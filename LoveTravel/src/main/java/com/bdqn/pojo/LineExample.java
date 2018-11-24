package com.bdqn.pojo;

import java.util.ArrayList;
import java.util.List;

public class LineExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LineExample() {
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

        public Criteria andLidIsNull() {
            addCriterion("LID is null");
            return (Criteria) this;
        }

        public Criteria andLidIsNotNull() {
            addCriterion("LID is not null");
            return (Criteria) this;
        }

        public Criteria andLidEqualTo(Integer value) {
            addCriterion("LID =", value, "lid");
            return (Criteria) this;
        }

        public Criteria andLidNotEqualTo(Integer value) {
            addCriterion("LID <>", value, "lid");
            return (Criteria) this;
        }

        public Criteria andLidGreaterThan(Integer value) {
            addCriterion("LID >", value, "lid");
            return (Criteria) this;
        }

        public Criteria andLidGreaterThanOrEqualTo(Integer value) {
            addCriterion("LID >=", value, "lid");
            return (Criteria) this;
        }

        public Criteria andLidLessThan(Integer value) {
            addCriterion("LID <", value, "lid");
            return (Criteria) this;
        }

        public Criteria andLidLessThanOrEqualTo(Integer value) {
            addCriterion("LID <=", value, "lid");
            return (Criteria) this;
        }

        public Criteria andLidIn(List<Integer> values) {
            addCriterion("LID in", values, "lid");
            return (Criteria) this;
        }

        public Criteria andLidNotIn(List<Integer> values) {
            addCriterion("LID not in", values, "lid");
            return (Criteria) this;
        }

        public Criteria andLidBetween(Integer value1, Integer value2) {
            addCriterion("LID between", value1, value2, "lid");
            return (Criteria) this;
        }

        public Criteria andLidNotBetween(Integer value1, Integer value2) {
            addCriterion("LID not between", value1, value2, "lid");
            return (Criteria) this;
        }

        public Criteria andLeaveCityIsNull() {
            addCriterion("leave_city is null");
            return (Criteria) this;
        }

        public Criteria andLeaveCityIsNotNull() {
            addCriterion("leave_city is not null");
            return (Criteria) this;
        }

        public Criteria andLeaveCityEqualTo(String value) {
            addCriterion("leave_city =", value, "leaveCity");
            return (Criteria) this;
        }

        public Criteria andLeaveCityNotEqualTo(String value) {
            addCriterion("leave_city <>", value, "leaveCity");
            return (Criteria) this;
        }

        public Criteria andLeaveCityGreaterThan(String value) {
            addCriterion("leave_city >", value, "leaveCity");
            return (Criteria) this;
        }

        public Criteria andLeaveCityGreaterThanOrEqualTo(String value) {
            addCriterion("leave_city >=", value, "leaveCity");
            return (Criteria) this;
        }

        public Criteria andLeaveCityLessThan(String value) {
            addCriterion("leave_city <", value, "leaveCity");
            return (Criteria) this;
        }

        public Criteria andLeaveCityLessThanOrEqualTo(String value) {
            addCriterion("leave_city <=", value, "leaveCity");
            return (Criteria) this;
        }

        public Criteria andLeaveCityLike(String value) {
            addCriterion("leave_city like", value, "leaveCity");
            return (Criteria) this;
        }

        public Criteria andLeaveCityNotLike(String value) {
            addCriterion("leave_city not like", value, "leaveCity");
            return (Criteria) this;
        }

        public Criteria andLeaveCityIn(List<String> values) {
            addCriterion("leave_city in", values, "leaveCity");
            return (Criteria) this;
        }

        public Criteria andLeaveCityNotIn(List<String> values) {
            addCriterion("leave_city not in", values, "leaveCity");
            return (Criteria) this;
        }

        public Criteria andLeaveCityBetween(String value1, String value2) {
            addCriterion("leave_city between", value1, value2, "leaveCity");
            return (Criteria) this;
        }

        public Criteria andLeaveCityNotBetween(String value1, String value2) {
            addCriterion("leave_city not between", value1, value2, "leaveCity");
            return (Criteria) this;
        }

        public Criteria andArriveCityIsNull() {
            addCriterion("arrive_city is null");
            return (Criteria) this;
        }

        public Criteria andArriveCityIsNotNull() {
            addCriterion("arrive_city is not null");
            return (Criteria) this;
        }

        public Criteria andArriveCityEqualTo(String value) {
            addCriterion("arrive_city =", value, "arriveCity");
            return (Criteria) this;
        }

        public Criteria andArriveCityNotEqualTo(String value) {
            addCriterion("arrive_city <>", value, "arriveCity");
            return (Criteria) this;
        }

        public Criteria andArriveCityGreaterThan(String value) {
            addCriterion("arrive_city >", value, "arriveCity");
            return (Criteria) this;
        }

        public Criteria andArriveCityGreaterThanOrEqualTo(String value) {
            addCriterion("arrive_city >=", value, "arriveCity");
            return (Criteria) this;
        }

        public Criteria andArriveCityLessThan(String value) {
            addCriterion("arrive_city <", value, "arriveCity");
            return (Criteria) this;
        }

        public Criteria andArriveCityLessThanOrEqualTo(String value) {
            addCriterion("arrive_city <=", value, "arriveCity");
            return (Criteria) this;
        }

        public Criteria andArriveCityLike(String value) {
            addCriterion("arrive_city like", value, "arriveCity");
            return (Criteria) this;
        }

        public Criteria andArriveCityNotLike(String value) {
            addCriterion("arrive_city not like", value, "arriveCity");
            return (Criteria) this;
        }

        public Criteria andArriveCityIn(List<String> values) {
            addCriterion("arrive_city in", values, "arriveCity");
            return (Criteria) this;
        }

        public Criteria andArriveCityNotIn(List<String> values) {
            addCriterion("arrive_city not in", values, "arriveCity");
            return (Criteria) this;
        }

        public Criteria andArriveCityBetween(String value1, String value2) {
            addCriterion("arrive_city between", value1, value2, "arriveCity");
            return (Criteria) this;
        }

        public Criteria andArriveCityNotBetween(String value1, String value2) {
            addCriterion("arrive_city not between", value1, value2, "arriveCity");
            return (Criteria) this;
        }

        public Criteria andLeaveAirportIsNull() {
            addCriterion("leave_airport is null");
            return (Criteria) this;
        }

        public Criteria andLeaveAirportIsNotNull() {
            addCriterion("leave_airport is not null");
            return (Criteria) this;
        }

        public Criteria andLeaveAirportEqualTo(String value) {
            addCriterion("leave_airport =", value, "leaveAirport");
            return (Criteria) this;
        }

        public Criteria andLeaveAirportNotEqualTo(String value) {
            addCriterion("leave_airport <>", value, "leaveAirport");
            return (Criteria) this;
        }

        public Criteria andLeaveAirportGreaterThan(String value) {
            addCriterion("leave_airport >", value, "leaveAirport");
            return (Criteria) this;
        }

        public Criteria andLeaveAirportGreaterThanOrEqualTo(String value) {
            addCriterion("leave_airport >=", value, "leaveAirport");
            return (Criteria) this;
        }

        public Criteria andLeaveAirportLessThan(String value) {
            addCriterion("leave_airport <", value, "leaveAirport");
            return (Criteria) this;
        }

        public Criteria andLeaveAirportLessThanOrEqualTo(String value) {
            addCriterion("leave_airport <=", value, "leaveAirport");
            return (Criteria) this;
        }

        public Criteria andLeaveAirportLike(String value) {
            addCriterion("leave_airport like", value, "leaveAirport");
            return (Criteria) this;
        }

        public Criteria andLeaveAirportNotLike(String value) {
            addCriterion("leave_airport not like", value, "leaveAirport");
            return (Criteria) this;
        }

        public Criteria andLeaveAirportIn(List<String> values) {
            addCriterion("leave_airport in", values, "leaveAirport");
            return (Criteria) this;
        }

        public Criteria andLeaveAirportNotIn(List<String> values) {
            addCriterion("leave_airport not in", values, "leaveAirport");
            return (Criteria) this;
        }

        public Criteria andLeaveAirportBetween(String value1, String value2) {
            addCriterion("leave_airport between", value1, value2, "leaveAirport");
            return (Criteria) this;
        }

        public Criteria andLeaveAirportNotBetween(String value1, String value2) {
            addCriterion("leave_airport not between", value1, value2, "leaveAirport");
            return (Criteria) this;
        }

        public Criteria andArriveAirportIsNull() {
            addCriterion("arrive_airport is null");
            return (Criteria) this;
        }

        public Criteria andArriveAirportIsNotNull() {
            addCriterion("arrive_airport is not null");
            return (Criteria) this;
        }

        public Criteria andArriveAirportEqualTo(String value) {
            addCriterion("arrive_airport =", value, "arriveAirport");
            return (Criteria) this;
        }

        public Criteria andArriveAirportNotEqualTo(String value) {
            addCriterion("arrive_airport <>", value, "arriveAirport");
            return (Criteria) this;
        }

        public Criteria andArriveAirportGreaterThan(String value) {
            addCriterion("arrive_airport >", value, "arriveAirport");
            return (Criteria) this;
        }

        public Criteria andArriveAirportGreaterThanOrEqualTo(String value) {
            addCriterion("arrive_airport >=", value, "arriveAirport");
            return (Criteria) this;
        }

        public Criteria andArriveAirportLessThan(String value) {
            addCriterion("arrive_airport <", value, "arriveAirport");
            return (Criteria) this;
        }

        public Criteria andArriveAirportLessThanOrEqualTo(String value) {
            addCriterion("arrive_airport <=", value, "arriveAirport");
            return (Criteria) this;
        }

        public Criteria andArriveAirportLike(String value) {
            addCriterion("arrive_airport like", value, "arriveAirport");
            return (Criteria) this;
        }

        public Criteria andArriveAirportNotLike(String value) {
            addCriterion("arrive_airport not like", value, "arriveAirport");
            return (Criteria) this;
        }

        public Criteria andArriveAirportIn(List<String> values) {
            addCriterion("arrive_airport in", values, "arriveAirport");
            return (Criteria) this;
        }

        public Criteria andArriveAirportNotIn(List<String> values) {
            addCriterion("arrive_airport not in", values, "arriveAirport");
            return (Criteria) this;
        }

        public Criteria andArriveAirportBetween(String value1, String value2) {
            addCriterion("arrive_airport between", value1, value2, "arriveAirport");
            return (Criteria) this;
        }

        public Criteria andArriveAirportNotBetween(String value1, String value2) {
            addCriterion("arrive_airport not between", value1, value2, "arriveAirport");
            return (Criteria) this;
        }

        public Criteria andLinetypeIsNull() {
            addCriterion("lineType is null");
            return (Criteria) this;
        }

        public Criteria andLinetypeIsNotNull() {
            addCriterion("lineType is not null");
            return (Criteria) this;
        }

        public Criteria andLinetypeEqualTo(String value) {
            addCriterion("lineType =", value, "linetype");
            return (Criteria) this;
        }

        public Criteria andLinetypeNotEqualTo(String value) {
            addCriterion("lineType <>", value, "linetype");
            return (Criteria) this;
        }

        public Criteria andLinetypeGreaterThan(String value) {
            addCriterion("lineType >", value, "linetype");
            return (Criteria) this;
        }

        public Criteria andLinetypeGreaterThanOrEqualTo(String value) {
            addCriterion("lineType >=", value, "linetype");
            return (Criteria) this;
        }

        public Criteria andLinetypeLessThan(String value) {
            addCriterion("lineType <", value, "linetype");
            return (Criteria) this;
        }

        public Criteria andLinetypeLessThanOrEqualTo(String value) {
            addCriterion("lineType <=", value, "linetype");
            return (Criteria) this;
        }

        public Criteria andLinetypeLike(String value) {
            addCriterion("lineType like", value, "linetype");
            return (Criteria) this;
        }

        public Criteria andLinetypeNotLike(String value) {
            addCriterion("lineType not like", value, "linetype");
            return (Criteria) this;
        }

        public Criteria andLinetypeIn(List<String> values) {
            addCriterion("lineType in", values, "linetype");
            return (Criteria) this;
        }

        public Criteria andLinetypeNotIn(List<String> values) {
            addCriterion("lineType not in", values, "linetype");
            return (Criteria) this;
        }

        public Criteria andLinetypeBetween(String value1, String value2) {
            addCriterion("lineType between", value1, value2, "linetype");
            return (Criteria) this;
        }

        public Criteria andLinetypeNotBetween(String value1, String value2) {
            addCriterion("lineType not between", value1, value2, "linetype");
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