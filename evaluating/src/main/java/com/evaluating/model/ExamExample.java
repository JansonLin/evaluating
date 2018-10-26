package com.evaluating.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ExamExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ExamExample() {
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

    /**
     * 
     * 
     * @author wcyong
     * 
     * @date 2018-10-26
     */
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

        public Criteria andENameIsNull() {
            addCriterion("e_name is null");
            return (Criteria) this;
        }

        public Criteria andENameIsNotNull() {
            addCriterion("e_name is not null");
            return (Criteria) this;
        }

        public Criteria andENameEqualTo(String value) {
            addCriterion("e_name =", value, "eName");
            return (Criteria) this;
        }

        public Criteria andENameNotEqualTo(String value) {
            addCriterion("e_name <>", value, "eName");
            return (Criteria) this;
        }

        public Criteria andENameGreaterThan(String value) {
            addCriterion("e_name >", value, "eName");
            return (Criteria) this;
        }

        public Criteria andENameGreaterThanOrEqualTo(String value) {
            addCriterion("e_name >=", value, "eName");
            return (Criteria) this;
        }

        public Criteria andENameLessThan(String value) {
            addCriterion("e_name <", value, "eName");
            return (Criteria) this;
        }

        public Criteria andENameLessThanOrEqualTo(String value) {
            addCriterion("e_name <=", value, "eName");
            return (Criteria) this;
        }

        public Criteria andENameLike(String value) {
            addCriterion("e_name like", value, "eName");
            return (Criteria) this;
        }

        public Criteria andENameNotLike(String value) {
            addCriterion("e_name not like", value, "eName");
            return (Criteria) this;
        }

        public Criteria andENameIn(List<String> values) {
            addCriterion("e_name in", values, "eName");
            return (Criteria) this;
        }

        public Criteria andENameNotIn(List<String> values) {
            addCriterion("e_name not in", values, "eName");
            return (Criteria) this;
        }

        public Criteria andENameBetween(String value1, String value2) {
            addCriterion("e_name between", value1, value2, "eName");
            return (Criteria) this;
        }

        public Criteria andENameNotBetween(String value1, String value2) {
            addCriterion("e_name not between", value1, value2, "eName");
            return (Criteria) this;
        }

        public Criteria andECountIsNull() {
            addCriterion("e_count is null");
            return (Criteria) this;
        }

        public Criteria andECountIsNotNull() {
            addCriterion("e_count is not null");
            return (Criteria) this;
        }

        public Criteria andECountEqualTo(Integer value) {
            addCriterion("e_count =", value, "eCount");
            return (Criteria) this;
        }

        public Criteria andECountNotEqualTo(Integer value) {
            addCriterion("e_count <>", value, "eCount");
            return (Criteria) this;
        }

        public Criteria andECountGreaterThan(Integer value) {
            addCriterion("e_count >", value, "eCount");
            return (Criteria) this;
        }

        public Criteria andECountGreaterThanOrEqualTo(Integer value) {
            addCriterion("e_count >=", value, "eCount");
            return (Criteria) this;
        }

        public Criteria andECountLessThan(Integer value) {
            addCriterion("e_count <", value, "eCount");
            return (Criteria) this;
        }

        public Criteria andECountLessThanOrEqualTo(Integer value) {
            addCriterion("e_count <=", value, "eCount");
            return (Criteria) this;
        }

        public Criteria andECountIn(List<Integer> values) {
            addCriterion("e_count in", values, "eCount");
            return (Criteria) this;
        }

        public Criteria andECountNotIn(List<Integer> values) {
            addCriterion("e_count not in", values, "eCount");
            return (Criteria) this;
        }

        public Criteria andECountBetween(Integer value1, Integer value2) {
            addCriterion("e_count between", value1, value2, "eCount");
            return (Criteria) this;
        }

        public Criteria andECountNotBetween(Integer value1, Integer value2) {
            addCriterion("e_count not between", value1, value2, "eCount");
            return (Criteria) this;
        }

        public Criteria andETimeIsNull() {
            addCriterion("e_time is null");
            return (Criteria) this;
        }

        public Criteria andETimeIsNotNull() {
            addCriterion("e_time is not null");
            return (Criteria) this;
        }

        public Criteria andETimeEqualTo(Date value) {
            addCriterion("e_time =", value, "eTime");
            return (Criteria) this;
        }

        public Criteria andETimeNotEqualTo(Date value) {
            addCriterion("e_time <>", value, "eTime");
            return (Criteria) this;
        }

        public Criteria andETimeGreaterThan(Date value) {
            addCriterion("e_time >", value, "eTime");
            return (Criteria) this;
        }

        public Criteria andETimeGreaterThanOrEqualTo(Date value) {
            addCriterion("e_time >=", value, "eTime");
            return (Criteria) this;
        }

        public Criteria andETimeLessThan(Date value) {
            addCriterion("e_time <", value, "eTime");
            return (Criteria) this;
        }

        public Criteria andETimeLessThanOrEqualTo(Date value) {
            addCriterion("e_time <=", value, "eTime");
            return (Criteria) this;
        }

        public Criteria andETimeIn(List<Date> values) {
            addCriterion("e_time in", values, "eTime");
            return (Criteria) this;
        }

        public Criteria andETimeNotIn(List<Date> values) {
            addCriterion("e_time not in", values, "eTime");
            return (Criteria) this;
        }

        public Criteria andETimeBetween(Date value1, Date value2) {
            addCriterion("e_time between", value1, value2, "eTime");
            return (Criteria) this;
        }

        public Criteria andETimeNotBetween(Date value1, Date value2) {
            addCriterion("e_time not between", value1, value2, "eTime");
            return (Criteria) this;
        }

        public Criteria andECodeIsNull() {
            addCriterion("e_code is null");
            return (Criteria) this;
        }

        public Criteria andECodeIsNotNull() {
            addCriterion("e_code is not null");
            return (Criteria) this;
        }

        public Criteria andECodeEqualTo(String value) {
            addCriterion("e_code =", value, "eCode");
            return (Criteria) this;
        }

        public Criteria andECodeNotEqualTo(String value) {
            addCriterion("e_code <>", value, "eCode");
            return (Criteria) this;
        }

        public Criteria andECodeGreaterThan(String value) {
            addCriterion("e_code >", value, "eCode");
            return (Criteria) this;
        }

        public Criteria andECodeGreaterThanOrEqualTo(String value) {
            addCriterion("e_code >=", value, "eCode");
            return (Criteria) this;
        }

        public Criteria andECodeLessThan(String value) {
            addCriterion("e_code <", value, "eCode");
            return (Criteria) this;
        }

        public Criteria andECodeLessThanOrEqualTo(String value) {
            addCriterion("e_code <=", value, "eCode");
            return (Criteria) this;
        }

        public Criteria andECodeLike(String value) {
            addCriterion("e_code like", value, "eCode");
            return (Criteria) this;
        }

        public Criteria andECodeNotLike(String value) {
            addCriterion("e_code not like", value, "eCode");
            return (Criteria) this;
        }

        public Criteria andECodeIn(List<String> values) {
            addCriterion("e_code in", values, "eCode");
            return (Criteria) this;
        }

        public Criteria andECodeNotIn(List<String> values) {
            addCriterion("e_code not in", values, "eCode");
            return (Criteria) this;
        }

        public Criteria andECodeBetween(String value1, String value2) {
            addCriterion("e_code between", value1, value2, "eCode");
            return (Criteria) this;
        }

        public Criteria andECodeNotBetween(String value1, String value2) {
            addCriterion("e_code not between", value1, value2, "eCode");
            return (Criteria) this;
        }

        public Criteria andECreatUserIdIsNull() {
            addCriterion("e_creat_user_id is null");
            return (Criteria) this;
        }

        public Criteria andECreatUserIdIsNotNull() {
            addCriterion("e_creat_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andECreatUserIdEqualTo(Integer value) {
            addCriterion("e_creat_user_id =", value, "eCreatUserId");
            return (Criteria) this;
        }

        public Criteria andECreatUserIdNotEqualTo(Integer value) {
            addCriterion("e_creat_user_id <>", value, "eCreatUserId");
            return (Criteria) this;
        }

        public Criteria andECreatUserIdGreaterThan(Integer value) {
            addCriterion("e_creat_user_id >", value, "eCreatUserId");
            return (Criteria) this;
        }

        public Criteria andECreatUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("e_creat_user_id >=", value, "eCreatUserId");
            return (Criteria) this;
        }

        public Criteria andECreatUserIdLessThan(Integer value) {
            addCriterion("e_creat_user_id <", value, "eCreatUserId");
            return (Criteria) this;
        }

        public Criteria andECreatUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("e_creat_user_id <=", value, "eCreatUserId");
            return (Criteria) this;
        }

        public Criteria andECreatUserIdIn(List<Integer> values) {
            addCriterion("e_creat_user_id in", values, "eCreatUserId");
            return (Criteria) this;
        }

        public Criteria andECreatUserIdNotIn(List<Integer> values) {
            addCriterion("e_creat_user_id not in", values, "eCreatUserId");
            return (Criteria) this;
        }

        public Criteria andECreatUserIdBetween(Integer value1, Integer value2) {
            addCriterion("e_creat_user_id between", value1, value2, "eCreatUserId");
            return (Criteria) this;
        }

        public Criteria andECreatUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("e_creat_user_id not between", value1, value2, "eCreatUserId");
            return (Criteria) this;
        }

        public Criteria andEDetailIsNull() {
            addCriterion("e_detail is null");
            return (Criteria) this;
        }

        public Criteria andEDetailIsNotNull() {
            addCriterion("e_detail is not null");
            return (Criteria) this;
        }

        public Criteria andEDetailEqualTo(String value) {
            addCriterion("e_detail =", value, "eDetail");
            return (Criteria) this;
        }

        public Criteria andEDetailNotEqualTo(String value) {
            addCriterion("e_detail <>", value, "eDetail");
            return (Criteria) this;
        }

        public Criteria andEDetailGreaterThan(String value) {
            addCriterion("e_detail >", value, "eDetail");
            return (Criteria) this;
        }

        public Criteria andEDetailGreaterThanOrEqualTo(String value) {
            addCriterion("e_detail >=", value, "eDetail");
            return (Criteria) this;
        }

        public Criteria andEDetailLessThan(String value) {
            addCriterion("e_detail <", value, "eDetail");
            return (Criteria) this;
        }

        public Criteria andEDetailLessThanOrEqualTo(String value) {
            addCriterion("e_detail <=", value, "eDetail");
            return (Criteria) this;
        }

        public Criteria andEDetailLike(String value) {
            addCriterion("e_detail like", value, "eDetail");
            return (Criteria) this;
        }

        public Criteria andEDetailNotLike(String value) {
            addCriterion("e_detail not like", value, "eDetail");
            return (Criteria) this;
        }

        public Criteria andEDetailIn(List<String> values) {
            addCriterion("e_detail in", values, "eDetail");
            return (Criteria) this;
        }

        public Criteria andEDetailNotIn(List<String> values) {
            addCriterion("e_detail not in", values, "eDetail");
            return (Criteria) this;
        }

        public Criteria andEDetailBetween(String value1, String value2) {
            addCriterion("e_detail between", value1, value2, "eDetail");
            return (Criteria) this;
        }

        public Criteria andEDetailNotBetween(String value1, String value2) {
            addCriterion("e_detail not between", value1, value2, "eDetail");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * 
     * 
     * @author wcyong
     * 
     * @date 2018-10-26
     */
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