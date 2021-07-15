package cn.jmu.service;

import cn.jmu.bean.FindTicket;
import cn.jmu.dao.FindTicketMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FindTicketService {
    @Autowired
    private FindTicketMapper findTicketMapper;

    public List<FindTicket> findTickets(FindTicket findTicket){
        return findTicketMapper.selectByFindTicket(findTicket);
    }
}
