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
     * ���Ե�����
     */
    private String examName;

    /**
     * ֱ����λid
     */
    private Integer eaOrgId;

    /**
     * ֱ����λ��
     */
    private String eaOrgName;

    /**
     * ӦƸ��λid
     */
    private Integer eaWorkId;

    /**
     * ӦƸ��λ
     */
    private String eaWorkName;

    /**
     * ����id������������
     */
    private Integer eaAtudentId;

    /**
     * ׼��֤��
     */
    private String examCardCode;

    /**
     * ����ʱ��
     */
    private Date eaEnterDate;

    /**
     * �����id
     */
    private Integer eaAuditorId;

    /**
     * ���״̬1����У�2���ͨ����3��˲�ͨ��
     */
    private Integer eaAudiStatus;

    /**
     * ���δͨ��ԭ��
     */
    private String eaReason;

    /**
     * ����״̬1δ���ԣ�2�ѿ���
     */
    private Integer eaStatus;

    /**
     * ���Գɼ�
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