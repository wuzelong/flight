package cn.jmu.bean;

import java.util.ArrayList;
import java.util.List;

public class AirportManagerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AirportManagerExample() {
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

        public Criteria andManageridIsNull() {
            addCriterion("managerId is null");
            return (Criteria) this;
        }

        public Criteria andManageridIsNotNull() {
            addCriterion("managerId is not null");
            return (Criteria) this;
        }

        public Criteria andManageridEqualTo(Integer value) {
            addCriterion("managerId =", value, "managerid");
            return (Criteria) this;
        }

        public Criteria andManageridNotEqualTo(Integer value) {
            addCriterion("managerId <>", value, "managerid");
            return (Criteria) this;
        }

        public Criteria andManageridGreaterThan(Integer value) {
            addCriterion("managerId >", value, "managerid");
            return (Criteria) this;
        }

        public Criteria andManageridGreaterThanOrEqualTo(Integer value) {
            addCriterion("managerId >=", value, "managerid");
            return (Criteria) this;
        }

        public Criteria andManageridLessThan(Integer value) {
            addCriterion("managerId <", value, "managerid");
            return (Criteria) this;
        }

        public Criteria andManageridLessThanOrEqualTo(Integer value) {
            addCriterion("managerId <=", value, "managerid");
            return (Criteria) this;
        }

        public Criteria andManageridIn(List<Integer> values) {
            addCriterion("managerId in", values, "managerid");
            return (Criteria) this;
        }

        public Criteria andManageridNotIn(List<Integer> values) {
            addCriterion("managerId not in", values, "managerid");
            return (Criteria) this;
        }

        public Criteria andManageridBetween(Integer value1, Integer value2) {
            addCriterion("managerId between", value1, value2, "managerid");
            return (Criteria) this;
        }

        public Criteria andManageridNotBetween(Integer value1, Integer value2) {
            addCriterion("managerId not between", value1, value2, "managerid");
            return (Criteria) this;
        }

        public Criteria andAuthorityIsNull() {
            addCriterion("authority is null");
            return (Criteria) this;
        }

        public Criteria andAuthorityIsNotNull() {
            addCriterion("authority is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorityEqualTo(String value) {
            addCriterion("authority =", value, "authority");
            return (Criteria) this;
        }

        public Criteria andAuthorityNotEqualTo(String value) {
            addCriterion("authority <>", value, "authority");
            return (Criteria) this;
        }

        public Criteria andAuthorityGreaterThan(String value) {
            addCriterion("authority >", value, "authority");
            return (Criteria) this;
        }

        public Criteria andAuthorityGreaterThanOrEqualTo(String value) {
            addCriterion("authority >=", value, "authority");
            return (Criteria) this;
        }

        public Criteria andAuthorityLessThan(String value) {
            addCriterion("authority <", value, "authority");
            return (Criteria) this;
        }

        public Criteria andAuthorityLessThanOrEqualTo(String value) {
            addCriterion("authority <=", value, "authority");
            return (Criteria) this;
        }

        public Criteria andAuthorityLike(String value) {
            addCriterion("authority like", value, "authority");
            return (Criteria) this;
        }

        public Criteria andAuthorityNotLike(String value) {
            addCriterion("authority not like", value, "authority");
            return (Criteria) this;
        }

        public Criteria andAuthorityIn(List<String> values) {
            addCriterion("authority in", values, "authority");
            return (Criteria) this;
        }

        public Criteria andAuthorityNotIn(List<String> values) {
            addCriterion("authority not in", values, "authority");
            return (Criteria) this;
        }

        public Criteria andAuthorityBetween(String value1, String value2) {
            addCriterion("authority between", value1, value2, "authority");
            return (Criteria) this;
        }

        public Criteria andAuthorityNotBetween(String value1, String value2) {
            addCriterion("authority not between", value1, value2, "authority");
            return (Criteria) this;
        }

        public Criteria andLoginidIsNull() {
            addCriterion("loginId is null");
            return (Criteria) this;
        }

        public Criteria andLoginidIsNotNull() {
            addCriterion("loginId is not null");
            return (Criteria) this;
        }

        public Criteria andLoginidEqualTo(String value) {
            addCriterion("loginId =", value, "loginid");
            return (Criteria) this;
        }

        public Criteria andLoginidNotEqualTo(String value) {
            addCriterion("loginId <>", value, "loginid");
            return (Criteria) this;
        }

        public Criteria andLoginidGreaterThan(String value) {
            addCriterion("loginId >", value, "loginid");
            return (Criteria) this;
        }

        public Criteria andLoginidGreaterThanOrEqualTo(String value) {
            addCriterion("loginId >=", value, "loginid");
            return (Criteria) this;
        }

        public Criteria andLoginidLessThan(String value) {
            addCriterion("loginId <", value, "loginid");
            return (Criteria) this;
        }

        public Criteria andLoginidLessThanOrEqualTo(String value) {
            addCriterion("loginId <=", value, "loginid");
            return (Criteria) this;
        }

        public Criteria andLoginidLike(String value) {
            addCriterion("loginId like", value, "loginid");
            return (Criteria) this;
        }

        public Criteria andLoginidNotLike(String value) {
            addCriterion("loginId not like", value, "loginid");
            return (Criteria) this;
        }

        public Criteria andLoginidIn(List<String> values) {
            addCriterion("loginId in", values, "loginid");
            return (Criteria) this;
        }

        public Criteria andLoginidNotIn(List<String> values) {
            addCriterion("loginId not in", values, "loginid");
            return (Criteria) this;
        }

        public Criteria andLoginidBetween(String value1, String value2) {
            addCriterion("loginId between", value1, value2, "loginid");
            return (Criteria) this;
        }

        public Criteria andLoginidNotBetween(String value1, String value2) {
            addCriterion("loginId not between", value1, value2, "loginid");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
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