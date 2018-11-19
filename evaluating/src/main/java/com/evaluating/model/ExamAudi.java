package com.evaluating.model;

import java.util.Date;

/**
 * 
 * 
 * @author wcyong
 * 
 * @date 2018-11-19
 */
public class ExamAudi {
    private Integer aId;

    private Integer examId;

    /**
     * 考试的名称
     */
    private String examName;

    /**
     * 直属单位id
     */
    private Integer eaOrgId;

    /**
     * 直属单位名
     */
    private String eaOrgName;

    /**
     * 应聘岗位id
     */
    private Integer eaWorkId;

    /**
     * 应聘岗位
     */
    private String eaWorkName;

    /**
     * 考生id，关联考生表
     */
    private Integer eaAtudentId;

    /**
     * 准考证号
     */
    private String examCardCode;

    /**
     * 报名时间
     */
    private Date eaEnterDate;

    /**
     * 审核人id
     */
    private Integer eaAuditorId;

    /**
     * 审核状态1审核中，2审核通过，3审核不通过
     */
    private Integer eaAudiStatus;

    /**
     * 审核未通过原因
     */
    private String eaReason;

    /**
     * 考试状态1未考试，2已考试
     */
    private Integer eaStatus;

    /**
     * 考试成绩
     */
    private Integer eaScore;

    public Integer getaId() {
        return aId;
    }

    public void setaId(Integer aId) {
        this.aId = aId;
    }

    public Integer getExamId() {
        return examId;
    }

    public void setExamId(Integer examId) {
        this.examId = examId;
    }

    public String getExamName() {
        return examName;
    }

    public void setExamName(String examName) {
        this.examName = examName == null ? null : examName.trim();
    }

    public Integer getEaOrgId() {
        return eaOrgId;
    }

    public void setEaOrgId(Integer eaOrgId) {
        this.eaOrgId = eaOrgId;
    }

    public String getEaOrgName() {
        return eaOrgName;
    }

    public void setEaOrgName(String eaOrgName) {
        this.eaOrgName = eaOrgName == null ? null : eaOrgName.trim();
    }

    public Integer getEaWorkId() {
        return eaWorkId;
    }

    public void setEaWorkId(Integer eaWorkId) {
        this.eaWorkId = eaWorkId;
    }

    public String getEaWorkName() {
        return eaWorkName;
    }

    public void setEaWorkName(String eaWorkName) {
        this.eaWorkName = eaWorkName == null ? null : eaWorkName.trim();
    }

    public Integer getEaAtudentId() {
        return eaAtudentId;
    }

    public void setEaAtudentId(Integer eaAtudentId) {
        this.eaAtudentId = eaAtudentId;
    }

    public String getExamCardCode() {
        return examCardCode;
    }

    public void setExamCardCode(String examCardCode) {
        this.examCardCode = examCardCode == null ? null : examCardCode.trim();
    }

    public Date getEaEnterDate() {
        return eaEnterDate;
    }

    public void setEaEnterDate(Date eaEnterDate) {
        this.eaEnterDate = eaEnterDate;
    }

    public Integer getEaAuditorId() {
        return eaAuditorId;
    }

    public void setEaAuditorId(Integer eaAuditorId) {
        this.eaAuditorId = eaAuditorId;
    }

    public Integer getEaAudiStatus() {
        return eaAudiStatus;
    }

    public void setEaAudiStatus(Integer eaAudiStatus) {
        this.eaAudiStatus = eaAudiStatus;
    }

    public String getEaReason() {
        return eaReason;
    }

    public void setEaReason(String eaReason) {
        this.eaReason = eaReason == null ? null : eaReason.trim();
    }

    public Integer getEaStatus() {
        return eaStatus;
    }

    public void setEaStatus(Integer eaStatus) {
        this.eaStatus = eaStatus;
    }

    public Integer getEaScore() {
        return eaScore;
    }

    public void setEaScore(Integer eaScore) {
        this.eaScore = eaScore;
    }
}