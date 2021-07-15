package cn.jmu.bean;

import java.util.ArrayList;
import java.util.List;

public class CabinExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CabinExample() {
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

        public Criteria andCabinlevelIsNull() {
            addCriterion("cabinLevel is null");
            return (Criteria) this;
        }

        public Criteria andCabinlevelIsNotNull() {
            addCriterion("cabinLevel is not null");
            return (Criteria) this;
        }

        public Criteria andCabinlevelEqualTo(String value) {
            addCriterion("cabinLevel =", value, "cabinlevel");
            return (Criteria) this;
        }

        public Criteria andCabinlevelNotEqualTo(String value) {
            addCriterion("cabinLevel <>", value, "cabinlevel");
            return (Criteria) this;
        }

        public Criteria andCabinlevelGreaterThan(String value) {
            addCriterion("cabinLevel >", value, "cabinlevel");
            return (Criteria) this;
        }

        public Criteria andCabinlevelGreaterThanOrEqualTo(String value) {
            addCriterion("cabinLevel >=", value, "cabinlevel");
            return (Criteria) this;
        }

        public Criteria andCabinlevelLessThan(String value) {
            addCriterion("cabinLevel <", value, "cabinlevel");
            return (Criteria) this;
        }

        public Criteria andCabinlevelLessThanOrEqualTo(String value) {
            addCriterion("cabinLevel <=", value, "cabinlevel");
            return (Criteria) this;
        }

        public Criteria andCabinlevelLike(String value) {
            addCriterion("cabinLevel like", value, "cabinlevel");
            return (Criteria) this;
        }

        public Criteria andCabinlevelNotLike(String value) {
            addCriterion("cabinLevel not like", value, "cabinlevel");
            return (Criteria) this;
        }

        public Criteria andCabinlevelIn(List<String> values) {
            addCriterion("cabinLevel in", values, "cabinlevel");
            return (Criteria) this;
        }

        public Criteria andCabinlevelNotIn(List<String> values) {
            addCriterion("cabinLevel not in", values, "cabinlevel");
            return (Criteria) this;
        }

        public Criteria andCabinlevelBetween(String value1, String value2) {
            addCriterion("cabinLevel between", value1, value2, "cabinlevel");
            return (Criteria) this;
        }

        public Criteria andCabinlevelNotBetween(String value1, String value2) {
            addCriterion("cabinLevel not between", value1, value2, "cabinlevel");
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