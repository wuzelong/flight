package cn.jmu.dao;

import cn.jmu.bean.Ticket;
import cn.jmu.bean.TicketExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.microsoft.sqlserver.jdbc.SQLServerException;

public interface TicketMapper {
    long countByExample(TicketExample example);

    int deleteByExample(TicketExample example);

    int deleteByPrimaryKey(Integer ticketid);

    int insert(Ticket record);

    boolean insertSelective(Ticket record);

    List<Ticket> selectByExample(TicketExample example);

    Ticket selectByPrimaryKey(Integer ticketid);

    int updateByExampleSelective(@Param("record") Ticket record, @Param("example") TicketExample example);

    int updateByExample(@Param("record") Ticket record, @Param("example") TicketExample example);

    boolean updateByPrimaryKeySelective(Ticket record);

    int updateByPrimaryKey(Ticket record);

    int insert2(Ticket ticket)throws SQLServerException;
}