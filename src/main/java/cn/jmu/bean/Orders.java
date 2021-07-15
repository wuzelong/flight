package cn.jmu.bean;

import java.math.BigDecimal;
import java.util.Date;

public class Orders {
    private Integer orderid;

    private Integer userid;

    private Integer offsetintegral;

    private BigDecimal totalcost;

    private String orderstatusx;

    private String telephone;

    private Date createtime;

    private Date paidtime;

    private String linkman;

    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getOffsetintegral() {
        return offsetintegral;
    }

    public void setOffsetintegral(Integer offsetintegral) {
        this.offsetintegral = offsetintegral;
    }

    public BigDecimal getTotalcost() {
        return totalcost;
    }

    public void setTotalcost(BigDecimal totalcost) {
        this.totalcost = totalcost;
    }

    public String getOrderstatusx() {
        return orderstatusx;
    }

    public void setOrderstatusx(String orderstatusx) {
        this.orderstatusx = orderstatusx == null ? null : orderstatusx.trim();
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getPaidtime() {
        return paidtime;
    }

    public void setPaidtime(Date paidtime) {
        this.paidtime = paidtime;
    }

    public String getLinkman() {
        return linkman;
    }

    public void setLinkman(String linkman) {
        this.linkman = linkman == null ? null : linkman.trim();
    }
}