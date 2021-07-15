package cn.jmu.dao;

import cn.jmu.bean.BindingExample;
import cn.jmu.bean.BindingKey;
import java.util.List;

import cn.jmu.bean.BindingKey2;
import org.apache.ibatis.annotations.Param;

public interface BindingMapper {
    long countByExample(BindingExample example);

    int deleteByExample(BindingExample example);

    boolean deleteByPrimaryKey(BindingKey key);

    boolean insert(BindingKey record);

    int insertSelective(BindingKey record);

    List<BindingKey> selectByExample(BindingExample example);

    int updateByExampleSelective(@Param("record") BindingKey record, @Param("example") BindingExample example);

    int updateByExample(@Param("record") BindingKey record, @Param("example") BindingExample example);

    List<BindingKey2> selectByUserId(int userid);
}