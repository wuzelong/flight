package cn.jmu.controller;

import cn.jmu.bean.*;
import cn.jmu.service.*;
import com.alibaba.fastjson.JSONArray;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.microsoft.sqlserver.jdbc.SQLServerException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


import java.math.BigDecimal;
import java.util.*;

@Controller
@RequestMapping("/orders")
public class OrdersController {
    @Autowired
    private OrdersService ordersService;
    @Autowired
    private TicketService ticketService;
    @Autowired
    private PassengerService passengerService;
    @Autowired
    private UsersService usersService;
    @Autowired
    private SeatSelectionService seatSelectionService;
    @Autowired
    private FlightInformationService flightInformationService;
    @Autowired
    private CabinService cabinService;

    @RequestMapping("/confirmOrder")
    @ResponseBody
    @Transactional
    public Msg confirmOrder(@RequestParam(value="passenger") String passenger,@RequestParam(value="fli") String fli,@RequestParam(value="cab") String cab,@RequestParam(value="linkMan") String linkMan,
                            @RequestParam(value="linkTel") String linkTel,@RequestParam(value="issu") String issu,@RequestParam(value="userId") String userId,
                            @RequestParam(value="inte") String inte,@RequestParam(value="rderCost") String rderCost,@RequestParam(value="ticketCost") String ticketCost){
        List<Passenger> passengers= JSONArray.parseArray(passenger,Passenger.class);
        for(Passenger p:passengers){
            if(ticketService.findTicketByFlightIdAndPassengerid(p.getPassengerid(),fli).size()!=0){
                return Msg.fail().add("msg", "同一乘机人只能购买一张机票！");
            }
            if(passengerService.findPassenger(p.getPassengerid())==null){
                passengerService.insertPassenger(p);
            }
        }
        Orders orders=new Orders();
        List<Ticket> tickets=new ArrayList<Ticket>();
        Date date=new Date();
        String or=Long.toString(date.getTime());
        int orderid=Integer.parseInt(or.substring(4));
        orders.setOrderid(orderid);
        orders.setUserid(Integer.parseInt(userId));
        orders.setOffsetintegral(Integer.parseInt(inte));
        orders.setTotalcost(BigDecimal.valueOf(Double.valueOf(rderCost)));
        orders.setOrderstatusx("待支付");
        orders.setTelephone(linkTel);
        orders.setCreatetime(date);
        orders.setLinkman(linkMan);
        ordersService.insertOrders(orders);
        for (int i=0;i<passengers.size();i++){
            Ticket ticket=new Ticket();
            ticket.setOrderid(orderid);
            ticket.setPassengerid(passengers.get(i).getPassengerid());
            ticket.setCabinid(Integer.parseInt(cab));
            ticket.setTicExecutiveflightid(fli);
            ticket.setAirportconstructioncost(BigDecimal.valueOf(50));
            ticket.setInsurancecost(BigDecimal.valueOf(Double.valueOf(issu)));
            ticket.setTotalcost(BigDecimal.valueOf(Double.valueOf(ticketCost)));
            ticket.setCheckstatus("未值机");
            tickets.add(ticket);
            try{
            	if(ticketService.insertTicket2(ticket)==0)return Msg.fail().add("msg", "抱歉，票已售罄！");            	
            }catch (SQLServerException e) {
            	ordersService.deleteOrders(orderid);
            	return Msg.fail().add("msg", "抱歉，票已售罄！！");
			}
            catch (Exception e) {
            	ordersService.deleteOrders(orderid);
            	return Msg.fail().add("msg", "抱歉，票已售罄！！！");  
			}
        }
        Map<String,Object> map=new HashMap<String, Object>();
        map.put("tickets",tickets);
        map.put("orders",orders);
        return Msg.success().add("map",map);
    }
    @RequestMapping("/payOrder")
    @ResponseBody
    public Msg payOrder(@RequestParam(value="oid")int orderid){
        Orders orders=ordersService.findOrdersByOrderId(orderid);
        List<Ticket> tickets=ticketService.findTicketByOrderid(orderid);
        int total=0;
        for (Ticket ticket:tickets){
            total+=ticket.getTotalcost().intValue();
            total-=ticket.getInsurancecost().intValue();
            total-=ticket.getAirportconstructioncost().intValue();
        }
        if(orders.getPaidtime()==null)orders.setPaidtime(new Date());
        orders.setOrderstatusx("已支付");
        ordersService.updateOrders(orders);
        Users users=usersService.findUserByUserid(orders.getUserid());
        users.setIntegral(users.getIntegral()+(total/10));
        usersService.updateUser(users);
        return Msg.success();
    }
    //TODO:输入订单号返回机票信息和已被选择座位
    @RequestMapping("/selectSeat")
    @ResponseBody
    public Msg selectSeat(@RequestParam(value="oid")int orderid,@RequestParam(value="uid")int userid){
    	Orders orders=ordersService.findOrdersByOrderId(orderid);
        if(orders==null||orders.getUserid()!=userid)return Msg.fail();
        List<Ticket> tickets = ticketService.findTicketByOrderid(orderid);
        List<SeatSelection> seatSelections=seatSelectionService.findSeatSelection(tickets.get(0).getTicExecutiveflightid());
        Map<String,Object> map=new HashMap<String, Object>();
        map.put("tickets",tickets);
        map.put("seatSelections",seatSelections);
        return Msg.success().add("map",map);
    }
    //TODO:选座
    @RequestMapping("/insertSeatSelection")
    @ResponseBody
    public Msg insertSeatSelection(@RequestParam(value="seatInfo") String seatInfo){
        //System.out.println(seatInfo);
    	List<SeatSelection> seatSelections=JSONArray.parseArray(seatInfo,SeatSelection.class);
//        List<SeatSelection> seatSelections=new ArrayList<>();
        for (SeatSelection s:seatSelections){
            SeatSelection seatSelection=new SeatSelection();
            seatSelection.setSeatid(s.getSeatid()+130);
            seatSelection.setSeatstatus("已选");
            seatSelection.setExecutiveflightid(s.getExecutiveflightid());
            seatSelection.setTicketid(s.getTicketid());
            //System.out.println(s);
            try{
                if(seatSelectionService.insertSeatSelection(seatSelection)==false)return Msg.fail();
            }catch (SQLServerException e) {
                return Msg.fail();
            }
            catch (Exception e) {
                return Msg.fail();
            }
            Ticket ticket=ticketService.findTicketByPrimary(s.getTicketid());
            ticket.setCheckstatus("已值机");
            ticketService.updateTicket(ticket);
        }
        return Msg.success();
    }
    //TODO:输入订单号放回机票号
    @RequestMapping("/findTicket")
    @ResponseBody
    public Msg findTicket(@RequestParam(value="oid")int orderid,@RequestParam(value="uid")int userid){
    	Orders orders=ordersService.findOrdersByOrderId(orderid);
        if(orders==null||orders.getUserid()!=userid)return Msg.fail();
        List<Ticket> tickets=ticketService.findTicketByOrderid(orderid);
        List<Integer> ticketId=new ArrayList<Integer>();
        for(Ticket t:tickets){
            ticketId.add(t.getTicketid());
        }
        return Msg.success().add("ticketId",ticketId);
    }
    //TODO:根据机票号返回各种信息
    @RequestMapping("getInformation")
    @ResponseBody
    public Msg getInformation(@RequestParam(value="tid")int ticketid){
        Ticket ticket=ticketService.findTicketByPrimary(ticketid);
        FlightInformation flightInformation=flightInformationService.findByExecutiveFlightId(ticket.getTicExecutiveflightid());
        Passenger passenger=passengerService.findPassenger(ticket.getPassengerid());
        Cabin cabin=cabinService.findByCabinId(ticket.getCabinid());
        Map<String,Object> map=new HashMap<String, Object>();
        map.put("flightInformation",flightInformation);
        map.put("passenger",passenger);
        map.put("cabin",cabin);
        return Msg.success().add("map",map);
    }

    @RequestMapping("/updateOrder")
    @ResponseBody
    public Msg updateOrder(Orders orders){
        ordersService.updateOrders(orders);
        return Msg.success();
    }

    @RequestMapping("/myOrders")
    @ResponseBody
    public Msg myOrders(@RequestParam(value="uid")int userid,@RequestParam(value = "page", defaultValue = "1") int page){
        PageHelper.startPage(page,5);
        List<Orders> orders=ordersService.findOrders(userid);
        PageInfo pageInfo=new PageInfo(orders,5);
        return Msg.success().add("pageInfo",pageInfo);
    }
    @RequestMapping("/checkTicket")
    @ResponseBody
    public Msg checkTicket(@RequestParam(value="tickId")int ticketid){
        Ticket ticket=ticketService.findTicketByPrimary(ticketid);
        boolean result = false;
        if(ticket!=null){
            result=true;
        }
        return Msg.success().add("result",result);
    }
}
