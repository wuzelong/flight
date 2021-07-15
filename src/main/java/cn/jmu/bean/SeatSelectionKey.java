package cn.jmu.bean;

public class SeatSelectionKey {
    private Integer seatid;

    private String executiveflightid;

    public Integer getSeatid() {
        return seatid;
    }

    public void setSeatid(Integer seatid) {
        this.seatid = seatid;
    }

    public String getExecutiveflightid() {
        return executiveflightid;
    }

    public void setExecutiveflightid(String executiveflightid) {
        this.executiveflightid = executiveflightid == null ? null : executiveflightid.trim();
    }
}