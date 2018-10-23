package com.evaluating.model;

/**
 * 
 * 
 * @author wcyong
 * 
 * @date 2018-10-23
 */
public class Room {
    private Integer id;

    /**
     * 考场信息
     */
    private String rName;

    /**
     * 可容纳考生数
     */
    private Integer rCount;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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