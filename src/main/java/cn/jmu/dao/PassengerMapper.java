package cn.jmu.dao;

import cn.jmu.bean.Passenger;
import cn.jmu.bean.PassengerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PassengerMapper {
    long countByExample(PassengerExample example);

    int deleteByExample(PassengerExample example);

    boolean deleteByPrimaryKey(String passengerid);

    int insert(Passenger record);

    boolean insertSelective(Passenger record);

    List<Passenger> selectByExample(PassengerExample example);

    Passenger selectByPrimaryKey(String passengerid);

    int updateByExampleSelective(@Param("record") Passenger record, @Param("example") PassengerExample example);

    int updateByExample(@Param("record") Passenger record, @Param("example") PassengerExample example);

    int updateByPrimaryKeySelective(Passenger record);

    int updateByPrimaryKey(Passenger record);
}