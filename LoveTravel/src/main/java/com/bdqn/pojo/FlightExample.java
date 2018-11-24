package com.bdqn.pojo;

import java.util.ArrayList;
import java.util.List;

public class FlightExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FlightExample() {
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

        public Criteria andFidIsNull() {
            addCriterion("FID is null");
            return (Criteria) this;
        }

        public Criteria andFidIsNotNull() {
            addCriterion("FID is not null");
            return (Criteria) this;
        }

        public Criteria andFidEqualTo(String value) {
            addCriterion("FID =", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidNotEqualTo(String value) {
            addCriterion("FID <>", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidGreaterThan(String value) {
            addCriterion("FID >", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidGreaterThanOrEqualTo(String value) {
            addCriterion("FID >=", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidLessThan(String value) {
            addCriterion("FID <", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidLessThanOrEqualTo(String value) {
            addCriterion("FID <=", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidLike(String value) {
            addCriterion("FID like", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidNotLike(String value) {
            addCriterion("FID not like", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidIn(List<String> values) {
            addCriterion("FID in", values, "fid");
            return (Criteria) this;
        }

        public Criteria andFidNotIn(List<String> values) {
            addCriterion("FID not in", values, "fid");
            return (Criteria) this;
        }

        public Criteria andFidBetween(String value1, String value2) {
            addCriterion("FID between", value1, value2, "fid");
            return (Criteria) this;
        }

        public Criteria andFidNotBetween(String value1, String value2) {
            addCriterion("FID not between", value1, value2, "fid");
            return (Criteria) this;
        }

        public Criteria andLidIsNull() {
            addCriterion("LID is null");
            return (Criteria) this;
        }

        public Criteria andLidIsNotNull() {
            addCriterion("LID is not null");
            return (Criteria) this;
        }

        public Criteria andLidEqualTo(String value) {
            addCriterion("LID =", value, "lid");
            return (Criteria) this;
        }

        public Criteria andLidNotEqualTo(String value) {
            addCriterion("LID <>", value, "lid");
            return (Criteria) this;
        }

        public Criteria andLidGreaterThan(String value) {
            addCriterion("LID >", value, "lid");
            return (Criteria) this;
        }

        public Criteria andLidGreaterThanOrEqualTo(String value) {
            addCriterion("LID >=", value, "lid");
            return (Criteria) this;
        }

        public Criteria andLidLessThan(String value) {
            addCriterion("LID <", value, "lid");
            return (Criteria) this;
        }

        public Criteria andLidLessThanOrEqualTo(String value) {
            addCriterion("LID <=", value, "lid");
            return (Criteria) this;
        }

        public Criteria andLidLike(String value) {
            addCriterion("LID like", value, "lid");
            return (Criteria) this;
        }

        public Criteria andLidNotLike(String value) {
            addCriterion("LID not like", value, "lid");
            return (Criteria) this;
        }

        public Criteria andLidIn(List<String> values) {
            addCriterion("LID in", values, "lid");
            return (Criteria) this;
        }

        public Criteria andLidNotIn(List<String> values) {
            addCriterion("LID not in", values, "lid");
            return (Criteria) this;
        }

        public Criteria andLidBetween(String value1, String value2) {
            addCriterion("LID between", value1, value2, "lid");
            return (Criteria) this;
        }

        public Criteria andLidNotBetween(String value1, String value2) {
            addCriterion("LID not between", value1, value2, "lid");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeIsNull() {
            addCriterion("leave_time is null");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeIsNotNull() {
            addCriterion("leave_time is not null");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeEqualTo(String value) {
            addCriterion("leave_time =", value, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeNotEqualTo(String value) {
            addCriterion("leave_time <>", value, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeGreaterThan(String value) {
            addCriterion("leave_time >", value, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeGreaterThanOrEqualTo(String value) {
            addCriterion("leave_time >=", value, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeLessThan(String value) {
            addCriterion("leave_time <", value, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeLessThanOrEqualTo(String value) {
            addCriterion("leave_time <=", value, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeLike(String value) {
            addCriterion("leave_time like", value, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeNotLike(String value) {
            addCriterion("leave_time not like", value, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeIn(List<String> values) {
            addCriterion("leave_time in", values, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeNotIn(List<String> values) {
            addCriterion("leave_time not in", values, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeBetween(String value1, String value2) {
            addCriterion("leave_time between", value1, value2, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeNotBetween(String value1, String value2) {
            addCriterion("leave_time not between", value1, value2, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andArriveTimeIsNull() {
            addCriterion("arrive_time is null");
            return (Criteria) this;
        }

        public Criteria andArriveTimeIsNotNull() {
            addCriterion("arrive_time is not null");
            return (Criteria) this;
        }

        public Criteria andArriveTimeEqualTo(String value) {
            addCriterion("arrive_time =", value, "arriveTime");
            return (Criteria) this;
        }

        public Criteria andArriveTimeNotEqualTo(String value) {
            addCriterion("arrive_time <>", value, "arriveTime");
            return (Criteria) this;
        }

        public Criteria andArriveTimeGreaterThan(String value) {
            addCriterion("arrive_time >", value, "arriveTime");
            return (Criteria) this;
        }

        public Criteria andArriveTimeGreaterThanOrEqualTo(String value) {
            addCriterion("arrive_time >=", value, "arriveTime");
            return (Criteria) this;
        }

        public Criteria andArriveTimeLessThan(String value) {
            addCriterion("arrive_time <", value, "arriveTime");
            return (Criteria) this;
        }

        public Criteria andArriveTimeLessThanOrEqualTo(String value) {
            addCriterion("arrive_time <=", value, "arriveTime");
            return (Criteria) this;
        }

        public Criteria andArriveTimeLike(String value) {
            addCriterion("arrive_time like", value, "arriveTime");
            return (Criteria) this;
        }

        public Criteria andArriveTimeNotLike(String value) {
            addCriterion("arrive_time not like", value, "arriveTime");
            return (Criteria) this;
        }

        public Criteria andArriveTimeIn(List<String> values) {
            addCriterion("arrive_time in", values, "arriveTime");
            return (Criteria) this;
        }

        public Criteria andArriveTimeNotIn(List<String> values) {
            addCriterion("arrive_time not in", values, "arriveTime");
            return (Criteria) this;
        }

        public Criteria andArriveTimeBetween(String value1, String value2) {
            addCriterion("arrive_time between", value1, value2, "arriveTime");
            return (Criteria) this;
        }

        public Criteria andArriveTimeNotBetween(String value1, String value2) {
            addCriterion("arrive_time not between", value1, value2, "arriveTime");
            return (Criteria) this;
        }

        public Criteria andTotalTimeIsNull() {
            addCriterion("total_time is null");
            return (Criteria) this;
        }

        public Criteria andTotalTimeIsNotNull() {
            addCriterion("total_time is not null");
            return (Criteria) this;
        }

        public Criteria andTotalTimeEqualTo(Double value) {
            addCriterion("total_time =", value, "totalTime");
            return (Criteria) this;
        }

        public Criteria andTotalTimeNotEqualTo(Double value) {
            addCriterion("total_time <>", value, "totalTime");
            return (Criteria) this;
        }

        public Criteria andTotalTimeGreaterThan(Double value) {
            addCriterion("total_time >", value, "totalTime");
            return (Criteria) this;
        }

        public Criteria andTotalTimeGreaterThanOrEqualTo(Double value) {
            addCriterion("total_time >=", value, "totalTime");
            return (Criteria) this;
        }

        public Criteria andTotalTimeLessThan(Double value) {
            addCriterion("total_time <", value, "totalTime");
            return (Criteria) this;
        }

        public Criteria andTotalTimeLessThanOrEqualTo(Double value) {
            addCriterion("total_time <=", value, "totalTime");
            return (Criteria) this;
        }

        public Criteria andTotalTimeIn(List<Double> values) {
            addCriterion("total_time in", values, "totalTime");
            return (Criteria) this;
        }

        public Criteria andTotalTimeNotIn(List<Double> values) {
            addCriterion("total_time not in", values, "totalTime");
            return (Criteria) this;
        }

        public Criteria andTotalTimeBetween(Double value1, Double value2) {
            addCriterion("total_time between", value1, value2, "totalTime");
            return (Criteria) this;
        }

        public Criteria andTotalTimeNotBetween(Double value1, Double value2) {
            addCriterion("total_time not between", value1, value2, "totalTime");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(Integer value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Integer value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Integer value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Integer value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Integer value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Integer> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Integer> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Integer value1, Integer value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andSeatsLeaveIsNull() {
            addCriterion("seats_leave is null");
            return (Criteria) this;
        }

        public Criteria andSeatsLeaveIsNotNull() {
            addCriterion("seats_leave is not null");
            return (Criteria) this;
        }

        public Criteria andSeatsLeaveEqualTo(Integer value) {
            addCriterion("seats_leave =", value, "seatsLeave");
            return (Criteria) this;
        }

        public Criteria andSeatsLeaveNotEqualTo(Integer value) {
            addCriterion("seats_leave <>", value, "seatsLeave");
            return (Criteria) this;
        }

        public Criteria andSeatsLeaveGreaterThan(Integer value) {
            addCriterion("seats_leave >", value, "seatsLeave");
            return (Criteria) this;
        }

        public Criteria andSeatsLeaveGreaterThanOrEqualTo(Integer value) {
            addCriterion("seats_leave >=", value, "seatsLeave");
            return (Criteria) this;
        }

        public Criteria andSeatsLeaveLessThan(Integer value) {
            addCriterion("seats_leave <", value, "seatsLeave");
            return (Criteria) this;
        }

        public Criteria andSeatsLeaveLessThanOrEqualTo(Integer value) {
            addCriterion("seats_leave <=", value, "seatsLeave");
            return (Criteria) this;
        }

        public Criteria andSeatsLeaveIn(List<Integer> values) {
            addCriterion("seats_leave in", values, "seatsLeave");
            return (Criteria) this;
        }

        public Criteria andSeatsLeaveNotIn(List<Integer> values) {
            addCriterion("seats_leave not in", values, "seatsLeave");
            return (Criteria) this;
        }

        public Criteria andSeatsLeaveBetween(Integer value1, Integer value2) {
            addCriterion("seats_leave between", value1, value2, "seatsLeave");
            return (Criteria) this;
        }

        public Criteria andSeatsLeaveNotBetween(Integer value1, Integer value2) {
            addCriterion("seats_leave not between", value1, value2, "seatsLeave");
            return (Criteria) this;
        }

        public Criteria andAidIsNull() {
            addCriterion("AID is null");
            return (Criteria) this;
        }

        public Criteria andAidIsNotNull() {
            addCriterion("AID is not null");
            return (Criteria) this;
        }

        public Criteria andAidEqualTo(Integer value) {
            addCriterion("AID =", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidNotEqualTo(Integer value) {
            addCriterion("AID <>", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidGreaterThan(Integer value) {
            addCriterion("AID >", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidGreaterThanOrEqualTo(Integer value) {
            addCriterion("AID >=", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidLessThan(Integer value) {
            addCriterion("AID <", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidLessThanOrEqualTo(Integer value) {
            addCriterion("AID <=", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidIn(List<Integer> values) {
            addCriterion("AID in", values, "aid");
            return (Criteria) this;
        }

        public Criteria andAidNotIn(List<Integer> values) {
            addCriterion("AID not in", values, "aid");
            return (Criteria) this;
        }

        public Criteria andAidBetween(Integer value1, Integer value2) {
            addCriterion("AID between", value1, value2, "aid");
            return (Criteria) this;
        }

        public Criteria andAidNotBetween(Integer value1, Integer value2) {
            addCriterion("AID not between", value1, value2, "aid");
            return (Criteria) this;
        }

        public Criteria andTimeIdIsNull() {
            addCriterion("time_id is null");
            return (Criteria) this;
        }

        public Criteria andTimeIdIsNotNull() {
            addCriterion("time_id is not null");
            return (Criteria) this;
        }

        public Criteria andTimeIdEqualTo(Integer value) {
            addCriterion("time_id =", value, "timeId");
            return (Criteria) this;
        }

        public Criteria andTimeIdNotEqualTo(Integer value) {
            addCriterion("time_id <>", value, "timeId");
            return (Criteria) this;
        }

        public Criteria andTimeIdGreaterThan(Integer value) {
            addCriterion("time_id >", value, "timeId");
            return (Criteria) this;
        }

        public Criteria andTimeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("time_id >=", value, "timeId");
            return (Criteria) this;
        }

        public Criteria andTimeIdLessThan(Integer value) {
            addCriterion("time_id <", value, "timeId");
            return (Criteria) this;
        }

        public Criteria andTimeIdLessThanOrEqualTo(Integer value) {
            addCriterion("time_id <=", value, "timeId");
            return (Criteria) this;
        }

        public Criteria andTimeIdIn(List<Integer> values) {
            addCriterion("time_id in", values, "timeId");
            return (Criteria) this;
        }

        public Criteria andTimeIdNotIn(List<Integer> values) {
            addCriterion("time_id not in", values, "timeId");
            return (Criteria) this;
        }

        public Criteria andTimeIdBetween(Integer value1, Integer value2) {
            addCriterion("time_id between", value1, value2, "timeId");
            return (Criteria) this;
        }

        public Criteria andTimeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("time_id not between", value1, value2, "timeId");
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