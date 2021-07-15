package cn.jmu.service;

import cn.jmu.bean.Passenger;
import cn.jmu.dao.PassengerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PassengerService {
    @Autowired
    private PassengerMapper passengerMapper;
    @Transactional
    public boolean insertPassenger(Passenger passenger){
        return passengerMapper.insertSelective(passenger);
    }

    public Passenger findPassenger(String passengerid){
        return passengerMapper.selectByPrimaryKey(passengerid);
    }
    @Transactional
    public boolean deletePassenger(String passengerid){
        return passengerMapper.deleteByPrimaryKey(passengerid);
    }
}
