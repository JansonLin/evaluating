package com.evaluating.model;

/**
 * 
 * 
 * @author wcyong
 * 
 * @date 2018-11-19
 */
public class Place {
    private Integer pId;

    /**
     * 考点信息
     */
    private String pName;

    /**
     * 考点可容纳人数
     */
    private Integer eCount;

    public Integer getpId() {
        return pId;
    }

    public void setpId(Integer pId) {
        this.pId = pId;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName == null ? null : pName.trim();
    }

    public Integer geteCount() {
        return eCount;
    }

    public void seteCount(Integer eCount) {
        this.eCount = eCount;
    }
}