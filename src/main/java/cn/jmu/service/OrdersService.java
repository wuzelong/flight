package cn.jmu.service;

import cn.jmu.bean.Orders;
import cn.jmu.bean.OrdersExample;
import cn.jmu.dao.OrdersMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class OrdersService {
    @Autowired
    private OrdersMapper ordersMapper;
    @Transactional
    public boolean insertOrders(Orders orders){
        return ordersMapper.insertSelective(orders);
    }
    @Transactional
    public boolean deleteOrders(int orderid){
        return ordersMapper.deleteByPrimaryKey(orderid);
    }
    @Transactional
    public boolean updateOrders(Orders orders){
        return ordersMapper.updateByPrimaryKeySelective(orders);
    }
    public List<Orders> findOrders(int userid){
        OrdersExample ordersExample=new OrdersExample();
        OrdersExample.Criteria criteria=ordersExample.createCriteria();
        criteria.andUseridEqualTo(userid);
        ordersExample.setOrderByClause("createtime desc");
        return ordersMapper.selectByExample(ordersExample);
    }
    public Orders findOrdersByOrderId(int orderid){
        return ordersMapper.selectByPrimaryKey(orderid);
    }
}
