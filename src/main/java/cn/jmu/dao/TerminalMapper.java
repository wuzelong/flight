package cn.jmu.dao;

import cn.jmu.bean.Terminal;
import cn.jmu.bean.TerminalExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TerminalMapper {
    long countByExample(TerminalExample example);

    int deleteByExample(TerminalExample example);

    int deleteByPrimaryKey(Integer terminalid);

    int insert(Terminal record);

    int insertSelective(Terminal record);

    List<Terminal> selectByExample(TerminalExample example);

    Terminal selectByPrimaryKey(Integer terminalid);

    int updateByExampleSelective(@Param("record") Terminal record, @Param("example") TerminalExample example);

    int updateByExample(@Param("record") Terminal record, @Param("example") TerminalExample example);

    int updateByPrimaryKeySelective(Terminal record);

    int updateByPrimaryKey(Terminal record);
}