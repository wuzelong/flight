package cn.jmu.service;


import cn.jmu.bean.AirportManager;
import cn.jmu.bean.AirportManagerExample;
import cn.jmu.dao.AirportManagerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AirportManagerService {
    @Autowired
    private AirportManagerMapper airportManagerMapper;

    public AirportManager checkAirportManager(String loginid, String password){
        AirportManagerExample airportManagerExample=new AirportManagerExample();
        AirportManagerExample.Criteria criteria=airportManagerExample.createCriteria();
        criteria.andLoginidEqualTo(loginid);
        criteria.andPasswordEqualTo(password);
        List<AirportManager> list=airportManagerMapper.selectByExample(airportManagerExample);
        if(list.size()==0){
            return null;
        }else{
            return list.get(0);
        }
    }

}
