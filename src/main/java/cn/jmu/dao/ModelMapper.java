package cn.jmu.dao;

import cn.jmu.bean.Model;
import cn.jmu.bean.ModelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ModelMapper {
    long countByExample(ModelExample example);

    int deleteByExample(ModelExample example);

    int deleteByPrimaryKey(String modelid);

    int insert(Model record);

    int insertSelective(Model record);

    List<Model> selectByExample(ModelExample example);

    Model selectByPrimaryKey(String modelid);

    int updateByExampleSelective(@Param("record") Model record, @Param("example") ModelExample example);

    int updateByExample(@Param("record") Model record, @Param("example") ModelExample example);

    int updateByPrimaryKeySelective(Model record);

    int updateByPrimaryKey(Model record);
}