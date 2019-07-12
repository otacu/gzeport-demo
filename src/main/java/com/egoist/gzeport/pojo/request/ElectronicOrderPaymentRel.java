package com.egoist.gzeport.pojo.request;

import com.thoughtworks.xstream.annotations.XStreamAlias;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * 电子订单关联支付表体
 */
public class ElectronicOrderPaymentRel implements Serializable {

    /**
     * 支付企业代码，申报企业的单一窗口企业注册编号
     */
    @NotNull(message = "支付企业代码不能为空")
    @XStreamAlias("PayEntNo")
    private String payEntNo;

    /**
     * 支付企业名称
     */
    @NotNull(message = "支付企业名称不能为空")
    @XStreamAlias("PayEntName")
    private String payEntName;

    /**
     * 支付交易编号，支付企业唯一的支付流水号
     */
    @NotNull(message = "支付交易编号不能为空")
    @XStreamAlias("PayNo")
    private String payNo;

    /**
     * 备注
     */
    @XStreamAlias("Notes")
    private String notes;

    /**
     * @return payEntNo
     */
    public String getPayEntNo() {
        return payEntNo;
    }

    /**
     * @param payEntNo payEntNo
     */
    public void setPayEntNo(String payEntNo) {
        this.payEntNo = payEntNo;
    }

    /**
     * @return payEntName
     */
    public String getPayEntName() {
        return payEntName;
    }

    /**
     * @param payEntName payEntName
     */
    public void setPayEntName(String payEntName) {
        this.payEntName = payEntName;
    }

    /**
     * @return payNo
     */
    public String getPayNo() {
        return payNo;
    }

    /**
     * @param payNo payNo
     */
    public void setPayNo(String payNo) {
        this.payNo = payNo;
    }

    /**
     * @return notes
     */
    public String getNotes() {
        return notes;
    }

    /**
     * @param notes notes
     */
    public void setNotes(String notes) {
        this.notes = notes;
    }
}
