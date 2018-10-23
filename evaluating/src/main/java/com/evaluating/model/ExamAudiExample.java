package com.evaluating.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ExamAudiExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ExamAudiExample() {
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
     * @date 2018-10-23
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

        public Criteria andExamIdIsNull() {
            addCriterion("exam_id is null");
            return (Criteria) this;
        }

        public Criteria andExamIdIsNotNull() {
            addCriterion("exam_id is not null");
            return (Criteria) this;
        }

        public Criteria andExamIdEqualTo(Integer value) {
            addCriterion("exam_id =", value, "examId");
            return (Criteria) this;
        }

        public Criteria andExamIdNotEqualTo(Integer value) {
            addCriterion("exam_id <>", value, "examId");
            return (Criteria) this;
        }

        public Criteria andExamIdGreaterThan(Integer value) {
            addCriterion("exam_id >", value, "examId");
            return (Criteria) this;
        }

        public Criteria andExamIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("exam_id >=", value, "examId");
            return (Criteria) this;
        }

        public Criteria andExamIdLessThan(Integer value) {
            addCriterion("exam_id <", value, "examId");
            return (Criteria) this;
        }

        public Criteria andExamIdLessThanOrEqualTo(Integer value) {
            addCriterion("exam_id <=", value, "examId");
            return (Criteria) this;
        }

        public Criteria andExamIdIn(List<Integer> values) {
            addCriterion("exam_id in", values, "examId");
            return (Criteria) this;
        }

        public Criteria andExamIdNotIn(List<Integer> values) {
            addCriterion("exam_id not in", values, "examId");
            return (Criteria) this;
        }

        public Criteria andExamIdBetween(Integer value1, Integer value2) {
            addCriterion("exam_id between", value1, value2, "examId");
            return (Criteria) this;
        }

        public Criteria andExamIdNotBetween(Integer value1, Integer value2) {
            addCriterion("exam_id not between", value1, value2, "examId");
            return (Criteria) this;
        }

        public Criteria andExamNameIsNull() {
            addCriterion("exam_name is null");
            return (Criteria) this;
        }

        public Criteria andExamNameIsNotNull() {
            addCriterion("exam_name is not null");
            return (Criteria) this;
        }

        public Criteria andExamNameEqualTo(String value) {
            addCriterion("exam_name =", value, "examName");
            return (Criteria) this;
        }

        public Criteria andExamNameNotEqualTo(String value) {
            addCriterion("exam_name <>", value, "examName");
            return (Criteria) this;
        }

        public Criteria andExamNameGreaterThan(String value) {
            addCriterion("exam_name >", value, "examName");
            return (Criteria) this;
        }

        public Criteria andExamNameGreaterThanOrEqualTo(String value) {
            addCriterion("exam_name >=", value, "examName");
            return (Criteria) this;
        }

        public Criteria andExamNameLessThan(String value) {
            addCriterion("exam_name <", value, "examName");
            return (Criteria) this;
        }

        public Criteria andExamNameLessThanOrEqualTo(String value) {
            addCriterion("exam_name <=", value, "examName");
            return (Criteria) this;
        }

        public Criteria andExamNameLike(String value) {
            addCriterion("exam_name like", value, "examName");
            return (Criteria) this;
        }

        public Criteria andExamNameNotLike(String value) {
            addCriterion("exam_name not like", value, "examName");
            return (Criteria) this;
        }

        public Criteria andExamNameIn(List<String> values) {
            addCriterion("exam_name in", values, "examName");
            return (Criteria) this;
        }

        public Criteria andExamNameNotIn(List<String> values) {
            addCriterion("exam_name not in", values, "examName");
            return (Criteria) this;
        }

        public Criteria andExamNameBetween(String value1, String value2) {
            addCriterion("exam_name between", value1, value2, "examName");
            return (Criteria) this;
        }

        public Criteria andExamNameNotBetween(String value1, String value2) {
            addCriterion("exam_name not between", value1, value2, "examName");
            return (Criteria) this;
        }

        public Criteria andEaOrgIdIsNull() {
            addCriterion("ea_org_id is null");
            return (Criteria) this;
        }

        public Criteria andEaOrgIdIsNotNull() {
            addCriterion("ea_org_id is not null");
            return (Criteria) this;
        }

        public Criteria andEaOrgIdEqualTo(Integer value) {
            addCriterion("ea_org_id =", value, "eaOrgId");
            return (Criteria) this;
        }

        public Criteria andEaOrgIdNotEqualTo(Integer value) {
            addCriterion("ea_org_id <>", value, "eaOrgId");
            return (Criteria) this;
        }

        public Criteria andEaOrgIdGreaterThan(Integer value) {
            addCriterion("ea_org_id >", value, "eaOrgId");
            return (Criteria) this;
        }

        public Criteria andEaOrgIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ea_org_id >=", value, "eaOrgId");
            return (Criteria) this;
        }

        public Criteria andEaOrgIdLessThan(Integer value) {
            addCriterion("ea_org_id <", value, "eaOrgId");
            return (Criteria) this;
        }

        public Criteria andEaOrgIdLessThanOrEqualTo(Integer value) {
            addCriterion("ea_org_id <=", value, "eaOrgId");
            return (Criteria) this;
        }

        public Criteria andEaOrgIdIn(List<Integer> values) {
            addCriterion("ea_org_id in", values, "eaOrgId");
            return (Criteria) this;
        }

        public Criteria andEaOrgIdNotIn(List<Integer> values) {
            addCriterion("ea_org_id not in", values, "eaOrgId");
            return (Criteria) this;
        }

        public Criteria andEaOrgIdBetween(Integer value1, Integer value2) {
            addCriterion("ea_org_id between", value1, value2, "eaOrgId");
            return (Criteria) this;
        }

        public Criteria andEaOrgIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ea_org_id not between", value1, value2, "eaOrgId");
            return (Criteria) this;
        }

        public Criteria andEaOrgNameIsNull() {
            addCriterion("ea_org_name is null");
            return (Criteria) this;
        }

        public Criteria andEaOrgNameIsNotNull() {
            addCriterion("ea_org_name is not null");
            return (Criteria) this;
        }

        public Criteria andEaOrgNameEqualTo(String value) {
            addCriterion("ea_org_name =", value, "eaOrgName");
            return (Criteria) this;
        }

        public Criteria andEaOrgNameNotEqualTo(String value) {
            addCriterion("ea_org_name <>", value, "eaOrgName");
            return (Criteria) this;
        }

        public Criteria andEaOrgNameGreaterThan(String value) {
            addCriterion("ea_org_name >", value, "eaOrgName");
            return (Criteria) this;
        }

        public Criteria andEaOrgNameGreaterThanOrEqualTo(String value) {
            addCriterion("ea_org_name >=", value, "eaOrgName");
            return (Criteria) this;
        }

        public Criteria andEaOrgNameLessThan(String value) {
            addCriterion("ea_org_name <", value, "eaOrgName");
            return (Criteria) this;
        }

        public Criteria andEaOrgNameLessThanOrEqualTo(String value) {
            addCriterion("ea_org_name <=", value, "eaOrgName");
            return (Criteria) this;
        }

        public Criteria andEaOrgNameLike(String value) {
            addCriterion("ea_org_name like", value, "eaOrgName");
            return (Criteria) this;
        }

        public Criteria andEaOrgNameNotLike(String value) {
            addCriterion("ea_org_name not like", value, "eaOrgName");
            return (Criteria) this;
        }

        public Criteria andEaOrgNameIn(List<String> values) {
            addCriterion("ea_org_name in", values, "eaOrgName");
            return (Criteria) this;
        }

        public Criteria andEaOrgNameNotIn(List<String> values) {
            addCriterion("ea_org_name not in", values, "eaOrgName");
            return (Criteria) this;
        }

        public Criteria andEaOrgNameBetween(String value1, String value2) {
            addCriterion("ea_org_name between", value1, value2, "eaOrgName");
            return (Criteria) this;
        }

        public Criteria andEaOrgNameNotBetween(String value1, String value2) {
            addCriterion("ea_org_name not between", value1, value2, "eaOrgName");
            return (Criteria) this;
        }

        public Criteria andEaWorkIdIsNull() {
            addCriterion("ea_work_id is null");
            return (Criteria) this;
        }

        public Criteria andEaWorkIdIsNotNull() {
            addCriterion("ea_work_id is not null");
            return (Criteria) this;
        }

        public Criteria andEaWorkIdEqualTo(Integer value) {
            addCriterion("ea_work_id =", value, "eaWorkId");
            return (Criteria) this;
        }

        public Criteria andEaWorkIdNotEqualTo(Integer value) {
            addCriterion("ea_work_id <>", value, "eaWorkId");
            return (Criteria) this;
        }

        public Criteria andEaWorkIdGreaterThan(Integer value) {
            addCriterion("ea_work_id >", value, "eaWorkId");
            return (Criteria) this;
        }

        public Criteria andEaWorkIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ea_work_id >=", value, "eaWorkId");
            return (Criteria) this;
        }

        public Criteria andEaWorkIdLessThan(Integer value) {
            addCriterion("ea_work_id <", value, "eaWorkId");
            return (Criteria) this;
        }

        public Criteria andEaWorkIdLessThanOrEqualTo(Integer value) {
            addCriterion("ea_work_id <=", value, "eaWorkId");
            return (Criteria) this;
        }

        public Criteria andEaWorkIdIn(List<Integer> values) {
            addCriterion("ea_work_id in", values, "eaWorkId");
            return (Criteria) this;
        }

        public Criteria andEaWorkIdNotIn(List<Integer> values) {
            addCriterion("ea_work_id not in", values, "eaWorkId");
            return (Criteria) this;
        }

        public Criteria andEaWorkIdBetween(Integer value1, Integer value2) {
            addCriterion("ea_work_id between", value1, value2, "eaWorkId");
            return (Criteria) this;
        }

        public Criteria andEaWorkIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ea_work_id not between", value1, value2, "eaWorkId");
            return (Criteria) this;
        }

        public Criteria andEaWorkNameIsNull() {
            addCriterion("ea_work_name is null");
            return (Criteria) this;
        }

        public Criteria andEaWorkNameIsNotNull() {
            addCriterion("ea_work_name is not null");
            return (Criteria) this;
        }

        public Criteria andEaWorkNameEqualTo(String value) {
            addCriterion("ea_work_name =", value, "eaWorkName");
            return (Criteria) this;
        }

        public Criteria andEaWorkNameNotEqualTo(String value) {
            addCriterion("ea_work_name <>", value, "eaWorkName");
            return (Criteria) this;
        }

        public Criteria andEaWorkNameGreaterThan(String value) {
            addCriterion("ea_work_name >", value, "eaWorkName");
            return (Criteria) this;
        }

        public Criteria andEaWorkNameGreaterThanOrEqualTo(String value) {
            addCriterion("ea_work_name >=", value, "eaWorkName");
            return (Criteria) this;
        }

        public Criteria andEaWorkNameLessThan(String value) {
            addCriterion("ea_work_name <", value, "eaWorkName");
            return (Criteria) this;
        }

        public Criteria andEaWorkNameLessThanOrEqualTo(String value) {
            addCriterion("ea_work_name <=", value, "eaWorkName");
            return (Criteria) this;
        }

        public Criteria andEaWorkNameLike(String value) {
            addCriterion("ea_work_name like", value, "eaWorkName");
            return (Criteria) this;
        }

        public Criteria andEaWorkNameNotLike(String value) {
            addCriterion("ea_work_name not like", value, "eaWorkName");
            return (Criteria) this;
        }

        public Criteria andEaWorkNameIn(List<String> values) {
            addCriterion("ea_work_name in", values, "eaWorkName");
            return (Criteria) this;
        }

        public Criteria andEaWorkNameNotIn(List<String> values) {
            addCriterion("ea_work_name not in", values, "eaWorkName");
            return (Criteria) this;
        }

        public Criteria andEaWorkNameBetween(String value1, String value2) {
            addCriterion("ea_work_name between", value1, value2, "eaWorkName");
            return (Criteria) this;
        }

        public Criteria andEaWorkNameNotBetween(String value1, String value2) {
            addCriterion("ea_work_name not between", value1, value2, "eaWorkName");
            return (Criteria) this;
        }

        public Criteria andEaAtudentIdIsNull() {
            addCriterion("ea_atudent_id is null");
            return (Criteria) this;
        }

        public Criteria andEaAtudentIdIsNotNull() {
            addCriterion("ea_atudent_id is not null");
            return (Criteria) this;
        }

        public Criteria andEaAtudentIdEqualTo(Integer value) {
            addCriterion("ea_atudent_id =", value, "eaAtudentId");
            return (Criteria) this;
        }

        public Criteria andEaAtudentIdNotEqualTo(Integer value) {
            addCriterion("ea_atudent_id <>", value, "eaAtudentId");
            return (Criteria) this;
        }

        public Criteria andEaAtudentIdGreaterThan(Integer value) {
            addCriterion("ea_atudent_id >", value, "eaAtudentId");
            return (Criteria) this;
        }

        public Criteria andEaAtudentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ea_atudent_id >=", value, "eaAtudentId");
            return (Criteria) this;
        }

        public Criteria andEaAtudentIdLessThan(Integer value) {
            addCriterion("ea_atudent_id <", value, "eaAtudentId");
            return (Criteria) this;
        }

        public Criteria andEaAtudentIdLessThanOrEqualTo(Integer value) {
            addCriterion("ea_atudent_id <=", value, "eaAtudentId");
            return (Criteria) this;
        }

        public Criteria andEaAtudentIdIn(List<Integer> values) {
            addCriterion("ea_atudent_id in", values, "eaAtudentId");
            return (Criteria) this;
        }

        public Criteria andEaAtudentIdNotIn(List<Integer> values) {
            addCriterion("ea_atudent_id not in", values, "eaAtudentId");
            return (Criteria) this;
        }

        public Criteria andEaAtudentIdBetween(Integer value1, Integer value2) {
            addCriterion("ea_atudent_id between", value1, value2, "eaAtudentId");
            return (Criteria) this;
        }

        public Criteria andEaAtudentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ea_atudent_id not between", value1, value2, "eaAtudentId");
            return (Criteria) this;
        }

        public Criteria andExamCardCodeIsNull() {
            addCriterion("exam_card_code is null");
            return (Criteria) this;
        }

        public Criteria andExamCardCodeIsNotNull() {
            addCriterion("exam_card_code is not null");
            return (Criteria) this;
        }

        public Criteria andExamCardCodeEqualTo(String value) {
            addCriterion("exam_card_code =", value, "examCardCode");
            return (Criteria) this;
        }

        public Criteria andExamCardCodeNotEqualTo(String value) {
            addCriterion("exam_card_code <>", value, "examCardCode");
            return (Criteria) this;
        }

        public Criteria andExamCardCodeGreaterThan(String value) {
            addCriterion("exam_card_code >", value, "examCardCode");
            return (Criteria) this;
        }

        public Criteria andExamCardCodeGreaterThanOrEqualTo(String value) {
            addCriterion("exam_card_code >=", value, "examCardCode");
            return (Criteria) this;
        }

        public Criteria andExamCardCodeLessThan(String value) {
            addCriterion("exam_card_code <", value, "examCardCode");
            return (Criteria) this;
        }

        public Criteria andExamCardCodeLessThanOrEqualTo(String value) {
            addCriterion("exam_card_code <=", value, "examCardCode");
            return (Criteria) this;
        }

        public Criteria andExamCardCodeLike(String value) {
            addCriterion("exam_card_code like", value, "examCardCode");
            return (Criteria) this;
        }

        public Criteria andExamCardCodeNotLike(String value) {
            addCriterion("exam_card_code not like", value, "examCardCode");
            return (Criteria) this;
        }

        public Criteria andExamCardCodeIn(List<String> values) {
            addCriterion("exam_card_code in", values, "examCardCode");
            return (Criteria) this;
        }

        public Criteria andExamCardCodeNotIn(List<String> values) {
            addCriterion("exam_card_code not in", values, "examCardCode");
            return (Criteria) this;
        }

        public Criteria andExamCardCodeBetween(String value1, String value2) {
            addCriterion("exam_card_code between", value1, value2, "examCardCode");
            return (Criteria) this;
        }

        public Criteria andExamCardCodeNotBetween(String value1, String value2) {
            addCriterion("exam_card_code not between", value1, value2, "examCardCode");
            return (Criteria) this;
        }

        public Criteria andEaEnterDateIsNull() {
            addCriterion("ea_enter_date is null");
            return (Criteria) this;
        }

        public Criteria andEaEnterDateIsNotNull() {
            addCriterion("ea_enter_date is not null");
            return (Criteria) this;
        }

        public Criteria andEaEnterDateEqualTo(Date value) {
            addCriterion("ea_enter_date =", value, "eaEnterDate");
            return (Criteria) this;
        }

        public Criteria andEaEnterDateNotEqualTo(Date value) {
            addCriterion("ea_enter_date <>", value, "eaEnterDate");
            return (Criteria) this;
        }

        public Criteria andEaEnterDateGreaterThan(Date value) {
            addCriterion("ea_enter_date >", value, "eaEnterDate");
            return (Criteria) this;
        }

        public Criteria andEaEnterDateGreaterThanOrEqualTo(Date value) {
            addCriterion("ea_enter_date >=", value, "eaEnterDate");
            return (Criteria) this;
        }

        public Criteria andEaEnterDateLessThan(Date value) {
            addCriterion("ea_enter_date <", value, "eaEnterDate");
            return (Criteria) this;
        }

        public Criteria andEaEnterDateLessThanOrEqualTo(Date value) {
            addCriterion("ea_enter_date <=", value, "eaEnterDate");
            return (Criteria) this;
        }

        public Criteria andEaEnterDateIn(List<Date> values) {
            addCriterion("ea_enter_date in", values, "eaEnterDate");
            return (Criteria) this;
        }

        public Criteria andEaEnterDateNotIn(List<Date> values) {
            addCriterion("ea_enter_date not in", values, "eaEnterDate");
            return (Criteria) this;
        }

        public Criteria andEaEnterDateBetween(Date value1, Date value2) {
            addCriterion("ea_enter_date between", value1, value2, "eaEnterDate");
            return (Criteria) this;
        }

        public Criteria andEaEnterDateNotBetween(Date value1, Date value2) {
            addCriterion("ea_enter_date not between", value1, value2, "eaEnterDate");
            return (Criteria) this;
        }

        public Criteria andEaAuditorIdIsNull() {
            addCriterion("ea_auditor_id is null");
            return (Criteria) this;
        }

        public Criteria andEaAuditorIdIsNotNull() {
            addCriterion("ea_auditor_id is not null");
            return (Criteria) this;
        }

        public Criteria andEaAuditorIdEqualTo(Integer value) {
            addCriterion("ea_auditor_id =", value, "eaAuditorId");
            return (Criteria) this;
        }

        public Criteria andEaAuditorIdNotEqualTo(Integer value) {
            addCriterion("ea_auditor_id <>", value, "eaAuditorId");
            return (Criteria) this;
        }

        public Criteria andEaAuditorIdGreaterThan(Integer value) {
            addCriterion("ea_auditor_id >", value, "eaAuditorId");
            return (Criteria) this;
        }

        public Criteria andEaAuditorIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ea_auditor_id >=", value, "eaAuditorId");
            return (Criteria) this;
        }

        public Criteria andEaAuditorIdLessThan(Integer value) {
            addCriterion("ea_auditor_id <", value, "eaAuditorId");
            return (Criteria) this;
        }

        public Criteria andEaAuditorIdLessThanOrEqualTo(Integer value) {
            addCriterion("ea_auditor_id <=", value, "eaAuditorId");
            return (Criteria) this;
        }

        public Criteria andEaAuditorIdIn(List<Integer> values) {
            addCriterion("ea_auditor_id in", values, "eaAuditorId");
            return (Criteria) this;
        }

        public Criteria andEaAuditorIdNotIn(List<Integer> values) {
            addCriterion("ea_auditor_id not in", values, "eaAuditorId");
            return (Criteria) this;
        }

        public Criteria andEaAuditorIdBetween(Integer value1, Integer value2) {
            addCriterion("ea_auditor_id between", value1, value2, "eaAuditorId");
            return (Criteria) this;
        }

        public Criteria andEaAuditorIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ea_auditor_id not between", value1, value2, "eaAuditorId");
            return (Criteria) this;
        }

        public Criteria andEaAudiStatusIsNull() {
            addCriterion("ea_audi_status is null");
            return (Criteria) this;
        }

        public Criteria andEaAudiStatusIsNotNull() {
            addCriterion("ea_audi_status is not null");
            return (Criteria) this;
        }

        public Criteria andEaAudiStatusEqualTo(Integer value) {
            addCriterion("ea_audi_status =", value, "eaAudiStatus");
            return (Criteria) this;
        }

        public Criteria andEaAudiStatusNotEqualTo(Integer value) {
            addCriterion("ea_audi_status <>", value, "eaAudiStatus");
            return (Criteria) this;
        }

        public Criteria andEaAudiStatusGreaterThan(Integer value) {
            addCriterion("ea_audi_status >", value, "eaAudiStatus");
            return (Criteria) this;
        }

        public Criteria andEaAudiStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("ea_audi_status >=", value, "eaAudiStatus");
            return (Criteria) this;
        }

        public Criteria andEaAudiStatusLessThan(Integer value) {
            addCriterion("ea_audi_status <", value, "eaAudiStatus");
            return (Criteria) this;
        }

        public Criteria andEaAudiStatusLessThanOrEqualTo(Integer value) {
            addCriterion("ea_audi_status <=", value, "eaAudiStatus");
            return (Criteria) this;
        }

        public Criteria andEaAudiStatusIn(List<Integer> values) {
            addCriterion("ea_audi_status in", values, "eaAudiStatus");
            return (Criteria) this;
        }

        public Criteria andEaAudiStatusNotIn(List<Integer> values) {
            addCriterion("ea_audi_status not in", values, "eaAudiStatus");
            return (Criteria) this;
        }

        public Criteria andEaAudiStatusBetween(Integer value1, Integer value2) {
            addCriterion("ea_audi_status between", value1, value2, "eaAudiStatus");
            return (Criteria) this;
        }

        public Criteria andEaAudiStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("ea_audi_status not between", value1, value2, "eaAudiStatus");
            return (Criteria) this;
        }

        public Criteria andEaReasonIsNull() {
            addCriterion("ea_reason is null");
            return (Criteria) this;
        }

        public Criteria andEaReasonIsNotNull() {
            addCriterion("ea_reason is not null");
            return (Criteria) this;
        }

        public Criteria andEaReasonEqualTo(String value) {
            addCriterion("ea_reason =", value, "eaReason");
            return (Criteria) this;
        }

        public Criteria andEaReasonNotEqualTo(String value) {
            addCriterion("ea_reason <>", value, "eaReason");
            return (Criteria) this;
        }

        public Criteria andEaReasonGreaterThan(String value) {
            addCriterion("ea_reason >", value, "eaReason");
            return (Criteria) this;
        }

        public Criteria andEaReasonGreaterThanOrEqualTo(String value) {
            addCriterion("ea_reason >=", value, "eaReason");
            return (Criteria) this;
        }

        public Criteria andEaReasonLessThan(String value) {
            addCriterion("ea_reason <", value, "eaReason");
            return (Criteria) this;
        }

        public Criteria andEaReasonLessThanOrEqualTo(String value) {
            addCriterion("ea_reason <=", value, "eaReason");
            return (Criteria) this;
        }

        public Criteria andEaReasonLike(String value) {
            addCriterion("ea_reason like", value, "eaReason");
            return (Criteria) this;
        }

        public Criteria andEaReasonNotLike(String value) {
            addCriterion("ea_reason not like", value, "eaReason");
            return (Criteria) this;
        }

        public Criteria andEaReasonIn(List<String> values) {
            addCriterion("ea_reason in", values, "eaReason");
            return (Criteria) this;
        }

        public Criteria andEaReasonNotIn(List<String> values) {
            addCriterion("ea_reason not in", values, "eaReason");
            return (Criteria) this;
        }

        public Criteria andEaReasonBetween(String value1, String value2) {
            addCriterion("ea_reason between", value1, value2, "eaReason");
            return (Criteria) this;
        }

        public Criteria andEaReasonNotBetween(String value1, String value2) {
            addCriterion("ea_reason not between", value1, value2, "eaReason");
            return (Criteria) this;
        }

        public Criteria andEaStatusIsNull() {
            addCriterion("ea_status is null");
            return (Criteria) this;
        }

        public Criteria andEaStatusIsNotNull() {
            addCriterion("ea_status is not null");
            return (Criteria) this;
        }

        public Criteria andEaStatusEqualTo(Integer value) {
            addCriterion("ea_status =", value, "eaStatus");
            return (Criteria) this;
        }

        public Criteria andEaStatusNotEqualTo(Integer value) {
            addCriterion("ea_status <>", value, "eaStatus");
            return (Criteria) this;
        }

        public Criteria andEaStatusGreaterThan(Integer value) {
            addCriterion("ea_status >", value, "eaStatus");
            return (Criteria) this;
        }

        public Criteria andEaStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("ea_status >=", value, "eaStatus");
            return (Criteria) this;
        }

        public Criteria andEaStatusLessThan(Integer value) {
            addCriterion("ea_status <", value, "eaStatus");
            return (Criteria) this;
        }

        public Criteria andEaStatusLessThanOrEqualTo(Integer value) {
            addCriterion("ea_status <=", value, "eaStatus");
            return (Criteria) this;
        }

        public Criteria andEaStatusIn(List<Integer> values) {
            addCriterion("ea_status in", values, "eaStatus");
            return (Criteria) this;
        }

        public Criteria andEaStatusNotIn(List<Integer> values) {
            addCriterion("ea_status not in", values, "eaStatus");
            return (Criteria) this;
        }

        public Criteria andEaStatusBetween(Integer value1, Integer value2) {
            addCriterion("ea_status between", value1, value2, "eaStatus");
            return (Criteria) this;
        }

        public Criteria andEaStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("ea_status not between", value1, value2, "eaStatus");
            return (Criteria) this;
        }

        public Criteria andEaScoreIsNull() {
            addCriterion("ea_score is null");
            return (Criteria) this;
        }

        public Criteria andEaScoreIsNotNull() {
            addCriterion("ea_score is not null");
            return (Criteria) this;
        }

        public Criteria andEaScoreEqualTo(Integer value) {
            addCriterion("ea_score =", value, "eaScore");
            return (Criteria) this;
        }

        public Criteria andEaScoreNotEqualTo(Integer value) {
            addCriterion("ea_score <>", value, "eaScore");
            return (Criteria) this;
        }

        public Criteria andEaScoreGreaterThan(Integer value) {
            addCriterion("ea_score >", value, "eaScore");
            return (Criteria) this;
        }

        public Criteria andEaScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("ea_score >=", value, "eaScore");
            return (Criteria) this;
        }

        public Criteria andEaScoreLessThan(Integer value) {
            addCriterion("ea_score <", value, "eaScore");
            return (Criteria) this;
        }

        public Criteria andEaScoreLessThanOrEqualTo(Integer value) {
            addCriterion("ea_score <=", value, "eaScore");
            return (Criteria) this;
        }

        public Criteria andEaScoreIn(List<Integer> values) {
            addCriterion("ea_score in", values, "eaScore");
            return (Criteria) this;
        }

        public Criteria andEaScoreNotIn(List<Integer> values) {
            addCriterion("ea_score not in", values, "eaScore");
            return (Criteria) this;
        }

        public Criteria andEaScoreBetween(Integer value1, Integer value2) {
            addCriterion("ea_score between", value1, value2, "eaScore");
            return (Criteria) this;
        }

        public Criteria andEaScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("ea_score not between", value1, value2, "eaScore");
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
     * @date 2018-10-23
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