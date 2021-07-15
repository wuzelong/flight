package cn.jmu.bean;

public class Flight2 extends Flight{
    private String departurecity;
    private String arrivalcity;

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

    @Override
    public String toString() {
        return "Flight2{" +
                "departurecity='" + departurecity + '\'' +
                ", arrivalcity='" + arrivalcity + '\'' +
                '}';
    }
}
