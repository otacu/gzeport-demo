package com.egoist.gzeport.pojo.request;

import com.thoughtworks.xstream.annotations.XStreamAlias;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * 订单头
 */
public class GzEPortCebOrderHead implements Serializable {

    /**
     * 系统唯一序号
     * 企业系统生成36位唯一序号（英文字母大写）。
     */
    @NotNull(message = "系统唯一序号不能为空")
    @XStreamAlias("guid")
    private String guid;

    /**
     * 报送类型
     * 企业报送类型。1-新增 2-变更 3-删除。默认为1。
     */
    @NotNull(message = "报送类型不能为空")
    @XStreamAlias("appType")
    private String appType;

    /**
     * 报送时间
     * 企业报送时间。格式:YYYYMMDDhhmmss。
     */
    @NotNull(message = "报送时间不能为空")
    @XStreamAlias("appTime")
    private String appTime;

    /**
     * 业务状态
     * 业务状态:1-暂存,2-申报,默认为2。
     */
    @NotNull(message = "业务状态不能为空")
    @XStreamAlias("appStatus")
    private String appStatus;

    /**
     * 订单类型
     * 电子订单类型：I进口
     */
    @NotNull(message = "订单类型不能为空")
    @XStreamAlias("orderType")
    private String orderType;


    /**
     * 订单编号
     * 交易平台的订单编号，同一交易平台的订单编号应唯一。订单编号长度不能超过60位。
     */
    @NotNull(message = "订单编号不能为空")
    @XStreamAlias("orderNo")
    private String orderNo;

    /**
     * 电商平台代码
     * 电商平台的海关注册登记编号；电商平台未在海关注册登记，由电商企业发送订单的，以中国电子口岸发布的电商平台标识编号为准。
     */
    @NotNull(message = "电商平台代码不能为空")
    @XStreamAlias("ebpCode")
    private String ebpCode;

    /**
     * 电商平台名称
     * 电商平台的海关注册登记名称；电商平台未在海关注册登记，由电商企业发送订单的，以中国电子口岸发布的电商平台名称为准。
     */
    @NotNull(message = "电商平台名称不能为空")
    @XStreamAlias("ebpName")
    private String ebpName;

    /**
     * 电商企业代码
     * 电商企业的海关注册登记编号。
     */
    @NotNull(message = "电商企业代码不能为空")
    @XStreamAlias("ebcCode")
    private String ebcCode;

    /**
     * 电商企业名称
     * 电商企业的海关注册登记名称。
     */
    @NotNull(message = "电商企业名称不能为空")
    @XStreamAlias("ebcName")
    private String ebcName;

    /**
     * 商品价格
     * 商品实际成交价，含非现金抵扣金额。
     */
    @NotNull(message = "商品价格不能为空")
    @XStreamAlias("goodsValue")
    private Double goodsValue;

    /**
     * 运杂费
     * 不包含在商品价格中的运杂费，无则填写"0"。
     */
    @NotNull(message = "运杂费不能为空")
    @XStreamAlias("freight")
    private Double freight;

    /**
     * 非现金抵扣金额
     * 使用积分、虚拟货币、代金券等非现金支付金额，无则填写"0"。
     */
    @NotNull(message = "非现金抵扣金额不能为空")
    @XStreamAlias("discount")
    private Double discount;

    /**
     * 代扣税款
     * 企业预先代扣的税款金额，无则填写“0”
     */
    @NotNull(message = "代扣税款不能为空")
    @XStreamAlias("taxTotal")
    private Double taxTotal;

    /**
     * 实际支付金额
     * 商品价格+运杂费+代扣税款-非现金抵扣金额，与支付凭证的支付金额一致。
     */
    @NotNull(message = "实际支付金额不能为空")
    @XStreamAlias("acturalPaid")
    private Double acturalPaid;

    /**
     * 币制
     * 限定为人民币，填写“142”。
     */
    @NotNull(message = "币制不能为空")
    @XStreamAlias("currency")
    private String currency;

    /**
     * 订购人注册号
     * 订购人的交易平台注册号。
     */
    @NotNull(message = "订购人注册号不能为空")
    @XStreamAlias("buyerRegNo")
    private String buyerRegNo;

    /**
     * 订购人姓名
     * 订购人的真实姓名。
     */
    @NotNull(message = "系统唯一序号不能为空")
    @XStreamAlias("buyerName")
    private String buyerName;

    /**
     * 订购人电话
     */
    @NotNull(message = "订购人电话不能为空")
    @XStreamAlias("buyerTelephone")
    private String buyerTelephone;

    /**
     * 订购人证件类型
     * 1-身份证,2-其它。限定为身份证，填写“1”。
     */
    @NotNull(message = "订购人证件类型不能为空")
    @XStreamAlias("buyerIdType")
    private String buyerIdType;

    /**
     * 订购人证件号码
     * 订购人的身份证件号码。
     */
    @NotNull(message = "订购人证件号码不能为空")
    @XStreamAlias("buyerIdNumber")
    private String buyerIdNumber;

    /**
     * 支付企业代码
     * 支付企业的海关注册登记编号。
     */
    @XStreamAlias("payCode")
    private String payCode;


    /**
     * 支付企业名称
     * 支付企业在海关注册登记的企业名称。
     */
    @XStreamAlias("payName")
    private String payName;

    /**
     * 支付交易编号
     * 支付企业唯一的支付流水号。
     */
    @XStreamAlias("payTransactionId")
    private String payTransactionId;


    /**
     * 商品批次号
     * 商品批次号。
     */
    @XStreamAlias("batchNumbers")
    private String batchNumbers;


    /**
     * 收货人姓名
     * 收货人姓名，必须与电子运单的收货人姓名一致。
     */
    @NotNull(message = "收货人姓名不能为空")
    @XStreamAlias("consignee")
    private String consignee;

    /**
     * 收货人电话
     * 收货人联系电话，必须与电子运单的收货人电话一致。
     */
    @NotNull(message = "收货人电话不能为空")
    @XStreamAlias("consigneeTelephone")
    private String consigneeTelephone;

    /**
     * 收货地址
     * 收货地址，必须与电子运单的收货地址一致。
     */
    @NotNull(message = "收货地址不能为空")
    @XStreamAlias("consigneeAddress")
    private String consigneeAddress;

    /**
     * 收货地址行政区划代码
     * 参照国家统计局公布的国家行政区划标准填制。
     */
    @NotNull(message = "收货地址行政区划代码不能为空")
    @XStreamAlias("consigneeDistrict")
    private String consigneeDistrict;

    /**
     * 备注
     */
    @XStreamAlias("note")
    private String note;


    /**
     * @return guid
     */
    public String getGuid() {
        return guid;
    }

    /**
     * @param guid guid
     */
    public void setGuid(String guid) {
        this.guid = guid;
    }

    /**
     * @return appType
     */
    public String getAppType() {
        return appType;
    }

    /**
     * @param appType appType
     */
    public void setAppType(String appType) {
        this.appType = appType;
    }

    /**
     * @return appTime
     */
    public String getAppTime() {
        return appTime;
    }

    /**
     * @param appTime appTime
     */
    public void setAppTime(String appTime) {
        this.appTime = appTime;
    }

    /**
     * @return appStatus
     */
    public String getAppStatus() {
        return appStatus;
    }

    /**
     * @param appStatus appStatus
     */
    public void setAppStatus(String appStatus) {
        this.appStatus = appStatus;
    }

    /**
     * @return orderType
     */
    public String getOrderType() {
        return orderType;
    }

    /**
     * @param orderType orderType
     */
    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

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
     * @return ebpCode
     */
    public String getEbpCode() {
        return ebpCode;
    }

    /**
     * @param ebpCode ebpCode
     */
    public void setEbpCode(String ebpCode) {
        this.ebpCode = ebpCode;
    }

    /**
     * @return ebpName
     */
    public String getEbpName() {
        return ebpName;
    }

    /**
     * @param ebpName ebpName
     */
    public void setEbpName(String ebpName) {
        this.ebpName = ebpName;
    }

    /**
     * @return ebcCode
     */
    public String getEbcCode() {
        return ebcCode;
    }

    /**
     * @param ebcCode ebcCode
     */
    public void setEbcCode(String ebcCode) {
        this.ebcCode = ebcCode;
    }

    /**
     * @return ebcName
     */
    public String getEbcName() {
        return ebcName;
    }

    /**
     * @param ebcName ebcName
     */
    public void setEbcName(String ebcName) {
        this.ebcName = ebcName;
    }

    /**
     * @return goodsValue
     */
    public Double getGoodsValue() {
        return goodsValue;
    }

    /**
     * @param goodsValue goodsValue
     */
    public void setGoodsValue(Double goodsValue) {
        this.goodsValue = goodsValue;
    }

    /**
     * @return freight
     */
    public Double getFreight() {
        return freight;
    }

    /**
     * @param freight freight
     */
    public void setFreight(Double freight) {
        this.freight = freight;
    }

    /**
     * @return discount
     */
    public Double getDiscount() {
        return discount;
    }

    /**
     * @param discount discount
     */
    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    /**
     * @return taxTotal
     */
    public Double getTaxTotal() {
        return taxTotal;
    }

    /**
     * @param taxTotal taxTotal
     */
    public void setTaxTotal(Double taxTotal) {
        this.taxTotal = taxTotal;
    }

    /**
     * @return acturalPaid
     */
    public Double getActuralPaid() {
        return acturalPaid;
    }

    /**
     * @param acturalPaid acturalPaid
     */
    public void setActuralPaid(Double acturalPaid) {
        this.acturalPaid = acturalPaid;
    }

    /**
     * @return currency
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * @param currency currency
     */
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     * @return buyerRegNo
     */
    public String getBuyerRegNo() {
        return buyerRegNo;
    }

    /**
     * @param buyerRegNo buyerRegNo
     */
    public void setBuyerRegNo(String buyerRegNo) {
        this.buyerRegNo = buyerRegNo;
    }

    /**
     * @return buyerName
     */
    public String getBuyerName() {
        return buyerName;
    }

    /**
     * @param buyerName buyerName
     */
    public void setBuyerName(String buyerName) {
        this.buyerName = buyerName;
    }

    /**
     * @return buyerIdType
     */
    public String getBuyerIdType() {
        return buyerIdType;
    }

    /**
     * @param buyerIdType buyerIdType
     */
    public void setBuyerIdType(String buyerIdType) {
        this.buyerIdType = buyerIdType;
    }

    /**
     * @return buyerIdNumber
     */
    public String getBuyerIdNumber() {
        return buyerIdNumber;
    }

    /**
     * @param buyerIdNumber buyerIdNumber
     */
    public void setBuyerIdNumber(String buyerIdNumber) {
        this.buyerIdNumber = buyerIdNumber;
    }

    /**
     * @return payCode
     */
    public String getPayCode() {
        return payCode;
    }

    /**
     * @param payCode payCode
     */
    public void setPayCode(String payCode) {
        this.payCode = payCode;
    }

    /**
     * @return payName
     */
    public String getPayName() {
        return payName;
    }

    /**
     * @param payName payName
     */
    public void setPayName(String payName) {
        this.payName = payName;
    }

    /**
     * @return payTransactionId
     */
    public String getPayTransactionId() {
        return payTransactionId;
    }

    /**
     * @param payTransactionId payTransactionId
     */
    public void setPayTransactionId(String payTransactionId) {
        this.payTransactionId = payTransactionId;
    }

    /**
     * @return batchNumbers
     */
    public String getBatchNumbers() {
        return batchNumbers;
    }

    /**
     * @param batchNumbers batchNumbers
     */
    public void setBatchNumbers(String batchNumbers) {
        this.batchNumbers = batchNumbers;
    }

    /**
     * @return consignee
     */
    public String getConsignee() {
        return consignee;
    }

    /**
     * @param consignee consignee
     */
    public void setConsignee(String consignee) {
        this.consignee = consignee;
    }

    /**
     * @return consigneeTelephone
     */
    public String getConsigneeTelephone() {
        return consigneeTelephone;
    }

    /**
     * @param consigneeTelephone consigneeTelephone
     */
    public void setConsigneeTelephone(String consigneeTelephone) {
        this.consigneeTelephone = consigneeTelephone;
    }

    /**
     * @return consigneeAddress
     */
    public String getConsigneeAddress() {
        return consigneeAddress;
    }

    /**
     * @param consigneeAddress consigneeAddress
     */
    public void setConsigneeAddress(String consigneeAddress) {
        this.consigneeAddress = consigneeAddress;
    }

    /**
     * @return consigneeDistrict
     */
    public String getConsigneeDistrict() {
        return consigneeDistrict;
    }

    /**
     * @param consigneeDistrict consigneeDistrict
     */
    public void setConsigneeDistrict(String consigneeDistrict) {
        this.consigneeDistrict = consigneeDistrict;
    }

    /**
     * @return note
     */
    public String getNote() {
        return note;
    }

    /**
     * @param note note
     */
    public void setNote(String note) {
        this.note = note;
    }

    /**
     * @return buyerTelephone
     */
    public String getBuyerTelephone() {
        return buyerTelephone;
    }

    /**
     * @param buyerTelephone buyerTelephone
     */
    public void setBuyerTelephone(String buyerTelephone) {
        this.buyerTelephone = buyerTelephone;
    }
}
