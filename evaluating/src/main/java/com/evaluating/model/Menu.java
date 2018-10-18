package com.evaluating.model;

/**
 * 
 * 
 * @author wcyong
 * 
 * @date 2018-10-18
 */
public class Menu {
    private Integer id;

    /**
     * 菜单名称
     */
    private String mName;

    /**
     * 菜单地址
     */
    private String mUrl;

    /**
     * 菜单信息
     */
    private String mInfo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName == null ? null : mName.trim();
    }

    public String getmUrl() {
        return mUrl;
    }

    public void setmUrl(String mUrl) {
        this.mUrl = mUrl == null ? null : mUrl.trim();
    }

    public String getmInfo() {
        return mInfo;
    }

    public void setmInfo(String mInfo) {
        this.mInfo = mInfo == null ? null : mInfo.trim();
    }
}