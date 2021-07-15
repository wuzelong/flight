package cn.jmu.bean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ExecutiveFlightExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ExecutiveFlightExample() {
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

        public Criteria andExecutiveflightidIsNull() {
            addCriterion("executiveFlightId is null");
            return (Criteria) this;
        }

        public Criteria andExecutiveflightidIsNotNull() {
            addCriterion("executiveFlightId is not null");
            return (Criteria) this;
        }

        public Criteria andExecutiveflightidEqualTo(String value) {
            addCriterion("executiveFlightId =", value, "executiveflightid");
            return (Criteria) this;
        }

        public Criteria andExecutiveflightidNotEqualTo(String value) {
            addCriterion("executiveFlightId <>", value, "executiveflightid");
            return (Criteria) this;
        }

        public Criteria andExecutiveflightidGreaterThan(String value) {
            addCriterion("executiveFlightId >", value, "executiveflightid");
            return (Criteria) this;
        }

        public Criteria andExecutiveflightidGreaterThanOrEqualTo(String value) {
            addCriterion("executiveFlightId >=", value, "executiveflightid");
            return (Criteria) this;
        }

        public Criteria andExecutiveflightidLessThan(String value) {
            addCriterion("executiveFlightId <", value, "executiveflightid");
            return (Criteria) this;
        }

        public Criteria andExecutiveflightidLessThanOrEqualTo(String value) {
            addCriterion("executiveFlightId <=", value, "executiveflightid");
            return (Criteria) this;
        }

        public Criteria andExecutiveflightidLike(String value) {
            addCriterion("executiveFlightId like", value, "executiveflightid");
            return (Criteria) this;
        }

        public Criteria andExecutiveflightidNotLike(String value) {
            addCriterion("executiveFlightId not like", value, "executiveflightid");
            return (Criteria) this;
        }

        public Criteria andExecutiveflightidIn(List<String> values) {
            addCriterion("executiveFlightId in", values, "executiveflightid");
            return (Criteria) this;
        }

        public Criteria andExecutiveflightidNotIn(List<String> values) {
            addCriterion("executiveFlightId not in", values, "executiveflightid");
            return (Criteria) this;
        }

        public Criteria andExecutiveflightidBetween(String value1, String value2) {
            addCriterion("executiveFlightId between", value1, value2, "executiveflightid");
            return (Criteria) this;
        }

        public Criteria andExecutiveflightidNotBetween(String value1, String value2) {
            addCriterion("executiveFlightId not between", value1, value2, "executiveflightid");
            return (Criteria) this;
        }

        public Criteria andFlightidIsNull() {
            addCriterion("flightId is null");
            return (Criteria) this;
        }

        public Criteria andFlightidIsNotNull() {
            addCriterion("flightId is not null");
            return (Criteria) this;
        }

        public Criteria andFlightidEqualTo(String value) {
            addCriterion("flightId =", value, "flightid");
            return (Criteria) this;
        }

        public Criteria andFlightidNotEqualTo(String value) {
            addCriterion("flightId <>", value, "flightid");
            return (Criteria) this;
        }

        public Criteria andFlightidGreaterThan(String value) {
            addCriterion("flightId >", value, "flightid");
            return (Criteria) this;
        }

        public Criteria andFlightidGreaterThanOrEqualTo(String value) {
            addCriterion("flightId >=", value, "flightid");
            return (Criteria) this;
        }

        public Criteria andFlightidLessThan(String value) {
            addCriterion("flightId <", value, "flightid");
            return (Criteria) this;
        }

        public Criteria andFlightidLessThanOrEqualTo(String value) {
            addCriterion("flightId <=", value, "flightid");
            return (Criteria) this;
        }

        public Criteria andFlightidLike(String value) {
            addCriterion("flightId like", value, "flightid");
            return (Criteria) this;
        }

        public Criteria andFlightidNotLike(String value) {
            addCriterion("flightId not like", value, "flightid");
            return (Criteria) this;
        }

        public Criteria andFlightidIn(List<String> values) {
            addCriterion("flightId in", values, "flightid");
            return (Criteria) this;
        }

        public Criteria andFlightidNotIn(List<String> values) {
            addCriterion("flightId not in", values, "flightid");
            return (Criteria) this;
        }

        public Criteria andFlightidBetween(String value1, String value2) {
            addCriterion("flightId between", value1, value2, "flightid");
            return (Criteria) this;
        }

        public Criteria andFlightidNotBetween(String value1, String value2) {
            addCriterion("flightId not between", value1, value2, "flightid");
            return (Criteria) this;
        }

        public Criteria andExecutivedateIsNull() {
            addCriterion("executiveDate is null");
            return (Criteria) this;
        }

        public Criteria andExecutivedateIsNotNull() {
            addCriterion("executiveDate is not null");
            return (Criteria) this;
        }

        public Criteria andExecutivedateEqualTo(Date value) {
            addCriterion("executiveDate =", value, "executivedate");
            return (Criteria) this;
        }

        public Criteria andExecutivedateNotEqualTo(Date value) {
            addCriterion("executiveDate <>", value, "executivedate");
            return (Criteria) this;
        }

        public Criteria andExecutivedateGreaterThan(Date value) {
            addCriterion("executiveDate >", value, "executivedate");
            return (Criteria) this;
        }

        public Criteria andExecutivedateGreaterThanOrEqualTo(Date value) {
            addCriterion("executiveDate >=", value, "executivedate");
            return (Criteria) this;
        }

        public Criteria andExecutivedateLessThan(Date value) {
            addCriterion("executiveDate <", value, "executivedate");
            return (Criteria) this;
        }

        public Criteria andExecutivedateLessThanOrEqualTo(Date value) {
            addCriterion("executiveDate <=", value, "executivedate");
            return (Criteria) this;
        }

        public Criteria andExecutivedateIn(List<Date> values) {
            addCriterion("executiveDate in", values, "executivedate");
            return (Criteria) this;
        }

        public Criteria andExecutivedateNotIn(List<Date> values) {
            addCriterion("executiveDate not in", values, "executivedate");
            return (Criteria) this;
        }

        public Criteria andExecutivedateBetween(Date value1, Date value2) {
            addCriterion("executiveDate between", value1, value2, "executivedate");
            return (Criteria) this;
        }

        public Criteria andExecutivedateNotBetween(Date value1, Date value2) {
            addCriterion("executiveDate not between", value1, value2, "executivedate");
            return (Criteria) this;
        }

        public Criteria andExecutivepriceIsNull() {
            addCriterion("executivePrice is null");
            return (Criteria) this;
        }

        public Criteria andExecutivepriceIsNotNull() {
            addCriterion("executivePrice is not null");
            return (Criteria) this;
        }

        public Criteria andExecutivepriceEqualTo(BigDecimal value) {
            addCriterion("executivePrice =", value, "executiveprice");
            return (Criteria) this;
        }

        public Criteria andExecutivepriceNotEqualTo(BigDecimal value) {
            addCriterion("executivePrice <>", value, "executiveprice");
            return (Criteria) this;
        }

        public Criteria andExecutivepriceGreaterThan(BigDecimal value) {
            addCriterion("executivePrice >", value, "executiveprice");
            return (Criteria) this;
        }

        public Criteria andExecutivepriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("executivePrice >=", value, "executiveprice");
            return (Criteria) this;
        }

        public Criteria andExecutivepriceLessThan(BigDecimal value) {
            addCriterion("executivePrice <", value, "executiveprice");
            return (Criteria) this;
        }

        public Criteria andExecutivepriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("executivePrice <=", value, "executiveprice");
            return (Criteria) this;
        }

        public Criteria andExecutivepriceIn(List<BigDecimal> values) {
            addCriterion("executivePrice in", values, "executiveprice");
            return (Criteria) this;
        }

        public Criteria andExecutivepriceNotIn(List<BigDecimal> values) {
            addCriterion("executivePrice not in", values, "executiveprice");
            return (Criteria) this;
        }

        public Criteria andExecutivepriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("executivePrice between", value1, value2, "executiveprice");
            return (Criteria) this;
        }

        public Criteria andExecutivepriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("executivePrice not between", value1, value2, "executiveprice");
            return (Criteria) this;
        }

        public Criteria andFlightstatusIsNull() {
            addCriterion("flightStatus is null");
            return (Criteria) this;
        }

        public Criteria andFlightstatusIsNotNull() {
            addCriterion("flightStatus is not null");
            return (Criteria) this;
        }

        public Criteria andFlightstatusEqualTo(String value) {
            addCriterion("flightStatus =", value, "flightstatus");
            return (Criteria) this;
        }

        public Criteria andFlightstatusNotEqualTo(String value) {
            addCriterion("flightStatus <>", value, "flightstatus");
            return (Criteria) this;
        }

        public Criteria andFlightstatusGreaterThan(String value) {
            addCriterion("flightStatus >", value, "flightstatus");
            return (Criteria) this;
        }

        public Criteria andFlightstatusGreaterThanOrEqualTo(String value) {
            addCriterion("flightStatus >=", value, "flightstatus");
            return (Criteria) this;
        }

        public Criteria andFlightstatusLessThan(String value) {
            addCriterion("flightStatus <", value, "flightstatus");
            return (Criteria) this;
        }

        public Criteria andFlightstatusLessThanOrEqualTo(String value) {
            addCriterion("flightStatus <=", value, "flightstatus");
            return (Criteria) this;
        }

        public Criteria andFlightstatusLike(String value) {
            addCriterion("flightStatus like", value, "flightstatus");
            return (Criteria) this;
        }

        public Criteria andFlightstatusNotLike(String value) {
            addCriterion("flightStatus not like", value, "flightstatus");
            return (Criteria) this;
        }

        public Criteria andFlightstatusIn(List<String> values) {
            addCriterion("flightStatus in", values, "flightstatus");
            return (Criteria) this;
        }

        public Criteria andFlightstatusNotIn(List<String> values) {
            addCriterion("flightStatus not in", values, "flightstatus");
            return (Criteria) this;
        }

        public Criteria andFlightstatusBetween(String value1, String value2) {
            addCriterion("flightStatus between", value1, value2, "flightstatus");
            return (Criteria) this;
        }

        public Criteria andFlightstatusNotBetween(String value1, String value2) {
            addCriterion("flightStatus not between", value1, value2, "flightstatus");
            return (Criteria) this;
        }

        public Criteria andEtdIsNull() {
            addCriterion("ETD is null");
            return (Criteria) this;
        }

        public Criteria andEtdIsNotNull() {
            addCriterion("ETD is not null");
            return (Criteria) this;
        }

        public Criteria andEtdEqualTo(Date value) {
            addCriterion("ETD =", value, "etd");
            return (Criteria) this;
        }

        public Criteria andEtdNotEqualTo(Date value) {
            addCriterion("ETD <>", value, "etd");
            return (Criteria) this;
        }

        public Criteria andEtdGreaterThan(Date value) {
            addCriterion("ETD >", value, "etd");
            return (Criteria) this;
        }

        public Criteria andEtdGreaterThanOrEqualTo(Date value) {
            addCriterion("ETD >=", value, "etd");
            return (Criteria) this;
        }

        public Criteria andEtdLessThan(Date value) {
            addCriterion("ETD <", value, "etd");
            return (Criteria) this;
        }

        public Criteria andEtdLessThanOrEqualTo(Date value) {
            addCriterion("ETD <=", value, "etd");
            return (Criteria) this;
        }

        public Criteria andEtdIn(List<Date> values) {
            addCriterion("ETD in", values, "etd");
            return (Criteria) this;
        }

        public Criteria andEtdNotIn(List<Date> values) {
            addCriterion("ETD not in", values, "etd");
            return (Criteria) this;
        }

        public Criteria andEtdBetween(Date value1, Date value2) {
            addCriterion("ETD between", value1, value2, "etd");
            return (Criteria) this;
        }

        public Criteria andEtdNotBetween(Date value1, Date value2) {
            addCriterion("ETD not between", value1, value2, "etd");
            return (Criteria) this;
        }

        public Criteria andAtdIsNull() {
            addCriterion("ATD is null");
            return (Criteria) this;
        }

        public Criteria andAtdIsNotNull() {
            addCriterion("ATD is not null");
            return (Criteria) this;
        }

        public Criteria andAtdEqualTo(Date value) {
            addCriterion("ATD =", value, "atd");
            return (Criteria) this;
        }

        public Criteria andAtdNotEqualTo(Date value) {
            addCriterion("ATD <>", value, "atd");
            return (Criteria) this;
        }

        public Criteria andAtdGreaterThan(Date value) {
            addCriterion("ATD >", value, "atd");
            return (Criteria) this;
        }

        public Criteria andAtdGreaterThanOrEqualTo(Date value) {
            addCriterion("ATD >=", value, "atd");
            return (Criteria) this;
        }

        public Criteria andAtdLessThan(Date value) {
            addCriterion("ATD <", value, "atd");
            return (Criteria) this;
        }

        public Criteria andAtdLessThanOrEqualTo(Date value) {
            addCriterion("ATD <=", value, "atd");
            return (Criteria) this;
        }

        public Criteria andAtdIn(List<Date> values) {
            addCriterion("ATD in", values, "atd");
            return (Criteria) this;
        }

        public Criteria andAtdNotIn(List<Date> values) {
            addCriterion("ATD not in", values, "atd");
            return (Criteria) this;
        }

        public Criteria andAtdBetween(Date value1, Date value2) {
            addCriterion("ATD between", value1, value2, "atd");
            return (Criteria) this;
        }

        public Criteria andAtdNotBetween(Date value1, Date value2) {
            addCriterion("ATD not between", value1, value2, "atd");
            return (Criteria) this;
        }

        public Criteria andEtaIsNull() {
            addCriterion("ETA is null");
            return (Criteria) this;
        }

        public Criteria andEtaIsNotNull() {
            addCriterion("ETA is not null");
            return (Criteria) this;
        }

        public Criteria andEtaEqualTo(Date value) {
            addCriterion("ETA =", value, "eta");
            return (Criteria) this;
        }

        public Criteria andEtaNotEqualTo(Date value) {
            addCriterion("ETA <>", value, "eta");
            return (Criteria) this;
        }

        public Criteria andEtaGreaterThan(Date value) {
            addCriterion("ETA >", value, "eta");
            return (Criteria) this;
        }

        public Criteria andEtaGreaterThanOrEqualTo(Date value) {
            addCriterion("ETA >=", value, "eta");
            return (Criteria) this;
        }

        public Criteria andEtaLessThan(Date value) {
            addCriterion("ETA <", value, "eta");
            return (Criteria) this;
        }

        public Criteria andEtaLessThanOrEqualTo(Date value) {
            addCriterion("ETA <=", value, "eta");
            return (Criteria) this;
        }

        public Criteria andEtaIn(List<Date> values) {
            addCriterion("ETA in", values, "eta");
            return (Criteria) this;
        }

        public Criteria andEtaNotIn(List<Date> values) {
            addCriterion("ETA not in", values, "eta");
            return (Criteria) this;
        }

        public Criteria andEtaBetween(Date value1, Date value2) {
            addCriterion("ETA between", value1, value2, "eta");
            return (Criteria) this;
        }

        public Criteria andEtaNotBetween(Date value1, Date value2) {
            addCriterion("ETA not between", value1, value2, "eta");
            return (Criteria) this;
        }

        public Criteria andAtaIsNull() {
            addCriterion("ATA is null");
            return (Criteria) this;
        }

        public Criteria andAtaIsNotNull() {
            addCriterion("ATA is not null");
            return (Criteria) this;
        }

        public Criteria andAtaEqualTo(Date value) {
            addCriterion("ATA =", value, "ata");
            return (Criteria) this;
        }

        public Criteria andAtaNotEqualTo(Date value) {
            addCriterion("ATA <>", value, "ata");
            return (Criteria) this;
        }

        public Criteria andAtaGreaterThan(Date value) {
            addCriterion("ATA >", value, "ata");
            return (Criteria) this;
        }

        public Criteria andAtaGreaterThanOrEqualTo(Date value) {
            addCriterion("ATA >=", value, "ata");
            return (Criteria) this;
        }

        public Criteria andAtaLessThan(Date value) {
            addCriterion("ATA <", value, "ata");
            return (Criteria) this;
        }

        public Criteria andAtaLessThanOrEqualTo(Date value) {
            addCriterion("ATA <=", value, "ata");
            return (Criteria) this;
        }

        public Criteria andAtaIn(List<Date> values) {
            addCriterion("ATA in", values, "ata");
            return (Criteria) this;
        }

        public Criteria andAtaNotIn(List<Date> values) {
            addCriterion("ATA not in", values, "ata");
            return (Criteria) this;
        }

        public Criteria andAtaBetween(Date value1, Date value2) {
            addCriterion("ATA between", value1, value2, "ata");
            return (Criteria) this;
        }

        public Criteria andAtaNotBetween(Date value1, Date value2) {
            addCriterion("ATA not between", value1, value2, "ata");
            return (Criteria) this;
        }

        public Criteria andBoardinggateIsNull() {
            addCriterion("boardingGate is null");
            return (Criteria) this;
        }

        public Criteria andBoardinggateIsNotNull() {
            addCriterion("boardingGate is not null");
            return (Criteria) this;
        }

        public Criteria andBoardinggateEqualTo(String value) {
            addCriterion("boardingGate =", value, "boardinggate");
            return (Criteria) this;
        }

        public Criteria andBoardinggateNotEqualTo(String value) {
            addCriterion("boardingGate <>", value, "boardinggate");
            return (Criteria) this;
        }

        public Criteria andBoardinggateGreaterThan(String value) {
            addCriterion("boardingGate >", value, "boardinggate");
            return (Criteria) this;
        }

        public Criteria andBoardinggateGreaterThanOrEqualTo(String value) {
            addCriterion("boardingGate >=", value, "boardinggate");
            return (Criteria) this;
        }

        public Criteria andBoardinggateLessThan(String value) {
            addCriterion("boardingGate <", value, "boardinggate");
            return (Criteria) this;
        }

        public Criteria andBoardinggateLessThanOrEqualTo(String value) {
            addCriterion("boardingGate <=", value, "boardinggate");
            return (Criteria) this;
        }

        public Criteria andBoardinggateLike(String value) {
            addCriterion("boardingGate like", value, "boardinggate");
            return (Criteria) this;
        }

        public Criteria andBoardinggateNotLike(String value) {
            addCriterion("boardingGate not like", value, "boardinggate");
            return (Criteria) this;
        }

        public Criteria andBoardinggateIn(List<String> values) {
            addCriterion("boardingGate in", values, "boardinggate");
            return (Criteria) this;
        }

        public Criteria andBoardinggateNotIn(List<String> values) {
            addCriterion("boardingGate not in", values, "boardinggate");
            return (Criteria) this;
        }

        public Criteria andBoardinggateBetween(String value1, String value2) {
            addCriterion("boardingGate between", value1, value2, "boardinggate");
            return (Criteria) this;
        }

        public Criteria andBoardinggateNotBetween(String value1, String value2) {
            addCriterion("boardingGate not between", value1, value2, "boardinggate");
            return (Criteria) this;
        }

        public Criteria andBoardingtimeIsNull() {
            addCriterion("boardingTime is null");
            return (Criteria) this;
        }

        public Criteria andBoardingtimeIsNotNull() {
            addCriterion("boardingTime is not null");
            return (Criteria) this;
        }

        public Criteria andBoardingtimeEqualTo(Date value) {
            addCriterion("boardingTime =", value, "boardingtime");
            return (Criteria) this;
        }

        public Criteria andBoardingtimeNotEqualTo(Date value) {
            addCriterion("boardingTime <>", value, "boardingtime");
            return (Criteria) this;
        }

        public Criteria andBoardingtimeGreaterThan(Date value) {
            addCriterion("boardingTime >", value, "boardingtime");
            return (Criteria) this;
        }

        public Criteria andBoardingtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("boardingTime >=", value, "boardingtime");
            return (Criteria) this;
        }

        public Criteria andBoardingtimeLessThan(Date value) {
            addCriterion("boardingTime <", value, "boardingtime");
            return (Criteria) this;
        }

        public Criteria andBoardingtimeLessThanOrEqualTo(Date value) {
            addCriterion("boardingTime <=", value, "boardingtime");
            return (Criteria) this;
        }

        public Criteria andBoardingtimeIn(List<Date> values) {
            addCriterion("boardingTime in", values, "boardingtime");
            return (Criteria) this;
        }

        public Criteria andBoardingtimeNotIn(List<Date> values) {
            addCriterion("boardingTime not in", values, "boardingtime");
            return (Criteria) this;
        }

        public Criteria andBoardingtimeBetween(Date value1, Date value2) {
            addCriterion("boardingTime between", value1, value2, "boardingtime");
            return (Criteria) this;
        }

        public Criteria andBoardingtimeNotBetween(Date value1, Date value2) {
            addCriterion("boardingTime not between", value1, value2, "boardingtime");
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