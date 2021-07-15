package cn.jmu.dao;

import cn.jmu.bean.ExecutiveFlight;
import cn.jmu.bean.ExecutiveFlightExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ExecutiveFlightMapper {
    long countByExample(ExecutiveFlightExample example);

    int deleteByExample(ExecutiveFlightExample example);

    int deleteByPrimaryKey(String executiveflightid);

    int insert(ExecutiveFlight record);

    int insertSelective(ExecutiveFlight record);

    List<ExecutiveFlight> selectByExample(ExecutiveFlightExample example);

    ExecutiveFlight selectByPrimaryKey(String executiveflightid);

    int updateByExampleSelective(@Param("record") ExecutiveFlight record, @Param("example") ExecutiveFlightExample example);

    int updateByExample(@Param("record") ExecutiveFlight record, @Param("example") ExecutiveFlightExample example);

    int updateByPrimaryKeySelective(ExecutiveFlight record);

    int updateByPrimaryKey(ExecutiveFlight record);
}