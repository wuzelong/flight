package cn.jmu.test;

import cn.jmu.bean.*;
import cn.jmu.service.*;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import java.util.Date;
import java.util.List;

public class TestCRUD {
    @Test
    public void testUser(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
        UsersService usersService= (UsersService) ac.getBean("usersService");
        System.out.println(usersService.checkUser("123",""));
        Users user=new Users();
        user.setUserid(2);
        user.setUsername("asdasd");
        System.out.println(usersService.updateUser(user));
    }
    @Test
    public void testAdministrator(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
        AdministratorService administratorService=(AdministratorService) ac.getBean("administratorService");
        System.out.println(administratorService.checkAdministrator("12580","123"));
    }
    @Test
    public void testBinding(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
        BindingService service=(BindingService) ac.getBean("bindingService");
        BindingKey binding=new BindingKey();
        binding.setPassengerid("350181200005211771");
        binding.setUserid(1);
//        service.insertBinding(binding);
        service.deleteBinding(binding);
    }
    @Test
    public void testPassenger(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
        PassengerService service=(PassengerService) ac.getBean("passengerService");
        Passenger passenger=service.findPassenger("350181200005211771");
        System.out.println(passenger.getPassengername());
    }
    @Test
    public void testTicket(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
        FindTicketService service=(FindTicketService) ac.getBean("findTicketService");
        FindTicket findTicket=new FindTicket();
        findTicket.setArrivalcity("长沙");
        findTicket.setDeparturecity("厦门");
        Date date=new Date();
        findTicket.setDeparturetime(date);
        List<FindTicket> findTickets=service.findTickets(findTicket);
        for (FindTicket f:
             findTickets) {
            System.out.println(f);
        }
    }
    @Test
    public void testFlightInformation(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
        FlightInformationService service=(FlightInformationService) ac.getBean("flightInformationService");
        FlightInformation flightInformation=new FlightInformation();
//        flightInformation.setArrivalcity("长沙");
//        flightInformation.setDeparturecity("厦门");
        flightInformation.setFlightId("MF00000010");
        Date date=new Date();
        System.out.println("456"+flightInformation);
        flightInformation.setPlannedDepartureTtime(date);
        List<FlightInformation> flightInformations= service.findFlight(flightInformation);
        for (FlightInformation f:
                flightInformations) {
            System.out.println("123"+f);
        }
    }
}
