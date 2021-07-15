package cn.jmu.service;

import cn.jmu.bean.Ticket;
import cn.jmu.bean.TicketExample;
import cn.jmu.dao.TicketMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.microsoft.sqlserver.jdbc.SQLServerException;

import java.util.List;

@Service
public class TicketService {
    @Autowired
    private TicketMapper ticketMapper;
    @Transactional(rollbackFor = Exception.class)
    public boolean insertTicket(Ticket ticket){
        return ticketMapper.insertSelective(ticket);
    }
    @Transactional(rollbackFor = Exception.class)
    public int insertTicket2(Ticket ticket)throws SQLServerException{
        return ticketMapper.insert2(ticket);
    }

    public Ticket findTicketByPrimary(int ticketid){
        return ticketMapper.selectByPrimaryKey(ticketid);
    }

    public List<Ticket> findTicketByOrderid(int orderid){
        TicketExample ticketExample=new TicketExample();
        TicketExample.Criteria criteria=ticketExample.createCriteria();
        criteria.andOrderidEqualTo(orderid);
        return ticketMapper.selectByExample(ticketExample);
    }
    public List<Ticket> findTicketByFlightIdAndPassengerid(String passengerid,String ticExecutiveflightid){
        TicketExample ticketExample=new TicketExample();
        TicketExample.Criteria criteria=ticketExample.createCriteria();
        criteria.andPassengeridEqualTo(passengerid);
        criteria.andTicExecutiveflightidEqualTo(ticExecutiveflightid);
        return ticketMapper.selectByExample(ticketExample);
    }
    @Transactional
    public boolean updateTicket(Ticket ticket){
        return ticketMapper.updateByPrimaryKeySelective(ticket);
    }
}
