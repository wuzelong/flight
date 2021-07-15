package cn.jmu.bean;

import java.math.BigDecimal;

public class Report {
    String flightId;
    int totalTicket;
    int selledTicket;
    BigDecimal income;
    String ontime;
    int executiveNum;

    public String getFlightId() {
        return flightId;
    }

    public void setFlightId(String flightId) {
        this.flightId = flightId;
    }

    public int getTotalTicket() {
        return totalTicket;
    }

    public void setTotalTicket(int totalTicket) {
        this.totalTicket = totalTicket;
    }

    public int getSelledTicket() {
        return selledTicket;
    }

    public void setSelledTicket(int selledTicket) {
        this.selledTicket = selledTicket;
    }

    public BigDecimal getIncome() {
        return income;
    }

    public void setIncome(BigDecimal income) {
        this.income = income;
    }

    public String getOntime() {
        return ontime;
    }

    public void setOntime(String ontime) {
        this.ontime = ontime;
    }

    public int getExecutiveNum() {
        return executiveNum;
    }

    public void setExecutiveNum(int executiveNum) {
        this.executiveNum = executiveNum;
    }

    @Override
    public String toString() {
        return "Report{" +
                "flightId='" + flightId + '\'' +
                ", totalTicket=" + totalTicket +
                ", selledTicket=" + selledTicket +
                ", income=" + income +
                ", ontime='" + ontime + '\'' +
                ", executiveNum=" + executiveNum +
                '}';
    }
}
