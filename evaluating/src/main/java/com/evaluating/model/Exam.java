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
     * 流程状态
     */
    private String bpmStatus;

    /**
     * 创建人id
     */
    private String eCreateId;

    /**
     * 考试名称
     */
    private String eName;

    /**
     * 考试状态
     */
    private String eStatus;

    /**
     * 所属部门
     */
    private String sysOrgCode;

    /**
     * 所属公司
     */
    private String sysCompanyCode;

    /**
     * 考试时间
     */
    private Date eDate;

    /**
     * 考试人数
     */
    private String eCount;

    /**
     * 考试信息
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