package cn.jmu.bean;

import java.util.Date;

public class FlightInformation {
    String flightId;
    String executiveFlightId;
    String departurecity;
    String arrivalcity;
    String departureAirport;
    String arrivalAirport;
    Date plannedDepartureTtime;
    Date plannedArrivalTime;
    Date ETD;
    Date ETA;
    Date ATD;
    Date ATA;
    String flightStatus;

    public String getFlightId() {
        return flightId;
    }

    public void setFlightId(String flightId) {
        this.flightId = flightId;
    }

    public String getDeparturecity() {
        return departurecity;
    }

    public void setDeparturecity(String departurecity) {
        this.departurecity = departurecity;
    }

    public String getArrivalcity() {
        return arrivalcity;
    }

    public void setArrivalcity(String arrivalcity) {
        this.arrivalcity = arrivalcity;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public void setDepartureAirport(String departureAirport) {
        this.departureAirport = departureAirport;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }

    public void setArrivalAirport(String arrivalAirport) {
        this.arrivalAirport = arrivalAirport;
    }

    public Date getPlannedDepartureTtime() {
        return plannedDepartureTtime;
    }

    public void setPlannedDepartureTtime(Date plannedDepartureTtime) {
        this.plannedDepartureTtime = plannedDepartureTtime;
    }

    public Date getPlannedArrivalTime() {
        return plannedArrivalTime;
    }

    public void setPlannedArrivalTime(Date plannedArrivalTime) {
        this.plannedArrivalTime = plannedArrivalTime;
    }

    public Date getETD() {
        return ETD;
    }

    public void setETD(Date ETD) {
        this.ETD = ETD;
    }

    public Date getETA() {
        return ETA;
    }

    public void setETA(Date ETA) {
        this.ETA = ETA;
    }

    public Date getATD() {
        return ATD;
    }

    public void setATD(Date ATD) {
        this.ATD = ATD;
    }

    public Date getATA() {
        return ATA;
    }

    public void setATA(Date ATA) {
        this.ATA = ATA;
    }

    public String getFlightStatus() {
        return flightStatus;
    }

    public void setFlightStatus(String flightStatus) {
        this.flightStatus = flightStatus;
    }

    public String getExecutiveFlightId() {
        return executiveFlightId;
    }

    public void setExecutiveFlightId(String executiveFlightId) {
        this.executiveFlightId = executiveFlightId;
    }

    @Override
    public String toString() {
        return "FlightInformation{" +
                "flightId='" + flightId + '\'' +
                ", executiveFlightId='" + executiveFlightId + '\'' +
                ", departurecity='" + departurecity + '\'' +
                ", arrivalcity='" + arrivalcity + '\'' +
                ", departureAirport='" + departureAirport + '\'' +
                ", arrivalAirport='" + arrivalAirport + '\'' +
                ", plannedDepartureTtime=" + plannedDepartureTtime +
                ", plannedArrivalTime=" + plannedArrivalTime +
                ", ETD=" + ETD +
                ", ETA=" + ETA +
                ", ATD=" + ATD +
                ", ATA=" + ATA +
                ", flightStatus='" + flightStatus + '\'' +
                '}';
    }
}
