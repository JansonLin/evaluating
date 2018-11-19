package com.evaluating.model;

/**
 * 
 * 
 * @author wcyong
 * 
 * @date 2018-11-19
 */
public class Role {
    private Integer rId;

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

    public Integer getrId() {
        return rId;
    }

    public void setrId(Integer rId) {
        this.rId = rId;
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