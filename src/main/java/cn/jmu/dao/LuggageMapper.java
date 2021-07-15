package cn.jmu.dao;

import cn.jmu.bean.Luggage;
import cn.jmu.bean.LuggageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LuggageMapper {
    long countByExample(LuggageExample example);

    int deleteByExample(LuggageExample example);

    int deleteByPrimaryKey(Integer luggageid);

    int insert(Luggage record);

    int insertSelective(Luggage record);

    List<Luggage> selectByExample(LuggageExample example);

    Luggage selectByPrimaryKey(Integer luggageid);

    int updateByExampleSelective(@Param("record") Luggage record, @Param("example") LuggageExample example);

    int updateByExample(@Param("record") Luggage record, @Param("example") LuggageExample example);

    int updateByPrimaryKeySelective(Luggage record);

    int updateByPrimaryKey(Luggage record);
}