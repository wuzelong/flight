package cn.jmu.dao;

import cn.jmu.bean.FlightInformation;

import java.util.List;

public interface FlightInformationMapper {
     List<FlightInformation> selectByCityAndTime(FlightInformation flightInformation);
     FlightInformation selectByExecutiveFlightId(String executiveFlightId);
}
