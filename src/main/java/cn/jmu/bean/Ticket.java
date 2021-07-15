package cn.jmu.bean;

import java.math.BigDecimal;

public class Ticket {
    private Integer ticketid;

    private Integer orderid;

    private String passengerid;

    private Integer cabinid;

    private String ticExecutiveflightid;

    private BigDecimal airportconstructioncost;

    private BigDecimal insurancecost;

    private BigDecimal totalcost;

    private String remarks;

    private String checkstatus;

    private String boardingid;

    @Override
	public String toString() {
		return "Ticket [ticketid=" + ticketid + ", orderid=" + orderid + ", passengerid=" + passengerid + ", cabinid="
				+ cabinid + ", ticExecutiveflightid=" + ticExecutiveflightid + ", airportconstructioncost="
				+ airportconstructioncost + ", insurancecost=" + insurancecost + ", totalcost=" + totalcost
				+ ", remarks=" + remarks + ", checkstatus=" + checkstatus + ", boardingid=" + boardingid + "]";
	}

	public Integer getTicketid() {
        return ticketid;
    }

    public void setTicketid(Integer ticketid) {
        this.ticketid = ticketid;
    }

    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    public String getPassengerid() {
        return passengerid;
    }

    public void setPassengerid(String passengerid) {
        this.passengerid = passengerid == null ? null : passengerid.trim();
    }

    public Integer getCabinid() {
        return cabinid;
    }

    public void setCabinid(Integer cabinid) {
        this.cabinid = cabinid;
    }

    public String getTicExecutiveflightid() {
        return ticExecutiveflightid;
    }

    public void setTicExecutiveflightid(String ticExecutiveflightid) {
        this.ticExecutiveflightid = ticExecutiveflightid == null ? null : ticExecutiveflightid.trim();
    }

    public BigDecimal getAirportconstructioncost() {
        return airportconstructioncost;
    }

    public void setAirportconstructioncost(BigDecimal airportconstructioncost) {
        this.airportconstructioncost = airportconstructioncost;
    }

    public BigDecimal getInsurancecost() {
        return insurancecost;
    }

    public void setInsurancecost(BigDecimal insurancecost) {
        this.insurancecost = insurancecost;
    }

    public BigDecimal getTotalcost() {
        return totalcost;
    }

    public void setTotalcost(BigDecimal totalcost) {
        this.totalcost = totalcost;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    public String getCheckstatus() {
        return checkstatus;
    }

    public void setCheckstatus(String checkstatus) {
        this.checkstatus = checkstatus == null ? null : checkstatus.trim();
    }

    public String getBoardingid() {
        return boardingid;
    }

    public void setBoardingid(String boardingid) {
        this.boardingid = boardingid == null ? null : boardingid.trim();
    }
}