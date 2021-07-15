package cn.jmu.controller;

import cn.jmu.bean.Airport;
import cn.jmu.bean.City;
import cn.jmu.bean.Flight;
import cn.jmu.bean.Flight2;
import cn.jmu.bean.Msg;
import cn.jmu.bean.Terminal;
import cn.jmu.service.AirportService;
import cn.jmu.service.CityService;
import cn.jmu.service.FlightService;
import cn.jmu.service.TerminalService;

import com.alibaba.fastjson.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;

import java.util.List;

@Controller
@RequestMapping("/flight")
public class FlightController {
    @Autowired
    FlightService flightService;
    @Autowired
    CityService cityService;
    @Autowired
    AirportService airportService;
    @Autowired
    TerminalService terminalService;
    
    @RequestMapping("/getAllFlight")
    @ResponseBody
    public Msg getAllFlight(){
        List<Flight2> flight2s=flightService.getAll();
        return Msg.success().add("flight2s",flight2s);
    }

    @RequestMapping("/updateFlight")
    @ResponseBody
    @Transactional
    public Msg updateFlight(@RequestParam(value="flight1")String flight1,
                            @RequestParam(value="cityName1")String cityName1,@RequestParam(value="cityName2")String cityName2){
        Flight flight= JSONArray.parseObject(flight1,Flight.class);
        flight.setModelid("波音737700");
        cityName1+="市";
    	cityName2+="市";
        City city1=cityService.findCity(cityName1);
        City city2=cityService.findCity(cityName2);
        if(city1==null||city2==null)return Msg.fail();
        Airport airport1=airportService.findAirport(city1.getCityid());
        Airport airport2=airportService.findAirport(city2.getCityid());
        if(airport1==null||airport2==null)return Msg.fail();
        Terminal terminal1=terminalService.findTerminal(airport1.getAirportid());
        Terminal terminal2=terminalService.findTerminal(airport2.getAirportid());
        if(terminal1==null||terminal2==null)return Msg.fail();
        flight.setTerminalid(terminal1.getTerminalid());
        flight.setTerTerminalid(terminal2.getTerminalid());
        flightService.updateFlight(flight);
        return Msg.success();
    }
    
    @RequestMapping("/insertFlight")
    @ResponseBody
    @Transactional
    public Msg insertFlight(@RequestParam(value="flight1")String flight1,
                            @RequestParam(value="cityName1")String cityName1,@RequestParam(value="cityName2")String cityName2){
    	Flight flight= JSONArray.parseObject(flight1,Flight.class);
    	flight.setModelid("波音737700");
    	cityName1+="市";
    	cityName2+="市";
        City city1=cityService.findCity(cityName1);
        City city2=cityService.findCity(cityName2);
        if(city1==null||city2==null)return Msg.fail();
        Airport airport1=airportService.findAirport(city1.getCityid());
        Airport airport2=airportService.findAirport(city2.getCityid());
        if(airport1==null||airport2==null)return Msg.fail();
        Terminal terminal1=terminalService.findTerminal(airport1.getAirportid());
        Terminal terminal2=terminalService.findTerminal(airport2.getAirportid());
        if(terminal1==null||terminal2==null)return Msg.fail();
        flight.setTerminalid(terminal1.getTerminalid());
        flight.setTerTerminalid(terminal2.getTerminalid());
        flightService.insertFlight(flight);
        return Msg.success();
    }
    @RequestMapping("findFlight")
    @ResponseBody
    public Msg findFlight(@RequestParam(value="fid")String flightid){
        Flight2 flight2=flightService.findFlight2(flightid);
        return Msg.success().add("flight2",flight2);
    }
}
