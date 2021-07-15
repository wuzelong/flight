package cn.jmu.service;

import cn.jmu.bean.ExecutiveFlight;
import cn.jmu.dao.ExecutiveFlightMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExecutiveflightService {
    @Autowired
    ExecutiveFlightMapper executiveFlightMapper;

    public ExecutiveFlight findExecutiveflight(String executiveflightid){
        return executiveFlightMapper.selectByPrimaryKey(executiveflightid);
    }
}
