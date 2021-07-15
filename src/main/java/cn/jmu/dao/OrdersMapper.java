package cn.jmu.dao;

import cn.jmu.bean.Orders;
import cn.jmu.bean.OrdersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrdersMapper {
    long countByExample(OrdersExample example);

    int deleteByExample(OrdersExample example);

    boolean deleteByPrimaryKey(Integer orderid);

    int insert(Orders record);

    boolean insertSelective(Orders record);

    List<Orders> selectByExample(OrdersExample example);

    Orders selectByPrimaryKey(Integer orderid);

    int updateByExampleSelective(@Param("record") Orders record, @Param("example") OrdersExample example);

    int updateByExample(@Param("record") Orders record, @Param("example") OrdersExample example);

    boolean updateByPrimaryKeySelective(Orders record);

    int updateByPrimaryKey(Orders record);
}