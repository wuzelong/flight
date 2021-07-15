package cn.jmu.bean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TicketTypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TicketTypeExample() {
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

        public Criteria andSellingpriceIsNull() {
            addCriterion("sellingPrice is null");
            return (Criteria) this;
        }

        public Criteria andSellingpriceIsNotNull() {
            addCriterion("sellingPrice is not null");
            return (Criteria) this;
        }

        public Criteria andSellingpriceEqualTo(BigDecimal value) {
            addCriterion("sellingPrice =", value, "sellingprice");
            return (Criteria) this;
        }

        public Criteria andSellingpriceNotEqualTo(BigDecimal value) {
            addCriterion("sellingPrice <>", value, "sellingprice");
            return (Criteria) this;
        }

        public Criteria andSellingpriceGreaterThan(BigDecimal value) {
            addCriterion("sellingPrice >", value, "sellingprice");
            return (Criteria) this;
        }

        public Criteria andSellingpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("sellingPrice >=", value, "sellingprice");
            return (Criteria) this;
        }

        public Criteria andSellingpriceLessThan(BigDecimal value) {
            addCriterion("sellingPrice <", value, "sellingprice");
            return (Criteria) this;
        }

        public Criteria andSellingpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("sellingPrice <=", value, "sellingprice");
            return (Criteria) this;
        }

        public Criteria andSellingpriceIn(List<BigDecimal> values) {
            addCriterion("sellingPrice in", values, "sellingprice");
            return (Criteria) this;
        }

        public Criteria andSellingpriceNotIn(List<BigDecimal> values) {
            addCriterion("sellingPrice not in", values, "sellingprice");
            return (Criteria) this;
        }

        public Criteria andSellingpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sellingPrice between", value1, value2, "sellingprice");
            return (Criteria) this;
        }

        public Criteria andSellingpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sellingPrice not between", value1, value2, "sellingprice");
            return (Criteria) this;
        }

        public Criteria andEffectivestarttimeIsNull() {
            addCriterion("effectiveStartTime is null");
            return (Criteria) this;
        }

        public Criteria andEffectivestarttimeIsNotNull() {
            addCriterion("effectiveStartTime is not null");
            return (Criteria) this;
        }

        public Criteria andEffectivestarttimeEqualTo(Date value) {
            addCriterion("effectiveStartTime =", value, "effectivestarttime");
            return (Criteria) this;
        }

        public Criteria andEffectivestarttimeNotEqualTo(Date value) {
            addCriterion("effectiveStartTime <>", value, "effectivestarttime");
            return (Criteria) this;
        }

        public Criteria andEffectivestarttimeGreaterThan(Date value) {
            addCriterion("effectiveStartTime >", value, "effectivestarttime");
            return (Criteria) this;
        }

        public Criteria andEffectivestarttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("effectiveStartTime >=", value, "effectivestarttime");
            return (Criteria) this;
        }

        public Criteria andEffectivestarttimeLessThan(Date value) {
            addCriterion("effectiveStartTime <", value, "effectivestarttime");
            return (Criteria) this;
        }

        public Criteria andEffectivestarttimeLessThanOrEqualTo(Date value) {
            addCriterion("effectiveStartTime <=", value, "effectivestarttime");
            return (Criteria) this;
        }

        public Criteria andEffectivestarttimeIn(List<Date> values) {
            addCriterion("effectiveStartTime in", values, "effectivestarttime");
            return (Criteria) this;
        }

        public Criteria andEffectivestarttimeNotIn(List<Date> values) {
            addCriterion("effectiveStartTime not in", values, "effectivestarttime");
            return (Criteria) this;
        }

        public Criteria andEffectivestarttimeBetween(Date value1, Date value2) {
            addCriterion("effectiveStartTime between", value1, value2, "effectivestarttime");
            return (Criteria) this;
        }

        public Criteria andEffectivestarttimeNotBetween(Date value1, Date value2) {
            addCriterion("effectiveStartTime not between", value1, value2, "effectivestarttime");
            return (Criteria) this;
        }

        public Criteria andEffectiveendtimeIsNull() {
            addCriterion("effectiveEndTime is null");
            return (Criteria) this;
        }

        public Criteria andEffectiveendtimeIsNotNull() {
            addCriterion("effectiveEndTime is not null");
            return (Criteria) this;
        }

        public Criteria andEffectiveendtimeEqualTo(Date value) {
            addCriterion("effectiveEndTime =", value, "effectiveendtime");
            return (Criteria) this;
        }

        public Criteria andEffectiveendtimeNotEqualTo(Date value) {
            addCriterion("effectiveEndTime <>", value, "effectiveendtime");
            return (Criteria) this;
        }

        public Criteria andEffectiveendtimeGreaterThan(Date value) {
            addCriterion("effectiveEndTime >", value, "effectiveendtime");
            return (Criteria) this;
        }

        public Criteria andEffectiveendtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("effectiveEndTime >=", value, "effectiveendtime");
            return (Criteria) this;
        }

        public Criteria andEffectiveendtimeLessThan(Date value) {
            addCriterion("effectiveEndTime <", value, "effectiveendtime");
            return (Criteria) this;
        }

        public Criteria andEffectiveendtimeLessThanOrEqualTo(Date value) {
            addCriterion("effectiveEndTime <=", value, "effectiveendtime");
            return (Criteria) this;
        }

        public Criteria andEffectiveendtimeIn(List<Date> values) {
            addCriterion("effectiveEndTime in", values, "effectiveendtime");
            return (Criteria) this;
        }

        public Criteria andEffectiveendtimeNotIn(List<Date> values) {
            addCriterion("effectiveEndTime not in", values, "effectiveendtime");
            return (Criteria) this;
        }

        public Criteria andEffectiveendtimeBetween(Date value1, Date value2) {
            addCriterion("effectiveEndTime between", value1, value2, "effectiveendtime");
            return (Criteria) this;
        }

        public Criteria andEffectiveendtimeNotBetween(Date value1, Date value2) {
            addCriterion("effectiveEndTime not between", value1, value2, "effectiveendtime");
            return (Criteria) this;
        }

        public Criteria andDiscountIsNull() {
            addCriterion("discount is null");
            return (Criteria) this;
        }

        public Criteria andDiscountIsNotNull() {
            addCriterion("discount is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountEqualTo(BigDecimal value) {
            addCriterion("discount =", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotEqualTo(BigDecimal value) {
            addCriterion("discount <>", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountGreaterThan(BigDecimal value) {
            addCriterion("discount >", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("discount >=", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountLessThan(BigDecimal value) {
            addCriterion("discount <", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("discount <=", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountIn(List<BigDecimal> values) {
            addCriterion("discount in", values, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotIn(List<BigDecimal> values) {
            addCriterion("discount not in", values, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("discount between", value1, value2, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("discount not between", value1, value2, "discount");
            return (Criteria) this;
        }

        public Criteria andRemainingticketsIsNull() {
            addCriterion("remainingTickets is null");
            return (Criteria) this;
        }

        public Criteria andRemainingticketsIsNotNull() {
            addCriterion("remainingTickets is not null");
            return (Criteria) this;
        }

        public Criteria andRemainingticketsEqualTo(Integer value) {
            addCriterion("remainingTickets =", value, "remainingtickets");
            return (Criteria) this;
        }

        public Criteria andRemainingticketsNotEqualTo(Integer value) {
            addCriterion("remainingTickets <>", value, "remainingtickets");
            return (Criteria) this;
        }

        public Criteria andRemainingticketsGreaterThan(Integer value) {
            addCriterion("remainingTickets >", value, "remainingtickets");
            return (Criteria) this;
        }

        public Criteria andRemainingticketsGreaterThanOrEqualTo(Integer value) {
            addCriterion("remainingTickets >=", value, "remainingtickets");
            return (Criteria) this;
        }

        public Criteria andRemainingticketsLessThan(Integer value) {
            addCriterion("remainingTickets <", value, "remainingtickets");
            return (Criteria) this;
        }

        public Criteria andRemainingticketsLessThanOrEqualTo(Integer value) {
            addCriterion("remainingTickets <=", value, "remainingtickets");
            return (Criteria) this;
        }

        public Criteria andRemainingticketsIn(List<Integer> values) {
            addCriterion("remainingTickets in", values, "remainingtickets");
            return (Criteria) this;
        }

        public Criteria andRemainingticketsNotIn(List<Integer> values) {
            addCriterion("remainingTickets not in", values, "remainingtickets");
            return (Criteria) this;
        }

        public Criteria andRemainingticketsBetween(Integer value1, Integer value2) {
            addCriterion("remainingTickets between", value1, value2, "remainingtickets");
            return (Criteria) this;
        }

        public Criteria andRemainingticketsNotBetween(Integer value1, Integer value2) {
            addCriterion("remainingTickets not between", value1, value2, "remainingtickets");
            return (Criteria) this;
        }

        public Criteria andLuggageallowanceIsNull() {
            addCriterion("luggageAllowance is null");
            return (Criteria) this;
        }

        public Criteria andLuggageallowanceIsNotNull() {
            addCriterion("luggageAllowance is not null");
            return (Criteria) this;
        }

        public Criteria andLuggageallowanceEqualTo(Integer value) {
            addCriterion("luggageAllowance =", value, "luggageallowance");
            return (Criteria) this;
        }

        public Criteria andLuggageallowanceNotEqualTo(Integer value) {
            addCriterion("luggageAllowance <>", value, "luggageallowance");
            return (Criteria) this;
        }

        public Criteria andLuggageallowanceGreaterThan(Integer value) {
            addCriterion("luggageAllowance >", value, "luggageallowance");
            return (Criteria) this;
        }

        public Criteria andLuggageallowanceGreaterThanOrEqualTo(Integer value) {
            addCriterion("luggageAllowance >=", value, "luggageallowance");
            return (Criteria) this;
        }

        public Criteria andLuggageallowanceLessThan(Integer value) {
            addCriterion("luggageAllowance <", value, "luggageallowance");
            return (Criteria) this;
        }

        public Criteria andLuggageallowanceLessThanOrEqualTo(Integer value) {
            addCriterion("luggageAllowance <=", value, "luggageallowance");
            return (Criteria) this;
        }

        public Criteria andLuggageallowanceIn(List<Integer> values) {
            addCriterion("luggageAllowance in", values, "luggageallowance");
            return (Criteria) this;
        }

        public Criteria andLuggageallowanceNotIn(List<Integer> values) {
            addCriterion("luggageAllowance not in", values, "luggageallowance");
            return (Criteria) this;
        }

        public Criteria andLuggageallowanceBetween(Integer value1, Integer value2) {
            addCriterion("luggageAllowance between", value1, value2, "luggageallowance");
            return (Criteria) this;
        }

        public Criteria andLuggageallowanceNotBetween(Integer value1, Integer value2) {
            addCriterion("luggageAllowance not between", value1, value2, "luggageallowance");
            return (Criteria) this;
        }

        public Criteria andLuggagenumberIsNull() {
            addCriterion("luggageNumber is null");
            return (Criteria) this;
        }

        public Criteria andLuggagenumberIsNotNull() {
            addCriterion("luggageNumber is not null");
            return (Criteria) this;
        }

        public Criteria andLuggagenumberEqualTo(Integer value) {
            addCriterion("luggageNumber =", value, "luggagenumber");
            return (Criteria) this;
        }

        public Criteria andLuggagenumberNotEqualTo(Integer value) {
            addCriterion("luggageNumber <>", value, "luggagenumber");
            return (Criteria) this;
        }

        public Criteria andLuggagenumberGreaterThan(Integer value) {
            addCriterion("luggageNumber >", value, "luggagenumber");
            return (Criteria) this;
        }

        public Criteria andLuggagenumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("luggageNumber >=", value, "luggagenumber");
            return (Criteria) this;
        }

        public Criteria andLuggagenumberLessThan(Integer value) {
            addCriterion("luggageNumber <", value, "luggagenumber");
            return (Criteria) this;
        }

        public Criteria andLuggagenumberLessThanOrEqualTo(Integer value) {
            addCriterion("luggageNumber <=", value, "luggagenumber");
            return (Criteria) this;
        }

        public Criteria andLuggagenumberIn(List<Integer> values) {
            addCriterion("luggageNumber in", values, "luggagenumber");
            return (Criteria) this;
        }

        public Criteria andLuggagenumberNotIn(List<Integer> values) {
            addCriterion("luggageNumber not in", values, "luggagenumber");
            return (Criteria) this;
        }

        public Criteria andLuggagenumberBetween(Integer value1, Integer value2) {
            addCriterion("luggageNumber between", value1, value2, "luggagenumber");
            return (Criteria) this;
        }

        public Criteria andLuggagenumberNotBetween(Integer value1, Integer value2) {
            addCriterion("luggageNumber not between", value1, value2, "luggagenumber");
            return (Criteria) this;
        }

        public Criteria andMealstatusIsNull() {
            addCriterion("mealStatus is null");
            return (Criteria) this;
        }

        public Criteria andMealstatusIsNotNull() {
            addCriterion("mealStatus is not null");
            return (Criteria) this;
        }

        public Criteria andMealstatusEqualTo(String value) {
            addCriterion("mealStatus =", value, "mealstatus");
            return (Criteria) this;
        }

        public Criteria andMealstatusNotEqualTo(String value) {
            addCriterion("mealStatus <>", value, "mealstatus");
            return (Criteria) this;
        }

        public Criteria andMealstatusGreaterThan(String value) {
            addCriterion("mealStatus >", value, "mealstatus");
            return (Criteria) this;
        }

        public Criteria andMealstatusGreaterThanOrEqualTo(String value) {
            addCriterion("mealStatus >=", value, "mealstatus");
            return (Criteria) this;
        }

        public Criteria andMealstatusLessThan(String value) {
            addCriterion("mealStatus <", value, "mealstatus");
            return (Criteria) this;
        }

        public Criteria andMealstatusLessThanOrEqualTo(String value) {
            addCriterion("mealStatus <=", value, "mealstatus");
            return (Criteria) this;
        }

        public Criteria andMealstatusLike(String value) {
            addCriterion("mealStatus like", value, "mealstatus");
            return (Criteria) this;
        }

        public Criteria andMealstatusNotLike(String value) {
            addCriterion("mealStatus not like", value, "mealstatus");
            return (Criteria) this;
        }

        public Criteria andMealstatusIn(List<String> values) {
            addCriterion("mealStatus in", values, "mealstatus");
            return (Criteria) this;
        }

        public Criteria andMealstatusNotIn(List<String> values) {
            addCriterion("mealStatus not in", values, "mealstatus");
            return (Criteria) this;
        }

        public Criteria andMealstatusBetween(String value1, String value2) {
            addCriterion("mealStatus between", value1, value2, "mealstatus");
            return (Criteria) this;
        }

        public Criteria andMealstatusNotBetween(String value1, String value2) {
            addCriterion("mealStatus not between", value1, value2, "mealstatus");
            return (Criteria) this;
        }

        public Criteria andRulesIsNull() {
            addCriterion("rules is null");
            return (Criteria) this;
        }

        public Criteria andRulesIsNotNull() {
            addCriterion("rules is not null");
            return (Criteria) this;
        }

        public Criteria andRulesEqualTo(String value) {
            addCriterion("rules =", value, "rules");
            return (Criteria) this;
        }

        public Criteria andRulesNotEqualTo(String value) {
            addCriterion("rules <>", value, "rules");
            return (Criteria) this;
        }

        public Criteria andRulesGreaterThan(String value) {
            addCriterion("rules >", value, "rules");
            return (Criteria) this;
        }

        public Criteria andRulesGreaterThanOrEqualTo(String value) {
            addCriterion("rules >=", value, "rules");
            return (Criteria) this;
        }

        public Criteria andRulesLessThan(String value) {
            addCriterion("rules <", value, "rules");
            return (Criteria) this;
        }

        public Criteria andRulesLessThanOrEqualTo(String value) {
            addCriterion("rules <=", value, "rules");
            return (Criteria) this;
        }

        public Criteria andRulesLike(String value) {
            addCriterion("rules like", value, "rules");
            return (Criteria) this;
        }

        public Criteria andRulesNotLike(String value) {
            addCriterion("rules not like", value, "rules");
            return (Criteria) this;
        }

        public Criteria andRulesIn(List<String> values) {
            addCriterion("rules in", values, "rules");
            return (Criteria) this;
        }

        public Criteria andRulesNotIn(List<String> values) {
            addCriterion("rules not in", values, "rules");
            return (Criteria) this;
        }

        public Criteria andRulesBetween(String value1, String value2) {
            addCriterion("rules between", value1, value2, "rules");
            return (Criteria) this;
        }

        public Criteria andRulesNotBetween(String value1, String value2) {
            addCriterion("rules not between", value1, value2, "rules");
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