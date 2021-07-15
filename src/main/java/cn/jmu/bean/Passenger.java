package cn.jmu.bean;

public class Passenger {
    private String passengerid;

    private String passengername;

    private String passengersex;

    private String passengertel;

    private String creditstatus;

    public String getPassengerid() {
        return passengerid;
    }

    public void setPassengerid(String passengerid) {
        this.passengerid = passengerid == null ? null : passengerid.trim();
    }

    public String getPassengername() {
        return passengername;
    }

    public void setPassengername(String passengername) {
        this.passengername = passengername == null ? null : passengername.trim();
    }

    public String getPassengersex() {
        return passengersex;
    }

    public void setPassengersex(String passengersex) {
        this.passengersex = passengersex == null ? null : passengersex.trim();
    }

    public String getPassengertel() {
        return passengertel;
    }

    public void setPassengertel(String passengertel) {
        this.passengertel = passengertel == null ? null : passengertel.trim();
    }

    public String getCreditstatus() {
        return creditstatus;
    }

    public void setCreditstatus(String creditstatus) {
        this.creditstatus = creditstatus == null ? null : creditstatus.trim();
    }
}