package cn.jmu.dao;

import cn.jmu.bean.SeatSelection;
import cn.jmu.bean.SeatSelectionExample;
import cn.jmu.bean.SeatSelectionKey;
import java.util.List;

import com.microsoft.sqlserver.jdbc.SQLServerException;
import org.apache.ibatis.annotations.Param;

public interface SeatSelectionMapper {
    long countByExample(SeatSelectionExample example);

    int deleteByExample(SeatSelectionExample example);

    int deleteByPrimaryKey(SeatSelectionKey key);

    int insert(SeatSelection record);

    boolean insertSelective(SeatSelection record)throws SQLServerException;

    List<SeatSelection> selectByExample(SeatSelectionExample example);

    SeatSelection selectByPrimaryKey(SeatSelectionKey key);

    int updateByExampleSelective(@Param("record") SeatSelection record, @Param("example") SeatSelectionExample example);

    int updateByExample(@Param("record") SeatSelection record, @Param("example") SeatSelectionExample example);

    int updateByPrimaryKeySelective(SeatSelection record);

    int updateByPrimaryKey(SeatSelection record);
}