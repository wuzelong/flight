package cn.jmu.service;

import cn.jmu.bean.City;
import cn.jmu.bean.CityExample;
import cn.jmu.dao.CityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityService {
    @Autowired
    private CityMapper cityMapper;
    public City findCity(String cityName){
        CityExample cityExample=new CityExample();
        CityExample.Criteria criteria= cityExample.createCriteria();
        criteria.andCitynameEqualTo(cityName);
        List<City> cities=cityMapper.selectByExample(cityExample);
        if(cities.size()==0){
            return null;
        }else {
            return cities.get(0);
        }
    }
}
