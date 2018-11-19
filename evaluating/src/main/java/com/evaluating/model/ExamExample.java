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
     * @date 2018-11-19
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

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andBpmStatusIsNull() {
            addCriterion("bpm_status is null");
            return (Criteria) this;
        }

        public Criteria andBpmStatusIsNotNull() {
            addCriterion("bpm_status is not null");
            return (Criteria) this;
        }

        public Criteria andBpmStatusEqualTo(String value) {
            addCriterion("bpm_status =", value, "bpmStatus");
            return (Criteria) this;
        }

        public Criteria andBpmStatusNotEqualTo(String value) {
            addCriterion("bpm_status <>", value, "bpmStatus");
            return (Criteria) this;
        }

        public Criteria andBpmStatusGreaterThan(String value) {
            addCriterion("bpm_status >", value, "bpmStatus");
            return (Criteria) this;
        }

        public Criteria andBpmStatusGreaterThanOrEqualTo(String value) {
            addCriterion("bpm_status >=", value, "bpmStatus");
            return (Criteria) this;
        }

        public Criteria andBpmStatusLessThan(String value) {
            addCriterion("bpm_status <", value, "bpmStatus");
            return (Criteria) this;
        }

        public Criteria andBpmStatusLessThanOrEqualTo(String value) {
            addCriterion("bpm_status <=", value, "bpmStatus");
            return (Criteria) this;
        }

        public Criteria andBpmStatusLike(String value) {
            addCriterion("bpm_status like", value, "bpmStatus");
            return (Criteria) this;
        }

        public Criteria andBpmStatusNotLike(String value) {
            addCriterion("bpm_status not like", value, "bpmStatus");
            return (Criteria) this;
        }

        public Criteria andBpmStatusIn(List<String> values) {
            addCriterion("bpm_status in", values, "bpmStatus");
            return (Criteria) this;
        }

        public Criteria andBpmStatusNotIn(List<String> values) {
            addCriterion("bpm_status not in", values, "bpmStatus");
            return (Criteria) this;
        }

        public Criteria andBpmStatusBetween(String value1, String value2) {
            addCriterion("bpm_status between", value1, value2, "bpmStatus");
            return (Criteria) this;
        }

        public Criteria andBpmStatusNotBetween(String value1, String value2) {
            addCriterion("bpm_status not between", value1, value2, "bpmStatus");
            return (Criteria) this;
        }

        public Criteria andECreateIdIsNull() {
            addCriterion("e_create_id is null");
            return (Criteria) this;
        }

        public Criteria andECreateIdIsNotNull() {
            addCriterion("e_create_id is not null");
            return (Criteria) this;
        }

        public Criteria andECreateIdEqualTo(String value) {
            addCriterion("e_create_id =", value, "eCreateId");
            return (Criteria) this;
        }

        public Criteria andECreateIdNotEqualTo(String value) {
            addCriterion("e_create_id <>", value, "eCreateId");
            return (Criteria) this;
        }

        public Criteria andECreateIdGreaterThan(String value) {
            addCriterion("e_create_id >", value, "eCreateId");
            return (Criteria) this;
        }

        public Criteria andECreateIdGreaterThanOrEqualTo(String value) {
            addCriterion("e_create_id >=", value, "eCreateId");
            return (Criteria) this;
        }

        public Criteria andECreateIdLessThan(String value) {
            addCriterion("e_create_id <", value, "eCreateId");
            return (Criteria) this;
        }

        public Criteria andECreateIdLessThanOrEqualTo(String value) {
            addCriterion("e_create_id <=", value, "eCreateId");
            return (Criteria) this;
        }

        public Criteria andECreateIdLike(String value) {
            addCriterion("e_create_id like", value, "eCreateId");
            return (Criteria) this;
        }

        public Criteria andECreateIdNotLike(String value) {
            addCriterion("e_create_id not like", value, "eCreateId");
            return (Criteria) this;
        }

        public Criteria andECreateIdIn(List<String> values) {
            addCriterion("e_create_id in", values, "eCreateId");
            return (Criteria) this;
        }

        public Criteria andECreateIdNotIn(List<String> values) {
            addCriterion("e_create_id not in", values, "eCreateId");
            return (Criteria) this;
        }

        public Criteria andECreateIdBetween(String value1, String value2) {
            addCriterion("e_create_id between", value1, value2, "eCreateId");
            return (Criteria) this;
        }

        public Criteria andECreateIdNotBetween(String value1, String value2) {
            addCriterion("e_create_id not between", value1, value2, "eCreateId");
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

        public Criteria andEStatusIsNull() {
            addCriterion("e_status is null");
            return (Criteria) this;
        }

        public Criteria andEStatusIsNotNull() {
            addCriterion("e_status is not null");
            return (Criteria) this;
        }

        public Criteria andEStatusEqualTo(String value) {
            addCriterion("e_status =", value, "eStatus");
            return (Criteria) this;
        }

        public Criteria andEStatusNotEqualTo(String value) {
            addCriterion("e_status <>", value, "eStatus");
            return (Criteria) this;
        }

        public Criteria andEStatusGreaterThan(String value) {
            addCriterion("e_status >", value, "eStatus");
            return (Criteria) this;
        }

        public Criteria andEStatusGreaterThanOrEqualTo(String value) {
            addCriterion("e_status >=", value, "eStatus");
            return (Criteria) this;
        }

        public Criteria andEStatusLessThan(String value) {
            addCriterion("e_status <", value, "eStatus");
            return (Criteria) this;
        }

        public Criteria andEStatusLessThanOrEqualTo(String value) {
            addCriterion("e_status <=", value, "eStatus");
            return (Criteria) this;
        }

        public Criteria andEStatusLike(String value) {
            addCriterion("e_status like", value, "eStatus");
            return (Criteria) this;
        }

        public Criteria andEStatusNotLike(String value) {
            addCriterion("e_status not like", value, "eStatus");
            return (Criteria) this;
        }

        public Criteria andEStatusIn(List<String> values) {
            addCriterion("e_status in", values, "eStatus");
            return (Criteria) this;
        }

        public Criteria andEStatusNotIn(List<String> values) {
            addCriterion("e_status not in", values, "eStatus");
            return (Criteria) this;
        }

        public Criteria andEStatusBetween(String value1, String value2) {
            addCriterion("e_status between", value1, value2, "eStatus");
            return (Criteria) this;
        }

        public Criteria andEStatusNotBetween(String value1, String value2) {
            addCriterion("e_status not between", value1, value2, "eStatus");
            return (Criteria) this;
        }

        public Criteria andSysOrgCodeIsNull() {
            addCriterion("sys_org_code is null");
            return (Criteria) this;
        }

        public Criteria andSysOrgCodeIsNotNull() {
            addCriterion("sys_org_code is not null");
            return (Criteria) this;
        }

        public Criteria andSysOrgCodeEqualTo(String value) {
            addCriterion("sys_org_code =", value, "sysOrgCode");
            return (Criteria) this;
        }

        public Criteria andSysOrgCodeNotEqualTo(String value) {
            addCriterion("sys_org_code <>", value, "sysOrgCode");
            return (Criteria) this;
        }

        public Criteria andSysOrgCodeGreaterThan(String value) {
            addCriterion("sys_org_code >", value, "sysOrgCode");
            return (Criteria) this;
        }

        public Criteria andSysOrgCodeGreaterThanOrEqualTo(String value) {
            addCriterion("sys_org_code >=", value, "sysOrgCode");
            return (Criteria) this;
        }

        public Criteria andSysOrgCodeLessThan(String value) {
            addCriterion("sys_org_code <", value, "sysOrgCode");
            return (Criteria) this;
        }

        public Criteria andSysOrgCodeLessThanOrEqualTo(String value) {
            addCriterion("sys_org_code <=", value, "sysOrgCode");
            return (Criteria) this;
        }

        public Criteria andSysOrgCodeLike(String value) {
            addCriterion("sys_org_code like", value, "sysOrgCode");
            return (Criteria) this;
        }

        public Criteria andSysOrgCodeNotLike(String value) {
            addCriterion("sys_org_code not like", value, "sysOrgCode");
            return (Criteria) this;
        }

        public Criteria andSysOrgCodeIn(List<String> values) {
            addCriterion("sys_org_code in", values, "sysOrgCode");
            return (Criteria) this;
        }

        public Criteria andSysOrgCodeNotIn(List<String> values) {
            addCriterion("sys_org_code not in", values, "sysOrgCode");
            return (Criteria) this;
        }

        public Criteria andSysOrgCodeBetween(String value1, String value2) {
            addCriterion("sys_org_code between", value1, value2, "sysOrgCode");
            return (Criteria) this;
        }

        public Criteria andSysOrgCodeNotBetween(String value1, String value2) {
            addCriterion("sys_org_code not between", value1, value2, "sysOrgCode");
            return (Criteria) this;
        }

        public Criteria andSysCompanyCodeIsNull() {
            addCriterion("sys_company_code is null");
            return (Criteria) this;
        }

        public Criteria andSysCompanyCodeIsNotNull() {
            addCriterion("sys_company_code is not null");
            return (Criteria) this;
        }

        public Criteria andSysCompanyCodeEqualTo(String value) {
            addCriterion("sys_company_code =", value, "sysCompanyCode");
            return (Criteria) this;
        }

        public Criteria andSysCompanyCodeNotEqualTo(String value) {
            addCriterion("sys_company_code <>", value, "sysCompanyCode");
            return (Criteria) this;
        }

        public Criteria andSysCompanyCodeGreaterThan(String value) {
            addCriterion("sys_company_code >", value, "sysCompanyCode");
            return (Criteria) this;
        }

        public Criteria andSysCompanyCodeGreaterThanOrEqualTo(String value) {
            addCriterion("sys_company_code >=", value, "sysCompanyCode");
            return (Criteria) this;
        }

        public Criteria andSysCompanyCodeLessThan(String value) {
            addCriterion("sys_company_code <", value, "sysCompanyCode");
            return (Criteria) this;
        }

        public Criteria andSysCompanyCodeLessThanOrEqualTo(String value) {
            addCriterion("sys_company_code <=", value, "sysCompanyCode");
            return (Criteria) this;
        }

        public Criteria andSysCompanyCodeLike(String value) {
            addCriterion("sys_company_code like", value, "sysCompanyCode");
            return (Criteria) this;
        }

        public Criteria andSysCompanyCodeNotLike(String value) {
            addCriterion("sys_company_code not like", value, "sysCompanyCode");
            return (Criteria) this;
        }

        public Criteria andSysCompanyCodeIn(List<String> values) {
            addCriterion("sys_company_code in", values, "sysCompanyCode");
            return (Criteria) this;
        }

        public Criteria andSysCompanyCodeNotIn(List<String> values) {
            addCriterion("sys_company_code not in", values, "sysCompanyCode");
            return (Criteria) this;
        }

        public Criteria andSysCompanyCodeBetween(String value1, String value2) {
            addCriterion("sys_company_code between", value1, value2, "sysCompanyCode");
            return (Criteria) this;
        }

        public Criteria andSysCompanyCodeNotBetween(String value1, String value2) {
            addCriterion("sys_company_code not between", value1, value2, "sysCompanyCode");
            return (Criteria) this;
        }

        public Criteria andEDateIsNull() {
            addCriterion("e_date is null");
            return (Criteria) this;
        }

        public Criteria andEDateIsNotNull() {
            addCriterion("e_date is not null");
            return (Criteria) this;
        }

        public Criteria andEDateEqualTo(Date value) {
            addCriterion("e_date =", value, "eDate");
            return (Criteria) this;
        }

        public Criteria andEDateNotEqualTo(Date value) {
            addCriterion("e_date <>", value, "eDate");
            return (Criteria) this;
        }

        public Criteria andEDateGreaterThan(Date value) {
            addCriterion("e_date >", value, "eDate");
            return (Criteria) this;
        }

        public Criteria andEDateGreaterThanOrEqualTo(Date value) {
            addCriterion("e_date >=", value, "eDate");
            return (Criteria) this;
        }

        public Criteria andEDateLessThan(Date value) {
            addCriterion("e_date <", value, "eDate");
            return (Criteria) this;
        }

        public Criteria andEDateLessThanOrEqualTo(Date value) {
            addCriterion("e_date <=", value, "eDate");
            return (Criteria) this;
        }

        public Criteria andEDateIn(List<Date> values) {
            addCriterion("e_date in", values, "eDate");
            return (Criteria) this;
        }

        public Criteria andEDateNotIn(List<Date> values) {
            addCriterion("e_date not in", values, "eDate");
            return (Criteria) this;
        }

        public Criteria andEDateBetween(Date value1, Date value2) {
            addCriterion("e_date between", value1, value2, "eDate");
            return (Criteria) this;
        }

        public Criteria andEDateNotBetween(Date value1, Date value2) {
            addCriterion("e_date not between", value1, value2, "eDate");
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

        public Criteria andECountEqualTo(String value) {
            addCriterion("e_count =", value, "eCount");
            return (Criteria) this;
        }

        public Criteria andECountNotEqualTo(String value) {
            addCriterion("e_count <>", value, "eCount");
            return (Criteria) this;
        }

        public Criteria andECountGreaterThan(String value) {
            addCriterion("e_count >", value, "eCount");
            return (Criteria) this;
        }

        public Criteria andECountGreaterThanOrEqualTo(String value) {
            addCriterion("e_count >=", value, "eCount");
            return (Criteria) this;
        }

        public Criteria andECountLessThan(String value) {
            addCriterion("e_count <", value, "eCount");
            return (Criteria) this;
        }

        public Criteria andECountLessThanOrEqualTo(String value) {
            addCriterion("e_count <=", value, "eCount");
            return (Criteria) this;
        }

        public Criteria andECountLike(String value) {
            addCriterion("e_count like", value, "eCount");
            return (Criteria) this;
        }

        public Criteria andECountNotLike(String value) {
            addCriterion("e_count not like", value, "eCount");
            return (Criteria) this;
        }

        public Criteria andECountIn(List<String> values) {
            addCriterion("e_count in", values, "eCount");
            return (Criteria) this;
        }

        public Criteria andECountNotIn(List<String> values) {
            addCriterion("e_count not in", values, "eCount");
            return (Criteria) this;
        }

        public Criteria andECountBetween(String value1, String value2) {
            addCriterion("e_count between", value1, value2, "eCount");
            return (Criteria) this;
        }

        public Criteria andECountNotBetween(String value1, String value2) {
            addCriterion("e_count not between", value1, value2, "eCount");
            return (Criteria) this;
        }

        public Criteria andEInfoIsNull() {
            addCriterion("e_info is null");
            return (Criteria) this;
        }

        public Criteria andEInfoIsNotNull() {
            addCriterion("e_info is not null");
            return (Criteria) this;
        }

        public Criteria andEInfoEqualTo(String value) {
            addCriterion("e_info =", value, "eInfo");
            return (Criteria) this;
        }

        public Criteria andEInfoNotEqualTo(String value) {
            addCriterion("e_info <>", value, "eInfo");
            return (Criteria) this;
        }

        public Criteria andEInfoGreaterThan(String value) {
            addCriterion("e_info >", value, "eInfo");
            return (Criteria) this;
        }

        public Criteria andEInfoGreaterThanOrEqualTo(String value) {
            addCriterion("e_info >=", value, "eInfo");
            return (Criteria) this;
        }

        public Criteria andEInfoLessThan(String value) {
            addCriterion("e_info <", value, "eInfo");
            return (Criteria) this;
        }

        public Criteria andEInfoLessThanOrEqualTo(String value) {
            addCriterion("e_info <=", value, "eInfo");
            return (Criteria) this;
        }

        public Criteria andEInfoLike(String value) {
            addCriterion("e_info like", value, "eInfo");
            return (Criteria) this;
        }

        public Criteria andEInfoNotLike(String value) {
            addCriterion("e_info not like", value, "eInfo");
            return (Criteria) this;
        }

        public Criteria andEInfoIn(List<String> values) {
            addCriterion("e_info in", values, "eInfo");
            return (Criteria) this;
        }

        public Criteria andEInfoNotIn(List<String> values) {
            addCriterion("e_info not in", values, "eInfo");
            return (Criteria) this;
        }

        public Criteria andEInfoBetween(String value1, String value2) {
            addCriterion("e_info between", value1, value2, "eInfo");
            return (Criteria) this;
        }

        public Criteria andEInfoNotBetween(String value1, String value2) {
            addCriterion("e_info not between", value1, value2, "eInfo");
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
     * @date 2018-11-19
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