package cn.jmu.bean;

import java.util.ArrayList;
import java.util.List;

public class SeatingChartExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SeatingChartExample() {
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

        public Criteria andCabinidIsNull() {
            addCriterion("cabinId is null");
            return (Criteria) this;
        }

        public Criteria andCabinidIsNotNull() {
            addCriterion("cabinId is not null");
            return (Criteria) this;
        }

        public Criteria andCabinidEqualTo(Integer value) {
            addCriterion("cabinId =", value, "cabinid");
            return (Criteria) this;
        }

        public Criteria andCabinidNotEqualTo(Integer value) {
            addCriterion("cabinId <>", value, "cabinid");
            return (Criteria) this;
        }

        public Criteria andCabinidGreaterThan(Integer value) {
            addCriterion("cabinId >", value, "cabinid");
            return (Criteria) this;
        }

        public Criteria andCabinidGreaterThanOrEqualTo(Integer value) {
            addCriterion("cabinId >=", value, "cabinid");
            return (Criteria) this;
        }

        public Criteria andCabinidLessThan(Integer value) {
            addCriterion("cabinId <", value, "cabinid");
            return (Criteria) this;
        }

        public Criteria andCabinidLessThanOrEqualTo(Integer value) {
            addCriterion("cabinId <=", value, "cabinid");
            return (Criteria) this;
        }

        public Criteria andCabinidIn(List<Integer> values) {
            addCriterion("cabinId in", values, "cabinid");
            return (Criteria) this;
        }

        public Criteria andCabinidNotIn(List<Integer> values) {
            addCriterion("cabinId not in", values, "cabinid");
            return (Criteria) this;
        }

        public Criteria andCabinidBetween(Integer value1, Integer value2) {
            addCriterion("cabinId between", value1, value2, "cabinid");
            return (Criteria) this;
        }

        public Criteria andCabinidNotBetween(Integer value1, Integer value2) {
            addCriterion("cabinId not between", value1, value2, "cabinid");
            return (Criteria) this;
        }

        public Criteria andPositionIsNull() {
            addCriterion("position is null");
            return (Criteria) this;
        }

        public Criteria andPositionIsNotNull() {
            addCriterion("position is not null");
            return (Criteria) this;
        }

        public Criteria andPositionEqualTo(String value) {
            addCriterion("position =", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotEqualTo(String value) {
            addCriterion("position <>", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThan(String value) {
            addCriterion("position >", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThanOrEqualTo(String value) {
            addCriterion("position >=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThan(String value) {
            addCriterion("position <", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThanOrEqualTo(String value) {
            addCriterion("position <=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLike(String value) {
            addCriterion("position like", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotLike(String value) {
            addCriterion("position not like", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionIn(List<String> values) {
            addCriterion("position in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotIn(List<String> values) {
            addCriterion("position not in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionBetween(String value1, String value2) {
            addCriterion("position between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotBetween(String value1, String value2) {
            addCriterion("position not between", value1, value2, "position");
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