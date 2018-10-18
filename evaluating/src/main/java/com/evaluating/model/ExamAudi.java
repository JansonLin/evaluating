package com.evaluating.model;

import java.util.Date;

/**
 * 
 * 
 * @author wcyong
 * 
 * @date 2018-10-18
 */
public class ExamAudi {
    private Integer id;

    private Integer examId;

    /**
     * 考试的名称
     */
    private String examName;

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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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