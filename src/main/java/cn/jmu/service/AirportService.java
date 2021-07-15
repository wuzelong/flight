package cn.jmu.service;

import cn.jmu.bean.Airport;
import cn.jmu.bean.AirportExample;
import cn.jmu.dao.AirportMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AirportService {
    @Autowired
    private AirportMapper airportMapper;
    public Airport findAirport(int cityId){
        AirportExample airportExample=new AirportExample();
        AirportExample.Criteria criteria=airportExample.createCriteria();
        criteria.andCityidEqualTo(cityId);
        List<Airport> airports=airportMapper.selectByExample(airportExample);
        if (airports.size()==0){
            return null;
        }else{
            return airports.get(0);
        }
    }
}
