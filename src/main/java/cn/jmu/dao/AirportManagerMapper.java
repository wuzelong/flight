package cn.jmu.dao;

import cn.jmu.bean.AirportManager;
import cn.jmu.bean.AirportManagerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AirportManagerMapper {
    long countByExample(AirportManagerExample example);

    int deleteByExample(AirportManagerExample example);

    int insert(AirportManager record);

    int insertSelective(AirportManager record);

    List<AirportManager> selectByExample(AirportManagerExample example);

    int updateByExampleSelective(@Param("record") AirportManager record, @Param("example") AirportManagerExample example);

    int updateByExample(@Param("record") AirportManager record, @Param("example") AirportManagerExample example);
}