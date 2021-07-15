package cn.jmu.bean;

public class Terminal {
    private Integer terminalid;

    private Integer airportid;

    private String terminalname;

    public Integer getTerminalid() {
        return terminalid;
    }

    public void setTerminalid(Integer terminalid) {
        this.terminalid = terminalid;
    }

    public Integer getAirportid() {
        return airportid;
    }

    public void setAirportid(Integer airportid) {
        this.airportid = airportid;
    }

    public String getTerminalname() {
        return terminalname;
    }

    public void setTerminalname(String terminalname) {
        this.terminalname = terminalname == null ? null : terminalname.trim();
    }
}