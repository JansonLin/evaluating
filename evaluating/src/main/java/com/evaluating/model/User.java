package com.evaluating.model;

import java.util.Date;

/**
 * 
 * 
 * @author wcyong
 * 
 * @date 2018-10-23
 */
public class User {
    private Integer id;

    /**
     * 用户名
     */
    private String uName;

    /**
     * 用户密码
     */
    private String uPassword;

    /**
     * 用户邮箱
     */
    private String uEmail;

    /**
     * 用户手机
     */
    private String uPhone;

    /**
     * 真实姓名
     */
    private String uRname;

    /**
     * 身份证号
     */
    private String uCardNo;

    /**
     * 性别1男，0 女 2 保密
     */
    private Integer uSex;

    /**
     * 生日
     */
    private Date uBirthday;

    /**
     * 籍贯
     */
    private String uJiguan;

    /**
     * 户口所在地
     */
    private String uHukou;

    /**
     * 政治面貌
     */
    private String uPolitical;

    /**
     * 学历
     */
    private String uEducation;

    /**
     * 学位
     */
    private String uDegree;

    /**
     * 学位
     */
    private String uMajor;

    /**
     * 毕业院校
     */
    private String uSchool;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName == null ? null : uName.trim();
    }

    public String getuPassword() {
        return uPassword;
    }

    public void setuPassword(String uPassword) {
        this.uPassword = uPassword == null ? null : uPassword.trim();
    }

    public String getuEmail() {
        return uEmail;
    }

    public void setuEmail(String uEmail) {
        this.uEmail = uEmail == null ? null : uEmail.trim();
    }

    public String getuPhone() {
        return uPhone;
    }

    public void setuPhone(String uPhone) {
        this.uPhone = uPhone == null ? null : uPhone.trim();
    }

    public String getuRname() {
        return uRname;
    }

    public void setuRname(String uRname) {
        this.uRname = uRname == null ? null : uRname.trim();
    }

    public String getuCardNo() {
        return uCardNo;
    }

    public void setuCardNo(String uCardNo) {
        this.uCardNo = uCardNo == null ? null : uCardNo.trim();
    }

    public Integer getuSex() {
        return uSex;
    }

    public void setuSex(Integer uSex) {
        this.uSex = uSex;
    }

    public Date getuBirthday() {
        return uBirthday;
    }

    public void setuBirthday(Date uBirthday) {
        this.uBirthday = uBirthday;
    }

    public String getuJiguan() {
        return uJiguan;
    }

    public void setuJiguan(String uJiguan) {
        this.uJiguan = uJiguan == null ? null : uJiguan.trim();
    }

    public String getuHukou() {
        return uHukou;
    }

    public void setuHukou(String uHukou) {
        this.uHukou = uHukou == null ? null : uHukou.trim();
    }

    public String getuPolitical() {
        return uPolitical;
    }

    public void setuPolitical(String uPolitical) {
        this.uPolitical = uPolitical == null ? null : uPolitical.trim();
    }

    public String getuEducation() {
        return uEducation;
    }

    public void setuEducation(String uEducation) {
        this.uEducation = uEducation == null ? null : uEducation.trim();
    }

    public String getuDegree() {
        return uDegree;
    }

    public void setuDegree(String uDegree) {
        this.uDegree = uDegree == null ? null : uDegree.trim();
    }

    public String getuMajor() {
        return uMajor;
    }

    public void setuMajor(String uMajor) {
        this.uMajor = uMajor == null ? null : uMajor.trim();
    }

    public String getuSchool() {
        return uSchool;
    }

    public void setuSchool(String uSchool) {
        this.uSchool = uSchool == null ? null : uSchool.trim();
    }
}