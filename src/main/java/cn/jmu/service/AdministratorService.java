package cn.jmu.service;


import cn.jmu.bean.Administrator;
import cn.jmu.bean.AdministratorExample;
import cn.jmu.dao.AdministratorMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class AdministratorService {
    @Autowired
    private AdministratorMapper administratorMapper;

    public Administrator checkAdministrator(String loginid, String password) {
        AdministratorExample administratorExample=new AdministratorExample();
        AdministratorExample.Criteria criteria=administratorExample.createCriteria();
        criteria.andLoginidEqualTo(loginid);
        criteria.andPasswordEqualTo(password);
        ArrayList<Administrator> administrators= (ArrayList<Administrator>) administratorMapper.selectByExample(administratorExample);
        if(administrators.size()==0){
            return null;
        }else {
            return administrators.get(0);
        }
    }
}
