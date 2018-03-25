package com.netease.SCM.entity;

import java.io.Serializable;

/**
 * Created by louxj424 on 2018/3/24.
 */
public class Supplier implements Serializable {
    private final static long serialVersionUID=-3051147093149131879L;

    /**
     * 供应商ID
     */
    private Integer supId;

    /**
     * 供应商名称
     */
    private String supName;

    /**
     *
     */
    private String supLinkman;

    /**
     * 供应商手机号
     */
    private String supPhone;

    /**
     * 供应商地址
     */
    private String supAddress;

    /**
     * 评价
     */
    private String supRemark;

    public Integer getSupId() {
        return supId;
    }

    public void setSupId(Integer supId) {
        this.supId = supId;
    }

    public String getSupName() {
        return supName;
    }

    public void setSupName(String supName) {
        this.supName = supName;
    }

    public String getSupLinkman() {
        return supLinkman;
    }

    public void setSupLinkman(String supLinkman) {
        this.supLinkman = supLinkman;
    }

    public String getSupPhone() {
        return supPhone;
    }

    public void setSupPhone(String supPhone) {
        this.supPhone = supPhone;
    }

    public String getSupRemark() {
        return supRemark;
    }

    public void setSupRemark(String supRemark) {
        this.supRemark = supRemark;
    }

    public String getSupAddress() {
        return supAddress;
    }

    public void setSupAddress(String supAddress) {
        this.supAddress = supAddress;
    }

    @Override
    public String toString() {
        return "Supplier{" +
                "supId=" + supId +
                ", supName='" + supName + '\'' +
                ", supLinkman='" + supLinkman + '\'' +
                ", supPhone='" + supPhone + '\'' +
                ", supAddress='" + supAddress + '\'' +
                ", supRemark='" + supRemark + '\'' +
                '}';
    }
}
