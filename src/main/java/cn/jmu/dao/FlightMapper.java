package cn.jmu.dao;

import cn.jmu.bean.Flight;
import cn.jmu.bean.Flight2;
import cn.jmu.bean.FlightExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FlightMapper {
    long countByExample(FlightExample example);

    int deleteByExample(FlightExample example);

    int deleteByPrimaryKey(String flightid);

    int insert(Flight record);

    boolean insertSelective(Flight record);

    List<Flight> selectByExample(FlightExample example);

    Flight selectByPrimaryKey(String flightid);

    int updateByExampleSelective(@Param("record") Flight record, @Param("example") FlightExample example);

    int updateByExample(@Param("record") Flight record, @Param("example") FlightExample example);

    boolean updateByPrimaryKeySelective(Flight record);

    int updateByPrimaryKey(Flight record);

    List<Flight2> findAll();

    Flight2 findFlightByFlightId(String flightid);
}