package cn.jmu.dao;

import cn.jmu.bean.FindTicket;

import java.util.List;

public interface FindTicketMapper {
    List<FindTicket> selectByFindTicket(FindTicket findTicket);
}
