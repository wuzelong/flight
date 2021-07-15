package cn.jmu.dao;

import cn.jmu.bean.SeatingChart;
import cn.jmu.bean.SeatingChartExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SeatingChartMapper {
    long countByExample(SeatingChartExample example);

    int deleteByExample(SeatingChartExample example);

    int deleteByPrimaryKey(Integer seatid);

    int insert(SeatingChart record);

    int insertSelective(SeatingChart record);

    List<SeatingChart> selectByExample(SeatingChartExample example);

    SeatingChart selectByPrimaryKey(Integer seatid);

    int updateByExampleSelective(@Param("record") SeatingChart record, @Param("example") SeatingChartExample example);

    int updateByExample(@Param("record") SeatingChart record, @Param("example") SeatingChartExample example);

    int updateByPrimaryKeySelective(SeatingChart record);

    int updateByPrimaryKey(SeatingChart record);
}