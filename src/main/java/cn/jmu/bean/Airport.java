package cn.jmu.bean;

public class Airport {
    private Integer airportid;

    private Integer cityid;

    private String airportname;

    private String address;

    public Integer getAirportid() {
        return airportid;
    }

    public void setAirportid(Integer airportid) {
        this.airportid = airportid;
    }

    public Integer getCityid() {
        return cityid;
    }

    public void setCityid(Integer cityid) {
        this.cityid = cityid;
    }

    public String getAirportname() {
        return airportname;
    }

    public void setAirportname(String airportname) {
        this.airportname = airportname == null ? null : airportname.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }
}