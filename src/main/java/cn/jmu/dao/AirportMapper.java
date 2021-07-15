package cn.jmu.dao;

import cn.jmu.bean.Airport;
import cn.jmu.bean.AirportExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AirportMapper {
    long countByExample(AirportExample example);

    int deleteByExample(AirportExample example);

    int deleteByPrimaryKey(Integer airportid);

    int insert(Airport record);

    int insertSelective(Airport record);

    List<Airport> selectByExample(AirportExample example);

    Airport selectByPrimaryKey(Integer airportid);

    int updateByExampleSelective(@Param("record") Airport record, @Param("example") AirportExample example);

    int updateByExample(@Param("record") Airport record, @Param("example") AirportExample example);

    int updateByPrimaryKeySelective(Airport record);

    int updateByPrimaryKey(Airport record);
}