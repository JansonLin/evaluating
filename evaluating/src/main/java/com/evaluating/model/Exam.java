package com.evaluating.model;

import java.util.Date;

/**
 * 
 * 
 * @author wcyong
 * 
 * @date 2018-11-19
 */
public class Exam {
    private String id;

    /**
     * ����״̬
     */
    private String bpmStatus;

    /**
     * ������id
     */
    private String eCreateId;

    /**
     * ��������
     */
    private String eName;

    /**
     * ����״̬
     */
    private String eStatus;

    /**
     * ��������
     */
    private String sysOrgCode;

    /**
     * ������˾
     */
    private String sysCompanyCode;

    /**
     * ����ʱ��
     */
    private Date eDate;

    /**
     * ��������
     */
    private String eCount;

    /**
     * ������Ϣ
     */
    private String eInfo;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getBpmStatus() {
        return bpmStatus;
    }

    public void setBpmStatus(String bpmStatus) {
        this.bpmStatus = bpmStatus == null ? null : bpmStatus.trim();
    }

    public String geteCreateId() {
        return eCreateId;
    }

    public void seteCreateId(String eCreateId) {
        this.eCreateId = eCreateId == null ? null : eCreateId.trim();
    }

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName == null ? null : eName.trim();
    }

    public String geteStatus() {
        return eStatus;
    }

    public void seteStatus(String eStatus) {
        this.eStatus = eStatus == null ? null : eStatus.trim();
    }

    public String getSysOrgCode() {
        return sysOrgCode;
    }

    public void setSysOrgCode(String sysOrgCode) {
        this.sysOrgCode = sysOrgCode == null ? null : sysOrgCode.trim();
    }

    public String getSysCompanyCode() {
        return sysCompanyCode;
    }

    public void setSysCompanyCode(String sysCompanyCode) {
        this.sysCompanyCode = sysCompanyCode == null ? null : sysCompanyCode.trim();
    }

    public Date geteDate() {
        return eDate;
    }

    public void seteDate(Date eDate) {
        this.eDate = eDate;
    }

    public String geteCount() {
        return eCount;
    }

    public void seteCount(String eCount) {
        this.eCount = eCount == null ? null : eCount.trim();
    }

    public String geteInfo() {
        return eInfo;
    }

    public void seteInfo(String eInfo) {
        this.eInfo = eInfo == null ? null : eInfo.trim();
    }
}