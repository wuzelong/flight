package cn.jmu.dao;

import cn.jmu.bean.Users;
import cn.jmu.bean.UsersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UsersMapper {
    long countByExample(UsersExample example);

    int deleteByExample(UsersExample example);

    int deleteByPrimaryKey(Integer userid);

    boolean insert(Users record);

    boolean insertSelective(Users record);

    List<Users> selectByExample(UsersExample example);

    Users selectByPrimaryKey(Integer userid);

    int updateByExampleSelective(@Param("record") Users record, @Param("example") UsersExample example);

    int updateByExample(@Param("record") Users record, @Param("example") UsersExample example);

    boolean updateByPrimaryKeySelective(Users record);

    boolean updateByPrimaryKey(Users record);
}