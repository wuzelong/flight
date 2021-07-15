package cn.jmu.service;

import cn.jmu.bean.FlightInformation;
import cn.jmu.dao.FlightInformationMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlightInformationService {
    @Autowired
    private FlightInformationMapper flightInformationMapper;

    public List<FlightInformation> findFlight(FlightInformation flightInformation){
        return flightInformationMapper.selectByCityAndTime(flightInformation);
    }
    public FlightInformation findByExecutiveFlightId(String executiveFlightId){
        return flightInformationMapper.selectByExecutiveFlightId(executiveFlightId);
    }
}
