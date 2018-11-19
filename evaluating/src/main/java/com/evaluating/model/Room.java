package com.evaluating.model;

/**
 * 
 * 
 * @author wcyong
 * 
 * @date 2018-11-19
 */
public class Room {
    private Integer roId;

    /**
     * 考场信息
     */
    private String rName;

    /**
     * 可容纳考生数
     */
    private Integer rCount;

    public Integer getRoId() {
        return roId;
    }

    public void setRoId(Integer roId) {
        this.roId = roId;
    }

    public String getrName() {
        return rName;
    }

    public void setrName(String rName) {
        this.rName = rName == null ? null : rName.trim();
    }

    public Integer getrCount() {
        return rCount;
    }

    public void setrCount(Integer rCount) {
        this.rCount = rCount;
    }
}