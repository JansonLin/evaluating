package com.evaluating.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class studentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public studentExample() {
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
     * @date 2018-10-18
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andSNameIsNull() {
            addCriterion("s_name is null");
            return (Criteria) this;
        }

        public Criteria andSNameIsNotNull() {
            addCriterion("s_name is not null");
            return (Criteria) this;
        }

        public Criteria andSNameEqualTo(String value) {
            addCriterion("s_name =", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameNotEqualTo(String value) {
            addCriterion("s_name <>", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameGreaterThan(String value) {
            addCriterion("s_name >", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameGreaterThanOrEqualTo(String value) {
            addCriterion("s_name >=", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameLessThan(String value) {
            addCriterion("s_name <", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameLessThanOrEqualTo(String value) {
            addCriterion("s_name <=", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameLike(String value) {
            addCriterion("s_name like", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameNotLike(String value) {
            addCriterion("s_name not like", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameIn(List<String> values) {
            addCriterion("s_name in", values, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameNotIn(List<String> values) {
            addCriterion("s_name not in", values, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameBetween(String value1, String value2) {
            addCriterion("s_name between", value1, value2, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameNotBetween(String value1, String value2) {
            addCriterion("s_name not between", value1, value2, "sName");
            return (Criteria) this;
        }

        public Criteria andSSexIsNull() {
            addCriterion("s_sex is null");
            return (Criteria) this;
        }

        public Criteria andSSexIsNotNull() {
            addCriterion("s_sex is not null");
            return (Criteria) this;
        }

        public Criteria andSSexEqualTo(Integer value) {
            addCriterion("s_sex =", value, "sSex");
            return (Criteria) this;
        }

        public Criteria andSSexNotEqualTo(Integer value) {
            addCriterion("s_sex <>", value, "sSex");
            return (Criteria) this;
        }

        public Criteria andSSexGreaterThan(Integer value) {
            addCriterion("s_sex >", value, "sSex");
            return (Criteria) this;
        }

        public Criteria andSSexGreaterThanOrEqualTo(Integer value) {
            addCriterion("s_sex >=", value, "sSex");
            return (Criteria) this;
        }

        public Criteria andSSexLessThan(Integer value) {
            addCriterion("s_sex <", value, "sSex");
            return (Criteria) this;
        }

        public Criteria andSSexLessThanOrEqualTo(Integer value) {
            addCriterion("s_sex <=", value, "sSex");
            return (Criteria) this;
        }

        public Criteria andSSexIn(List<Integer> values) {
            addCriterion("s_sex in", values, "sSex");
            return (Criteria) this;
        }

        public Criteria andSSexNotIn(List<Integer> values) {
            addCriterion("s_sex not in", values, "sSex");
            return (Criteria) this;
        }

        public Criteria andSSexBetween(Integer value1, Integer value2) {
            addCriterion("s_sex between", value1, value2, "sSex");
            return (Criteria) this;
        }

        public Criteria andSSexNotBetween(Integer value1, Integer value2) {
            addCriterion("s_sex not between", value1, value2, "sSex");
            return (Criteria) this;
        }

        public Criteria andSBirthdayIsNull() {
            addCriterion("s_birthday is null");
            return (Criteria) this;
        }

        public Criteria andSBirthdayIsNotNull() {
            addCriterion("s_birthday is not null");
            return (Criteria) this;
        }

        public Criteria andSBirthdayEqualTo(Date value) {
            addCriterionForJDBCDate("s_birthday =", value, "sBirthday");
            return (Criteria) this;
        }

        public Criteria andSBirthdayNotEqualTo(Date value) {
            addCriterionForJDBCDate("s_birthday <>", value, "sBirthday");
            return (Criteria) this;
        }

        public Criteria andSBirthdayGreaterThan(Date value) {
            addCriterionForJDBCDate("s_birthday >", value, "sBirthday");
            return (Criteria) this;
        }

        public Criteria andSBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("s_birthday >=", value, "sBirthday");
            return (Criteria) this;
        }

        public Criteria andSBirthdayLessThan(Date value) {
            addCriterionForJDBCDate("s_birthday <", value, "sBirthday");
            return (Criteria) this;
        }

        public Criteria andSBirthdayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("s_birthday <=", value, "sBirthday");
            return (Criteria) this;
        }

        public Criteria andSBirthdayIn(List<Date> values) {
            addCriterionForJDBCDate("s_birthday in", values, "sBirthday");
            return (Criteria) this;
        }

        public Criteria andSBirthdayNotIn(List<Date> values) {
            addCriterionForJDBCDate("s_birthday not in", values, "sBirthday");
            return (Criteria) this;
        }

        public Criteria andSBirthdayBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("s_birthday between", value1, value2, "sBirthday");
            return (Criteria) this;
        }

        public Criteria andSBirthdayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("s_birthday not between", value1, value2, "sBirthday");
            return (Criteria) this;
        }

        public Criteria andSEthnicIsNull() {
            addCriterion("s_ethnic is null");
            return (Criteria) this;
        }

        public Criteria andSEthnicIsNotNull() {
            addCriterion("s_ethnic is not null");
            return (Criteria) this;
        }

        public Criteria andSEthnicEqualTo(String value) {
            addCriterion("s_ethnic =", value, "sEthnic");
            return (Criteria) this;
        }

        public Criteria andSEthnicNotEqualTo(String value) {
            addCriterion("s_ethnic <>", value, "sEthnic");
            return (Criteria) this;
        }

        public Criteria andSEthnicGreaterThan(String value) {
            addCriterion("s_ethnic >", value, "sEthnic");
            return (Criteria) this;
        }

        public Criteria andSEthnicGreaterThanOrEqualTo(String value) {
            addCriterion("s_ethnic >=", value, "sEthnic");
            return (Criteria) this;
        }

        public Criteria andSEthnicLessThan(String value) {
            addCriterion("s_ethnic <", value, "sEthnic");
            return (Criteria) this;
        }

        public Criteria andSEthnicLessThanOrEqualTo(String value) {
            addCriterion("s_ethnic <=", value, "sEthnic");
            return (Criteria) this;
        }

        public Criteria andSEthnicLike(String value) {
            addCriterion("s_ethnic like", value, "sEthnic");
            return (Criteria) this;
        }

        public Criteria andSEthnicNotLike(String value) {
            addCriterion("s_ethnic not like", value, "sEthnic");
            return (Criteria) this;
        }

        public Criteria andSEthnicIn(List<String> values) {
            addCriterion("s_ethnic in", values, "sEthnic");
            return (Criteria) this;
        }

        public Criteria andSEthnicNotIn(List<String> values) {
            addCriterion("s_ethnic not in", values, "sEthnic");
            return (Criteria) this;
        }

        public Criteria andSEthnicBetween(String value1, String value2) {
            addCriterion("s_ethnic between", value1, value2, "sEthnic");
            return (Criteria) this;
        }

        public Criteria andSEthnicNotBetween(String value1, String value2) {
            addCriterion("s_ethnic not between", value1, value2, "sEthnic");
            return (Criteria) this;
        }

        public Criteria andSJiguanIsNull() {
            addCriterion("s_jiguan is null");
            return (Criteria) this;
        }

        public Criteria andSJiguanIsNotNull() {
            addCriterion("s_jiguan is not null");
            return (Criteria) this;
        }

        public Criteria andSJiguanEqualTo(String value) {
            addCriterion("s_jiguan =", value, "sJiguan");
            return (Criteria) this;
        }

        public Criteria andSJiguanNotEqualTo(String value) {
            addCriterion("s_jiguan <>", value, "sJiguan");
            return (Criteria) this;
        }

        public Criteria andSJiguanGreaterThan(String value) {
            addCriterion("s_jiguan >", value, "sJiguan");
            return (Criteria) this;
        }

        public Criteria andSJiguanGreaterThanOrEqualTo(String value) {
            addCriterion("s_jiguan >=", value, "sJiguan");
            return (Criteria) this;
        }

        public Criteria andSJiguanLessThan(String value) {
            addCriterion("s_jiguan <", value, "sJiguan");
            return (Criteria) this;
        }

        public Criteria andSJiguanLessThanOrEqualTo(String value) {
            addCriterion("s_jiguan <=", value, "sJiguan");
            return (Criteria) this;
        }

        public Criteria andSJiguanLike(String value) {
            addCriterion("s_jiguan like", value, "sJiguan");
            return (Criteria) this;
        }

        public Criteria andSJiguanNotLike(String value) {
            addCriterion("s_jiguan not like", value, "sJiguan");
            return (Criteria) this;
        }

        public Criteria andSJiguanIn(List<String> values) {
            addCriterion("s_jiguan in", values, "sJiguan");
            return (Criteria) this;
        }

        public Criteria andSJiguanNotIn(List<String> values) {
            addCriterion("s_jiguan not in", values, "sJiguan");
            return (Criteria) this;
        }

        public Criteria andSJiguanBetween(String value1, String value2) {
            addCriterion("s_jiguan between", value1, value2, "sJiguan");
            return (Criteria) this;
        }

        public Criteria andSJiguanNotBetween(String value1, String value2) {
            addCriterion("s_jiguan not between", value1, value2, "sJiguan");
            return (Criteria) this;
        }

        public Criteria andSHukouIsNull() {
            addCriterion("s_hukou is null");
            return (Criteria) this;
        }

        public Criteria andSHukouIsNotNull() {
            addCriterion("s_hukou is not null");
            return (Criteria) this;
        }

        public Criteria andSHukouEqualTo(String value) {
            addCriterion("s_hukou =", value, "sHukou");
            return (Criteria) this;
        }

        public Criteria andSHukouNotEqualTo(String value) {
            addCriterion("s_hukou <>", value, "sHukou");
            return (Criteria) this;
        }

        public Criteria andSHukouGreaterThan(String value) {
            addCriterion("s_hukou >", value, "sHukou");
            return (Criteria) this;
        }

        public Criteria andSHukouGreaterThanOrEqualTo(String value) {
            addCriterion("s_hukou >=", value, "sHukou");
            return (Criteria) this;
        }

        public Criteria andSHukouLessThan(String value) {
            addCriterion("s_hukou <", value, "sHukou");
            return (Criteria) this;
        }

        public Criteria andSHukouLessThanOrEqualTo(String value) {
            addCriterion("s_hukou <=", value, "sHukou");
            return (Criteria) this;
        }

        public Criteria andSHukouLike(String value) {
            addCriterion("s_hukou like", value, "sHukou");
            return (Criteria) this;
        }

        public Criteria andSHukouNotLike(String value) {
            addCriterion("s_hukou not like", value, "sHukou");
            return (Criteria) this;
        }

        public Criteria andSHukouIn(List<String> values) {
            addCriterion("s_hukou in", values, "sHukou");
            return (Criteria) this;
        }

        public Criteria andSHukouNotIn(List<String> values) {
            addCriterion("s_hukou not in", values, "sHukou");
            return (Criteria) this;
        }

        public Criteria andSHukouBetween(String value1, String value2) {
            addCriterion("s_hukou between", value1, value2, "sHukou");
            return (Criteria) this;
        }

        public Criteria andSHukouNotBetween(String value1, String value2) {
            addCriterion("s_hukou not between", value1, value2, "sHukou");
            return (Criteria) this;
        }

        public Criteria andSPoliticalIsNull() {
            addCriterion("s_political is null");
            return (Criteria) this;
        }

        public Criteria andSPoliticalIsNotNull() {
            addCriterion("s_political is not null");
            return (Criteria) this;
        }

        public Criteria andSPoliticalEqualTo(String value) {
            addCriterion("s_political =", value, "sPolitical");
            return (Criteria) this;
        }

        public Criteria andSPoliticalNotEqualTo(String value) {
            addCriterion("s_political <>", value, "sPolitical");
            return (Criteria) this;
        }

        public Criteria andSPoliticalGreaterThan(String value) {
            addCriterion("s_political >", value, "sPolitical");
            return (Criteria) this;
        }

        public Criteria andSPoliticalGreaterThanOrEqualTo(String value) {
            addCriterion("s_political >=", value, "sPolitical");
            return (Criteria) this;
        }

        public Criteria andSPoliticalLessThan(String value) {
            addCriterion("s_political <", value, "sPolitical");
            return (Criteria) this;
        }

        public Criteria andSPoliticalLessThanOrEqualTo(String value) {
            addCriterion("s_political <=", value, "sPolitical");
            return (Criteria) this;
        }

        public Criteria andSPoliticalLike(String value) {
            addCriterion("s_political like", value, "sPolitical");
            return (Criteria) this;
        }

        public Criteria andSPoliticalNotLike(String value) {
            addCriterion("s_political not like", value, "sPolitical");
            return (Criteria) this;
        }

        public Criteria andSPoliticalIn(List<String> values) {
            addCriterion("s_political in", values, "sPolitical");
            return (Criteria) this;
        }

        public Criteria andSPoliticalNotIn(List<String> values) {
            addCriterion("s_political not in", values, "sPolitical");
            return (Criteria) this;
        }

        public Criteria andSPoliticalBetween(String value1, String value2) {
            addCriterion("s_political between", value1, value2, "sPolitical");
            return (Criteria) this;
        }

        public Criteria andSPoliticalNotBetween(String value1, String value2) {
            addCriterion("s_political not between", value1, value2, "sPolitical");
            return (Criteria) this;
        }

        public Criteria andSEducationIsNull() {
            addCriterion("s_education is null");
            return (Criteria) this;
        }

        public Criteria andSEducationIsNotNull() {
            addCriterion("s_education is not null");
            return (Criteria) this;
        }

        public Criteria andSEducationEqualTo(String value) {
            addCriterion("s_education =", value, "sEducation");
            return (Criteria) this;
        }

        public Criteria andSEducationNotEqualTo(String value) {
            addCriterion("s_education <>", value, "sEducation");
            return (Criteria) this;
        }

        public Criteria andSEducationGreaterThan(String value) {
            addCriterion("s_education >", value, "sEducation");
            return (Criteria) this;
        }

        public Criteria andSEducationGreaterThanOrEqualTo(String value) {
            addCriterion("s_education >=", value, "sEducation");
            return (Criteria) this;
        }

        public Criteria andSEducationLessThan(String value) {
            addCriterion("s_education <", value, "sEducation");
            return (Criteria) this;
        }

        public Criteria andSEducationLessThanOrEqualTo(String value) {
            addCriterion("s_education <=", value, "sEducation");
            return (Criteria) this;
        }

        public Criteria andSEducationLike(String value) {
            addCriterion("s_education like", value, "sEducation");
            return (Criteria) this;
        }

        public Criteria andSEducationNotLike(String value) {
            addCriterion("s_education not like", value, "sEducation");
            return (Criteria) this;
        }

        public Criteria andSEducationIn(List<String> values) {
            addCriterion("s_education in", values, "sEducation");
            return (Criteria) this;
        }

        public Criteria andSEducationNotIn(List<String> values) {
            addCriterion("s_education not in", values, "sEducation");
            return (Criteria) this;
        }

        public Criteria andSEducationBetween(String value1, String value2) {
            addCriterion("s_education between", value1, value2, "sEducation");
            return (Criteria) this;
        }

        public Criteria andSEducationNotBetween(String value1, String value2) {
            addCriterion("s_education not between", value1, value2, "sEducation");
            return (Criteria) this;
        }

        public Criteria andSDegreeIsNull() {
            addCriterion("s_degree is null");
            return (Criteria) this;
        }

        public Criteria andSDegreeIsNotNull() {
            addCriterion("s_degree is not null");
            return (Criteria) this;
        }

        public Criteria andSDegreeEqualTo(String value) {
            addCriterion("s_degree =", value, "sDegree");
            return (Criteria) this;
        }

        public Criteria andSDegreeNotEqualTo(String value) {
            addCriterion("s_degree <>", value, "sDegree");
            return (Criteria) this;
        }

        public Criteria andSDegreeGreaterThan(String value) {
            addCriterion("s_degree >", value, "sDegree");
            return (Criteria) this;
        }

        public Criteria andSDegreeGreaterThanOrEqualTo(String value) {
            addCriterion("s_degree >=", value, "sDegree");
            return (Criteria) this;
        }

        public Criteria andSDegreeLessThan(String value) {
            addCriterion("s_degree <", value, "sDegree");
            return (Criteria) this;
        }

        public Criteria andSDegreeLessThanOrEqualTo(String value) {
            addCriterion("s_degree <=", value, "sDegree");
            return (Criteria) this;
        }

        public Criteria andSDegreeLike(String value) {
            addCriterion("s_degree like", value, "sDegree");
            return (Criteria) this;
        }

        public Criteria andSDegreeNotLike(String value) {
            addCriterion("s_degree not like", value, "sDegree");
            return (Criteria) this;
        }

        public Criteria andSDegreeIn(List<String> values) {
            addCriterion("s_degree in", values, "sDegree");
            return (Criteria) this;
        }

        public Criteria andSDegreeNotIn(List<String> values) {
            addCriterion("s_degree not in", values, "sDegree");
            return (Criteria) this;
        }

        public Criteria andSDegreeBetween(String value1, String value2) {
            addCriterion("s_degree between", value1, value2, "sDegree");
            return (Criteria) this;
        }

        public Criteria andSDegreeNotBetween(String value1, String value2) {
            addCriterion("s_degree not between", value1, value2, "sDegree");
            return (Criteria) this;
        }

        public Criteria andSSchoolIsNull() {
            addCriterion("s_school is null");
            return (Criteria) this;
        }

        public Criteria andSSchoolIsNotNull() {
            addCriterion("s_school is not null");
            return (Criteria) this;
        }

        public Criteria andSSchoolEqualTo(String value) {
            addCriterion("s_school =", value, "sSchool");
            return (Criteria) this;
        }

        public Criteria andSSchoolNotEqualTo(String value) {
            addCriterion("s_school <>", value, "sSchool");
            return (Criteria) this;
        }

        public Criteria andSSchoolGreaterThan(String value) {
            addCriterion("s_school >", value, "sSchool");
            return (Criteria) this;
        }

        public Criteria andSSchoolGreaterThanOrEqualTo(String value) {
            addCriterion("s_school >=", value, "sSchool");
            return (Criteria) this;
        }

        public Criteria andSSchoolLessThan(String value) {
            addCriterion("s_school <", value, "sSchool");
            return (Criteria) this;
        }

        public Criteria andSSchoolLessThanOrEqualTo(String value) {
            addCriterion("s_school <=", value, "sSchool");
            return (Criteria) this;
        }

        public Criteria andSSchoolLike(String value) {
            addCriterion("s_school like", value, "sSchool");
            return (Criteria) this;
        }

        public Criteria andSSchoolNotLike(String value) {
            addCriterion("s_school not like", value, "sSchool");
            return (Criteria) this;
        }

        public Criteria andSSchoolIn(List<String> values) {
            addCriterion("s_school in", values, "sSchool");
            return (Criteria) this;
        }

        public Criteria andSSchoolNotIn(List<String> values) {
            addCriterion("s_school not in", values, "sSchool");
            return (Criteria) this;
        }

        public Criteria andSSchoolBetween(String value1, String value2) {
            addCriterion("s_school between", value1, value2, "sSchool");
            return (Criteria) this;
        }

        public Criteria andSSchoolNotBetween(String value1, String value2) {
            addCriterion("s_school not between", value1, value2, "sSchool");
            return (Criteria) this;
        }

        public Criteria andSMajorIsNull() {
            addCriterion("s_major is null");
            return (Criteria) this;
        }

        public Criteria andSMajorIsNotNull() {
            addCriterion("s_major is not null");
            return (Criteria) this;
        }

        public Criteria andSMajorEqualTo(String value) {
            addCriterion("s_major =", value, "sMajor");
            return (Criteria) this;
        }

        public Criteria andSMajorNotEqualTo(String value) {
            addCriterion("s_major <>", value, "sMajor");
            return (Criteria) this;
        }

        public Criteria andSMajorGreaterThan(String value) {
            addCriterion("s_major >", value, "sMajor");
            return (Criteria) this;
        }

        public Criteria andSMajorGreaterThanOrEqualTo(String value) {
            addCriterion("s_major >=", value, "sMajor");
            return (Criteria) this;
        }

        public Criteria andSMajorLessThan(String value) {
            addCriterion("s_major <", value, "sMajor");
            return (Criteria) this;
        }

        public Criteria andSMajorLessThanOrEqualTo(String value) {
            addCriterion("s_major <=", value, "sMajor");
            return (Criteria) this;
        }

        public Criteria andSMajorLike(String value) {
            addCriterion("s_major like", value, "sMajor");
            return (Criteria) this;
        }

        public Criteria andSMajorNotLike(String value) {
            addCriterion("s_major not like", value, "sMajor");
            return (Criteria) this;
        }

        public Criteria andSMajorIn(List<String> values) {
            addCriterion("s_major in", values, "sMajor");
            return (Criteria) this;
        }

        public Criteria andSMajorNotIn(List<String> values) {
            addCriterion("s_major not in", values, "sMajor");
            return (Criteria) this;
        }

        public Criteria andSMajorBetween(String value1, String value2) {
            addCriterion("s_major between", value1, value2, "sMajor");
            return (Criteria) this;
        }

        public Criteria andSMajorNotBetween(String value1, String value2) {
            addCriterion("s_major not between", value1, value2, "sMajor");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
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
     * @date 2018-10-18
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