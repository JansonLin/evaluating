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
     * ������Ϣ
     */
    private String pName;

    /**
     * �������������
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