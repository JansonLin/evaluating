package com.evaluating.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
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

        public Criteria andUIdIsNull() {
            addCriterion("u_id is null");
            return (Criteria) this;
        }

        public Criteria andUIdIsNotNull() {
            addCriterion("u_id is not null");
            return (Criteria) this;
        }

        public Criteria andUIdEqualTo(Integer value) {
            addCriterion("u_id =", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotEqualTo(Integer value) {
            addCriterion("u_id <>", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdGreaterThan(Integer value) {
            addCriterion("u_id >", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("u_id >=", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdLessThan(Integer value) {
            addCriterion("u_id <", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdLessThanOrEqualTo(Integer value) {
            addCriterion("u_id <=", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdIn(List<Integer> values) {
            addCriterion("u_id in", values, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotIn(List<Integer> values) {
            addCriterion("u_id not in", values, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdBetween(Integer value1, Integer value2) {
            addCriterion("u_id between", value1, value2, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotBetween(Integer value1, Integer value2) {
            addCriterion("u_id not between", value1, value2, "uId");
            return (Criteria) this;
        }

        public Criteria andUNameIsNull() {
            addCriterion("u_name is null");
            return (Criteria) this;
        }

        public Criteria andUNameIsNotNull() {
            addCriterion("u_name is not null");
            return (Criteria) this;
        }

        public Criteria andUNameEqualTo(String value) {
            addCriterion("u_name =", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameNotEqualTo(String value) {
            addCriterion("u_name <>", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameGreaterThan(String value) {
            addCriterion("u_name >", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameGreaterThanOrEqualTo(String value) {
            addCriterion("u_name >=", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameLessThan(String value) {
            addCriterion("u_name <", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameLessThanOrEqualTo(String value) {
            addCriterion("u_name <=", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameLike(String value) {
            addCriterion("u_name like", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameNotLike(String value) {
            addCriterion("u_name not like", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameIn(List<String> values) {
            addCriterion("u_name in", values, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameNotIn(List<String> values) {
            addCriterion("u_name not in", values, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameBetween(String value1, String value2) {
            addCriterion("u_name between", value1, value2, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameNotBetween(String value1, String value2) {
            addCriterion("u_name not between", value1, value2, "uName");
            return (Criteria) this;
        }

        public Criteria andUPasswordIsNull() {
            addCriterion("u_password is null");
            return (Criteria) this;
        }

        public Criteria andUPasswordIsNotNull() {
            addCriterion("u_password is not null");
            return (Criteria) this;
        }

        public Criteria andUPasswordEqualTo(String value) {
            addCriterion("u_password =", value, "uPassword");
            return (Criteria) this;
        }

        public Criteria andUPasswordNotEqualTo(String value) {
            addCriterion("u_password <>", value, "uPassword");
            return (Criteria) this;
        }

        public Criteria andUPasswordGreaterThan(String value) {
            addCriterion("u_password >", value, "uPassword");
            return (Criteria) this;
        }

        public Criteria andUPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("u_password >=", value, "uPassword");
            return (Criteria) this;
        }

        public Criteria andUPasswordLessThan(String value) {
            addCriterion("u_password <", value, "uPassword");
            return (Criteria) this;
        }

        public Criteria andUPasswordLessThanOrEqualTo(String value) {
            addCriterion("u_password <=", value, "uPassword");
            return (Criteria) this;
        }

        public Criteria andUPasswordLike(String value) {
            addCriterion("u_password like", value, "uPassword");
            return (Criteria) this;
        }

        public Criteria andUPasswordNotLike(String value) {
            addCriterion("u_password not like", value, "uPassword");
            return (Criteria) this;
        }

        public Criteria andUPasswordIn(List<String> values) {
            addCriterion("u_password in", values, "uPassword");
            return (Criteria) this;
        }

        public Criteria andUPasswordNotIn(List<String> values) {
            addCriterion("u_password not in", values, "uPassword");
            return (Criteria) this;
        }

        public Criteria andUPasswordBetween(String value1, String value2) {
            addCriterion("u_password between", value1, value2, "uPassword");
            return (Criteria) this;
        }

        public Criteria andUPasswordNotBetween(String value1, String value2) {
            addCriterion("u_password not between", value1, value2, "uPassword");
            return (Criteria) this;
        }

        public Criteria andUEmailIsNull() {
            addCriterion("u_email is null");
            return (Criteria) this;
        }

        public Criteria andUEmailIsNotNull() {
            addCriterion("u_email is not null");
            return (Criteria) this;
        }

        public Criteria andUEmailEqualTo(String value) {
            addCriterion("u_email =", value, "uEmail");
            return (Criteria) this;
        }

        public Criteria andUEmailNotEqualTo(String value) {
            addCriterion("u_email <>", value, "uEmail");
            return (Criteria) this;
        }

        public Criteria andUEmailGreaterThan(String value) {
            addCriterion("u_email >", value, "uEmail");
            return (Criteria) this;
        }

        public Criteria andUEmailGreaterThanOrEqualTo(String value) {
            addCriterion("u_email >=", value, "uEmail");
            return (Criteria) this;
        }

        public Criteria andUEmailLessThan(String value) {
            addCriterion("u_email <", value, "uEmail");
            return (Criteria) this;
        }

        public Criteria andUEmailLessThanOrEqualTo(String value) {
            addCriterion("u_email <=", value, "uEmail");
            return (Criteria) this;
        }

        public Criteria andUEmailLike(String value) {
            addCriterion("u_email like", value, "uEmail");
            return (Criteria) this;
        }

        public Criteria andUEmailNotLike(String value) {
            addCriterion("u_email not like", value, "uEmail");
            return (Criteria) this;
        }

        public Criteria andUEmailIn(List<String> values) {
            addCriterion("u_email in", values, "uEmail");
            return (Criteria) this;
        }

        public Criteria andUEmailNotIn(List<String> values) {
            addCriterion("u_email not in", values, "uEmail");
            return (Criteria) this;
        }

        public Criteria andUEmailBetween(String value1, String value2) {
            addCriterion("u_email between", value1, value2, "uEmail");
            return (Criteria) this;
        }

        public Criteria andUEmailNotBetween(String value1, String value2) {
            addCriterion("u_email not between", value1, value2, "uEmail");
            return (Criteria) this;
        }

        public Criteria andUPhoneIsNull() {
            addCriterion("u_phone is null");
            return (Criteria) this;
        }

        public Criteria andUPhoneIsNotNull() {
            addCriterion("u_phone is not null");
            return (Criteria) this;
        }

        public Criteria andUPhoneEqualTo(String value) {
            addCriterion("u_phone =", value, "uPhone");
            return (Criteria) this;
        }

        public Criteria andUPhoneNotEqualTo(String value) {
            addCriterion("u_phone <>", value, "uPhone");
            return (Criteria) this;
        }

        public Criteria andUPhoneGreaterThan(String value) {
            addCriterion("u_phone >", value, "uPhone");
            return (Criteria) this;
        }

        public Criteria andUPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("u_phone >=", value, "uPhone");
            return (Criteria) this;
        }

        public Criteria andUPhoneLessThan(String value) {
            addCriterion("u_phone <", value, "uPhone");
            return (Criteria) this;
        }

        public Criteria andUPhoneLessThanOrEqualTo(String value) {
            addCriterion("u_phone <=", value, "uPhone");
            return (Criteria) this;
        }

        public Criteria andUPhoneLike(String value) {
            addCriterion("u_phone like", value, "uPhone");
            return (Criteria) this;
        }

        public Criteria andUPhoneNotLike(String value) {
            addCriterion("u_phone not like", value, "uPhone");
            return (Criteria) this;
        }

        public Criteria andUPhoneIn(List<String> values) {
            addCriterion("u_phone in", values, "uPhone");
            return (Criteria) this;
        }

        public Criteria andUPhoneNotIn(List<String> values) {
            addCriterion("u_phone not in", values, "uPhone");
            return (Criteria) this;
        }

        public Criteria andUPhoneBetween(String value1, String value2) {
            addCriterion("u_phone between", value1, value2, "uPhone");
            return (Criteria) this;
        }

        public Criteria andUPhoneNotBetween(String value1, String value2) {
            addCriterion("u_phone not between", value1, value2, "uPhone");
            return (Criteria) this;
        }

        public Criteria andURnameIsNull() {
            addCriterion("u_rname is null");
            return (Criteria) this;
        }

        public Criteria andURnameIsNotNull() {
            addCriterion("u_rname is not null");
            return (Criteria) this;
        }

        public Criteria andURnameEqualTo(String value) {
            addCriterion("u_rname =", value, "uRname");
            return (Criteria) this;
        }

        public Criteria andURnameNotEqualTo(String value) {
            addCriterion("u_rname <>", value, "uRname");
            return (Criteria) this;
        }

        public Criteria andURnameGreaterThan(String value) {
            addCriterion("u_rname >", value, "uRname");
            return (Criteria) this;
        }

        public Criteria andURnameGreaterThanOrEqualTo(String value) {
            addCriterion("u_rname >=", value, "uRname");
            return (Criteria) this;
        }

        public Criteria andURnameLessThan(String value) {
            addCriterion("u_rname <", value, "uRname");
            return (Criteria) this;
        }

        public Criteria andURnameLessThanOrEqualTo(String value) {
            addCriterion("u_rname <=", value, "uRname");
            return (Criteria) this;
        }

        public Criteria andURnameLike(String value) {
            addCriterion("u_rname like", value, "uRname");
            return (Criteria) this;
        }

        public Criteria andURnameNotLike(String value) {
            addCriterion("u_rname not like", value, "uRname");
            return (Criteria) this;
        }

        public Criteria andURnameIn(List<String> values) {
            addCriterion("u_rname in", values, "uRname");
            return (Criteria) this;
        }

        public Criteria andURnameNotIn(List<String> values) {
            addCriterion("u_rname not in", values, "uRname");
            return (Criteria) this;
        }

        public Criteria andURnameBetween(String value1, String value2) {
            addCriterion("u_rname between", value1, value2, "uRname");
            return (Criteria) this;
        }

        public Criteria andURnameNotBetween(String value1, String value2) {
            addCriterion("u_rname not between", value1, value2, "uRname");
            return (Criteria) this;
        }

        public Criteria andUCardNoIsNull() {
            addCriterion("u_card_no is null");
            return (Criteria) this;
        }

        public Criteria andUCardNoIsNotNull() {
            addCriterion("u_card_no is not null");
            return (Criteria) this;
        }

        public Criteria andUCardNoEqualTo(String value) {
            addCriterion("u_card_no =", value, "uCardNo");
            return (Criteria) this;
        }

        public Criteria andUCardNoNotEqualTo(String value) {
            addCriterion("u_card_no <>", value, "uCardNo");
            return (Criteria) this;
        }

        public Criteria andUCardNoGreaterThan(String value) {
            addCriterion("u_card_no >", value, "uCardNo");
            return (Criteria) this;
        }

        public Criteria andUCardNoGreaterThanOrEqualTo(String value) {
            addCriterion("u_card_no >=", value, "uCardNo");
            return (Criteria) this;
        }

        public Criteria andUCardNoLessThan(String value) {
            addCriterion("u_card_no <", value, "uCardNo");
            return (Criteria) this;
        }

        public Criteria andUCardNoLessThanOrEqualTo(String value) {
            addCriterion("u_card_no <=", value, "uCardNo");
            return (Criteria) this;
        }

        public Criteria andUCardNoLike(String value) {
            addCriterion("u_card_no like", value, "uCardNo");
            return (Criteria) this;
        }

        public Criteria andUCardNoNotLike(String value) {
            addCriterion("u_card_no not like", value, "uCardNo");
            return (Criteria) this;
        }

        public Criteria andUCardNoIn(List<String> values) {
            addCriterion("u_card_no in", values, "uCardNo");
            return (Criteria) this;
        }

        public Criteria andUCardNoNotIn(List<String> values) {
            addCriterion("u_card_no not in", values, "uCardNo");
            return (Criteria) this;
        }

        public Criteria andUCardNoBetween(String value1, String value2) {
            addCriterion("u_card_no between", value1, value2, "uCardNo");
            return (Criteria) this;
        }

        public Criteria andUCardNoNotBetween(String value1, String value2) {
            addCriterion("u_card_no not between", value1, value2, "uCardNo");
            return (Criteria) this;
        }

        public Criteria andUSexIsNull() {
            addCriterion("u_sex is null");
            return (Criteria) this;
        }

        public Criteria andUSexIsNotNull() {
            addCriterion("u_sex is not null");
            return (Criteria) this;
        }

        public Criteria andUSexEqualTo(Integer value) {
            addCriterion("u_sex =", value, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexNotEqualTo(Integer value) {
            addCriterion("u_sex <>", value, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexGreaterThan(Integer value) {
            addCriterion("u_sex >", value, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexGreaterThanOrEqualTo(Integer value) {
            addCriterion("u_sex >=", value, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexLessThan(Integer value) {
            addCriterion("u_sex <", value, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexLessThanOrEqualTo(Integer value) {
            addCriterion("u_sex <=", value, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexIn(List<Integer> values) {
            addCriterion("u_sex in", values, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexNotIn(List<Integer> values) {
            addCriterion("u_sex not in", values, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexBetween(Integer value1, Integer value2) {
            addCriterion("u_sex between", value1, value2, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexNotBetween(Integer value1, Integer value2) {
            addCriterion("u_sex not between", value1, value2, "uSex");
            return (Criteria) this;
        }

        public Criteria andUBirthdayIsNull() {
            addCriterion("u_birthday is null");
            return (Criteria) this;
        }

        public Criteria andUBirthdayIsNotNull() {
            addCriterion("u_birthday is not null");
            return (Criteria) this;
        }

        public Criteria andUBirthdayEqualTo(Date value) {
            addCriterionForJDBCDate("u_birthday =", value, "uBirthday");
            return (Criteria) this;
        }

        public Criteria andUBirthdayNotEqualTo(Date value) {
            addCriterionForJDBCDate("u_birthday <>", value, "uBirthday");
            return (Criteria) this;
        }

        public Criteria andUBirthdayGreaterThan(Date value) {
            addCriterionForJDBCDate("u_birthday >", value, "uBirthday");
            return (Criteria) this;
        }

        public Criteria andUBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("u_birthday >=", value, "uBirthday");
            return (Criteria) this;
        }

        public Criteria andUBirthdayLessThan(Date value) {
            addCriterionForJDBCDate("u_birthday <", value, "uBirthday");
            return (Criteria) this;
        }

        public Criteria andUBirthdayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("u_birthday <=", value, "uBirthday");
            return (Criteria) this;
        }

        public Criteria andUBirthdayIn(List<Date> values) {
            addCriterionForJDBCDate("u_birthday in", values, "uBirthday");
            return (Criteria) this;
        }

        public Criteria andUBirthdayNotIn(List<Date> values) {
            addCriterionForJDBCDate("u_birthday not in", values, "uBirthday");
            return (Criteria) this;
        }

        public Criteria andUBirthdayBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("u_birthday between", value1, value2, "uBirthday");
            return (Criteria) this;
        }

        public Criteria andUBirthdayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("u_birthday not between", value1, value2, "uBirthday");
            return (Criteria) this;
        }

        public Criteria andUJiguanIsNull() {
            addCriterion("u_jiguan is null");
            return (Criteria) this;
        }

        public Criteria andUJiguanIsNotNull() {
            addCriterion("u_jiguan is not null");
            return (Criteria) this;
        }

        public Criteria andUJiguanEqualTo(String value) {
            addCriterion("u_jiguan =", value, "uJiguan");
            return (Criteria) this;
        }

        public Criteria andUJiguanNotEqualTo(String value) {
            addCriterion("u_jiguan <>", value, "uJiguan");
            return (Criteria) this;
        }

        public Criteria andUJiguanGreaterThan(String value) {
            addCriterion("u_jiguan >", value, "uJiguan");
            return (Criteria) this;
        }

        public Criteria andUJiguanGreaterThanOrEqualTo(String value) {
            addCriterion("u_jiguan >=", value, "uJiguan");
            return (Criteria) this;
        }

        public Criteria andUJiguanLessThan(String value) {
            addCriterion("u_jiguan <", value, "uJiguan");
            return (Criteria) this;
        }

        public Criteria andUJiguanLessThanOrEqualTo(String value) {
            addCriterion("u_jiguan <=", value, "uJiguan");
            return (Criteria) this;
        }

        public Criteria andUJiguanLike(String value) {
            addCriterion("u_jiguan like", value, "uJiguan");
            return (Criteria) this;
        }

        public Criteria andUJiguanNotLike(String value) {
            addCriterion("u_jiguan not like", value, "uJiguan");
            return (Criteria) this;
        }

        public Criteria andUJiguanIn(List<String> values) {
            addCriterion("u_jiguan in", values, "uJiguan");
            return (Criteria) this;
        }

        public Criteria andUJiguanNotIn(List<String> values) {
            addCriterion("u_jiguan not in", values, "uJiguan");
            return (Criteria) this;
        }

        public Criteria andUJiguanBetween(String value1, String value2) {
            addCriterion("u_jiguan between", value1, value2, "uJiguan");
            return (Criteria) this;
        }

        public Criteria andUJiguanNotBetween(String value1, String value2) {
            addCriterion("u_jiguan not between", value1, value2, "uJiguan");
            return (Criteria) this;
        }

        public Criteria andUHukouIsNull() {
            addCriterion("u_hukou is null");
            return (Criteria) this;
        }

        public Criteria andUHukouIsNotNull() {
            addCriterion("u_hukou is not null");
            return (Criteria) this;
        }

        public Criteria andUHukouEqualTo(String value) {
            addCriterion("u_hukou =", value, "uHukou");
            return (Criteria) this;
        }

        public Criteria andUHukouNotEqualTo(String value) {
            addCriterion("u_hukou <>", value, "uHukou");
            return (Criteria) this;
        }

        public Criteria andUHukouGreaterThan(String value) {
            addCriterion("u_hukou >", value, "uHukou");
            return (Criteria) this;
        }

        public Criteria andUHukouGreaterThanOrEqualTo(String value) {
            addCriterion("u_hukou >=", value, "uHukou");
            return (Criteria) this;
        }

        public Criteria andUHukouLessThan(String value) {
            addCriterion("u_hukou <", value, "uHukou");
            return (Criteria) this;
        }

        public Criteria andUHukouLessThanOrEqualTo(String value) {
            addCriterion("u_hukou <=", value, "uHukou");
            return (Criteria) this;
        }

        public Criteria andUHukouLike(String value) {
            addCriterion("u_hukou like", value, "uHukou");
            return (Criteria) this;
        }

        public Criteria andUHukouNotLike(String value) {
            addCriterion("u_hukou not like", value, "uHukou");
            return (Criteria) this;
        }

        public Criteria andUHukouIn(List<String> values) {
            addCriterion("u_hukou in", values, "uHukou");
            return (Criteria) this;
        }

        public Criteria andUHukouNotIn(List<String> values) {
            addCriterion("u_hukou not in", values, "uHukou");
            return (Criteria) this;
        }

        public Criteria andUHukouBetween(String value1, String value2) {
            addCriterion("u_hukou between", value1, value2, "uHukou");
            return (Criteria) this;
        }

        public Criteria andUHukouNotBetween(String value1, String value2) {
            addCriterion("u_hukou not between", value1, value2, "uHukou");
            return (Criteria) this;
        }

        public Criteria andUPoliticalIsNull() {
            addCriterion("u_political is null");
            return (Criteria) this;
        }

        public Criteria andUPoliticalIsNotNull() {
            addCriterion("u_political is not null");
            return (Criteria) this;
        }

        public Criteria andUPoliticalEqualTo(String value) {
            addCriterion("u_political =", value, "uPolitical");
            return (Criteria) this;
        }

        public Criteria andUPoliticalNotEqualTo(String value) {
            addCriterion("u_political <>", value, "uPolitical");
            return (Criteria) this;
        }

        public Criteria andUPoliticalGreaterThan(String value) {
            addCriterion("u_political >", value, "uPolitical");
            return (Criteria) this;
        }

        public Criteria andUPoliticalGreaterThanOrEqualTo(String value) {
            addCriterion("u_political >=", value, "uPolitical");
            return (Criteria) this;
        }

        public Criteria andUPoliticalLessThan(String value) {
            addCriterion("u_political <", value, "uPolitical");
            return (Criteria) this;
        }

        public Criteria andUPoliticalLessThanOrEqualTo(String value) {
            addCriterion("u_political <=", value, "uPolitical");
            return (Criteria) this;
        }

        public Criteria andUPoliticalLike(String value) {
            addCriterion("u_political like", value, "uPolitical");
            return (Criteria) this;
        }

        public Criteria andUPoliticalNotLike(String value) {
            addCriterion("u_political not like", value, "uPolitical");
            return (Criteria) this;
        }

        public Criteria andUPoliticalIn(List<String> values) {
            addCriterion("u_political in", values, "uPolitical");
            return (Criteria) this;
        }

        public Criteria andUPoliticalNotIn(List<String> values) {
            addCriterion("u_political not in", values, "uPolitical");
            return (Criteria) this;
        }

        public Criteria andUPoliticalBetween(String value1, String value2) {
            addCriterion("u_political between", value1, value2, "uPolitical");
            return (Criteria) this;
        }

        public Criteria andUPoliticalNotBetween(String value1, String value2) {
            addCriterion("u_political not between", value1, value2, "uPolitical");
            return (Criteria) this;
        }

        public Criteria andUEducationIsNull() {
            addCriterion("u_education is null");
            return (Criteria) this;
        }

        public Criteria andUEducationIsNotNull() {
            addCriterion("u_education is not null");
            return (Criteria) this;
        }

        public Criteria andUEducationEqualTo(String value) {
            addCriterion("u_education =", value, "uEducation");
            return (Criteria) this;
        }

        public Criteria andUEducationNotEqualTo(String value) {
            addCriterion("u_education <>", value, "uEducation");
            return (Criteria) this;
        }

        public Criteria andUEducationGreaterThan(String value) {
            addCriterion("u_education >", value, "uEducation");
            return (Criteria) this;
        }

        public Criteria andUEducationGreaterThanOrEqualTo(String value) {
            addCriterion("u_education >=", value, "uEducation");
            return (Criteria) this;
        }

        public Criteria andUEducationLessThan(String value) {
            addCriterion("u_education <", value, "uEducation");
            return (Criteria) this;
        }

        public Criteria andUEducationLessThanOrEqualTo(String value) {
            addCriterion("u_education <=", value, "uEducation");
            return (Criteria) this;
        }

        public Criteria andUEducationLike(String value) {
            addCriterion("u_education like", value, "uEducation");
            return (Criteria) this;
        }

        public Criteria andUEducationNotLike(String value) {
            addCriterion("u_education not like", value, "uEducation");
            return (Criteria) this;
        }

        public Criteria andUEducationIn(List<String> values) {
            addCriterion("u_education in", values, "uEducation");
            return (Criteria) this;
        }

        public Criteria andUEducationNotIn(List<String> values) {
            addCriterion("u_education not in", values, "uEducation");
            return (Criteria) this;
        }

        public Criteria andUEducationBetween(String value1, String value2) {
            addCriterion("u_education between", value1, value2, "uEducation");
            return (Criteria) this;
        }

        public Criteria andUEducationNotBetween(String value1, String value2) {
            addCriterion("u_education not between", value1, value2, "uEducation");
            return (Criteria) this;
        }

        public Criteria andUDegreeIsNull() {
            addCriterion("u_degree is null");
            return (Criteria) this;
        }

        public Criteria andUDegreeIsNotNull() {
            addCriterion("u_degree is not null");
            return (Criteria) this;
        }

        public Criteria andUDegreeEqualTo(String value) {
            addCriterion("u_degree =", value, "uDegree");
            return (Criteria) this;
        }

        public Criteria andUDegreeNotEqualTo(String value) {
            addCriterion("u_degree <>", value, "uDegree");
            return (Criteria) this;
        }

        public Criteria andUDegreeGreaterThan(String value) {
            addCriterion("u_degree >", value, "uDegree");
            return (Criteria) this;
        }

        public Criteria andUDegreeGreaterThanOrEqualTo(String value) {
            addCriterion("u_degree >=", value, "uDegree");
            return (Criteria) this;
        }

        public Criteria andUDegreeLessThan(String value) {
            addCriterion("u_degree <", value, "uDegree");
            return (Criteria) this;
        }

        public Criteria andUDegreeLessThanOrEqualTo(String value) {
            addCriterion("u_degree <=", value, "uDegree");
            return (Criteria) this;
        }

        public Criteria andUDegreeLike(String value) {
            addCriterion("u_degree like", value, "uDegree");
            return (Criteria) this;
        }

        public Criteria andUDegreeNotLike(String value) {
            addCriterion("u_degree not like", value, "uDegree");
            return (Criteria) this;
        }

        public Criteria andUDegreeIn(List<String> values) {
            addCriterion("u_degree in", values, "uDegree");
            return (Criteria) this;
        }

        public Criteria andUDegreeNotIn(List<String> values) {
            addCriterion("u_degree not in", values, "uDegree");
            return (Criteria) this;
        }

        public Criteria andUDegreeBetween(String value1, String value2) {
            addCriterion("u_degree between", value1, value2, "uDegree");
            return (Criteria) this;
        }

        public Criteria andUDegreeNotBetween(String value1, String value2) {
            addCriterion("u_degree not between", value1, value2, "uDegree");
            return (Criteria) this;
        }

        public Criteria andUMajorIsNull() {
            addCriterion("u_major is null");
            return (Criteria) this;
        }

        public Criteria andUMajorIsNotNull() {
            addCriterion("u_major is not null");
            return (Criteria) this;
        }

        public Criteria andUMajorEqualTo(String value) {
            addCriterion("u_major =", value, "uMajor");
            return (Criteria) this;
        }

        public Criteria andUMajorNotEqualTo(String value) {
            addCriterion("u_major <>", value, "uMajor");
            return (Criteria) this;
        }

        public Criteria andUMajorGreaterThan(String value) {
            addCriterion("u_major >", value, "uMajor");
            return (Criteria) this;
        }

        public Criteria andUMajorGreaterThanOrEqualTo(String value) {
            addCriterion("u_major >=", value, "uMajor");
            return (Criteria) this;
        }

        public Criteria andUMajorLessThan(String value) {
            addCriterion("u_major <", value, "uMajor");
            return (Criteria) this;
        }

        public Criteria andUMajorLessThanOrEqualTo(String value) {
            addCriterion("u_major <=", value, "uMajor");
            return (Criteria) this;
        }

        public Criteria andUMajorLike(String value) {
            addCriterion("u_major like", value, "uMajor");
            return (Criteria) this;
        }

        public Criteria andUMajorNotLike(String value) {
            addCriterion("u_major not like", value, "uMajor");
            return (Criteria) this;
        }

        public Criteria andUMajorIn(List<String> values) {
            addCriterion("u_major in", values, "uMajor");
            return (Criteria) this;
        }

        public Criteria andUMajorNotIn(List<String> values) {
            addCriterion("u_major not in", values, "uMajor");
            return (Criteria) this;
        }

        public Criteria andUMajorBetween(String value1, String value2) {
            addCriterion("u_major between", value1, value2, "uMajor");
            return (Criteria) this;
        }

        public Criteria andUMajorNotBetween(String value1, String value2) {
            addCriterion("u_major not between", value1, value2, "uMajor");
            return (Criteria) this;
        }

        public Criteria andUSchoolIsNull() {
            addCriterion("u_school is null");
            return (Criteria) this;
        }

        public Criteria andUSchoolIsNotNull() {
            addCriterion("u_school is not null");
            return (Criteria) this;
        }

        public Criteria andUSchoolEqualTo(String value) {
            addCriterion("u_school =", value, "uSchool");
            return (Criteria) this;
        }

        public Criteria andUSchoolNotEqualTo(String value) {
            addCriterion("u_school <>", value, "uSchool");
            return (Criteria) this;
        }

        public Criteria andUSchoolGreaterThan(String value) {
            addCriterion("u_school >", value, "uSchool");
            return (Criteria) this;
        }

        public Criteria andUSchoolGreaterThanOrEqualTo(String value) {
            addCriterion("u_school >=", value, "uSchool");
            return (Criteria) this;
        }

        public Criteria andUSchoolLessThan(String value) {
            addCriterion("u_school <", value, "uSchool");
            return (Criteria) this;
        }

        public Criteria andUSchoolLessThanOrEqualTo(String value) {
            addCriterion("u_school <=", value, "uSchool");
            return (Criteria) this;
        }

        public Criteria andUSchoolLike(String value) {
            addCriterion("u_school like", value, "uSchool");
            return (Criteria) this;
        }

        public Criteria andUSchoolNotLike(String value) {
            addCriterion("u_school not like", value, "uSchool");
            return (Criteria) this;
        }

        public Criteria andUSchoolIn(List<String> values) {
            addCriterion("u_school in", values, "uSchool");
            return (Criteria) this;
        }

        public Criteria andUSchoolNotIn(List<String> values) {
            addCriterion("u_school not in", values, "uSchool");
            return (Criteria) this;
        }

        public Criteria andUSchoolBetween(String value1, String value2) {
            addCriterion("u_school between", value1, value2, "uSchool");
            return (Criteria) this;
        }

        public Criteria andUSchoolNotBetween(String value1, String value2) {
            addCriterion("u_school not between", value1, value2, "uSchool");
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