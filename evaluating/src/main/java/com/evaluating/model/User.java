package com.evaluating.model;

import java.util.Date;

/**
 * 
 * 
 * @author wcyong
 * 
 * @date 2018-11-19
 */
public class User {
    private Integer uId;

    /**
     * �û���
     */
    private String uName;

    /**
     * �û�����
     */
    private String uPassword;

    /**
     * �û�����
     */
    private String uEmail;

    /**
     * �û��ֻ�
     */
    private String uPhone;

    /**
     * ��ʵ����
     */
    private String uRname;

    /**
     * ���֤��
     */
    private String uCardNo;

    /**
     * �Ա�1�У�0 Ů 2 ����
     */
    private Integer uSex;

    /**
     * ����
     */
    private Date uBirthday;

    /**
     * ����
     */
    private String uJiguan;

    /**
     * �������ڵ�
     */
    private String uHukou;

    /**
     * ������ò
     */
    private String uPolitical;

    /**
     * ѧ��
     */
    private String uEducation;

    /**
     * ѧλ
     */
    private String uDegree;

    /**
     * ѧλ
     */
    private String uMajor;

    /**
     * ��ҵԺУ
     */
    private String uSchool;

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName == null ? null : uName.trim();
    }

    public String getuPassword() {
        return uPassword;
    }

    public void setuPassword(String uPassword) {
        this.uPassword = uPassword == null ? null : uPassword.trim();
    }

    public String getuEmail() {
        return uEmail;
    }

    public void setuEmail(String uEmail) {
        this.uEmail = uEmail == null ? null : uEmail.trim();
    }

    public String getuPhone() {
        return uPhone;
    }

    public void setuPhone(String uPhone) {
        this.uPhone = uPhone == null ? null : uPhone.trim();
    }

    public String getuRname() {
        return uRname;
    }

    public void setuRname(String uRname) {
        this.uRname = uRname == null ? null : uRname.trim();
    }

    public String getuCardNo() {
        return uCardNo;
    }

    public void setuCardNo(String uCardNo) {
        this.uCardNo = uCardNo == null ? null : uCardNo.trim();
    }

    public Integer getuSex() {
        return uSex;
    }

    public void setuSex(Integer uSex) {
        this.uSex = uSex;
    }

    public Date getuBirthday() {
        return uBirthday;
    }

    public void setuBirthday(Date uBirthday) {
        this.uBirthday = uBirthday;
    }

    public String getuJiguan() {
        return uJiguan;
    }

    public void setuJiguan(String uJiguan) {
        this.uJiguan = uJiguan == null ? null : uJiguan.trim();
    }

    public String getuHukou() {
        return uHukou;
    }

    public void setuHukou(String uHukou) {
        this.uHukou = uHukou == null ? null : uHukou.trim();
    }

    public String getuPolitical() {
        return uPolitical;
    }

    public void setuPolitical(String uPolitical) {
        this.uPolitical = uPolitical == null ? null : uPolitical.trim();
    }

    public String getuEducation() {
        return uEducation;
    }

    public void setuEducation(String uEducation) {
        this.uEducation = uEducation == null ? null : uEducation.trim();
    }

    public String getuDegree() {
        return uDegree;
    }

    public void setuDegree(String uDegree) {
        this.uDegree = uDegree == null ? null : uDegree.trim();
    }

    public String getuMajor() {
        return uMajor;
    }

    public void setuMajor(String uMajor) {
        this.uMajor = uMajor == null ? null : uMajor.trim();
    }

    public String getuSchool() {
        return uSchool;
    }

    public void setuSchool(String uSchool) {
        this.uSchool = uSchool == null ? null : uSchool.trim();
    }
}