package cn.jmu.bean;

public class SeatingChart {
    private Integer seatid;

    private String modelid;

    private Integer cabinid;

    private String position;

    public Integer getSeatid() {
        return seatid;
    }

    public void setSeatid(Integer seatid) {
        this.seatid = seatid;
    }

    public String getModelid() {
        return modelid;
    }

    public void setModelid(String modelid) {
        this.modelid = modelid == null ? null : modelid.trim();
    }

    public Integer getCabinid() {
        return cabinid;
    }

    public void setCabinid(Integer cabinid) {
        this.cabinid = cabinid;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position == null ? null : position.trim();
    }
}