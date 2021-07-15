package cn.jmu.bean;

import java.math.BigDecimal;

public class Luggage {
    private Integer luggageid;

    private Integer ticketid;

    private BigDecimal luggageweight;

    private BigDecimal length;

    private BigDecimal width;

    private BigDecimal height;

    private BigDecimal fine;

    public Integer getLuggageid() {
        return luggageid;
    }

    public void setLuggageid(Integer luggageid) {
        this.luggageid = luggageid;
    }

    public Integer getTicketid() {
        return ticketid;
    }

    public void setTicketid(Integer ticketid) {
        this.ticketid = ticketid;
    }

    public BigDecimal getLuggageweight() {
        return luggageweight;
    }

    public void setLuggageweight(BigDecimal luggageweight) {
        this.luggageweight = luggageweight;
    }

    public BigDecimal getLength() {
        return length;
    }

    public void setLength(BigDecimal length) {
        this.length = length;
    }

    public BigDecimal getWidth() {
        return width;
    }

    public void setWidth(BigDecimal width) {
        this.width = width;
    }

    public BigDecimal getHeight() {
        return height;
    }

    public void setHeight(BigDecimal height) {
        this.height = height;
    }

    public BigDecimal getFine() {
        return fine;
    }

    public void setFine(BigDecimal fine) {
        this.fine = fine;
    }
}