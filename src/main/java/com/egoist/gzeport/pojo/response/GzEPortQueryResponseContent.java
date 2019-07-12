package com.egoist.gzeport.pojo.response;

import java.io.Serializable;

/**
 * 查询响应内容
 */
public class GzEPortQueryResponseContent implements Serializable {
    /**
     * 平台业务单编号
     */
    private String orderNo;

    /**
     * 平台状态
     */
    private Integer state;

    /**
     * 平台回执内容
     */
    private String receiptContent;

    /**
     * 国检业务单编号
     */
    private String ciqNo;

    /**
     * 国检状态
     */
    private Integer ciqState;

    /**
     * 国检回执内容
     */
    private String ciqReceiptContent;

    /**
     * 海关业务单编号
     */
    private String cusNo;

    /**
     * 海关状态
     */
    private Integer cusState;

    /**
     * 海关回执内容
     */
    private String cusReceiptContent;

    /**
     * 海关预录入编号 清单才有
     */
    private String cusPreNo;

    /**
     * @return orderNo
     */
    public String getOrderNo() {
        return orderNo;
    }

    /**
     * @param orderNo orderNo
     */
    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    /**
     * @return state
     */
    public Integer getState() {
        return state;
    }

    /**
     * @param state state
     */
    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * @return receiptContent
     */
    public String getReceiptContent() {
        return receiptContent;
    }

    /**
     * @param receiptContent receiptContent
     */
    public void setReceiptContent(String receiptContent) {
        this.receiptContent = receiptContent;
    }

    /**
     * @return ciqNo
     */
    public String getCiqNo() {
        return ciqNo;
    }

    /**
     * @param ciqNo ciqNo
     */
    public void setCiqNo(String ciqNo) {
        this.ciqNo = ciqNo;
    }

    /**
     * @return ciqState
     */
    public Integer getCiqState() {
        return ciqState;
    }

    /**
     * @param ciqState ciqState
     */
    public void setCiqState(Integer ciqState) {
        this.ciqState = ciqState;
    }

    /**
     * @return ciqReceiptContent
     */
    public String getCiqReceiptContent() {
        return ciqReceiptContent;
    }

    /**
     * @param ciqReceiptContent ciqReceiptContent
     */
    public void setCiqReceiptContent(String ciqReceiptContent) {
        this.ciqReceiptContent = ciqReceiptContent;
    }

    /**
     * @return cusNo
     */
    public String getCusNo() {
        return cusNo;
    }

    /**
     * @param cusNo cusNo
     */
    public void setCusNo(String cusNo) {
        this.cusNo = cusNo;
    }

    /**
     * @return cusState
     */
    public Integer getCusState() {
        return cusState;
    }

    /**
     * @param cusState cusState
     */
    public void setCusState(Integer cusState) {
        this.cusState = cusState;
    }

    /**
     * @return cusReceiptContent
     */
    public String getCusReceiptContent() {
        return cusReceiptContent;
    }

    /**
     * @param cusReceiptContent cusReceiptContent
     */
    public void setCusReceiptContent(String cusReceiptContent) {
        this.cusReceiptContent = cusReceiptContent;
    }

    /**
     * @return cusPreNo
     */
    public String getCusPreNo() {
        return cusPreNo;
    }

    /**
     * @param cusPreNo cusPreNo
     */
    public void setCusPreNo(String cusPreNo) {
        this.cusPreNo = cusPreNo;
    }
}
