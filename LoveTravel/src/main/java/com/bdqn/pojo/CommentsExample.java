package com.bdqn.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CommentsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CommentsExample() {
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

        public Criteria andHotelidIsNull() {
            addCriterion("hotelid is null");
            return (Criteria) this;
        }

        public Criteria andHotelidIsNotNull() {
            addCriterion("hotelid is not null");
            return (Criteria) this;
        }

        public Criteria andHotelidEqualTo(Integer value) {
            addCriterion("hotelid =", value, "hotelid");
            return (Criteria) this;
        }

        public Criteria andHotelidNotEqualTo(Integer value) {
            addCriterion("hotelid <>", value, "hotelid");
            return (Criteria) this;
        }

        public Criteria andHotelidGreaterThan(Integer value) {
            addCriterion("hotelid >", value, "hotelid");
            return (Criteria) this;
        }

        public Criteria andHotelidGreaterThanOrEqualTo(Integer value) {
            addCriterion("hotelid >=", value, "hotelid");
            return (Criteria) this;
        }

        public Criteria andHotelidLessThan(Integer value) {
            addCriterion("hotelid <", value, "hotelid");
            return (Criteria) this;
        }

        public Criteria andHotelidLessThanOrEqualTo(Integer value) {
            addCriterion("hotelid <=", value, "hotelid");
            return (Criteria) this;
        }

        public Criteria andHotelidIn(List<Integer> values) {
            addCriterion("hotelid in", values, "hotelid");
            return (Criteria) this;
        }

        public Criteria andHotelidNotIn(List<Integer> values) {
            addCriterion("hotelid not in", values, "hotelid");
            return (Criteria) this;
        }

        public Criteria andHotelidBetween(Integer value1, Integer value2) {
            addCriterion("hotelid between", value1, value2, "hotelid");
            return (Criteria) this;
        }

        public Criteria andHotelidNotBetween(Integer value1, Integer value2) {
            addCriterion("hotelid not between", value1, value2, "hotelid");
            return (Criteria) this;
        }

        public Criteria andHotelnameIsNull() {
            addCriterion("hotelname is null");
            return (Criteria) this;
        }

        public Criteria andHotelnameIsNotNull() {
            addCriterion("hotelname is not null");
            return (Criteria) this;
        }

        public Criteria andHotelnameEqualTo(String value) {
            addCriterion("hotelname =", value, "hotelname");
            return (Criteria) this;
        }

        public Criteria andHotelnameNotEqualTo(String value) {
            addCriterion("hotelname <>", value, "hotelname");
            return (Criteria) this;
        }

        public Criteria andHotelnameGreaterThan(String value) {
            addCriterion("hotelname >", value, "hotelname");
            return (Criteria) this;
        }

        public Criteria andHotelnameGreaterThanOrEqualTo(String value) {
            addCriterion("hotelname >=", value, "hotelname");
            return (Criteria) this;
        }

        public Criteria andHotelnameLessThan(String value) {
            addCriterion("hotelname <", value, "hotelname");
            return (Criteria) this;
        }

        public Criteria andHotelnameLessThanOrEqualTo(String value) {
            addCriterion("hotelname <=", value, "hotelname");
            return (Criteria) this;
        }

        public Criteria andHotelnameLike(String value) {
            addCriterion("hotelname like", value, "hotelname");
            return (Criteria) this;
        }

        public Criteria andHotelnameNotLike(String value) {
            addCriterion("hotelname not like", value, "hotelname");
            return (Criteria) this;
        }

        public Criteria andHotelnameIn(List<String> values) {
            addCriterion("hotelname in", values, "hotelname");
            return (Criteria) this;
        }

        public Criteria andHotelnameNotIn(List<String> values) {
            addCriterion("hotelname not in", values, "hotelname");
            return (Criteria) this;
        }

        public Criteria andHotelnameBetween(String value1, String value2) {
            addCriterion("hotelname between", value1, value2, "hotelname");
            return (Criteria) this;
        }

        public Criteria andHotelnameNotBetween(String value1, String value2) {
            addCriterion("hotelname not between", value1, value2, "hotelname");
            return (Criteria) this;
        }

        public Criteria andCleanscoreIsNull() {
            addCriterion("cleanscore is null");
            return (Criteria) this;
        }

        public Criteria andCleanscoreIsNotNull() {
            addCriterion("cleanscore is not null");
            return (Criteria) this;
        }

        public Criteria andCleanscoreEqualTo(Integer value) {
            addCriterion("cleanscore =", value, "cleanscore");
            return (Criteria) this;
        }

        public Criteria andCleanscoreNotEqualTo(Integer value) {
            addCriterion("cleanscore <>", value, "cleanscore");
            return (Criteria) this;
        }

        public Criteria andCleanscoreGreaterThan(Integer value) {
            addCriterion("cleanscore >", value, "cleanscore");
            return (Criteria) this;
        }

        public Criteria andCleanscoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("cleanscore >=", value, "cleanscore");
            return (Criteria) this;
        }

        public Criteria andCleanscoreLessThan(Integer value) {
            addCriterion("cleanscore <", value, "cleanscore");
            return (Criteria) this;
        }

        public Criteria andCleanscoreLessThanOrEqualTo(Integer value) {
            addCriterion("cleanscore <=", value, "cleanscore");
            return (Criteria) this;
        }

        public Criteria andCleanscoreIn(List<Integer> values) {
            addCriterion("cleanscore in", values, "cleanscore");
            return (Criteria) this;
        }

        public Criteria andCleanscoreNotIn(List<Integer> values) {
            addCriterion("cleanscore not in", values, "cleanscore");
            return (Criteria) this;
        }

        public Criteria andCleanscoreBetween(Integer value1, Integer value2) {
            addCriterion("cleanscore between", value1, value2, "cleanscore");
            return (Criteria) this;
        }

        public Criteria andCleanscoreNotBetween(Integer value1, Integer value2) {
            addCriterion("cleanscore not between", value1, value2, "cleanscore");
            return (Criteria) this;
        }

        public Criteria andLocationscoreIsNull() {
            addCriterion("locationscore is null");
            return (Criteria) this;
        }

        public Criteria andLocationscoreIsNotNull() {
            addCriterion("locationscore is not null");
            return (Criteria) this;
        }

        public Criteria andLocationscoreEqualTo(Integer value) {
            addCriterion("locationscore =", value, "locationscore");
            return (Criteria) this;
        }

        public Criteria andLocationscoreNotEqualTo(Integer value) {
            addCriterion("locationscore <>", value, "locationscore");
            return (Criteria) this;
        }

        public Criteria andLocationscoreGreaterThan(Integer value) {
            addCriterion("locationscore >", value, "locationscore");
            return (Criteria) this;
        }

        public Criteria andLocationscoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("locationscore >=", value, "locationscore");
            return (Criteria) this;
        }

        public Criteria andLocationscoreLessThan(Integer value) {
            addCriterion("locationscore <", value, "locationscore");
            return (Criteria) this;
        }

        public Criteria andLocationscoreLessThanOrEqualTo(Integer value) {
            addCriterion("locationscore <=", value, "locationscore");
            return (Criteria) this;
        }

        public Criteria andLocationscoreIn(List<Integer> values) {
            addCriterion("locationscore in", values, "locationscore");
            return (Criteria) this;
        }

        public Criteria andLocationscoreNotIn(List<Integer> values) {
            addCriterion("locationscore not in", values, "locationscore");
            return (Criteria) this;
        }

        public Criteria andLocationscoreBetween(Integer value1, Integer value2) {
            addCriterion("locationscore between", value1, value2, "locationscore");
            return (Criteria) this;
        }

        public Criteria andLocationscoreNotBetween(Integer value1, Integer value2) {
            addCriterion("locationscore not between", value1, value2, "locationscore");
            return (Criteria) this;
        }

        public Criteria andServicescoreIsNull() {
            addCriterion("servicescore is null");
            return (Criteria) this;
        }

        public Criteria andServicescoreIsNotNull() {
            addCriterion("servicescore is not null");
            return (Criteria) this;
        }

        public Criteria andServicescoreEqualTo(Integer value) {
            addCriterion("servicescore =", value, "servicescore");
            return (Criteria) this;
        }

        public Criteria andServicescoreNotEqualTo(Integer value) {
            addCriterion("servicescore <>", value, "servicescore");
            return (Criteria) this;
        }

        public Criteria andServicescoreGreaterThan(Integer value) {
            addCriterion("servicescore >", value, "servicescore");
            return (Criteria) this;
        }

        public Criteria andServicescoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("servicescore >=", value, "servicescore");
            return (Criteria) this;
        }

        public Criteria andServicescoreLessThan(Integer value) {
            addCriterion("servicescore <", value, "servicescore");
            return (Criteria) this;
        }

        public Criteria andServicescoreLessThanOrEqualTo(Integer value) {
            addCriterion("servicescore <=", value, "servicescore");
            return (Criteria) this;
        }

        public Criteria andServicescoreIn(List<Integer> values) {
            addCriterion("servicescore in", values, "servicescore");
            return (Criteria) this;
        }

        public Criteria andServicescoreNotIn(List<Integer> values) {
            addCriterion("servicescore not in", values, "servicescore");
            return (Criteria) this;
        }

        public Criteria andServicescoreBetween(Integer value1, Integer value2) {
            addCriterion("servicescore between", value1, value2, "servicescore");
            return (Criteria) this;
        }

        public Criteria andServicescoreNotBetween(Integer value1, Integer value2) {
            addCriterion("servicescore not between", value1, value2, "servicescore");
            return (Criteria) this;
        }

        public Criteria andFacilitiesscoreIsNull() {
            addCriterion("FacilitiesScore is null");
            return (Criteria) this;
        }

        public Criteria andFacilitiesscoreIsNotNull() {
            addCriterion("FacilitiesScore is not null");
            return (Criteria) this;
        }

        public Criteria andFacilitiesscoreEqualTo(Integer value) {
            addCriterion("FacilitiesScore =", value, "facilitiesscore");
            return (Criteria) this;
        }

        public Criteria andFacilitiesscoreNotEqualTo(Integer value) {
            addCriterion("FacilitiesScore <>", value, "facilitiesscore");
            return (Criteria) this;
        }

        public Criteria andFacilitiesscoreGreaterThan(Integer value) {
            addCriterion("FacilitiesScore >", value, "facilitiesscore");
            return (Criteria) this;
        }

        public Criteria andFacilitiesscoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("FacilitiesScore >=", value, "facilitiesscore");
            return (Criteria) this;
        }

        public Criteria andFacilitiesscoreLessThan(Integer value) {
            addCriterion("FacilitiesScore <", value, "facilitiesscore");
            return (Criteria) this;
        }

        public Criteria andFacilitiesscoreLessThanOrEqualTo(Integer value) {
            addCriterion("FacilitiesScore <=", value, "facilitiesscore");
            return (Criteria) this;
        }

        public Criteria andFacilitiesscoreIn(List<Integer> values) {
            addCriterion("FacilitiesScore in", values, "facilitiesscore");
            return (Criteria) this;
        }

        public Criteria andFacilitiesscoreNotIn(List<Integer> values) {
            addCriterion("FacilitiesScore not in", values, "facilitiesscore");
            return (Criteria) this;
        }

        public Criteria andFacilitiesscoreBetween(Integer value1, Integer value2) {
            addCriterion("FacilitiesScore between", value1, value2, "facilitiesscore");
            return (Criteria) this;
        }

        public Criteria andFacilitiesscoreNotBetween(Integer value1, Integer value2) {
            addCriterion("FacilitiesScore not between", value1, value2, "facilitiesscore");
            return (Criteria) this;
        }

        public Criteria andCommentinfoIsNull() {
            addCriterion("commentinfo is null");
            return (Criteria) this;
        }

        public Criteria andCommentinfoIsNotNull() {
            addCriterion("commentinfo is not null");
            return (Criteria) this;
        }

        public Criteria andCommentinfoEqualTo(String value) {
            addCriterion("commentinfo =", value, "commentinfo");
            return (Criteria) this;
        }

        public Criteria andCommentinfoNotEqualTo(String value) {
            addCriterion("commentinfo <>", value, "commentinfo");
            return (Criteria) this;
        }

        public Criteria andCommentinfoGreaterThan(String value) {
            addCriterion("commentinfo >", value, "commentinfo");
            return (Criteria) this;
        }

        public Criteria andCommentinfoGreaterThanOrEqualTo(String value) {
            addCriterion("commentinfo >=", value, "commentinfo");
            return (Criteria) this;
        }

        public Criteria andCommentinfoLessThan(String value) {
            addCriterion("commentinfo <", value, "commentinfo");
            return (Criteria) this;
        }

        public Criteria andCommentinfoLessThanOrEqualTo(String value) {
            addCriterion("commentinfo <=", value, "commentinfo");
            return (Criteria) this;
        }

        public Criteria andCommentinfoLike(String value) {
            addCriterion("commentinfo like", value, "commentinfo");
            return (Criteria) this;
        }

        public Criteria andCommentinfoNotLike(String value) {
            addCriterion("commentinfo not like", value, "commentinfo");
            return (Criteria) this;
        }

        public Criteria andCommentinfoIn(List<String> values) {
            addCriterion("commentinfo in", values, "commentinfo");
            return (Criteria) this;
        }

        public Criteria andCommentinfoNotIn(List<String> values) {
            addCriterion("commentinfo not in", values, "commentinfo");
            return (Criteria) this;
        }

        public Criteria andCommentinfoBetween(String value1, String value2) {
            addCriterion("commentinfo between", value1, value2, "commentinfo");
            return (Criteria) this;
        }

        public Criteria andCommentinfoNotBetween(String value1, String value2) {
            addCriterion("commentinfo not between", value1, value2, "commentinfo");
            return (Criteria) this;
        }

        public Criteria andTotalscoreIsNull() {
            addCriterion("totalscore is null");
            return (Criteria) this;
        }

        public Criteria andTotalscoreIsNotNull() {
            addCriterion("totalscore is not null");
            return (Criteria) this;
        }

        public Criteria andTotalscoreEqualTo(Integer value) {
            addCriterion("totalscore =", value, "totalscore");
            return (Criteria) this;
        }

        public Criteria andTotalscoreNotEqualTo(Integer value) {
            addCriterion("totalscore <>", value, "totalscore");
            return (Criteria) this;
        }

        public Criteria andTotalscoreGreaterThan(Integer value) {
            addCriterion("totalscore >", value, "totalscore");
            return (Criteria) this;
        }

        public Criteria andTotalscoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("totalscore >=", value, "totalscore");
            return (Criteria) this;
        }

        public Criteria andTotalscoreLessThan(Integer value) {
            addCriterion("totalscore <", value, "totalscore");
            return (Criteria) this;
        }

        public Criteria andTotalscoreLessThanOrEqualTo(Integer value) {
            addCriterion("totalscore <=", value, "totalscore");
            return (Criteria) this;
        }

        public Criteria andTotalscoreIn(List<Integer> values) {
            addCriterion("totalscore in", values, "totalscore");
            return (Criteria) this;
        }

        public Criteria andTotalscoreNotIn(List<Integer> values) {
            addCriterion("totalscore not in", values, "totalscore");
            return (Criteria) this;
        }

        public Criteria andTotalscoreBetween(Integer value1, Integer value2) {
            addCriterion("totalscore between", value1, value2, "totalscore");
            return (Criteria) this;
        }

        public Criteria andTotalscoreNotBetween(Integer value1, Integer value2) {
            addCriterion("totalscore not between", value1, value2, "totalscore");
            return (Criteria) this;
        }

        public Criteria andCreatebyIsNull() {
            addCriterion("createby is null");
            return (Criteria) this;
        }

        public Criteria andCreatebyIsNotNull() {
            addCriterion("createby is not null");
            return (Criteria) this;
        }

        public Criteria andCreatebyEqualTo(Integer value) {
            addCriterion("createby =", value, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyNotEqualTo(Integer value) {
            addCriterion("createby <>", value, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyGreaterThan(Integer value) {
            addCriterion("createby >", value, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyGreaterThanOrEqualTo(Integer value) {
            addCriterion("createby >=", value, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyLessThan(Integer value) {
            addCriterion("createby <", value, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyLessThanOrEqualTo(Integer value) {
            addCriterion("createby <=", value, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyIn(List<Integer> values) {
            addCriterion("createby in", values, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyNotIn(List<Integer> values) {
            addCriterion("createby not in", values, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyBetween(Integer value1, Integer value2) {
            addCriterion("createby between", value1, value2, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyNotBetween(Integer value1, Integer value2) {
            addCriterion("createby not between", value1, value2, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatedateIsNull() {
            addCriterion("createdate is null");
            return (Criteria) this;
        }

        public Criteria andCreatedateIsNotNull() {
            addCriterion("createdate is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedateEqualTo(Date value) {
            addCriterion("createdate =", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotEqualTo(Date value) {
            addCriterion("createdate <>", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThan(Date value) {
            addCriterion("createdate >", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThanOrEqualTo(Date value) {
            addCriterion("createdate >=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThan(Date value) {
            addCriterion("createdate <", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThanOrEqualTo(Date value) {
            addCriterion("createdate <=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateIn(List<Date> values) {
            addCriterion("createdate in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotIn(List<Date> values) {
            addCriterion("createdate not in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateBetween(Date value1, Date value2) {
            addCriterion("createdate between", value1, value2, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotBetween(Date value1, Date value2) {
            addCriterion("createdate not between", value1, value2, "createdate");
            return (Criteria) this;
        }

        public Criteria andModifybyIsNull() {
            addCriterion("modifyby is null");
            return (Criteria) this;
        }

        public Criteria andModifybyIsNotNull() {
            addCriterion("modifyby is not null");
            return (Criteria) this;
        }

        public Criteria andModifybyEqualTo(Integer value) {
            addCriterion("modifyby =", value, "modifyby");
            return (Criteria) this;
        }

        public Criteria andModifybyNotEqualTo(Integer value) {
            addCriterion("modifyby <>", value, "modifyby");
            return (Criteria) this;
        }

        public Criteria andModifybyGreaterThan(Integer value) {
            addCriterion("modifyby >", value, "modifyby");
            return (Criteria) this;
        }

        public Criteria andModifybyGreaterThanOrEqualTo(Integer value) {
            addCriterion("modifyby >=", value, "modifyby");
            return (Criteria) this;
        }

        public Criteria andModifybyLessThan(Integer value) {
            addCriterion("modifyby <", value, "modifyby");
            return (Criteria) this;
        }

        public Criteria andModifybyLessThanOrEqualTo(Integer value) {
            addCriterion("modifyby <=", value, "modifyby");
            return (Criteria) this;
        }

        public Criteria andModifybyIn(List<Integer> values) {
            addCriterion("modifyby in", values, "modifyby");
            return (Criteria) this;
        }

        public Criteria andModifybyNotIn(List<Integer> values) {
            addCriterion("modifyby not in", values, "modifyby");
            return (Criteria) this;
        }

        public Criteria andModifybyBetween(Integer value1, Integer value2) {
            addCriterion("modifyby between", value1, value2, "modifyby");
            return (Criteria) this;
        }

        public Criteria andModifybyNotBetween(Integer value1, Integer value2) {
            addCriterion("modifyby not between", value1, value2, "modifyby");
            return (Criteria) this;
        }

        public Criteria andModifydateIsNull() {
            addCriterion("modifydate is null");
            return (Criteria) this;
        }

        public Criteria andModifydateIsNotNull() {
            addCriterion("modifydate is not null");
            return (Criteria) this;
        }

        public Criteria andModifydateEqualTo(Date value) {
            addCriterion("modifydate =", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateNotEqualTo(Date value) {
            addCriterion("modifydate <>", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateGreaterThan(Date value) {
            addCriterion("modifydate >", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateGreaterThanOrEqualTo(Date value) {
            addCriterion("modifydate >=", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateLessThan(Date value) {
            addCriterion("modifydate <", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateLessThanOrEqualTo(Date value) {
            addCriterion("modifydate <=", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateIn(List<Date> values) {
            addCriterion("modifydate in", values, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateNotIn(List<Date> values) {
            addCriterion("modifydate not in", values, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateBetween(Date value1, Date value2) {
            addCriterion("modifydate between", value1, value2, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateNotBetween(Date value1, Date value2) {
            addCriterion("modifydate not between", value1, value2, "modifydate");
            return (Criteria) this;
        }

        public Criteria andOrdernoIsNull() {
            addCriterion("orderno is null");
            return (Criteria) this;
        }

        public Criteria andOrdernoIsNotNull() {
            addCriterion("orderno is not null");
            return (Criteria) this;
        }

        public Criteria andOrdernoEqualTo(String value) {
            addCriterion("orderno =", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoNotEqualTo(String value) {
            addCriterion("orderno <>", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoGreaterThan(String value) {
            addCriterion("orderno >", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoGreaterThanOrEqualTo(String value) {
            addCriterion("orderno >=", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoLessThan(String value) {
            addCriterion("orderno <", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoLessThanOrEqualTo(String value) {
            addCriterion("orderno <=", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoLike(String value) {
            addCriterion("orderno like", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoNotLike(String value) {
            addCriterion("orderno not like", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoIn(List<String> values) {
            addCriterion("orderno in", values, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoNotIn(List<String> values) {
            addCriterion("orderno not in", values, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoBetween(String value1, String value2) {
            addCriterion("orderno between", value1, value2, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoNotBetween(String value1, String value2) {
            addCriterion("orderno not between", value1, value2, "orderno");
            return (Criteria) this;
        }

        public Criteria andCommentsimgIsNull() {
            addCriterion("commentsImg is null");
            return (Criteria) this;
        }

        public Criteria andCommentsimgIsNotNull() {
            addCriterion("commentsImg is not null");
            return (Criteria) this;
        }

        public Criteria andCommentsimgEqualTo(String value) {
            addCriterion("commentsImg =", value, "commentsimg");
            return (Criteria) this;
        }

        public Criteria andCommentsimgNotEqualTo(String value) {
            addCriterion("commentsImg <>", value, "commentsimg");
            return (Criteria) this;
        }

        public Criteria andCommentsimgGreaterThan(String value) {
            addCriterion("commentsImg >", value, "commentsimg");
            return (Criteria) this;
        }

        public Criteria andCommentsimgGreaterThanOrEqualTo(String value) {
            addCriterion("commentsImg >=", value, "commentsimg");
            return (Criteria) this;
        }

        public Criteria andCommentsimgLessThan(String value) {
            addCriterion("commentsImg <", value, "commentsimg");
            return (Criteria) this;
        }

        public Criteria andCommentsimgLessThanOrEqualTo(String value) {
            addCriterion("commentsImg <=", value, "commentsimg");
            return (Criteria) this;
        }

        public Criteria andCommentsimgLike(String value) {
            addCriterion("commentsImg like", value, "commentsimg");
            return (Criteria) this;
        }

        public Criteria andCommentsimgNotLike(String value) {
            addCriterion("commentsImg not like", value, "commentsimg");
            return (Criteria) this;
        }

        public Criteria andCommentsimgIn(List<String> values) {
            addCriterion("commentsImg in", values, "commentsimg");
            return (Criteria) this;
        }

        public Criteria andCommentsimgNotIn(List<String> values) {
            addCriterion("commentsImg not in", values, "commentsimg");
            return (Criteria) this;
        }

        public Criteria andCommentsimgBetween(String value1, String value2) {
            addCriterion("commentsImg between", value1, value2, "commentsimg");
            return (Criteria) this;
        }

        public Criteria andCommentsimgNotBetween(String value1, String value2) {
            addCriterion("commentsImg not between", value1, value2, "commentsimg");
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