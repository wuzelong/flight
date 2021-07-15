package cn.jmu.service;

import cn.jmu.bean.Flight;
import cn.jmu.bean.Flight2;
import cn.jmu.bean.FlightExample;
import cn.jmu.dao.FlightMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class FlightService {
    @Autowired
    private FlightMapper flightMapper;
    public Flight findFlightByid(String flightid){
        return flightMapper.selectByPrimaryKey(flightid);
    }
    public List<Flight> findAll(){
        FlightExample flightExample=new FlightExample();
        flightExample.setOrderByClause("plannedDepartureTtime asc");
        return flightMapper.selectByExample(flightExample);
    }
    @Transactional
    public boolean updateFlight(Flight flight){
        return flightMapper.updateByPrimaryKeySelective(flight);
    }
    public List<Flight2> getAll(){
        return flightMapper.findAll();
    }
    @Transactional
    public boolean insertFlight(Flight flight){
        return flightMapper.insertSelective(flight);
    }
    public Flight2 findFlight2(String flightid){
        return flightMapper.findFlightByFlightId(flightid);
    }
}
