package cn.jmu.bean;

import java.util.ArrayList;
import java.util.List;

public class TerminalExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TerminalExample() {
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

        public Criteria andAirportidIsNull() {
            addCriterion("airportId is null");
            return (Criteria) this;
        }

        public Criteria andAirportidIsNotNull() {
            addCriterion("airportId is not null");
            return (Criteria) this;
        }

        public Criteria andAirportidEqualTo(Integer value) {
            addCriterion("airportId =", value, "airportid");
            return (Criteria) this;
        }

        public Criteria andAirportidNotEqualTo(Integer value) {
            addCriterion("airportId <>", value, "airportid");
            return (Criteria) this;
        }

        public Criteria andAirportidGreaterThan(Integer value) {
            addCriterion("airportId >", value, "airportid");
            return (Criteria) this;
        }

        public Criteria andAirportidGreaterThanOrEqualTo(Integer value) {
            addCriterion("airportId >=", value, "airportid");
            return (Criteria) this;
        }

        public Criteria andAirportidLessThan(Integer value) {
            addCriterion("airportId <", value, "airportid");
            return (Criteria) this;
        }

        public Criteria andAirportidLessThanOrEqualTo(Integer value) {
            addCriterion("airportId <=", value, "airportid");
            return (Criteria) this;
        }

        public Criteria andAirportidIn(List<Integer> values) {
            addCriterion("airportId in", values, "airportid");
            return (Criteria) this;
        }

        public Criteria andAirportidNotIn(List<Integer> values) {
            addCriterion("airportId not in", values, "airportid");
            return (Criteria) this;
        }

        public Criteria andAirportidBetween(Integer value1, Integer value2) {
            addCriterion("airportId between", value1, value2, "airportid");
            return (Criteria) this;
        }

        public Criteria andAirportidNotBetween(Integer value1, Integer value2) {
            addCriterion("airportId not between", value1, value2, "airportid");
            return (Criteria) this;
        }

        public Criteria andTerminalnameIsNull() {
            addCriterion("terminalName is null");
            return (Criteria) this;
        }

        public Criteria andTerminalnameIsNotNull() {
            addCriterion("terminalName is not null");
            return (Criteria) this;
        }

        public Criteria andTerminalnameEqualTo(String value) {
            addCriterion("terminalName =", value, "terminalname");
            return (Criteria) this;
        }

        public Criteria andTerminalnameNotEqualTo(String value) {
            addCriterion("terminalName <>", value, "terminalname");
            return (Criteria) this;
        }

        public Criteria andTerminalnameGreaterThan(String value) {
            addCriterion("terminalName >", value, "terminalname");
            return (Criteria) this;
        }

        public Criteria andTerminalnameGreaterThanOrEqualTo(String value) {
            addCriterion("terminalName >=", value, "terminalname");
            return (Criteria) this;
        }

        public Criteria andTerminalnameLessThan(String value) {
            addCriterion("terminalName <", value, "terminalname");
            return (Criteria) this;
        }

        public Criteria andTerminalnameLessThanOrEqualTo(String value) {
            addCriterion("terminalName <=", value, "terminalname");
            return (Criteria) this;
        }

        public Criteria andTerminalnameLike(String value) {
            addCriterion("terminalName like", value, "terminalname");
            return (Criteria) this;
        }

        public Criteria andTerminalnameNotLike(String value) {
            addCriterion("terminalName not like", value, "terminalname");
            return (Criteria) this;
        }

        public Criteria andTerminalnameIn(List<String> values) {
            addCriterion("terminalName in", values, "terminalname");
            return (Criteria) this;
        }

        public Criteria andTerminalnameNotIn(List<String> values) {
            addCriterion("terminalName not in", values, "terminalname");
            return (Criteria) this;
        }

        public Criteria andTerminalnameBetween(String value1, String value2) {
            addCriterion("terminalName between", value1, value2, "terminalname");
            return (Criteria) this;
        }

        public Criteria andTerminalnameNotBetween(String value1, String value2) {
            addCriterion("terminalName not between", value1, value2, "terminalname");
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