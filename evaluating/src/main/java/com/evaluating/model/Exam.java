package com.evaluating.model;

import java.util.Date;

/**
 * 
 * 
 * @author wcyong
 * 
 * @date 2018-10-26
 */
public class Exam {
    private Integer id;

    /**
     * 考试的名称
     */
    private String eName;

    /**
     * 可容纳考试人数
     */
    private Integer eCount;

    /**
     * 考试时间
     */
    private Date eTime;

    /**
     * 创建时定义考试编号，作为准考证号的前缀
     */
    private String eCode;

    /**
     * 创建考试的用户id
     */
    private Integer eCreatUserId;

    /**
     * 考试介绍
     */
    private String eDetail;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName == null ? null : eName.trim();
    }

    public Integer geteCount() {
        return eCount;
    }

    public void seteCount(Integer eCount) {
        this.eCount = eCount;
    }

    public Date geteTime() {
        return eTime;
    }

    public void seteTime(Date eTime) {
        this.eTime = eTime;
    }

    public String geteCode() {
        return eCode;
    }

    public void seteCode(String eCode) {
        this.eCode = eCode == null ? null : eCode.trim();
    }

    public Integer geteCreatUserId() {
        return eCreatUserId;
    }

    public void seteCreatUserId(Integer eCreatUserId) {
        this.eCreatUserId = eCreatUserId;
    }

    public String geteDetail() {
        return eDetail;
    }

    public void seteDetail(String eDetail) {
        this.eDetail = eDetail == null ? null : eDetail.trim();
    }
}