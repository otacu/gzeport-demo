package com.egoist.gzeport.pojo.request;

import com.thoughtworks.xstream.annotations.XStreamAlias;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.List;

/**
 * 电子订单详情
 */
public class ElectronicOrderDetail implements Serializable {

    /**
     * 企业电子订单编号,原始交易平台的原始订单编号
     */
    @NotNull(message = "企业电子订单编号不能为空")
    @XStreamAlias("EntOrderNo")
    private String entOrderNo;

    /**
     * 电子订单状态,
     * 0-订单确认
     * 1-订单完成
     * 2-订单取消
     */
    @NotNull(message = "电子订单状态不能为空")
    @XStreamAlias("OrderStatus")
    private String orderStatus;

    /**
     * 支付状态,
     * 0-已付款
     * 1-未付款
     */
    @NotNull(message = "支付状态不能为空")
    @XStreamAlias("PayStatus")
    private String payStatus;

    /**
     * 订单商品总额, 货款金额，商品实际成交价不包括优惠减免
     */
    @NotNull(message = "")
    @XStreamAlias("OrderGoodTotal")
    private Double orderGoodTotal;

    /**
     * 订单商品总额币制，参照币制代码表
     */
    @NotNull(message = "订单商品总额币制不能为空")
    @XStreamAlias("OrderGoodTotalCurr")
    private String orderGoodTotalCurr;

    /**
     * 订单运费，运杂费，无则填“0”
     */
    @NotNull(message = "订单运费不能为空")
    @XStreamAlias("Freight")
    private Double freight;

    /**
     * 税款，按照货款金额计算的税款，无则填“0”
     */
    @NotNull(message = "税款不能为空")
    @XStreamAlias("Tax")
    private Double tax;

    /**
     * 抵付金额,优惠减免金额，无则填“0”
     */
    @NotNull(message = "抵付金额不能为空")
    @XStreamAlias("OtherPayment")
    private Double otherPayment;

    /**
     * 条件字段
     * 抵付说明,抵付情况说明。如果填写抵付金额时，此项必填。
     */
    @XStreamAlias("OtherPayNotes")
    private String otherPayNotes;

    /**
     * 其它费用,无则填“0”
     */
    @XStreamAlias("OtherCharges")
    private Double otherCharges;

    /**
     * 实际支付金额,货款+运费+税款-优惠金额，与支付保持一致（精确到元）
     */
    @NotNull(message = "实际支付金额不能为空")
    @XStreamAlias("ActualAmountPaid")
    private Double actualAmountPaid;


    /**
     * 收货人名称,收货人信息，同运单
     */
    @NotNull(message = "收货人名称不能为空")
    @XStreamAlias("RecipientName")
    private String recipientName;

    /**
     * 收货人地址,收货人信息，同运单
     */
    @NotNull(message = "收货人地址不能为空")
    @XStreamAlias("RecipientAddr")
    private String recipientAddr;

    /**
     * 收货人电话
     */
    @NotNull(message = "收货人电话不能为空")
    @XStreamAlias("RecipientTel")
    private String recipientTel;

    /**
     * 收货人所在国,参照国别代码表
     */
    @NotNull(message = "收货人所在国不能为空")
    @XStreamAlias("RecipientCountry")
    private String recipientCountry;

    /**
     * 收货人行政区代码，进口需要填收货人所在行政区域代码
     * 出口可空
     */
    @NotNull(message = "收货人行政区代码不能为空")
    @XStreamAlias("RecipientProvincesCode")
    private String recipientProvincesCode;

    /**
     * 下单人账户,订购人在交易平台唯一注册号，后续大数据分析使用，一个平台注册号对应一个身份证
     */
    @NotNull(message = "下单人账户不能为空")
    @XStreamAlias("OrderDocAcount")
    private String orderDocAcount;

    /**
     * 下单人姓名，海关监管的对象，需要对个人消费额度和实名认证进行管控
     */
    @NotNull(message = "下单人姓名不能为空")
    @XStreamAlias("OrderDocName")
    private String orderDocName;

    /**
     * 下单人证件类型，购买者证件号码类型。
     * 01:身份证、02:护照、04:其他
     */
    @NotNull(message = "下单人证件类型不能为空")
    @XStreamAlias("OrderDocType")
    private String orderDocType;

    /**
     * 下单人证件号，默认为身份证号
     */
    @NotNull(message = "下单人证件号不能为空")
    @XStreamAlias("OrderDocId")
    private String orderDocId;

    /**
     * 下单人电话,购买者联系电话号码。
     */
    @NotNull(message = "下单人电话不能为空")
    @XStreamAlias("OrderDocTel")
    private String orderDocTel;

    /**
     * 订单日期
     */
    @NotNull(message = "订单日期不能为空")
    @XStreamAlias("OrderDate")
    private String orderDate;

    /**
     * 商品批次号
     */
    @XStreamAlias("BatchNumbers")
    private String batchNumbers;

    /**
     * 发票类型
     */
    @XStreamAlias("InvoiceType")
    private String invoiceType;

    /**
     * 发票编号
     */
    @NotNull(message = "")
    @XStreamAlias("InvoiceNo")
    private String invoiceNo;

    /**
     *
     */
    @NotNull(message = "")
    @XStreamAlias("InvoiceTitle")
    private String invoiceTitle;

    /**
     *
     */
    @NotNull(message = "")
    @XStreamAlias("InvoiceIdentifyID")
    private String invoiceIdentifyID;

    /**
     * 发票内容,多项时取首项或合并填写
     */
    @XStreamAlias("InvoiceDesc")
    private String invoiceDesc;

    /**
     * 发票金额,开票总金额，应与订单实际支付金额一致
     */
    @XStreamAlias("InvoiceAmount")
    private Double invoiceAmount;

    /**
     * 开票日期
     */
    @XStreamAlias("InvoiceDate")
    private String invoiceDate;

    /**
     * 备注
     */
    @XStreamAlias("Notes")
    private String notes;

    /**
     * 订单商品
     */
    @NotNull(message = "订单商品不能为空")
    @XStreamAlias("GoodsList")
    private List<ElectronicOrderGoods> electronicOrderGoodsList;

    /**
     * @return electronicOrderGoodsList
     */
    public List<ElectronicOrderGoods> getElectronicOrderGoodsList() {
        return electronicOrderGoodsList;
    }

    /**
     * @param electronicOrderGoodsList electronicOrderGoodsList
     */
    public void setElectronicOrderGoodsList(List<ElectronicOrderGoods> electronicOrderGoodsList) {
        this.electronicOrderGoodsList = electronicOrderGoodsList;
    }

    /**
     * @return entOrderNo
     */
    public String getEntOrderNo() {
        return entOrderNo;
    }

    /**
     * @param entOrderNo entOrderNo
     */
    public void setEntOrderNo(String entOrderNo) {
        this.entOrderNo = entOrderNo;
    }

    /**
     * @return orderStatus
     */
    public String getOrderStatus() {
        return orderStatus;
    }

    /**
     * @param orderStatus orderStatus
     */
    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    /**
     * @return payStatus
     */
    public String getPayStatus() {
        return payStatus;
    }

    /**
     * @param payStatus payStatus
     */
    public void setPayStatus(String payStatus) {
        this.payStatus = payStatus;
    }

    /**
     * @return orderGoodTotal
     */
    public Double getOrderGoodTotal() {
        return orderGoodTotal;
    }

    /**
     * @param orderGoodTotal orderGoodTotal
     */
    public void setOrderGoodTotal(Double orderGoodTotal) {
        this.orderGoodTotal = orderGoodTotal;
    }

    /**
     * @return orderGoodTotalCurr
     */
    public String getOrderGoodTotalCurr() {
        return orderGoodTotalCurr;
    }

    /**
     * @param orderGoodTotalCurr orderGoodTotalCurr
     */
    public void setOrderGoodTotalCurr(String orderGoodTotalCurr) {
        this.orderGoodTotalCurr = orderGoodTotalCurr;
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
     * @return tax
     */
    public Double getTax() {
        return tax;
    }

    /**
     * @param tax tax
     */
    public void setTax(Double tax) {
        this.tax = tax;
    }

    /**
     * @return otherPayment
     */
    public Double getOtherPayment() {
        return otherPayment;
    }

    /**
     * @param otherPayment otherPayment
     */
    public void setOtherPayment(Double otherPayment) {
        this.otherPayment = otherPayment;
    }

    /**
     * @return otherPayNotes
     */
    public String getOtherPayNotes() {
        return otherPayNotes;
    }

    /**
     * @param otherPayNotes otherPayNotes
     */
    public void setOtherPayNotes(String otherPayNotes) {
        this.otherPayNotes = otherPayNotes;
    }

    /**
     * @return otherCharges
     */
    public Double getOtherCharges() {
        return otherCharges;
    }

    /**
     * @param otherCharges otherCharges
     */
    public void setOtherCharges(Double otherCharges) {
        this.otherCharges = otherCharges;
    }

    /**
     * @return actualAmountPaid
     */
    public Double getActualAmountPaid() {
        return actualAmountPaid;
    }

    /**
     * @param actualAmountPaid actualAmountPaid
     */
    public void setActualAmountPaid(Double actualAmountPaid) {
        this.actualAmountPaid = actualAmountPaid;
    }

    /**
     * @return recipientName
     */
    public String getRecipientName() {
        return recipientName;
    }

    /**
     * @param recipientName recipientName
     */
    public void setRecipientName(String recipientName) {
        this.recipientName = recipientName;
    }

    /**
     * @return recipientAddr
     */
    public String getRecipientAddr() {
        return recipientAddr;
    }

    /**
     * @param recipientAddr recipientAddr
     */
    public void setRecipientAddr(String recipientAddr) {
        this.recipientAddr = recipientAddr;
    }

    /**
     * @return recipientTel
     */
    public String getRecipientTel() {
        return recipientTel;
    }

    /**
     * @param recipientTel recipientTel
     */
    public void setRecipientTel(String recipientTel) {
        this.recipientTel = recipientTel;
    }

    /**
     * @return recipientCountry
     */
    public String getRecipientCountry() {
        return recipientCountry;
    }

    /**
     * @param recipientCountry recipientCountry
     */
    public void setRecipientCountry(String recipientCountry) {
        this.recipientCountry = recipientCountry;
    }

    /**
     * @return recipientProvincesCode
     */
    public String getRecipientProvincesCode() {
        return recipientProvincesCode;
    }

    /**
     * @param recipientProvincesCode recipientProvincesCode
     */
    public void setRecipientProvincesCode(String recipientProvincesCode) {
        this.recipientProvincesCode = recipientProvincesCode;
    }

    /**
     * @return orderDocAcount
     */
    public String getOrderDocAcount() {
        return orderDocAcount;
    }

    /**
     * @param orderDocAcount orderDocAcount
     */
    public void setOrderDocAcount(String orderDocAcount) {
        this.orderDocAcount = orderDocAcount;
    }

    /**
     * @return orderDocName
     */
    public String getOrderDocName() {
        return orderDocName;
    }

    /**
     * @param orderDocName orderDocName
     */
    public void setOrderDocName(String orderDocName) {
        this.orderDocName = orderDocName;
    }

    /**
     * @return orderDocType
     */
    public String getOrderDocType() {
        return orderDocType;
    }

    /**
     * @param orderDocType orderDocType
     */
    public void setOrderDocType(String orderDocType) {
        this.orderDocType = orderDocType;
    }

    /**
     * @return orderDocId
     */
    public String getOrderDocId() {
        return orderDocId;
    }

    /**
     * @param orderDocId orderDocId
     */
    public void setOrderDocId(String orderDocId) {
        this.orderDocId = orderDocId;
    }

    /**
     * @return orderDocTel
     */
    public String getOrderDocTel() {
        return orderDocTel;
    }

    /**
     * @param orderDocTel orderDocTel
     */
    public void setOrderDocTel(String orderDocTel) {
        this.orderDocTel = orderDocTel;
    }

    /**
     * @return orderDate
     */
    public String getOrderDate() {
        return orderDate;
    }

    /**
     * @param orderDate orderDate
     */
    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
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
     * @return invoiceType
     */
    public String getInvoiceType() {
        return invoiceType;
    }

    /**
     * @param invoiceType invoiceType
     */
    public void setInvoiceType(String invoiceType) {
        this.invoiceType = invoiceType;
    }

    /**
     * @return invoiceNo
     */
    public String getInvoiceNo() {
        return invoiceNo;
    }

    /**
     * @param invoiceNo invoiceNo
     */
    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo;
    }

    /**
     * @return invoiceTitle
     */
    public String getInvoiceTitle() {
        return invoiceTitle;
    }

    /**
     * @param invoiceTitle invoiceTitle
     */
    public void setInvoiceTitle(String invoiceTitle) {
        this.invoiceTitle = invoiceTitle;
    }

    /**
     * @return invoiceIdentifyID
     */
    public String getInvoiceIdentifyID() {
        return invoiceIdentifyID;
    }

    /**
     * @param invoiceIdentifyID invoiceIdentifyID
     */
    public void setInvoiceIdentifyID(String invoiceIdentifyID) {
        this.invoiceIdentifyID = invoiceIdentifyID;
    }

    /**
     * @return invoiceDesc
     */
    public String getInvoiceDesc() {
        return invoiceDesc;
    }

    /**
     * @param invoiceDesc invoiceDesc
     */
    public void setInvoiceDesc(String invoiceDesc) {
        this.invoiceDesc = invoiceDesc;
    }

    /**
     * @return invoiceAmount
     */
    public Double getInvoiceAmount() {
        return invoiceAmount;
    }

    /**
     * @param invoiceAmount invoiceAmount
     */
    public void setInvoiceAmount(Double invoiceAmount) {
        this.invoiceAmount = invoiceAmount;
    }

    /**
     * @return invoiceDate
     */
    public String getInvoiceDate() {
        return invoiceDate;
    }

    /**
     * @param invoiceDate invoiceDate
     */
    public void setInvoiceDate(String invoiceDate) {
        this.invoiceDate = invoiceDate;
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
