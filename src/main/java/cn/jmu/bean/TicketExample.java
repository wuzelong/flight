package cn.jmu.bean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class TicketExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TicketExample() {
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

        public Criteria andOrderidIsNull() {
            addCriterion("orderId is null");
            return (Criteria) this;
        }

        public Criteria andOrderidIsNotNull() {
            addCriterion("orderId is not null");
            return (Criteria) this;
        }

        public Criteria andOrderidEqualTo(Integer value) {
            addCriterion("orderId =", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotEqualTo(Integer value) {
            addCriterion("orderId <>", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThan(Integer value) {
            addCriterion("orderId >", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThanOrEqualTo(Integer value) {
            addCriterion("orderId >=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThan(Integer value) {
            addCriterion("orderId <", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThanOrEqualTo(Integer value) {
            addCriterion("orderId <=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidIn(List<Integer> values) {
            addCriterion("orderId in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotIn(List<Integer> values) {
            addCriterion("orderId not in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidBetween(Integer value1, Integer value2) {
            addCriterion("orderId between", value1, value2, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotBetween(Integer value1, Integer value2) {
            addCriterion("orderId not between", value1, value2, "orderid");
            return (Criteria) this;
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

        public Criteria andTicExecutiveflightidIsNull() {
            addCriterion("tic_executiveFlightId is null");
            return (Criteria) this;
        }

        public Criteria andTicExecutiveflightidIsNotNull() {
            addCriterion("tic_executiveFlightId is not null");
            return (Criteria) this;
        }

        public Criteria andTicExecutiveflightidEqualTo(String value) {
            addCriterion("tic_executiveFlightId =", value, "ticExecutiveflightid");
            return (Criteria) this;
        }

        public Criteria andTicExecutiveflightidNotEqualTo(String value) {
            addCriterion("tic_executiveFlightId <>", value, "ticExecutiveflightid");
            return (Criteria) this;
        }

        public Criteria andTicExecutiveflightidGreaterThan(String value) {
            addCriterion("tic_executiveFlightId >", value, "ticExecutiveflightid");
            return (Criteria) this;
        }

        public Criteria andTicExecutiveflightidGreaterThanOrEqualTo(String value) {
            addCriterion("tic_executiveFlightId >=", value, "ticExecutiveflightid");
            return (Criteria) this;
        }

        public Criteria andTicExecutiveflightidLessThan(String value) {
            addCriterion("tic_executiveFlightId <", value, "ticExecutiveflightid");
            return (Criteria) this;
        }

        public Criteria andTicExecutiveflightidLessThanOrEqualTo(String value) {
            addCriterion("tic_executiveFlightId <=", value, "ticExecutiveflightid");
            return (Criteria) this;
        }

        public Criteria andTicExecutiveflightidLike(String value) {
            addCriterion("tic_executiveFlightId like", value, "ticExecutiveflightid");
            return (Criteria) this;
        }

        public Criteria andTicExecutiveflightidNotLike(String value) {
            addCriterion("tic_executiveFlightId not like", value, "ticExecutiveflightid");
            return (Criteria) this;
        }

        public Criteria andTicExecutiveflightidIn(List<String> values) {
            addCriterion("tic_executiveFlightId in", values, "ticExecutiveflightid");
            return (Criteria) this;
        }

        public Criteria andTicExecutiveflightidNotIn(List<String> values) {
            addCriterion("tic_executiveFlightId not in", values, "ticExecutiveflightid");
            return (Criteria) this;
        }

        public Criteria andTicExecutiveflightidBetween(String value1, String value2) {
            addCriterion("tic_executiveFlightId between", value1, value2, "ticExecutiveflightid");
            return (Criteria) this;
        }

        public Criteria andTicExecutiveflightidNotBetween(String value1, String value2) {
            addCriterion("tic_executiveFlightId not between", value1, value2, "ticExecutiveflightid");
            return (Criteria) this;
        }

        public Criteria andAirportconstructioncostIsNull() {
            addCriterion("airportConstructionCost is null");
            return (Criteria) this;
        }

        public Criteria andAirportconstructioncostIsNotNull() {
            addCriterion("airportConstructionCost is not null");
            return (Criteria) this;
        }

        public Criteria andAirportconstructioncostEqualTo(BigDecimal value) {
            addCriterion("airportConstructionCost =", value, "airportconstructioncost");
            return (Criteria) this;
        }

        public Criteria andAirportconstructioncostNotEqualTo(BigDecimal value) {
            addCriterion("airportConstructionCost <>", value, "airportconstructioncost");
            return (Criteria) this;
        }

        public Criteria andAirportconstructioncostGreaterThan(BigDecimal value) {
            addCriterion("airportConstructionCost >", value, "airportconstructioncost");
            return (Criteria) this;
        }

        public Criteria andAirportconstructioncostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("airportConstructionCost >=", value, "airportconstructioncost");
            return (Criteria) this;
        }

        public Criteria andAirportconstructioncostLessThan(BigDecimal value) {
            addCriterion("airportConstructionCost <", value, "airportconstructioncost");
            return (Criteria) this;
        }

        public Criteria andAirportconstructioncostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("airportConstructionCost <=", value, "airportconstructioncost");
            return (Criteria) this;
        }

        public Criteria andAirportconstructioncostIn(List<BigDecimal> values) {
            addCriterion("airportConstructionCost in", values, "airportconstructioncost");
            return (Criteria) this;
        }

        public Criteria andAirportconstructioncostNotIn(List<BigDecimal> values) {
            addCriterion("airportConstructionCost not in", values, "airportconstructioncost");
            return (Criteria) this;
        }

        public Criteria andAirportconstructioncostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("airportConstructionCost between", value1, value2, "airportconstructioncost");
            return (Criteria) this;
        }

        public Criteria andAirportconstructioncostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("airportConstructionCost not between", value1, value2, "airportconstructioncost");
            return (Criteria) this;
        }

        public Criteria andInsurancecostIsNull() {
            addCriterion("insuranceCost is null");
            return (Criteria) this;
        }

        public Criteria andInsurancecostIsNotNull() {
            addCriterion("insuranceCost is not null");
            return (Criteria) this;
        }

        public Criteria andInsurancecostEqualTo(BigDecimal value) {
            addCriterion("insuranceCost =", value, "insurancecost");
            return (Criteria) this;
        }

        public Criteria andInsurancecostNotEqualTo(BigDecimal value) {
            addCriterion("insuranceCost <>", value, "insurancecost");
            return (Criteria) this;
        }

        public Criteria andInsurancecostGreaterThan(BigDecimal value) {
            addCriterion("insuranceCost >", value, "insurancecost");
            return (Criteria) this;
        }

        public Criteria andInsurancecostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("insuranceCost >=", value, "insurancecost");
            return (Criteria) this;
        }

        public Criteria andInsurancecostLessThan(BigDecimal value) {
            addCriterion("insuranceCost <", value, "insurancecost");
            return (Criteria) this;
        }

        public Criteria andInsurancecostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("insuranceCost <=", value, "insurancecost");
            return (Criteria) this;
        }

        public Criteria andInsurancecostIn(List<BigDecimal> values) {
            addCriterion("insuranceCost in", values, "insurancecost");
            return (Criteria) this;
        }

        public Criteria andInsurancecostNotIn(List<BigDecimal> values) {
            addCriterion("insuranceCost not in", values, "insurancecost");
            return (Criteria) this;
        }

        public Criteria andInsurancecostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("insuranceCost between", value1, value2, "insurancecost");
            return (Criteria) this;
        }

        public Criteria andInsurancecostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("insuranceCost not between", value1, value2, "insurancecost");
            return (Criteria) this;
        }

        public Criteria andTotalcostIsNull() {
            addCriterion("totalCost is null");
            return (Criteria) this;
        }

        public Criteria andTotalcostIsNotNull() {
            addCriterion("totalCost is not null");
            return (Criteria) this;
        }

        public Criteria andTotalcostEqualTo(BigDecimal value) {
            addCriterion("totalCost =", value, "totalcost");
            return (Criteria) this;
        }

        public Criteria andTotalcostNotEqualTo(BigDecimal value) {
            addCriterion("totalCost <>", value, "totalcost");
            return (Criteria) this;
        }

        public Criteria andTotalcostGreaterThan(BigDecimal value) {
            addCriterion("totalCost >", value, "totalcost");
            return (Criteria) this;
        }

        public Criteria andTotalcostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("totalCost >=", value, "totalcost");
            return (Criteria) this;
        }

        public Criteria andTotalcostLessThan(BigDecimal value) {
            addCriterion("totalCost <", value, "totalcost");
            return (Criteria) this;
        }

        public Criteria andTotalcostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("totalCost <=", value, "totalcost");
            return (Criteria) this;
        }

        public Criteria andTotalcostIn(List<BigDecimal> values) {
            addCriterion("totalCost in", values, "totalcost");
            return (Criteria) this;
        }

        public Criteria andTotalcostNotIn(List<BigDecimal> values) {
            addCriterion("totalCost not in", values, "totalcost");
            return (Criteria) this;
        }

        public Criteria andTotalcostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("totalCost between", value1, value2, "totalcost");
            return (Criteria) this;
        }

        public Criteria andTotalcostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("totalCost not between", value1, value2, "totalcost");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNull() {
            addCriterion("remarks is null");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNotNull() {
            addCriterion("remarks is not null");
            return (Criteria) this;
        }

        public Criteria andRemarksEqualTo(String value) {
            addCriterion("remarks =", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotEqualTo(String value) {
            addCriterion("remarks <>", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThan(String value) {
            addCriterion("remarks >", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("remarks >=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThan(String value) {
            addCriterion("remarks <", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThanOrEqualTo(String value) {
            addCriterion("remarks <=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLike(String value) {
            addCriterion("remarks like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotLike(String value) {
            addCriterion("remarks not like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksIn(List<String> values) {
            addCriterion("remarks in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotIn(List<String> values) {
            addCriterion("remarks not in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksBetween(String value1, String value2) {
            addCriterion("remarks between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotBetween(String value1, String value2) {
            addCriterion("remarks not between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andCheckstatusIsNull() {
            addCriterion("checkStatus is null");
            return (Criteria) this;
        }

        public Criteria andCheckstatusIsNotNull() {
            addCriterion("checkStatus is not null");
            return (Criteria) this;
        }

        public Criteria andCheckstatusEqualTo(String value) {
            addCriterion("checkStatus =", value, "checkstatus");
            return (Criteria) this;
        }

        public Criteria andCheckstatusNotEqualTo(String value) {
            addCriterion("checkStatus <>", value, "checkstatus");
            return (Criteria) this;
        }

        public Criteria andCheckstatusGreaterThan(String value) {
            addCriterion("checkStatus >", value, "checkstatus");
            return (Criteria) this;
        }

        public Criteria andCheckstatusGreaterThanOrEqualTo(String value) {
            addCriterion("checkStatus >=", value, "checkstatus");
            return (Criteria) this;
        }

        public Criteria andCheckstatusLessThan(String value) {
            addCriterion("checkStatus <", value, "checkstatus");
            return (Criteria) this;
        }

        public Criteria andCheckstatusLessThanOrEqualTo(String value) {
            addCriterion("checkStatus <=", value, "checkstatus");
            return (Criteria) this;
        }

        public Criteria andCheckstatusLike(String value) {
            addCriterion("checkStatus like", value, "checkstatus");
            return (Criteria) this;
        }

        public Criteria andCheckstatusNotLike(String value) {
            addCriterion("checkStatus not like", value, "checkstatus");
            return (Criteria) this;
        }

        public Criteria andCheckstatusIn(List<String> values) {
            addCriterion("checkStatus in", values, "checkstatus");
            return (Criteria) this;
        }

        public Criteria andCheckstatusNotIn(List<String> values) {
            addCriterion("checkStatus not in", values, "checkstatus");
            return (Criteria) this;
        }

        public Criteria andCheckstatusBetween(String value1, String value2) {
            addCriterion("checkStatus between", value1, value2, "checkstatus");
            return (Criteria) this;
        }

        public Criteria andCheckstatusNotBetween(String value1, String value2) {
            addCriterion("checkStatus not between", value1, value2, "checkstatus");
            return (Criteria) this;
        }

        public Criteria andBoardingidIsNull() {
            addCriterion("boardingId is null");
            return (Criteria) this;
        }

        public Criteria andBoardingidIsNotNull() {
            addCriterion("boardingId is not null");
            return (Criteria) this;
        }

        public Criteria andBoardingidEqualTo(String value) {
            addCriterion("boardingId =", value, "boardingid");
            return (Criteria) this;
        }

        public Criteria andBoardingidNotEqualTo(String value) {
            addCriterion("boardingId <>", value, "boardingid");
            return (Criteria) this;
        }

        public Criteria andBoardingidGreaterThan(String value) {
            addCriterion("boardingId >", value, "boardingid");
            return (Criteria) this;
        }

        public Criteria andBoardingidGreaterThanOrEqualTo(String value) {
            addCriterion("boardingId >=", value, "boardingid");
            return (Criteria) this;
        }

        public Criteria andBoardingidLessThan(String value) {
            addCriterion("boardingId <", value, "boardingid");
            return (Criteria) this;
        }

        public Criteria andBoardingidLessThanOrEqualTo(String value) {
            addCriterion("boardingId <=", value, "boardingid");
            return (Criteria) this;
        }

        public Criteria andBoardingidLike(String value) {
            addCriterion("boardingId like", value, "boardingid");
            return (Criteria) this;
        }

        public Criteria andBoardingidNotLike(String value) {
            addCriterion("boardingId not like", value, "boardingid");
            return (Criteria) this;
        }

        public Criteria andBoardingidIn(List<String> values) {
            addCriterion("boardingId in", values, "boardingid");
            return (Criteria) this;
        }

        public Criteria andBoardingidNotIn(List<String> values) {
            addCriterion("boardingId not in", values, "boardingid");
            return (Criteria) this;
        }

        public Criteria andBoardingidBetween(String value1, String value2) {
            addCriterion("boardingId between", value1, value2, "boardingid");
            return (Criteria) this;
        }

        public Criteria andBoardingidNotBetween(String value1, String value2) {
            addCriterion("boardingId not between", value1, value2, "boardingid");
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