package cn.jmu.bean;

public class Cabin {
    private Integer cabinid;

    private String cabinlevel;

    public Integer getCabinid() {
        return cabinid;
    }

    public void setCabinid(Integer cabinid) {
        this.cabinid = cabinid;
    }

    public String getCabinlevel() {
        return cabinlevel;
    }

    public void setCabinlevel(String cabinlevel) {
        this.cabinlevel = cabinlevel == null ? null : cabinlevel.trim();
    }
}