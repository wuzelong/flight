package cn.jmu.dao;

import cn.jmu.bean.TicketType;
import cn.jmu.bean.TicketTypeExample;
import cn.jmu.bean.TicketTypeKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TicketTypeMapper {
    long countByExample(TicketTypeExample example);

    int deleteByExample(TicketTypeExample example);

    int deleteByPrimaryKey(TicketTypeKey key);

    int insert(TicketType record);

    int insertSelective(TicketType record);

    List<TicketType> selectByExample(TicketTypeExample example);

    TicketType selectByPrimaryKey(TicketTypeKey key);

    int updateByExampleSelective(@Param("record") TicketType record, @Param("example") TicketTypeExample example);

    int updateByExample(@Param("record") TicketType record, @Param("example") TicketTypeExample example);

    int updateByPrimaryKeySelective(TicketType record);

    int updateByPrimaryKey(TicketType record);
}