package cn.jmu.bean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrdersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrdersExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andOrderidIsNull() {
            addCriterion("orderId is null");
            return (Criteria) this;
        }

        public Criteria andOrderidIsNotNull() {
            addCriterion("orderId is not null");
            return (Criteria) this;
        }

        public Criteria andOrderidEqualTo(Integer value) {
            addCriterion("orderId =", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotEqualTo(Integer value) {
            addCriterion("orderId <>", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThan(Integer value) {
            addCriterion("orderId >", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThanOrEqualTo(Integer value) {
            addCriterion("orderId >=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThan(Integer value) {
            addCriterion("orderId <", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThanOrEqualTo(Integer value) {
            addCriterion("orderId <=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidIn(List<Integer> values) {
            addCriterion("orderId in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotIn(List<Integer> values) {
            addCriterion("orderId not in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidBetween(Integer value1, Integer value2) {
            addCriterion("orderId between", value1, value2, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotBetween(Integer value1, Integer value2) {
            addCriterion("orderId not between", value1, value2, "orderid");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("userId is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userId is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Integer value) {
            addCriterion("userId =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Integer value) {
            addCriterion("userId <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Integer value) {
            addCriterion("userId >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("userId >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Integer value) {
            addCriterion("userId <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Integer value) {
            addCriterion("userId <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Integer> values) {
            addCriterion("userId in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Integer> values) {
            addCriterion("userId not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Integer value1, Integer value2) {
            addCriterion("userId between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("userId not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andOffsetintegralIsNull() {
            addCriterion("offsetIntegral is null");
            return (Criteria) this;
        }

        public Criteria andOffsetintegralIsNotNull() {
            addCriterion("offsetIntegral is not null");
            return (Criteria) this;
        }

        public Criteria andOffsetintegralEqualTo(Integer value) {
            addCriterion("offsetIntegral =", value, "offsetintegral");
            return (Criteria) this;
        }

        public Criteria andOffsetintegralNotEqualTo(Integer value) {
            addCriterion("offsetIntegral <>", value, "offsetintegral");
            return (Criteria) this;
        }

        public Criteria andOffsetintegralGreaterThan(Integer value) {
            addCriterion("offsetIntegral >", value, "offsetintegral");
            return (Criteria) this;
        }

        public Criteria andOffsetintegralGreaterThanOrEqualTo(Integer value) {
            addCriterion("offsetIntegral >=", value, "offsetintegral");
            return (Criteria) this;
        }

        public Criteria andOffsetintegralLessThan(Integer value) {
            addCriterion("offsetIntegral <", value, "offsetintegral");
            return (Criteria) this;
        }

        public Criteria andOffsetintegralLessThanOrEqualTo(Integer value) {
            addCriterion("offsetIntegral <=", value, "offsetintegral");
            return (Criteria) this;
        }

        public Criteria andOffsetintegralIn(List<Integer> values) {
            addCriterion("offsetIntegral in", values, "offsetintegral");
            return (Criteria) this;
        }

        public Criteria andOffsetintegralNotIn(List<Integer> values) {
            addCriterion("offsetIntegral not in", values, "offsetintegral");
            return (Criteria) this;
        }

        public Criteria andOffsetintegralBetween(Integer value1, Integer value2) {
            addCriterion("offsetIntegral between", value1, value2, "offsetintegral");
            return (Criteria) this;
        }

        public Criteria andOffsetintegralNotBetween(Integer value1, Integer value2) {
            addCriterion("offsetIntegral not between", value1, value2, "offsetintegral");
            return (Criteria) this;
        }

        public Criteria andTotalcostIsNull() {
            addCriterion("totalCost is null");
            return (Criteria) this;
        }

        public Criteria andTotalcostIsNotNull() {
            addCriterion("totalCost is not null");
            return (Criteria) this;
        }

        public Criteria andTotalcostEqualTo(BigDecimal value) {
            addCriterion("totalCost =", value, "totalcost");
            return (Criteria) this;
        }

        public Criteria andTotalcostNotEqualTo(BigDecimal value) {
            addCriterion("totalCost <>", value, "totalcost");
            return (Criteria) this;
        }

        public Criteria andTotalcostGreaterThan(BigDecimal value) {
            addCriterion("totalCost >", value, "totalcost");
            return (Criteria) this;
        }

        public Criteria andTotalcostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("totalCost >=", value, "totalcost");
            return (Criteria) this;
        }

        public Criteria andTotalcostLessThan(BigDecimal value) {
            addCriterion("totalCost <", value, "totalcost");
            return (Criteria) this;
        }

        public Criteria andTotalcostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("totalCost <=", value, "totalcost");
            return (Criteria) this;
        }

        public Criteria andTotalcostIn(List<BigDecimal> values) {
            addCriterion("totalCost in", values, "totalcost");
            return (Criteria) this;
        }

        public Criteria andTotalcostNotIn(List<BigDecimal> values) {
            addCriterion("totalCost not in", values, "totalcost");
            return (Criteria) this;
        }

        public Criteria andTotalcostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("totalCost between", value1, value2, "totalcost");
            return (Criteria) this;
        }

        public Criteria andTotalcostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("totalCost not between", value1, value2, "totalcost");
            return (Criteria) this;
        }

        public Criteria andOrderstatusxIsNull() {
            addCriterion("orderStatusx is null");
            return (Criteria) this;
        }

        public Criteria andOrderstatusxIsNotNull() {
            addCriterion("orderStatusx is not null");
            return (Criteria) this;
        }

        public Criteria andOrderstatusxEqualTo(String value) {
            addCriterion("orderStatusx =", value, "orderstatusx");
            return (Criteria) this;
        }

        public Criteria andOrderstatusxNotEqualTo(String value) {
            addCriterion("orderStatusx <>", value, "orderstatusx");
            return (Criteria) this;
        }

        public Criteria andOrderstatusxGreaterThan(String value) {
            addCriterion("orderStatusx >", value, "orderstatusx");
            return (Criteria) this;
        }

        public Criteria andOrderstatusxGreaterThanOrEqualTo(String value) {
            addCriterion("orderStatusx >=", value, "orderstatusx");
            return (Criteria) this;
        }

        public Criteria andOrderstatusxLessThan(String value) {
            addCriterion("orderStatusx <", value, "orderstatusx");
            return (Criteria) this;
        }

        public Criteria andOrderstatusxLessThanOrEqualTo(String value) {
            addCriterion("orderStatusx <=", value, "orderstatusx");
            return (Criteria) this;
        }

        public Criteria andOrderstatusxLike(String value) {
            addCriterion("orderStatusx like", value, "orderstatusx");
            return (Criteria) this;
        }

        public Criteria andOrderstatusxNotLike(String value) {
            addCriterion("orderStatusx not like", value, "orderstatusx");
            return (Criteria) this;
        }

        public Criteria andOrderstatusxIn(List<String> values) {
            addCriterion("orderStatusx in", values, "orderstatusx");
            return (Criteria) this;
        }

        public Criteria andOrderstatusxNotIn(List<String> values) {
            addCriterion("orderStatusx not in", values, "orderstatusx");
            return (Criteria) this;
        }

        public Criteria andOrderstatusxBetween(String value1, String value2) {
            addCriterion("orderStatusx between", value1, value2, "orderstatusx");
            return (Criteria) this;
        }

        public Criteria andOrderstatusxNotBetween(String value1, String value2) {
            addCriterion("orderStatusx not between", value1, value2, "orderstatusx");
            return (Criteria) this;
        }

        public Criteria andTelephoneIsNull() {
            addCriterion("telephone is null");
            return (Criteria) this;
        }

        public Criteria andTelephoneIsNotNull() {
            addCriterion("telephone is not null");
            return (Criteria) this;
        }

        public Criteria andTelephoneEqualTo(String value) {
            addCriterion("telephone =", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotEqualTo(String value) {
            addCriterion("telephone <>", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneGreaterThan(String value) {
            addCriterion("telephone >", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("telephone >=", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLessThan(String value) {
            addCriterion("telephone <", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLessThanOrEqualTo(String value) {
            addCriterion("telephone <=", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLike(String value) {
            addCriterion("telephone like", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotLike(String value) {
            addCriterion("telephone not like", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneIn(List<String> values) {
            addCriterion("telephone in", values, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotIn(List<String> values) {
            addCriterion("telephone not in", values, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneBetween(String value1, String value2) {
            addCriterion("telephone between", value1, value2, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotBetween(String value1, String value2) {
            addCriterion("telephone not between", value1, value2, "telephone");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createTime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("createTime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("createTime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("createTime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createTime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("createTime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createTime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("createTime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("createTime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("createTime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("createTime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andPaidtimeIsNull() {
            addCriterion("paidTime is null");
            return (Criteria) this;
        }

        public Criteria andPaidtimeIsNotNull() {
            addCriterion("paidTime is not null");
            return (Criteria) this;
        }

        public Criteria andPaidtimeEqualTo(Date value) {
            addCriterion("paidTime =", value, "paidtime");
            return (Criteria) this;
        }

        public Criteria andPaidtimeNotEqualTo(Date value) {
            addCriterion("paidTime <>", value, "paidtime");
            return (Criteria) this;
        }

        public Criteria andPaidtimeGreaterThan(Date value) {
            addCriterion("paidTime >", value, "paidtime");
            return (Criteria) this;
        }

        public Criteria andPaidtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("paidTime >=", value, "paidtime");
            return (Criteria) this;
        }

        public Criteria andPaidtimeLessThan(Date value) {
            addCriterion("paidTime <", value, "paidtime");
            return (Criteria) this;
        }

        public Criteria andPaidtimeLessThanOrEqualTo(Date value) {
            addCriterion("paidTime <=", value, "paidtime");
            return (Criteria) this;
        }

        public Criteria andPaidtimeIn(List<Date> values) {
            addCriterion("paidTime in", values, "paidtime");
            return (Criteria) this;
        }

        public Criteria andPaidtimeNotIn(List<Date> values) {
            addCriterion("paidTime not in", values, "paidtime");
            return (Criteria) this;
        }

        public Criteria andPaidtimeBetween(Date value1, Date value2) {
            addCriterion("paidTime between", value1, value2, "paidtime");
            return (Criteria) this;
        }

        public Criteria andPaidtimeNotBetween(Date value1, Date value2) {
            addCriterion("paidTime not between", value1, value2, "paidtime");
            return (Criteria) this;
        }

        public Criteria andLinkmanIsNull() {
            addCriterion("linkman is null");
            return (Criteria) this;
        }

        public Criteria andLinkmanIsNotNull() {
            addCriterion("linkman is not null");
            return (Criteria) this;
        }

        public Criteria andLinkmanEqualTo(String value) {
            addCriterion("linkman =", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanNotEqualTo(String value) {
            addCriterion("linkman <>", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanGreaterThan(String value) {
            addCriterion("linkman >", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanGreaterThanOrEqualTo(String value) {
            addCriterion("linkman >=", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanLessThan(String value) {
            addCriterion("linkman <", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanLessThanOrEqualTo(String value) {
            addCriterion("linkman <=", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanLike(String value) {
            addCriterion("linkman like", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanNotLike(String value) {
            addCriterion("linkman not like", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanIn(List<String> values) {
            addCriterion("linkman in", values, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanNotIn(List<String> values) {
            addCriterion("linkman not in", values, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanBetween(String value1, String value2) {
            addCriterion("linkman between", value1, value2, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanNotBetween(String value1, String value2) {
            addCriterion("linkman not between", value1, value2, "linkman");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}