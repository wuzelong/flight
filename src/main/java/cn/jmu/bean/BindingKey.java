package cn.jmu.bean;

public class BindingKey {
    private Integer userid;

    private String passengerid;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getPassengerid() {
        return passengerid;
    }

    public void setPassengerid(String passengerid) {
        this.passengerid = passengerid == null ? null : passengerid.trim();
    }
}