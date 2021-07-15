package cn.jmu.bean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FlightExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FlightExample() {
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

        public Criteria andModelidIsNull() {
            addCriterion("modelId is null");
            return (Criteria) this;
        }

        public Criteria andModelidIsNotNull() {
            addCriterion("modelId is not null");
            return (Criteria) this;
        }

        public Criteria andModelidEqualTo(String value) {
            addCriterion("modelId =", value, "modelid");
            return (Criteria) this;
        }

        public Criteria andModelidNotEqualTo(String value) {
            addCriterion("modelId <>", value, "modelid");
            return (Criteria) this;
        }

        public Criteria andModelidGreaterThan(String value) {
            addCriterion("modelId >", value, "modelid");
            return (Criteria) this;
        }

        public Criteria andModelidGreaterThanOrEqualTo(String value) {
            addCriterion("modelId >=", value, "modelid");
            return (Criteria) this;
        }

        public Criteria andModelidLessThan(String value) {
            addCriterion("modelId <", value, "modelid");
            return (Criteria) this;
        }

        public Criteria andModelidLessThanOrEqualTo(String value) {
            addCriterion("modelId <=", value, "modelid");
            return (Criteria) this;
        }

        public Criteria andModelidLike(String value) {
            addCriterion("modelId like", value, "modelid");
            return (Criteria) this;
        }

        public Criteria andModelidNotLike(String value) {
            addCriterion("modelId not like", value, "modelid");
            return (Criteria) this;
        }

        public Criteria andModelidIn(List<String> values) {
            addCriterion("modelId in", values, "modelid");
            return (Criteria) this;
        }

        public Criteria andModelidNotIn(List<String> values) {
            addCriterion("modelId not in", values, "modelid");
            return (Criteria) this;
        }

        public Criteria andModelidBetween(String value1, String value2) {
            addCriterion("modelId between", value1, value2, "modelid");
            return (Criteria) this;
        }

        public Criteria andModelidNotBetween(String value1, String value2) {
            addCriterion("modelId not between", value1, value2, "modelid");
            return (Criteria) this;
        }

        public Criteria andTerminalidIsNull() {
            addCriterion("terminalId is null");
            return (Criteria) this;
        }

        public Criteria andTerminalidIsNotNull() {
            addCriterion("terminalId is not null");
            return (Criteria) this;
        }

        public Criteria andTerminalidEqualTo(Integer value) {
            addCriterion("terminalId =", value, "terminalid");
            return (Criteria) this;
        }

        public Criteria andTerminalidNotEqualTo(Integer value) {
            addCriterion("terminalId <>", value, "terminalid");
            return (Criteria) this;
        }

        public Criteria andTerminalidGreaterThan(Integer value) {
            addCriterion("terminalId >", value, "terminalid");
            return (Criteria) this;
        }

        public Criteria andTerminalidGreaterThanOrEqualTo(Integer value) {
            addCriterion("terminalId >=", value, "terminalid");
            return (Criteria) this;
        }

        public Criteria andTerminalidLessThan(Integer value) {
            addCriterion("terminalId <", value, "terminalid");
            return (Criteria) this;
        }

        public Criteria andTerminalidLessThanOrEqualTo(Integer value) {
            addCriterion("terminalId <=", value, "terminalid");
            return (Criteria) this;
        }

        public Criteria andTerminalidIn(List<Integer> values) {
            addCriterion("terminalId in", values, "terminalid");
            return (Criteria) this;
        }

        public Criteria andTerminalidNotIn(List<Integer> values) {
            addCriterion("terminalId not in", values, "terminalid");
            return (Criteria) this;
        }

        public Criteria andTerminalidBetween(Integer value1, Integer value2) {
            addCriterion("terminalId between", value1, value2, "terminalid");
            return (Criteria) this;
        }

        public Criteria andTerminalidNotBetween(Integer value1, Integer value2) {
            addCriterion("terminalId not between", value1, value2, "terminalid");
            return (Criteria) this;
        }

        public Criteria andTerTerminalidIsNull() {
            addCriterion("ter_terminalId is null");
            return (Criteria) this;
        }

        public Criteria andTerTerminalidIsNotNull() {
            addCriterion("ter_terminalId is not null");
            return (Criteria) this;
        }

        public Criteria andTerTerminalidEqualTo(Integer value) {
            addCriterion("ter_terminalId =", value, "terTerminalid");
            return (Criteria) this;
        }

        public Criteria andTerTerminalidNotEqualTo(Integer value) {
            addCriterion("ter_terminalId <>", value, "terTerminalid");
            return (Criteria) this;
        }

        public Criteria andTerTerminalidGreaterThan(Integer value) {
            addCriterion("ter_terminalId >", value, "terTerminalid");
            return (Criteria) this;
        }

        public Criteria andTerTerminalidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ter_terminalId >=", value, "terTerminalid");
            return (Criteria) this;
        }

        public Criteria andTerTerminalidLessThan(Integer value) {
            addCriterion("ter_terminalId <", value, "terTerminalid");
            return (Criteria) this;
        }

        public Criteria andTerTerminalidLessThanOrEqualTo(Integer value) {
            addCriterion("ter_terminalId <=", value, "terTerminalid");
            return (Criteria) this;
        }

        public Criteria andTerTerminalidIn(List<Integer> values) {
            addCriterion("ter_terminalId in", values, "terTerminalid");
            return (Criteria) this;
        }

        public Criteria andTerTerminalidNotIn(List<Integer> values) {
            addCriterion("ter_terminalId not in", values, "terTerminalid");
            return (Criteria) this;
        }

        public Criteria andTerTerminalidBetween(Integer value1, Integer value2) {
            addCriterion("ter_terminalId between", value1, value2, "terTerminalid");
            return (Criteria) this;
        }

        public Criteria andTerTerminalidNotBetween(Integer value1, Integer value2) {
            addCriterion("ter_terminalId not between", value1, value2, "terTerminalid");
            return (Criteria) this;
        }

        public Criteria andPlanneddeparturettimeIsNull() {
            addCriterion("plannedDepartureTtime is null");
            return (Criteria) this;
        }

        public Criteria andPlanneddeparturettimeIsNotNull() {
            addCriterion("plannedDepartureTtime is not null");
            return (Criteria) this;
        }

        public Criteria andPlanneddeparturettimeEqualTo(Date value) {
            addCriterion("plannedDepartureTtime =", value, "planneddeparturettime");
            return (Criteria) this;
        }

        public Criteria andPlanneddeparturettimeNotEqualTo(Date value) {
            addCriterion("plannedDepartureTtime <>", value, "planneddeparturettime");
            return (Criteria) this;
        }

        public Criteria andPlanneddeparturettimeGreaterThan(Date value) {
            addCriterion("plannedDepartureTtime >", value, "planneddeparturettime");
            return (Criteria) this;
        }

        public Criteria andPlanneddeparturettimeGreaterThanOrEqualTo(Date value) {
            addCriterion("plannedDepartureTtime >=", value, "planneddeparturettime");
            return (Criteria) this;
        }

        public Criteria andPlanneddeparturettimeLessThan(Date value) {
            addCriterion("plannedDepartureTtime <", value, "planneddeparturettime");
            return (Criteria) this;
        }

        public Criteria andPlanneddeparturettimeLessThanOrEqualTo(Date value) {
            addCriterion("plannedDepartureTtime <=", value, "planneddeparturettime");
            return (Criteria) this;
        }

        public Criteria andPlanneddeparturettimeIn(List<Date> values) {
            addCriterion("plannedDepartureTtime in", values, "planneddeparturettime");
            return (Criteria) this;
        }

        public Criteria andPlanneddeparturettimeNotIn(List<Date> values) {
            addCriterion("plannedDepartureTtime not in", values, "planneddeparturettime");
            return (Criteria) this;
        }

        public Criteria andPlanneddeparturettimeBetween(Date value1, Date value2) {
            addCriterion("plannedDepartureTtime between", value1, value2, "planneddeparturettime");
            return (Criteria) this;
        }

        public Criteria andPlanneddeparturettimeNotBetween(Date value1, Date value2) {
            addCriterion("plannedDepartureTtime not between", value1, value2, "planneddeparturettime");
            return (Criteria) this;
        }

        public Criteria andPlannedarrivaltimeIsNull() {
            addCriterion("plannedArrivalTime is null");
            return (Criteria) this;
        }

        public Criteria andPlannedarrivaltimeIsNotNull() {
            addCriterion("plannedArrivalTime is not null");
            return (Criteria) this;
        }

        public Criteria andPlannedarrivaltimeEqualTo(Date value) {
            addCriterion("plannedArrivalTime =", value, "plannedarrivaltime");
            return (Criteria) this;
        }

        public Criteria andPlannedarrivaltimeNotEqualTo(Date value) {
            addCriterion("plannedArrivalTime <>", value, "plannedarrivaltime");
            return (Criteria) this;
        }

        public Criteria andPlannedarrivaltimeGreaterThan(Date value) {
            addCriterion("plannedArrivalTime >", value, "plannedarrivaltime");
            return (Criteria) this;
        }

        public Criteria andPlannedarrivaltimeGreaterThanOrEqualTo(Date value) {
            addCriterion("plannedArrivalTime >=", value, "plannedarrivaltime");
            return (Criteria) this;
        }

        public Criteria andPlannedarrivaltimeLessThan(Date value) {
            addCriterion("plannedArrivalTime <", value, "plannedarrivaltime");
            return (Criteria) this;
        }

        public Criteria andPlannedarrivaltimeLessThanOrEqualTo(Date value) {
            addCriterion("plannedArrivalTime <=", value, "plannedarrivaltime");
            return (Criteria) this;
        }

        public Criteria andPlannedarrivaltimeIn(List<Date> values) {
            addCriterion("plannedArrivalTime in", values, "plannedarrivaltime");
            return (Criteria) this;
        }

        public Criteria andPlannedarrivaltimeNotIn(List<Date> values) {
            addCriterion("plannedArrivalTime not in", values, "plannedarrivaltime");
            return (Criteria) this;
        }

        public Criteria andPlannedarrivaltimeBetween(Date value1, Date value2) {
            addCriterion("plannedArrivalTime between", value1, value2, "plannedarrivaltime");
            return (Criteria) this;
        }

        public Criteria andPlannedarrivaltimeNotBetween(Date value1, Date value2) {
            addCriterion("plannedArrivalTime not between", value1, value2, "plannedarrivaltime");
            return (Criteria) this;
        }

        public Criteria andPricingIsNull() {
            addCriterion("pricing is null");
            return (Criteria) this;
        }

        public Criteria andPricingIsNotNull() {
            addCriterion("pricing is not null");
            return (Criteria) this;
        }

        public Criteria andPricingEqualTo(BigDecimal value) {
            addCriterion("pricing =", value, "pricing");
            return (Criteria) this;
        }

        public Criteria andPricingNotEqualTo(BigDecimal value) {
            addCriterion("pricing <>", value, "pricing");
            return (Criteria) this;
        }

        public Criteria andPricingGreaterThan(BigDecimal value) {
            addCriterion("pricing >", value, "pricing");
            return (Criteria) this;
        }

        public Criteria andPricingGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("pricing >=", value, "pricing");
            return (Criteria) this;
        }

        public Criteria andPricingLessThan(BigDecimal value) {
            addCriterion("pricing <", value, "pricing");
            return (Criteria) this;
        }

        public Criteria andPricingLessThanOrEqualTo(BigDecimal value) {
            addCriterion("pricing <=", value, "pricing");
            return (Criteria) this;
        }

        public Criteria andPricingIn(List<BigDecimal> values) {
            addCriterion("pricing in", values, "pricing");
            return (Criteria) this;
        }

        public Criteria andPricingNotIn(List<BigDecimal> values) {
            addCriterion("pricing not in", values, "pricing");
            return (Criteria) this;
        }

        public Criteria andPricingBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pricing between", value1, value2, "pricing");
            return (Criteria) this;
        }

        public Criteria andPricingNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pricing not between", value1, value2, "pricing");
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