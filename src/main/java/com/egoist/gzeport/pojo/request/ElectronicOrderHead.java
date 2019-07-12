package com.egoist.gzeport.pojo.request;

import com.thoughtworks.xstream.annotations.XStreamAlias;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * 电子订单请求头
 */
public class ElectronicOrderHead implements Serializable {
    /**
     * 申报企业编号，申报企业单一窗口企业注册编号
     */
    @NotNull(message = "申报企业编号不能为空")
    @XStreamAlias("DeclEntNo")
    private String declEntNo;

    /**
     * 申报企业名称，
     */
    @NotNull(message = "申报企业名称不能为空")
    @XStreamAlias("DeclEntName")
    private String declEntName;

    /**
     * 电商企业编号， 电商企业单一窗口企业注册编号
     */
    @NotNull(message = "电商企业编号不能为空")
    @XStreamAlias("EBEntNo")
    private String eBEntNo;

    /**
     * 电商企业名称
     */
    @NotNull(message = "电商企业名称")
    @XStreamAlias("EBEntName")
    private String eBEntName;

    /**
     * 电商平台企业编号，电商平台单一窗口企业注册编号
     */
    @NotNull(message = "电商平台企业编号不能为空")
    @XStreamAlias("EBPEntNo")
    private String eBPEntNo;

    /**
     * 电商平台企业名称，电商平台的海关备案名称
     */
    @XStreamAlias("EBPEntName")
    private String eBPEntName;

    /**
     * 电商平台互联网域名,电商平台的互联网域名。以海关发布的对接电商平台域名列表为准。
     */
    @NotNull(message = "电商平台互联网域名不能为空")
    @XStreamAlias("InternetDomainName")
    private String internetDomainName;

    /**
     * 申报时间
     */
    @NotNull(message = "申报时间不能为空")
    @XStreamAlias("DeclTime")
    private String declTime;

    /**
     * 操作方式，A-新增；M-变更；D-删除
     */
    @NotNull(message = "操作方式不能为空")
    @XStreamAlias("OpType")
    private String opType;

    /**
     * 进出口标示，电商平台的订单类型 I-进口商品订单；E-出口商品订单
     */
    @NotNull(message = "进出口标示不能为空")
    @XStreamAlias("IeFlag")
    private String ieFlag;

    /**
     * 主管海关代码，参考海关代码
     */
    @NotNull(message = "主管海关代码不能为空")
    @XStreamAlias("CustomsCode")
    private String customsCode;

    /**
     * 检验检疫机构代码,参考检验检疫机构代码
     */
    @NotNull(message = "检验检疫机构代码不能为空")
    @XStreamAlias("CIQOrgCode")
    private String cIQOrgCode;

    /**
     * @return declEntNo
     */
    public String getDeclEntNo() {
        return declEntNo;
    }

    /**
     * @param declEntNo declEntNo
     */
    public void setDeclEntNo(String declEntNo) {
        this.declEntNo = declEntNo;
    }

    /**
     * @return declEntName
     */
    public String getDeclEntName() {
        return declEntName;
    }

    /**
     * @param declEntName declEntName
     */
    public void setDeclEntName(String declEntName) {
        this.declEntName = declEntName;
    }

    /**
     * @return eBEntNo
     */
    public String geteBEntNo() {
        return eBEntNo;
    }

    /**
     * @param eBEntNo eBEntNo
     */
    public void seteBEntNo(String eBEntNo) {
        this.eBEntNo = eBEntNo;
    }

    /**
     * @return eBEntName
     */
    public String geteBEntName() {
        return eBEntName;
    }

    /**
     * @param eBEntName eBEntName
     */
    public void seteBEntName(String eBEntName) {
        this.eBEntName = eBEntName;
    }

    /**
     * @return eBPEntNo
     */
    public String geteBPEntNo() {
        return eBPEntNo;
    }

    /**
     * @param eBPEntNo eBPEntNo
     */
    public void seteBPEntNo(String eBPEntNo) {
        this.eBPEntNo = eBPEntNo;
    }

    /**
     * @return eBPEntName
     */
    public String geteBPEntName() {
        return eBPEntName;
    }

    /**
     * @param eBPEntName eBPEntName
     */
    public void seteBPEntName(String eBPEntName) {
        this.eBPEntName = eBPEntName;
    }

    /**
     * @return internetDomainName
     */
    public String getInternetDomainName() {
        return internetDomainName;
    }

    /**
     * @param internetDomainName internetDomainName
     */
    public void setInternetDomainName(String internetDomainName) {
        this.internetDomainName = internetDomainName;
    }

    /**
     * @return declTime
     */
    public String getDeclTime() {
        return declTime;
    }

    /**
     * @param declTime declTime
     */
    public void setDeclTime(String declTime) {
        this.declTime = declTime;
    }

    /**
     * @return opType
     */
    public String getOpType() {
        return opType;
    }

    /**
     * @param opType opType
     */
    public void setOpType(String opType) {
        this.opType = opType;
    }

    /**
     * @return ieFlag
     */
    public String getIeFlag() {
        return ieFlag;
    }

    /**
     * @param ieFlag ieFlag
     */
    public void setIeFlag(String ieFlag) {
        this.ieFlag = ieFlag;
    }

    /**
     * @return customsCode
     */
    public String getCustomsCode() {
        return customsCode;
    }

    /**
     * @param customsCode customsCode
     */
    public void setCustomsCode(String customsCode) {
        this.customsCode = customsCode;
    }

    /**
     * @return cIQOrgCode
     */
    public String getcIQOrgCode() {
        return cIQOrgCode;
    }

    /**
     * @param cIQOrgCode cIQOrgCode
     */
    public void setcIQOrgCode(String cIQOrgCode) {
        this.cIQOrgCode = cIQOrgCode;
    }
}
