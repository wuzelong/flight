package cn.jmu.controller;

import cn.jmu.bean.*;
import cn.jmu.service.ExecutiveflightService;
import cn.jmu.service.FindTicketService;
import cn.jmu.service.FlightInformationService;
import cn.jmu.service.TicketTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

@Controller
@RequestMapping("/find")
public class FindTicketController {
    @Autowired
    FindTicketService findTicketService;
    @Autowired
    FlightInformationService flightInformationService;
    @Autowired
    ExecutiveflightService executiveflightService;
    @Autowired
    TicketTypeService ticketTypeService;

    @RequestMapping("/findTicketType")
    @ResponseBody
    public Msg findTicketType(@RequestParam(value="c")int cabinid,@RequestParam(value="f")String executiveflightid){
        List<TicketType> ticketTypes=ticketTypeService.findTicketType(cabinid, executiveflightid);
        if (ticketTypes.size()==0){
            return Msg.fail();
        }
        return Msg.success().add("tickType",ticketTypes.get(0));
    }
    @RequestMapping("/trans")
    @ResponseBody
    public Msg trans(@RequestParam(value="b")BigDecimal bigDecimal){
    	double rtn=bigDecimal.doubleValue();
        return Msg.success().add("b",rtn);
    }
    //TODO：查询机票，返回类型你看着改，改完标记一下就行
    @PostMapping("/findTicket")
    @ResponseBody
    public Msg findTicket(@RequestParam(value="d")String date2,@RequestParam(value="f")String departurecity,@RequestParam(value="t")String arrivalcity, HttpSession session) throws ParseException{
    	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    	Date date = sdf.parse(date2);
    	FindTicket findTicket=new FindTicket();
        findTicket.setDeparturetime(date);
        findTicket.setDeparturecity(departurecity);
        findTicket.setArrivalcity(arrivalcity);
        ArrayList<FindTicket> tickets = (ArrayList<FindTicket>)findTicketService.findTickets(findTicket);
        return Msg.success().add("tickets",tickets);
    }
    //TODO:查询航班动态，根据航班ID和时间或者城市和时间。返回类型你看着改，改完标记一下就行
    @RequestMapping("/flightInformation")
    @ResponseBody
    public Msg flightInformation(Date date,String departurecity, String arrivalcity,@RequestParam(value="fid")String flightId){
        FlightInformation flightInformation=new FlightInformation();
        if(flightId!=null && flightId != ""){
            flightInformation.setFlightId(flightId);
        }else{
            flightInformation.setDeparturecity(departurecity);
            flightInformation.setArrivalcity(arrivalcity);
        }
        flightInformation.setPlannedDepartureTtime(date);
        List<FlightInformation> flightInformations=flightInformationService.findFlight(flightInformation);
        return Msg.success().add("flightInformations",flightInformations);
    }
    @RequestMapping("/findExecutiveFlight")
    @ResponseBody
    public Msg findExecutiveFlight(String executiveflightid){
        ExecutiveFlight executiveFlight=executiveflightService.findExecutiveflight(executiveflightid);
        return Msg.success().add("executiveFlight",executiveFlight);
    }
}

