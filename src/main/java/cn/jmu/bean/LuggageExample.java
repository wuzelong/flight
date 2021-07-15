package cn.jmu.bean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class LuggageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LuggageExample() {
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

        public Criteria andLuggageidIsNull() {
            addCriterion("luggageId is null");
            return (Criteria) this;
        }

        public Criteria andLuggageidIsNotNull() {
            addCriterion("luggageId is not null");
            return (Criteria) this;
        }

        public Criteria andLuggageidEqualTo(Integer value) {
            addCriterion("luggageId =", value, "luggageid");
            return (Criteria) this;
        }

        public Criteria andLuggageidNotEqualTo(Integer value) {
            addCriterion("luggageId <>", value, "luggageid");
            return (Criteria) this;
        }

        public Criteria andLuggageidGreaterThan(Integer value) {
            addCriterion("luggageId >", value, "luggageid");
            return (Criteria) this;
        }

        public Criteria andLuggageidGreaterThanOrEqualTo(Integer value) {
            addCriterion("luggageId >=", value, "luggageid");
            return (Criteria) this;
        }

        public Criteria andLuggageidLessThan(Integer value) {
            addCriterion("luggageId <", value, "luggageid");
            return (Criteria) this;
        }

        public Criteria andLuggageidLessThanOrEqualTo(Integer value) {
            addCriterion("luggageId <=", value, "luggageid");
            return (Criteria) this;
        }

        public Criteria andLuggageidIn(List<Integer> values) {
            addCriterion("luggageId in", values, "luggageid");
            return (Criteria) this;
        }

        public Criteria andLuggageidNotIn(List<Integer> values) {
            addCriterion("luggageId not in", values, "luggageid");
            return (Criteria) this;
        }

        public Criteria andLuggageidBetween(Integer value1, Integer value2) {
            addCriterion("luggageId between", value1, value2, "luggageid");
            return (Criteria) this;
        }

        public Criteria andLuggageidNotBetween(Integer value1, Integer value2) {
            addCriterion("luggageId not between", value1, value2, "luggageid");
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

        public Criteria andLuggageweightIsNull() {
            addCriterion("luggageWeight is null");
            return (Criteria) this;
        }

        public Criteria andLuggageweightIsNotNull() {
            addCriterion("luggageWeight is not null");
            return (Criteria) this;
        }

        public Criteria andLuggageweightEqualTo(BigDecimal value) {
            addCriterion("luggageWeight =", value, "luggageweight");
            return (Criteria) this;
        }

        public Criteria andLuggageweightNotEqualTo(BigDecimal value) {
            addCriterion("luggageWeight <>", value, "luggageweight");
            return (Criteria) this;
        }

        public Criteria andLuggageweightGreaterThan(BigDecimal value) {
            addCriterion("luggageWeight >", value, "luggageweight");
            return (Criteria) this;
        }

        public Criteria andLuggageweightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("luggageWeight >=", value, "luggageweight");
            return (Criteria) this;
        }

        public Criteria andLuggageweightLessThan(BigDecimal value) {
            addCriterion("luggageWeight <", value, "luggageweight");
            return (Criteria) this;
        }

        public Criteria andLuggageweightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("luggageWeight <=", value, "luggageweight");
            return (Criteria) this;
        }

        public Criteria andLuggageweightIn(List<BigDecimal> values) {
            addCriterion("luggageWeight in", values, "luggageweight");
            return (Criteria) this;
        }

        public Criteria andLuggageweightNotIn(List<BigDecimal> values) {
            addCriterion("luggageWeight not in", values, "luggageweight");
            return (Criteria) this;
        }

        public Criteria andLuggageweightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("luggageWeight between", value1, value2, "luggageweight");
            return (Criteria) this;
        }

        public Criteria andLuggageweightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("luggageWeight not between", value1, value2, "luggageweight");
            return (Criteria) this;
        }

        public Criteria andLengthIsNull() {
            addCriterion("length is null");
            return (Criteria) this;
        }

        public Criteria andLengthIsNotNull() {
            addCriterion("length is not null");
            return (Criteria) this;
        }

        public Criteria andLengthEqualTo(BigDecimal value) {
            addCriterion("length =", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthNotEqualTo(BigDecimal value) {
            addCriterion("length <>", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthGreaterThan(BigDecimal value) {
            addCriterion("length >", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("length >=", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthLessThan(BigDecimal value) {
            addCriterion("length <", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthLessThanOrEqualTo(BigDecimal value) {
            addCriterion("length <=", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthIn(List<BigDecimal> values) {
            addCriterion("length in", values, "length");
            return (Criteria) this;
        }

        public Criteria andLengthNotIn(List<BigDecimal> values) {
            addCriterion("length not in", values, "length");
            return (Criteria) this;
        }

        public Criteria andLengthBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("length between", value1, value2, "length");
            return (Criteria) this;
        }

        public Criteria andLengthNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("length not between", value1, value2, "length");
            return (Criteria) this;
        }

        public Criteria andWidthIsNull() {
            addCriterion("width is null");
            return (Criteria) this;
        }

        public Criteria andWidthIsNotNull() {
            addCriterion("width is not null");
            return (Criteria) this;
        }

        public Criteria andWidthEqualTo(BigDecimal value) {
            addCriterion("width =", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthNotEqualTo(BigDecimal value) {
            addCriterion("width <>", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthGreaterThan(BigDecimal value) {
            addCriterion("width >", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("width >=", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthLessThan(BigDecimal value) {
            addCriterion("width <", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthLessThanOrEqualTo(BigDecimal value) {
            addCriterion("width <=", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthIn(List<BigDecimal> values) {
            addCriterion("width in", values, "width");
            return (Criteria) this;
        }

        public Criteria andWidthNotIn(List<BigDecimal> values) {
            addCriterion("width not in", values, "width");
            return (Criteria) this;
        }

        public Criteria andWidthBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("width between", value1, value2, "width");
            return (Criteria) this;
        }

        public Criteria andWidthNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("width not between", value1, value2, "width");
            return (Criteria) this;
        }

        public Criteria andHeightIsNull() {
            addCriterion("height is null");
            return (Criteria) this;
        }

        public Criteria andHeightIsNotNull() {
            addCriterion("height is not null");
            return (Criteria) this;
        }

        public Criteria andHeightEqualTo(BigDecimal value) {
            addCriterion("height =", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotEqualTo(BigDecimal value) {
            addCriterion("height <>", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightGreaterThan(BigDecimal value) {
            addCriterion("height >", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("height >=", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightLessThan(BigDecimal value) {
            addCriterion("height <", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("height <=", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightIn(List<BigDecimal> values) {
            addCriterion("height in", values, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotIn(List<BigDecimal> values) {
            addCriterion("height not in", values, "height");
            return (Criteria) this;
        }

        public Criteria andHeightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("height between", value1, value2, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("height not between", value1, value2, "height");
            return (Criteria) this;
        }

        public Criteria andFineIsNull() {
            addCriterion("fine is null");
            return (Criteria) this;
        }

        public Criteria andFineIsNotNull() {
            addCriterion("fine is not null");
            return (Criteria) this;
        }

        public Criteria andFineEqualTo(BigDecimal value) {
            addCriterion("fine =", value, "fine");
            return (Criteria) this;
        }

        public Criteria andFineNotEqualTo(BigDecimal value) {
            addCriterion("fine <>", value, "fine");
            return (Criteria) this;
        }

        public Criteria andFineGreaterThan(BigDecimal value) {
            addCriterion("fine >", value, "fine");
            return (Criteria) this;
        }

        public Criteria andFineGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("fine >=", value, "fine");
            return (Criteria) this;
        }

        public Criteria andFineLessThan(BigDecimal value) {
            addCriterion("fine <", value, "fine");
            return (Criteria) this;
        }

        public Criteria andFineLessThanOrEqualTo(BigDecimal value) {
            addCriterion("fine <=", value, "fine");
            return (Criteria) this;
        }

        public Criteria andFineIn(List<BigDecimal> values) {
            addCriterion("fine in", values, "fine");
            return (Criteria) this;
        }

        public Criteria andFineNotIn(List<BigDecimal> values) {
            addCriterion("fine not in", values, "fine");
            return (Criteria) this;
        }

        public Criteria andFineBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fine between", value1, value2, "fine");
            return (Criteria) this;
        }

        public Criteria andFineNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fine not between", value1, value2, "fine");
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