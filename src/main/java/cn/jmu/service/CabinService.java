package cn.jmu.service;

import cn.jmu.bean.Cabin;
import cn.jmu.dao.CabinMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CabinService {
    @Autowired
    private CabinMapper cabinMapper;
    public Cabin findByCabinId(int cabinId){
        return cabinMapper.selectByPrimaryKey(cabinId);
    }
}
