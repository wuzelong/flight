package cn.jmu.service;

import cn.jmu.bean.Users;
import cn.jmu.bean.UsersExample;
import cn.jmu.dao.UsersMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;

@Service
public class UsersService {
    @Autowired
    private UsersMapper usersMapper;

    public Users checkUser(String loginid, String password) {
        UsersExample usersExample=new UsersExample();
        UsersExample.Criteria criteria=usersExample.createCriteria();
        criteria.andLoginidEqualTo(loginid);
        criteria.andPasswordEqualTo(password);
        ArrayList<Users> users= (ArrayList<Users>) usersMapper.selectByExample(usersExample);
        if(users.size()==0){
            return null;
        }else {
            return users.get(0);
        }
    }

    public Users findUserByUserid(int userid){
        return usersMapper.selectByPrimaryKey(userid);
    }

    public Users findUserByLoginID(String loginid){
        UsersExample usersExample=new UsersExample();
        UsersExample.Criteria criteria=usersExample.createCriteria();
        criteria.andLoginidEqualTo(loginid);
        ArrayList<Users> users= (ArrayList<Users>) usersMapper.selectByExample(usersExample);
        if(users.size()==0){
            return null;
        }else {
            return users.get(0);
        }
    }
    @Transactional
    public boolean InsertUser(Users user) {
        return usersMapper.insertSelective(user);
    }

    @Transactional
    public boolean updateUser(Users user) {
        return usersMapper.updateByPrimaryKeySelective(user);
    }
}
