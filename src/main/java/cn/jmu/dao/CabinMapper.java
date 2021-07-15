package cn.jmu.dao;

import cn.jmu.bean.Cabin;
import cn.jmu.bean.CabinExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CabinMapper {
    long countByExample(CabinExample example);

    int deleteByExample(CabinExample example);

    int deleteByPrimaryKey(Integer cabinid);

    int insert(Cabin record);

    int insertSelective(Cabin record);

    List<Cabin> selectByExample(CabinExample example);

    Cabin selectByPrimaryKey(Integer cabinid);

    int updateByExampleSelective(@Param("record") Cabin record, @Param("example") CabinExample example);

    int updateByExample(@Param("record") Cabin record, @Param("example") CabinExample example);

    int updateByPrimaryKeySelective(Cabin record);

    int updateByPrimaryKey(Cabin record);
}