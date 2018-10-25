package com.evaluating.model;

import java.util.Date;

/**
 * 
 * 
 * @author wcyong
 * 
 * @date 2018-10-23
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
}