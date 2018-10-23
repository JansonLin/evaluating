package com.evaluating.model;

/**
 * 
 * 
 * @author wcyong
 * 
 * @date 2018-10-23
 */
public class Place {
    private Integer id;

    /**
     * 考点信息
     */
    private String pName;

    /**
     * 考点可容纳人数
     */
    private Integer eCount;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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