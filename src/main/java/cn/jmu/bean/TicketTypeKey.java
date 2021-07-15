package cn.jmu.bean;

public class TicketTypeKey {
    private Integer cabinid;

    private String executiveflightid;

    public Integer getCabinid() {
        return cabinid;
    }

    public void setCabinid(Integer cabinid) {
        this.cabinid = cabinid;
    }

    public String getExecutiveflightid() {
        return executiveflightid;
    }

    public void setExecutiveflightid(String executiveflightid) {
        this.executiveflightid = executiveflightid == null ? null : executiveflightid.trim();
    }
}