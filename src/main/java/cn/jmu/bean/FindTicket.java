package cn.jmu.bean;

import java.util.Date;

public class FindTicket {
    String flightId;
    String executiveFlightId;
    String departurecity;
    String arrivalcity;
    Date departuretime;
    Date arrivaltime;
    int cabinId;
    String cabinLevel;
    double executivePrice;
    double sellingPrice;
    double discount;
    int remainingTickets;
    int luggageAllowance;
    int luggageNumber;
    String mealStatus;
    String rules;
    String departureairportName;
    String arrivalairportName;
    String departureterminalName;
    String arrivalterminalName;
    int integral;

    public String getFlightId() {
        return flightId;
    }

    public void setFlightId(String flightId) {
        this.flightId = flightId;
    }

    public String getDeparturecity() {
        return departurecity;
    }

    public void setDeparturecity(String departurecity) {
        this.departurecity = departurecity;
    }

    public String getArrivalcity() {
        return arrivalcity;
    }

    public void setArrivalcity(String arrivalcity) {
        this.arrivalcity = arrivalcity;
    }

    public Date getDeparturetime() {
        return departuretime;
    }

    public void setDeparturetime(Date departuretime) {
        this.departuretime = departuretime;
    }

    public Date getArrivaltime() {
        return arrivaltime;
    }

    public void setArrivaltime(Date arrivaltime) {
        this.arrivaltime = arrivaltime;
    }

    public String getCabinLevel() {
        return cabinLevel;
    }

    public void setCabinLevel(String cabinLevel) {
        this.cabinLevel = cabinLevel;
    }

    public double getExecutivePrice() {
        return executivePrice;
    }

    public void setExecutivePrice(double executivePrice) {
        this.executivePrice = executivePrice;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public int getRemainingTickets() {
        return remainingTickets;
    }

    public void setRemainingTickets(int remainingTickets) {
        this.remainingTickets = remainingTickets;
    }

    public int getLuggageAllowance() {
        return luggageAllowance;
    }

    public void setLuggageAllowance(int luggageAllowance) {
        this.luggageAllowance = luggageAllowance;
    }

    public int getLuggageNumber() {
        return luggageNumber;
    }

    public void setLuggageNumber(int luggageNumber) {
        this.luggageNumber = luggageNumber;
    }

    public String getMealStatus() {
        return mealStatus;
    }

    public void setMealStatus(String mealStatus) {
        this.mealStatus = mealStatus;
    }

    public String getRules() {
        return rules;
    }

    public void setRules(String rules) {
        this.rules = rules;
    }

    public String getExecutiveFlightId() {
        return executiveFlightId;
    }

    public void setExecutiveFlightId(String executiveFlightId) {
        this.executiveFlightId = executiveFlightId;
    }

    public int getCabinId() {
        return cabinId;
    }

    public void setCabinId(int cabinId) {
        this.cabinId = cabinId;
    }

    public String getDepartureairportName() {
        return departureairportName;
    }

    public void setDepartureairportName(String departureairportName) {
        this.departureairportName = departureairportName;
    }

    public String getArrivalairportName() {
        return arrivalairportName;
    }

    public void setArrivalairportName(String arrivalairportName) {
        this.arrivalairportName = arrivalairportName;
    }

    public String getDepartureterminalName() {
        return departureterminalName;
    }

    public void setDepartureterminalName(String departureterminalName) {
        this.departureterminalName = departureterminalName;
    }

    public String getArrivalterminalName() {
        return arrivalterminalName;
    }

    public void setArrivalterminalName(String arrivalterminalName) {
        this.arrivalterminalName = arrivalterminalName;
    }

    public int getIntegral() {
        return integral;
    }

    public void setIntegral(int integral) {
        this.integral = integral;
    }

    @Override
    public String toString() {
        return "FindTicket{" +
                "flightId='" + flightId + '\'' +
                ", executiveFlightId='" + executiveFlightId + '\'' +
                ", departurecity='" + departurecity + '\'' +
                ", arrivalcity='" + arrivalcity + '\'' +
                ", departuretime=" + departuretime +
                ", arrivaltime=" + arrivaltime +
                ", cabinId=" + cabinId +
                ", cabinLevel='" + cabinLevel + '\'' +
                ", executivePrice=" + executivePrice +
                ", sellingPrice=" + sellingPrice +
                ", discount=" + discount +
                ", remainingTickets=" + remainingTickets +
                ", luggageAllowance=" + luggageAllowance +
                ", luggageNumber=" + luggageNumber +
                ", mealStatus='" + mealStatus + '\'' +
                ", rules='" + rules + '\'' +
                ", departureairportName='" + departureairportName + '\'' +
                ", arrivalairportName='" + arrivalairportName + '\'' +
                ", departureterminalName='" + departureterminalName + '\'' +
                ", arrivalterminalName='" + arrivalterminalName + '\'' +
                ", integral=" + integral +
                '}';
    }
}
