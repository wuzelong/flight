package cn.jmu.bean;

import java.math.BigDecimal;
import java.util.Date;

public class Flight {
    private String flightid;

    private String modelid;

    private Integer terminalid;

    private Integer terTerminalid;

    private Date planneddeparturettime;

    private Date plannedarrivaltime;

    private BigDecimal pricing;

    @Override
	public String toString() {
		return "Flight [flightid=" + flightid + ", modelid=" + modelid + ", terminalid=" + terminalid
				+ ", terTerminalid=" + terTerminalid + ", planneddeparturettime=" + planneddeparturettime
				+ ", plannedarrivaltime=" + plannedarrivaltime + ", pricing=" + pricing + "]";
	}

	public String getFlightid() {
        return flightid;
    }

    public void setFlightid(String flightid) {
        this.flightid = flightid == null ? null : flightid.trim();
    }

    public String getModelid() {
        return modelid;
    }

    public void setModelid(String modelid) {
        this.modelid = modelid == null ? null : modelid.trim();
    }

    public Integer getTerminalid() {
        return terminalid;
    }

    public void setTerminalid(Integer terminalid) {
        this.terminalid = terminalid;
    }

    public Integer getTerTerminalid() {
        return terTerminalid;
    }

    public void setTerTerminalid(Integer terTerminalid) {
        this.terTerminalid = terTerminalid;
    }

    public Date getPlanneddeparturettime() {
        return planneddeparturettime;
    }

    public void setPlanneddeparturettime(Date planneddeparturettime) {
        this.planneddeparturettime = planneddeparturettime;
    }

    public Date getPlannedarrivaltime() {
        return plannedarrivaltime;
    }

    public void setPlannedarrivaltime(Date plannedarrivaltime) {
        this.plannedarrivaltime = plannedarrivaltime;
    }

    public BigDecimal getPricing() {
        return pricing;
    }

    public void setPricing(BigDecimal pricing) {
        this.pricing = pricing;
    }
}