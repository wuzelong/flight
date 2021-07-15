package cn.jmu.bean;

import java.util.ArrayList;
import java.util.List;

public class SeatSelectionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SeatSelectionExample() {
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

        public Criteria andSeatidIsNull() {
            addCriterion("seatId is null");
            return (Criteria) this;
        }

        public Criteria andSeatidIsNotNull() {
            addCriterion("seatId is not null");
            return (Criteria) this;
        }

        public Criteria andSeatidEqualTo(Integer value) {
            addCriterion("seatId =", value, "seatid");
            return (Criteria) this;
        }

        public Criteria andSeatidNotEqualTo(Integer value) {
            addCriterion("seatId <>", value, "seatid");
            return (Criteria) this;
        }

        public Criteria andSeatidGreaterThan(Integer value) {
            addCriterion("seatId >", value, "seatid");
            return (Criteria) this;
        }

        public Criteria andSeatidGreaterThanOrEqualTo(Integer value) {
            addCriterion("seatId >=", value, "seatid");
            return (Criteria) this;
        }

        public Criteria andSeatidLessThan(Integer value) {
            addCriterion("seatId <", value, "seatid");
            return (Criteria) this;
        }

        public Criteria andSeatidLessThanOrEqualTo(Integer value) {
            addCriterion("seatId <=", value, "seatid");
            return (Criteria) this;
        }

        public Criteria andSeatidIn(List<Integer> values) {
            addCriterion("seatId in", values, "seatid");
            return (Criteria) this;
        }

        public Criteria andSeatidNotIn(List<Integer> values) {
            addCriterion("seatId not in", values, "seatid");
            return (Criteria) this;
        }

        public Criteria andSeatidBetween(Integer value1, Integer value2) {
            addCriterion("seatId between", value1, value2, "seatid");
            return (Criteria) this;
        }

        public Criteria andSeatidNotBetween(Integer value1, Integer value2) {
            addCriterion("seatId not between", value1, value2, "seatid");
            return (Criteria) this;
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

        public Criteria andTicketidIsNull() {
            addCriterion("ticketId is null");
            return (Criteria) this;
        }

        public Criteria andTicketidIsNotNull() {
            addCriterion("ticketId is not null");
            return (Criteria) this;
        }

        public Criteria andTicketidEqualTo(Integer value) {
            addCriterion("ticketId =", value, "ticketid");
            return (Criteria) this;
        }

        public Criteria andTicketidNotEqualTo(Integer value) {
            addCriterion("ticketId <>", value, "ticketid");
            return (Criteria) this;
        }

        public Criteria andTicketidGreaterThan(Integer value) {
            addCriterion("ticketId >", value, "ticketid");
            return (Criteria) this;
        }

        public Criteria andTicketidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ticketId >=", value, "ticketid");
            return (Criteria) this;
        }

        public Criteria andTicketidLessThan(Integer value) {
            addCriterion("ticketId <", value, "ticketid");
            return (Criteria) this;
        }

        public Criteria andTicketidLessThanOrEqualTo(Integer value) {
            addCriterion("ticketId <=", value, "ticketid");
            return (Criteria) this;
        }

        public Criteria andTicketidIn(List<Integer> values) {
            addCriterion("ticketId in", values, "ticketid");
            return (Criteria) this;
        }

        public Criteria andTicketidNotIn(List<Integer> values) {
            addCriterion("ticketId not in", values, "ticketid");
            return (Criteria) this;
        }

        public Criteria andTicketidBetween(Integer value1, Integer value2) {
            addCriterion("ticketId between", value1, value2, "ticketid");
            return (Criteria) this;
        }

        public Criteria andTicketidNotBetween(Integer value1, Integer value2) {
            addCriterion("ticketId not between", value1, value2, "ticketid");
            return (Criteria) this;
        }

        public Criteria andSeatstatusIsNull() {
            addCriterion("seatStatus is null");
            return (Criteria) this;
        }

        public Criteria andSeatstatusIsNotNull() {
            addCriterion("seatStatus is not null");
            return (Criteria) this;
        }

        public Criteria andSeatstatusEqualTo(String value) {
            addCriterion("seatStatus =", value, "seatstatus");
            return (Criteria) this;
        }

        public Criteria andSeatstatusNotEqualTo(String value) {
            addCriterion("seatStatus <>", value, "seatstatus");
            return (Criteria) this;
        }

        public Criteria andSeatstatusGreaterThan(String value) {
            addCriterion("seatStatus >", value, "seatstatus");
            return (Criteria) this;
        }

        public Criteria andSeatstatusGreaterThanOrEqualTo(String value) {
            addCriterion("seatStatus >=", value, "seatstatus");
            return (Criteria) this;
        }

        public Criteria andSeatstatusLessThan(String value) {
            addCriterion("seatStatus <", value, "seatstatus");
            return (Criteria) this;
        }

        public Criteria andSeatstatusLessThanOrEqualTo(String value) {
            addCriterion("seatStatus <=", value, "seatstatus");
            return (Criteria) this;
        }

        public Criteria andSeatstatusLike(String value) {
            addCriterion("seatStatus like", value, "seatstatus");
            return (Criteria) this;
        }

        public Criteria andSeatstatusNotLike(String value) {
            addCriterion("seatStatus not like", value, "seatstatus");
            return (Criteria) this;
        }

        public Criteria andSeatstatusIn(List<String> values) {
            addCriterion("seatStatus in", values, "seatstatus");
            return (Criteria) this;
        }

        public Criteria andSeatstatusNotIn(List<String> values) {
            addCriterion("seatStatus not in", values, "seatstatus");
            return (Criteria) this;
        }

        public Criteria andSeatstatusBetween(String value1, String value2) {
            addCriterion("seatStatus between", value1, value2, "seatstatus");
            return (Criteria) this;
        }

        public Criteria andSeatstatusNotBetween(String value1, String value2) {
            addCriterion("seatStatus not between", value1, value2, "seatstatus");
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