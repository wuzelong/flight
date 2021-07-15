package cn.jmu.service;


import cn.jmu.bean.TicketType;
import cn.jmu.bean.TicketTypeExample;
import cn.jmu.dao.TicketTypeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketTypeService {
    @Autowired
    TicketTypeMapper ticketTypeMapper;

    public List<TicketType> findTicketType(int cabinid, String executiveflightid){
        TicketTypeExample ticketTypeExample=new TicketTypeExample();
        TicketTypeExample.Criteria criteria=ticketTypeExample.createCriteria();
        criteria.andCabinidEqualTo(cabinid);
        criteria.andExecutiveflightidEqualTo(executiveflightid);
        return ticketTypeMapper.selectByExample(ticketTypeExample);
    }
}
