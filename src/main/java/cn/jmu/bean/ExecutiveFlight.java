package cn.jmu.bean;

import java.math.BigDecimal;
import java.util.Date;

public class ExecutiveFlight {
    private String executiveflightid;

    private String flightid;

    private Date executivedate;

    private BigDecimal executiveprice;

    private String flightstatus;

    private Date etd;

    private Date atd;

    private Date eta;

    private Date ata;

    private String boardinggate;

    private Date boardingtime;

    public String getExecutiveflightid() {
        return executiveflightid;
    }

    public void setExecutiveflightid(String executiveflightid) {
        this.executiveflightid = executiveflightid == null ? null : executiveflightid.trim();
    }

    public String getFlightid() {
        return flightid;
    }

    public void setFlightid(String flightid) {
        this.flightid = flightid == null ? null : flightid.trim();
    }

    public Date getExecutivedate() {
        return executivedate;
    }

    public void setExecutivedate(Date executivedate) {
        this.executivedate = executivedate;
    }

    public BigDecimal getExecutiveprice() {
        return executiveprice;
    }

    public void setExecutiveprice(BigDecimal executiveprice) {
        this.executiveprice = executiveprice;
    }

    public String getFlightstatus() {
        return flightstatus;
    }

    public void setFlightstatus(String flightstatus) {
        this.flightstatus = flightstatus == null ? null : flightstatus.trim();
    }

    public Date getEtd() {
        return etd;
    }

    public void setEtd(Date etd) {
        this.etd = etd;
    }

    public Date getAtd() {
        return atd;
    }

    public void setAtd(Date atd) {
        this.atd = atd;
    }

    public Date getEta() {
        return eta;
    }

    public void setEta(Date eta) {
        this.eta = eta;
    }

    public Date getAta() {
        return ata;
    }

    public void setAta(Date ata) {
        this.ata = ata;
    }

    public String getBoardinggate() {
        return boardinggate;
    }

    public void setBoardinggate(String boardinggate) {
        this.boardinggate = boardinggate == null ? null : boardinggate.trim();
    }

    public Date getBoardingtime() {
        return boardingtime;
    }

    public void setBoardingtime(Date boardingtime) {
        this.boardingtime = boardingtime;
    }
}