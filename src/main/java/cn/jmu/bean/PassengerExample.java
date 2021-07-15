package cn.jmu.bean;

import java.util.ArrayList;
import java.util.List;

public class PassengerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PassengerExample() {
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

        public Criteria andPassengeridIsNull() {
            addCriterion("passengerId is null");
            return (Criteria) this;
        }

        public Criteria andPassengeridIsNotNull() {
            addCriterion("passengerId is not null");
            return (Criteria) this;
        }

        public Criteria andPassengeridEqualTo(String value) {
            addCriterion("passengerId =", value, "passengerid");
            return (Criteria) this;
        }

        public Criteria andPassengeridNotEqualTo(String value) {
            addCriterion("passengerId <>", value, "passengerid");
            return (Criteria) this;
        }

        public Criteria andPassengeridGreaterThan(String value) {
            addCriterion("passengerId >", value, "passengerid");
            return (Criteria) this;
        }

        public Criteria andPassengeridGreaterThanOrEqualTo(String value) {
            addCriterion("passengerId >=", value, "passengerid");
            return (Criteria) this;
        }

        public Criteria andPassengeridLessThan(String value) {
            addCriterion("passengerId <", value, "passengerid");
            return (Criteria) this;
        }

        public Criteria andPassengeridLessThanOrEqualTo(String value) {
            addCriterion("passengerId <=", value, "passengerid");
            return (Criteria) this;
        }

        public Criteria andPassengeridLike(String value) {
            addCriterion("passengerId like", value, "passengerid");
            return (Criteria) this;
        }

        public Criteria andPassengeridNotLike(String value) {
            addCriterion("passengerId not like", value, "passengerid");
            return (Criteria) this;
        }

        public Criteria andPassengeridIn(List<String> values) {
            addCriterion("passengerId in", values, "passengerid");
            return (Criteria) this;
        }

        public Criteria andPassengeridNotIn(List<String> values) {
            addCriterion("passengerId not in", values, "passengerid");
            return (Criteria) this;
        }

        public Criteria andPassengeridBetween(String value1, String value2) {
            addCriterion("passengerId between", value1, value2, "passengerid");
            return (Criteria) this;
        }

        public Criteria andPassengeridNotBetween(String value1, String value2) {
            addCriterion("passengerId not between", value1, value2, "passengerid");
            return (Criteria) this;
        }

        public Criteria andPassengernameIsNull() {
            addCriterion("passengerName is null");
            return (Criteria) this;
        }

        public Criteria andPassengernameIsNotNull() {
            addCriterion("passengerName is not null");
            return (Criteria) this;
        }

        public Criteria andPassengernameEqualTo(String value) {
            addCriterion("passengerName =", value, "passengername");
            return (Criteria) this;
        }

        public Criteria andPassengernameNotEqualTo(String value) {
            addCriterion("passengerName <>", value, "passengername");
            return (Criteria) this;
        }

        public Criteria andPassengernameGreaterThan(String value) {
            addCriterion("passengerName >", value, "passengername");
            return (Criteria) this;
        }

        public Criteria andPassengernameGreaterThanOrEqualTo(String value) {
            addCriterion("passengerName >=", value, "passengername");
            return (Criteria) this;
        }

        public Criteria andPassengernameLessThan(String value) {
            addCriterion("passengerName <", value, "passengername");
            return (Criteria) this;
        }

        public Criteria andPassengernameLessThanOrEqualTo(String value) {
            addCriterion("passengerName <=", value, "passengername");
            return (Criteria) this;
        }

        public Criteria andPassengernameLike(String value) {
            addCriterion("passengerName like", value, "passengername");
            return (Criteria) this;
        }

        public Criteria andPassengernameNotLike(String value) {
            addCriterion("passengerName not like", value, "passengername");
            return (Criteria) this;
        }

        public Criteria andPassengernameIn(List<String> values) {
            addCriterion("passengerName in", values, "passengername");
            return (Criteria) this;
        }

        public Criteria andPassengernameNotIn(List<String> values) {
            addCriterion("passengerName not in", values, "passengername");
            return (Criteria) this;
        }

        public Criteria andPassengernameBetween(String value1, String value2) {
            addCriterion("passengerName between", value1, value2, "passengername");
            return (Criteria) this;
        }

        public Criteria andPassengernameNotBetween(String value1, String value2) {
            addCriterion("passengerName not between", value1, value2, "passengername");
            return (Criteria) this;
        }

        public Criteria andPassengersexIsNull() {
            addCriterion("passengerSex is null");
            return (Criteria) this;
        }

        public Criteria andPassengersexIsNotNull() {
            addCriterion("passengerSex is not null");
            return (Criteria) this;
        }

        public Criteria andPassengersexEqualTo(String value) {
            addCriterion("passengerSex =", value, "passengersex");
            return (Criteria) this;
        }

        public Criteria andPassengersexNotEqualTo(String value) {
            addCriterion("passengerSex <>", value, "passengersex");
            return (Criteria) this;
        }

        public Criteria andPassengersexGreaterThan(String value) {
            addCriterion("passengerSex >", value, "passengersex");
            return (Criteria) this;
        }

        public Criteria andPassengersexGreaterThanOrEqualTo(String value) {
            addCriterion("passengerSex >=", value, "passengersex");
            return (Criteria) this;
        }

        public Criteria andPassengersexLessThan(String value) {
            addCriterion("passengerSex <", value, "passengersex");
            return (Criteria) this;
        }

        public Criteria andPassengersexLessThanOrEqualTo(String value) {
            addCriterion("passengerSex <=", value, "passengersex");
            return (Criteria) this;
        }

        public Criteria andPassengersexLike(String value) {
            addCriterion("passengerSex like", value, "passengersex");
            return (Criteria) this;
        }

        public Criteria andPassengersexNotLike(String value) {
            addCriterion("passengerSex not like", value, "passengersex");
            return (Criteria) this;
        }

        public Criteria andPassengersexIn(List<String> values) {
            addCriterion("passengerSex in", values, "passengersex");
            return (Criteria) this;
        }

        public Criteria andPassengersexNotIn(List<String> values) {
            addCriterion("passengerSex not in", values, "passengersex");
            return (Criteria) this;
        }

        public Criteria andPassengersexBetween(String value1, String value2) {
            addCriterion("passengerSex between", value1, value2, "passengersex");
            return (Criteria) this;
        }

        public Criteria andPassengersexNotBetween(String value1, String value2) {
            addCriterion("passengerSex not between", value1, value2, "passengersex");
            return (Criteria) this;
        }

        public Criteria andPassengertelIsNull() {
            addCriterion("passengerTel is null");
            return (Criteria) this;
        }

        public Criteria andPassengertelIsNotNull() {
            addCriterion("passengerTel is not null");
            return (Criteria) this;
        }

        public Criteria andPassengertelEqualTo(String value) {
            addCriterion("passengerTel =", value, "passengertel");
            return (Criteria) this;
        }

        public Criteria andPassengertelNotEqualTo(String value) {
            addCriterion("passengerTel <>", value, "passengertel");
            return (Criteria) this;
        }

        public Criteria andPassengertelGreaterThan(String value) {
            addCriterion("passengerTel >", value, "passengertel");
            return (Criteria) this;
        }

        public Criteria andPassengertelGreaterThanOrEqualTo(String value) {
            addCriterion("passengerTel >=", value, "passengertel");
            return (Criteria) this;
        }

        public Criteria andPassengertelLessThan(String value) {
            addCriterion("passengerTel <", value, "passengertel");
            return (Criteria) this;
        }

        public Criteria andPassengertelLessThanOrEqualTo(String value) {
            addCriterion("passengerTel <=", value, "passengertel");
            return (Criteria) this;
        }

        public Criteria andPassengertelLike(String value) {
            addCriterion("passengerTel like", value, "passengertel");
            return (Criteria) this;
        }

        public Criteria andPassengertelNotLike(String value) {
            addCriterion("passengerTel not like", value, "passengertel");
            return (Criteria) this;
        }

        public Criteria andPassengertelIn(List<String> values) {
            addCriterion("passengerTel in", values, "passengertel");
            return (Criteria) this;
        }

        public Criteria andPassengertelNotIn(List<String> values) {
            addCriterion("passengerTel not in", values, "passengertel");
            return (Criteria) this;
        }

        public Criteria andPassengertelBetween(String value1, String value2) {
            addCriterion("passengerTel between", value1, value2, "passengertel");
            return (Criteria) this;
        }

        public Criteria andPassengertelNotBetween(String value1, String value2) {
            addCriterion("passengerTel not between", value1, value2, "passengertel");
            return (Criteria) this;
        }

        public Criteria andCreditstatusIsNull() {
            addCriterion("creditStatus is null");
            return (Criteria) this;
        }

        public Criteria andCreditstatusIsNotNull() {
            addCriterion("creditStatus is not null");
            return (Criteria) this;
        }

        public Criteria andCreditstatusEqualTo(String value) {
            addCriterion("creditStatus =", value, "creditstatus");
            return (Criteria) this;
        }

        public Criteria andCreditstatusNotEqualTo(String value) {
            addCriterion("creditStatus <>", value, "creditstatus");
            return (Criteria) this;
        }

        public Criteria andCreditstatusGreaterThan(String value) {
            addCriterion("creditStatus >", value, "creditstatus");
            return (Criteria) this;
        }

        public Criteria andCreditstatusGreaterThanOrEqualTo(String value) {
            addCriterion("creditStatus >=", value, "creditstatus");
            return (Criteria) this;
        }

        public Criteria andCreditstatusLessThan(String value) {
            addCriterion("creditStatus <", value, "creditstatus");
            return (Criteria) this;
        }

        public Criteria andCreditstatusLessThanOrEqualTo(String value) {
            addCriterion("creditStatus <=", value, "creditstatus");
            return (Criteria) this;
        }

        public Criteria andCreditstatusLike(String value) {
            addCriterion("creditStatus like", value, "creditstatus");
            return (Criteria) this;
        }

        public Criteria andCreditstatusNotLike(String value) {
            addCriterion("creditStatus not like", value, "creditstatus");
            return (Criteria) this;
        }

        public Criteria andCreditstatusIn(List<String> values) {
            addCriterion("creditStatus in", values, "creditstatus");
            return (Criteria) this;
        }

        public Criteria andCreditstatusNotIn(List<String> values) {
            addCriterion("creditStatus not in", values, "creditstatus");
            return (Criteria) this;
        }

        public Criteria andCreditstatusBetween(String value1, String value2) {
            addCriterion("creditStatus between", value1, value2, "creditstatus");
            return (Criteria) this;
        }

        public Criteria andCreditstatusNotBetween(String value1, String value2) {
            addCriterion("creditStatus not between", value1, value2, "creditstatus");
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