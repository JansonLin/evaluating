package com.evaluating.model;

/**
 * 
 * 
 * @author wcyong
 * 
 * @date 2018-10-23
 */
public class Role {
    private Integer id;

    /**
     * 角色名称
     */
    private String rName;

    /**
     * 角色编号
     */
    private String rCode;

    /**
     * 角色信息
     */
    private String rInfo;

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

    public String getrCode() {
        return rCode;
    }

    public void setrCode(String rCode) {
        this.rCode = rCode == null ? null : rCode.trim();
    }

    public String getrInfo() {
        return rInfo;
    }

    public void setrInfo(String rInfo) {
        this.rInfo = rInfo == null ? null : rInfo.trim();
    }
}