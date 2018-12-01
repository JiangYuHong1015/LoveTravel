package com.bdqn.pojo;

import java.util.ArrayList;
import java.util.List;

public class FlightOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FlightOrderExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andFidIsNull() {
            addCriterion("fid is null");
            return (Criteria) this;
        }

        public Criteria andFidIsNotNull() {
            addCriterion("fid is not null");
            return (Criteria) this;
        }

        public Criteria andFidEqualTo(String value) {
            addCriterion("fid =", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidNotEqualTo(String value) {
            addCriterion("fid <>", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidGreaterThan(String value) {
            addCriterion("fid >", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidGreaterThanOrEqualTo(String value) {
            addCriterion("fid >=", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidLessThan(String value) {
            addCriterion("fid <", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidLessThanOrEqualTo(String value) {
            addCriterion("fid <=", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidLike(String value) {
            addCriterion("fid like", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidNotLike(String value) {
            addCriterion("fid not like", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidIn(List<String> values) {
            addCriterion("fid in", values, "fid");
            return (Criteria) this;
        }

        public Criteria andFidNotIn(List<String> values) {
            addCriterion("fid not in", values, "fid");
            return (Criteria) this;
        }

        public Criteria andFidBetween(String value1, String value2) {
            addCriterion("fid between", value1, value2, "fid");
            return (Criteria) this;
        }

        public Criteria andFidNotBetween(String value1, String value2) {
            addCriterion("fid not between", value1, value2, "fid");
            return (Criteria) this;
        }

        public Criteria andLeavedateIsNull() {
            addCriterion("leaveDate is null");
            return (Criteria) this;
        }

        public Criteria andLeavedateIsNotNull() {
            addCriterion("leaveDate is not null");
            return (Criteria) this;
        }

        public Criteria andLeavedateEqualTo(String value) {
            addCriterion("leaveDate =", value, "leavedate");
            return (Criteria) this;
        }

        public Criteria andLeavedateNotEqualTo(String value) {
            addCriterion("leaveDate <>", value, "leavedate");
            return (Criteria) this;
        }

        public Criteria andLeavedateGreaterThan(String value) {
            addCriterion("leaveDate >", value, "leavedate");
            return (Criteria) this;
        }

        public Criteria andLeavedateGreaterThanOrEqualTo(String value) {
            addCriterion("leaveDate >=", value, "leavedate");
            return (Criteria) this;
        }

        public Criteria andLeavedateLessThan(String value) {
            addCriterion("leaveDate <", value, "leavedate");
            return (Criteria) this;
        }

        public Criteria andLeavedateLessThanOrEqualTo(String value) {
            addCriterion("leaveDate <=", value, "leavedate");
            return (Criteria) this;
        }

        public Criteria andLeavedateLike(String value) {
            addCriterion("leaveDate like", value, "leavedate");
            return (Criteria) this;
        }

        public Criteria andLeavedateNotLike(String value) {
            addCriterion("leaveDate not like", value, "leavedate");
            return (Criteria) this;
        }

        public Criteria andLeavedateIn(List<String> values) {
            addCriterion("leaveDate in", values, "leavedate");
            return (Criteria) this;
        }

        public Criteria andLeavedateNotIn(List<String> values) {
            addCriterion("leaveDate not in", values, "leavedate");
            return (Criteria) this;
        }

        public Criteria andLeavedateBetween(String value1, String value2) {
            addCriterion("leaveDate between", value1, value2, "leavedate");
            return (Criteria) this;
        }

        public Criteria andLeavedateNotBetween(String value1, String value2) {
            addCriterion("leaveDate not between", value1, value2, "leavedate");
            return (Criteria) this;
        }

        public Criteria andLeavecityIsNull() {
            addCriterion("leaveCity is null");
            return (Criteria) this;
        }

        public Criteria andLeavecityIsNotNull() {
            addCriterion("leaveCity is not null");
            return (Criteria) this;
        }

        public Criteria andLeavecityEqualTo(String value) {
            addCriterion("leaveCity =", value, "leavecity");
            return (Criteria) this;
        }

        public Criteria andLeavecityNotEqualTo(String value) {
            addCriterion("leaveCity <>", value, "leavecity");
            return (Criteria) this;
        }

        public Criteria andLeavecityGreaterThan(String value) {
            addCriterion("leaveCity >", value, "leavecity");
            return (Criteria) this;
        }

        public Criteria andLeavecityGreaterThanOrEqualTo(String value) {
            addCriterion("leaveCity >=", value, "leavecity");
            return (Criteria) this;
        }

        public Criteria andLeavecityLessThan(String value) {
            addCriterion("leaveCity <", value, "leavecity");
            return (Criteria) this;
        }

        public Criteria andLeavecityLessThanOrEqualTo(String value) {
            addCriterion("leaveCity <=", value, "leavecity");
            return (Criteria) this;
        }

        public Criteria andLeavecityLike(String value) {
            addCriterion("leaveCity like", value, "leavecity");
            return (Criteria) this;
        }

        public Criteria andLeavecityNotLike(String value) {
            addCriterion("leaveCity not like", value, "leavecity");
            return (Criteria) this;
        }

        public Criteria andLeavecityIn(List<String> values) {
            addCriterion("leaveCity in", values, "leavecity");
            return (Criteria) this;
        }

        public Criteria andLeavecityNotIn(List<String> values) {
            addCriterion("leaveCity not in", values, "leavecity");
            return (Criteria) this;
        }

        public Criteria andLeavecityBetween(String value1, String value2) {
            addCriterion("leaveCity between", value1, value2, "leavecity");
            return (Criteria) this;
        }

        public Criteria andLeavecityNotBetween(String value1, String value2) {
            addCriterion("leaveCity not between", value1, value2, "leavecity");
            return (Criteria) this;
        }

        public Criteria andArrivecityIsNull() {
            addCriterion("arriveCity is null");
            return (Criteria) this;
        }

        public Criteria andArrivecityIsNotNull() {
            addCriterion("arriveCity is not null");
            return (Criteria) this;
        }

        public Criteria andArrivecityEqualTo(String value) {
            addCriterion("arriveCity =", value, "arrivecity");
            return (Criteria) this;
        }

        public Criteria andArrivecityNotEqualTo(String value) {
            addCriterion("arriveCity <>", value, "arrivecity");
            return (Criteria) this;
        }

        public Criteria andArrivecityGreaterThan(String value) {
            addCriterion("arriveCity >", value, "arrivecity");
            return (Criteria) this;
        }

        public Criteria andArrivecityGreaterThanOrEqualTo(String value) {
            addCriterion("arriveCity >=", value, "arrivecity");
            return (Criteria) this;
        }

        public Criteria andArrivecityLessThan(String value) {
            addCriterion("arriveCity <", value, "arrivecity");
            return (Criteria) this;
        }

        public Criteria andArrivecityLessThanOrEqualTo(String value) {
            addCriterion("arriveCity <=", value, "arrivecity");
            return (Criteria) this;
        }

        public Criteria andArrivecityLike(String value) {
            addCriterion("arriveCity like", value, "arrivecity");
            return (Criteria) this;
        }

        public Criteria andArrivecityNotLike(String value) {
            addCriterion("arriveCity not like", value, "arrivecity");
            return (Criteria) this;
        }

        public Criteria andArrivecityIn(List<String> values) {
            addCriterion("arriveCity in", values, "arrivecity");
            return (Criteria) this;
        }

        public Criteria andArrivecityNotIn(List<String> values) {
            addCriterion("arriveCity not in", values, "arrivecity");
            return (Criteria) this;
        }

        public Criteria andArrivecityBetween(String value1, String value2) {
            addCriterion("arriveCity between", value1, value2, "arrivecity");
            return (Criteria) this;
        }

        public Criteria andArrivecityNotBetween(String value1, String value2) {
            addCriterion("arriveCity not between", value1, value2, "arrivecity");
            return (Criteria) this;
        }

        public Criteria andLeavetimeIsNull() {
            addCriterion("leaveTime is null");
            return (Criteria) this;
        }

        public Criteria andLeavetimeIsNotNull() {
            addCriterion("leaveTime is not null");
            return (Criteria) this;
        }

        public Criteria andLeavetimeEqualTo(String value) {
            addCriterion("leaveTime =", value, "leavetime");
            return (Criteria) this;
        }

        public Criteria andLeavetimeNotEqualTo(String value) {
            addCriterion("leaveTime <>", value, "leavetime");
            return (Criteria) this;
        }

        public Criteria andLeavetimeGreaterThan(String value) {
            addCriterion("leaveTime >", value, "leavetime");
            return (Criteria) this;
        }

        public Criteria andLeavetimeGreaterThanOrEqualTo(String value) {
            addCriterion("leaveTime >=", value, "leavetime");
            return (Criteria) this;
        }

        public Criteria andLeavetimeLessThan(String value) {
            addCriterion("leaveTime <", value, "leavetime");
            return (Criteria) this;
        }

        public Criteria andLeavetimeLessThanOrEqualTo(String value) {
            addCriterion("leaveTime <=", value, "leavetime");
            return (Criteria) this;
        }

        public Criteria andLeavetimeLike(String value) {
            addCriterion("leaveTime like", value, "leavetime");
            return (Criteria) this;
        }

        public Criteria andLeavetimeNotLike(String value) {
            addCriterion("leaveTime not like", value, "leavetime");
            return (Criteria) this;
        }

        public Criteria andLeavetimeIn(List<String> values) {
            addCriterion("leaveTime in", values, "leavetime");
            return (Criteria) this;
        }

        public Criteria andLeavetimeNotIn(List<String> values) {
            addCriterion("leaveTime not in", values, "leavetime");
            return (Criteria) this;
        }

        public Criteria andLeavetimeBetween(String value1, String value2) {
            addCriterion("leaveTime between", value1, value2, "leavetime");
            return (Criteria) this;
        }

        public Criteria andLeavetimeNotBetween(String value1, String value2) {
            addCriterion("leaveTime not between", value1, value2, "leavetime");
            return (Criteria) this;
        }

        public Criteria andArrivetimeIsNull() {
            addCriterion("arriveTime is null");
            return (Criteria) this;
        }

        public Criteria andArrivetimeIsNotNull() {
            addCriterion("arriveTime is not null");
            return (Criteria) this;
        }

        public Criteria andArrivetimeEqualTo(String value) {
            addCriterion("arriveTime =", value, "arrivetime");
            return (Criteria) this;
        }

        public Criteria andArrivetimeNotEqualTo(String value) {
            addCriterion("arriveTime <>", value, "arrivetime");
            return (Criteria) this;
        }

        public Criteria andArrivetimeGreaterThan(String value) {
            addCriterion("arriveTime >", value, "arrivetime");
            return (Criteria) this;
        }

        public Criteria andArrivetimeGreaterThanOrEqualTo(String value) {
            addCriterion("arriveTime >=", value, "arrivetime");
            return (Criteria) this;
        }

        public Criteria andArrivetimeLessThan(String value) {
            addCriterion("arriveTime <", value, "arrivetime");
            return (Criteria) this;
        }

        public Criteria andArrivetimeLessThanOrEqualTo(String value) {
            addCriterion("arriveTime <=", value, "arrivetime");
            return (Criteria) this;
        }

        public Criteria andArrivetimeLike(String value) {
            addCriterion("arriveTime like", value, "arrivetime");
            return (Criteria) this;
        }

        public Criteria andArrivetimeNotLike(String value) {
            addCriterion("arriveTime not like", value, "arrivetime");
            return (Criteria) this;
        }

        public Criteria andArrivetimeIn(List<String> values) {
            addCriterion("arriveTime in", values, "arrivetime");
            return (Criteria) this;
        }

        public Criteria andArrivetimeNotIn(List<String> values) {
            addCriterion("arriveTime not in", values, "arrivetime");
            return (Criteria) this;
        }

        public Criteria andArrivetimeBetween(String value1, String value2) {
            addCriterion("arriveTime between", value1, value2, "arrivetime");
            return (Criteria) this;
        }

        public Criteria andArrivetimeNotBetween(String value1, String value2) {
            addCriterion("arriveTime not between", value1, value2, "arrivetime");
            return (Criteria) this;
        }

        public Criteria andLeaveairportIsNull() {
            addCriterion("leaveAirport is null");
            return (Criteria) this;
        }

        public Criteria andLeaveairportIsNotNull() {
            addCriterion("leaveAirport is not null");
            return (Criteria) this;
        }

        public Criteria andLeaveairportEqualTo(String value) {
            addCriterion("leaveAirport =", value, "leaveairport");
            return (Criteria) this;
        }

        public Criteria andLeaveairportNotEqualTo(String value) {
            addCriterion("leaveAirport <>", value, "leaveairport");
            return (Criteria) this;
        }

        public Criteria andLeaveairportGreaterThan(String value) {
            addCriterion("leaveAirport >", value, "leaveairport");
            return (Criteria) this;
        }

        public Criteria andLeaveairportGreaterThanOrEqualTo(String value) {
            addCriterion("leaveAirport >=", value, "leaveairport");
            return (Criteria) this;
        }

        public Criteria andLeaveairportLessThan(String value) {
            addCriterion("leaveAirport <", value, "leaveairport");
            return (Criteria) this;
        }

        public Criteria andLeaveairportLessThanOrEqualTo(String value) {
            addCriterion("leaveAirport <=", value, "leaveairport");
            return (Criteria) this;
        }

        public Criteria andLeaveairportLike(String value) {
            addCriterion("leaveAirport like", value, "leaveairport");
            return (Criteria) this;
        }

        public Criteria andLeaveairportNotLike(String value) {
            addCriterion("leaveAirport not like", value, "leaveairport");
            return (Criteria) this;
        }

        public Criteria andLeaveairportIn(List<String> values) {
            addCriterion("leaveAirport in", values, "leaveairport");
            return (Criteria) this;
        }

        public Criteria andLeaveairportNotIn(List<String> values) {
            addCriterion("leaveAirport not in", values, "leaveairport");
            return (Criteria) this;
        }

        public Criteria andLeaveairportBetween(String value1, String value2) {
            addCriterion("leaveAirport between", value1, value2, "leaveairport");
            return (Criteria) this;
        }

        public Criteria andLeaveairportNotBetween(String value1, String value2) {
            addCriterion("leaveAirport not between", value1, value2, "leaveairport");
            return (Criteria) this;
        }

        public Criteria andArriveairportIsNull() {
            addCriterion("arriveAirport is null");
            return (Criteria) this;
        }

        public Criteria andArriveairportIsNotNull() {
            addCriterion("arriveAirport is not null");
            return (Criteria) this;
        }

        public Criteria andArriveairportEqualTo(String value) {
            addCriterion("arriveAirport =", value, "arriveairport");
            return (Criteria) this;
        }

        public Criteria andArriveairportNotEqualTo(String value) {
            addCriterion("arriveAirport <>", value, "arriveairport");
            return (Criteria) this;
        }

        public Criteria andArriveairportGreaterThan(String value) {
            addCriterion("arriveAirport >", value, "arriveairport");
            return (Criteria) this;
        }

        public Criteria andArriveairportGreaterThanOrEqualTo(String value) {
            addCriterion("arriveAirport >=", value, "arriveairport");
            return (Criteria) this;
        }

        public Criteria andArriveairportLessThan(String value) {
            addCriterion("arriveAirport <", value, "arriveairport");
            return (Criteria) this;
        }

        public Criteria andArriveairportLessThanOrEqualTo(String value) {
            addCriterion("arriveAirport <=", value, "arriveairport");
            return (Criteria) this;
        }

        public Criteria andArriveairportLike(String value) {
            addCriterion("arriveAirport like", value, "arriveairport");
            return (Criteria) this;
        }

        public Criteria andArriveairportNotLike(String value) {
            addCriterion("arriveAirport not like", value, "arriveairport");
            return (Criteria) this;
        }

        public Criteria andArriveairportIn(List<String> values) {
            addCriterion("arriveAirport in", values, "arriveairport");
            return (Criteria) this;
        }

        public Criteria andArriveairportNotIn(List<String> values) {
            addCriterion("arriveAirport not in", values, "arriveairport");
            return (Criteria) this;
        }

        public Criteria andArriveairportBetween(String value1, String value2) {
            addCriterion("arriveAirport between", value1, value2, "arriveairport");
            return (Criteria) this;
        }

        public Criteria andArriveairportNotBetween(String value1, String value2) {
            addCriterion("arriveAirport not between", value1, value2, "arriveairport");
            return (Criteria) this;
        }

        public Criteria andContactnameIsNull() {
            addCriterion("contactName is null");
            return (Criteria) this;
        }

        public Criteria andContactnameIsNotNull() {
            addCriterion("contactName is not null");
            return (Criteria) this;
        }

        public Criteria andContactnameEqualTo(String value) {
            addCriterion("contactName =", value, "contactname");
            return (Criteria) this;
        }

        public Criteria andContactnameNotEqualTo(String value) {
            addCriterion("contactName <>", value, "contactname");
            return (Criteria) this;
        }

        public Criteria andContactnameGreaterThan(String value) {
            addCriterion("contactName >", value, "contactname");
            return (Criteria) this;
        }

        public Criteria andContactnameGreaterThanOrEqualTo(String value) {
            addCriterion("contactName >=", value, "contactname");
            return (Criteria) this;
        }

        public Criteria andContactnameLessThan(String value) {
            addCriterion("contactName <", value, "contactname");
            return (Criteria) this;
        }

        public Criteria andContactnameLessThanOrEqualTo(String value) {
            addCriterion("contactName <=", value, "contactname");
            return (Criteria) this;
        }

        public Criteria andContactnameLike(String value) {
            addCriterion("contactName like", value, "contactname");
            return (Criteria) this;
        }

        public Criteria andContactnameNotLike(String value) {
            addCriterion("contactName not like", value, "contactname");
            return (Criteria) this;
        }

        public Criteria andContactnameIn(List<String> values) {
            addCriterion("contactName in", values, "contactname");
            return (Criteria) this;
        }

        public Criteria andContactnameNotIn(List<String> values) {
            addCriterion("contactName not in", values, "contactname");
            return (Criteria) this;
        }

        public Criteria andContactnameBetween(String value1, String value2) {
            addCriterion("contactName between", value1, value2, "contactname");
            return (Criteria) this;
        }

        public Criteria andContactnameNotBetween(String value1, String value2) {
            addCriterion("contactName not between", value1, value2, "contactname");
            return (Criteria) this;
        }

        public Criteria andCardnoIsNull() {
            addCriterion("cardNo is null");
            return (Criteria) this;
        }

        public Criteria andCardnoIsNotNull() {
            addCriterion("cardNo is not null");
            return (Criteria) this;
        }

        public Criteria andCardnoEqualTo(String value) {
            addCriterion("cardNo =", value, "cardno");
            return (Criteria) this;
        }

        public Criteria andCardnoNotEqualTo(String value) {
            addCriterion("cardNo <>", value, "cardno");
            return (Criteria) this;
        }

        public Criteria andCardnoGreaterThan(String value) {
            addCriterion("cardNo >", value, "cardno");
            return (Criteria) this;
        }

        public Criteria andCardnoGreaterThanOrEqualTo(String value) {
            addCriterion("cardNo >=", value, "cardno");
            return (Criteria) this;
        }

        public Criteria andCardnoLessThan(String value) {
            addCriterion("cardNo <", value, "cardno");
            return (Criteria) this;
        }

        public Criteria andCardnoLessThanOrEqualTo(String value) {
            addCriterion("cardNo <=", value, "cardno");
            return (Criteria) this;
        }

        public Criteria andCardnoLike(String value) {
            addCriterion("cardNo like", value, "cardno");
            return (Criteria) this;
        }

        public Criteria andCardnoNotLike(String value) {
            addCriterion("cardNo not like", value, "cardno");
            return (Criteria) this;
        }

        public Criteria andCardnoIn(List<String> values) {
            addCriterion("cardNo in", values, "cardno");
            return (Criteria) this;
        }

        public Criteria andCardnoNotIn(List<String> values) {
            addCriterion("cardNo not in", values, "cardno");
            return (Criteria) this;
        }

        public Criteria andCardnoBetween(String value1, String value2) {
            addCriterion("cardNo between", value1, value2, "cardno");
            return (Criteria) this;
        }

        public Criteria andCardnoNotBetween(String value1, String value2) {
            addCriterion("cardNo not between", value1, value2, "cardno");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
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