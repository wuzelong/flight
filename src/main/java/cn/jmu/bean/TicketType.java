package cn.jmu.bean;

import java.math.BigDecimal;
import java.util.Date;

public class TicketType extends TicketTypeKey {
    private BigDecimal sellingprice;

    private Date effectivestarttime;

    private Date effectiveendtime;

    private BigDecimal discount;

    private Integer remainingtickets;

    private Integer luggageallowance;

    private Integer luggagenumber;

    private String mealstatus;

    private String rules;

    public BigDecimal getSellingprice() {
        return sellingprice;
    }

    public void setSellingprice(BigDecimal sellingprice) {
        this.sellingprice = sellingprice;
    }

    public Date getEffectivestarttime() {
        return effectivestarttime;
    }

    public void setEffectivestarttime(Date effectivestarttime) {
        this.effectivestarttime = effectivestarttime;
    }

    public Date getEffectiveendtime() {
        return effectiveendtime;
    }

    public void setEffectiveendtime(Date effectiveendtime) {
        this.effectiveendtime = effectiveendtime;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    public Integer getRemainingtickets() {
        return remainingtickets;
    }

    public void setRemainingtickets(Integer remainingtickets) {
        this.remainingtickets = remainingtickets;
    }

    public Integer getLuggageallowance() {
        return luggageallowance;
    }

    public void setLuggageallowance(Integer luggageallowance) {
        this.luggageallowance = luggageallowance;
    }

    public Integer getLuggagenumber() {
        return luggagenumber;
    }

    public void setLuggagenumber(Integer luggagenumber) {
        this.luggagenumber = luggagenumber;
    }

    public String getMealstatus() {
        return mealstatus;
    }

    public void setMealstatus(String mealstatus) {
        this.mealstatus = mealstatus == null ? null : mealstatus.trim();
    }

    public String getRules() {
        return rules;
    }

    public void setRules(String rules) {
        this.rules = rules == null ? null : rules.trim();
    }
}