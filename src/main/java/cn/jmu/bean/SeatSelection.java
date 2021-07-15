package cn.jmu.bean;

public class SeatSelection extends SeatSelectionKey {
    private Integer ticketid;

    private String seatstatus;

    @Override
	public String toString() {
		return "SeatSelection [ticketid=" + ticketid + ", seatstatus=" + seatstatus + "]";
	}

	public Integer getTicketid() {
        return ticketid;
    }

    public void setTicketid(Integer ticketid) {
        this.ticketid = ticketid;
    }

    public String getSeatstatus() {
        return seatstatus;
    }

    public void setSeatstatus(String seatstatus) {
        this.seatstatus = seatstatus == null ? null : seatstatus.trim();
    }
}