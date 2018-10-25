package com.evaluating.model;

import java.util.Date;

/**
 * 
 * 
 * @author wcyong
 * 
 * @date 2018-10-23
 */
public class student {
    private Integer id;

    /**
     * 姓名
     */
    private String sName;

    /**
     * 性别
     */
    private Integer sSex;

    /**
     * 出生年月
     */
    private Date sBirthday;

    /**
     * 民族
     */
    private String sEthnic;

    /**
     * 籍贯
     */
    private String sJiguan;

    /**
     * 户口所在地
     */
    private String sHukou;

    /**
     * 政治面貌
     */
    private String sPolitical;

    /**
     * 学历
     */
    private String sEducation;

    /**
     * 学位
     */
    private String sDegree;

    /**
     * 学校
     */
    private String sSchool;

    /**
     * 专业
     */
    private String sMajor;

    /**
     * 用户id
     */
    private Integer userId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName == null ? null : sName.trim();
    }

    public Integer getsSex() {
        return sSex;
    }

    public void setsSex(Integer sSex) {
        this.sSex = sSex;
    }

    public Date getsBirthday() {
        return sBirthday;
    }

    public void setsBirthday(Date sBirthday) {
        this.sBirthday = sBirthday;
    }

    public String getsEthnic() {
        return sEthnic;
    }

    public void setsEthnic(String sEthnic) {
        this.sEthnic = sEthnic == null ? null : sEthnic.trim();
    }

    public String getsJiguan() {
        return sJiguan;
    }

    public void setsJiguan(String sJiguan) {
        this.sJiguan = sJiguan == null ? null : sJiguan.trim();
    }

    public String getsHukou() {
        return sHukou;
    }

    public void setsHukou(String sHukou) {
        this.sHukou = sHukou == null ? null : sHukou.trim();
    }

    public String getsPolitical() {
        return sPolitical;
    }

    public void setsPolitical(String sPolitical) {
        this.sPolitical = sPolitical == null ? null : sPolitical.trim();
    }

    public String getsEducation() {
        return sEducation;
    }

    public void setsEducation(String sEducation) {
        this.sEducation = sEducation == null ? null : sEducation.trim();
    }

    public String getsDegree() {
        return sDegree;
    }

    public void setsDegree(String sDegree) {
        this.sDegree = sDegree == null ? null : sDegree.trim();
    }

    public String getsSchool() {
        return sSchool;
    }

    public void setsSchool(String sSchool) {
        this.sSchool = sSchool == null ? null : sSchool.trim();
    }

    public String getsMajor() {
        return sMajor;
    }

    public void setsMajor(String sMajor) {
        this.sMajor = sMajor == null ? null : sMajor.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}