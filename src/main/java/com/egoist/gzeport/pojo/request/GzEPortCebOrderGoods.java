package com.egoist.gzeport.pojo.request;

import com.thoughtworks.xstream.annotations.XStreamAlias;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * 订单商品
 */
@XStreamAlias("OrderList")
public class GzEPortCebOrderGoods implements Serializable {

    /**
     * 商品序号
     * 从1开始的递增序号。
     */
    @NotNull(message = "商品序号不能为空")
    @XStreamAlias("gnum")
    private String gnum;

    /**
     * 企业商品货号
     * 电商企业自定义的商品货号（SKU）。
     */
    @XStreamAlias("itemNo")
    private String itemNo;

    /**
     * 企业商品名称
     * 交易平台销售商品的中文名称。
     */
    @NotNull(message = "企业商品名称不能为空")
    @XStreamAlias("itemName")
    private String itemName;

    /**
     * 商品规格型号
     */
    @NotNull(message = "商品规格型号不能为空")
    @XStreamAlias("gmodel")
    private String gmodel;

    /**
     * 企业商品描述
     * 交易平台销售商品的描述信息。
     */
    @XStreamAlias("itemDescribe")
    private String itemDescribe;

    /**
     * 条形码
     * 国际通用的商品条形码，一般由前缀部分、制造厂商代码、商品代码和校验码组成。
     */
    @XStreamAlias("barCode")
    private String barCode;

    /**
     * 单位
     * 填写海关标准的参数代码，参照《JGS-20 海关业务代码集》- 计量单位代码。
     */
    @NotNull(message = "单位不能为空")
    @XStreamAlias("unit")
    private String unit;

    /**
     * 数量
     * 商品实际数量。
     */
    @NotNull(message = "数量不能为空")
    @XStreamAlias("qty")
    private Double qty;

    /**
     * 单价
     * 商品单价。赠品单价填写为“0”.
     */
    @NotNull(message = "单价不能为空")
    @XStreamAlias("price")
    private Double price;


    /**
     * 总价
     * 商品总价，等于单价乘以数量。
     */
    @NotNull(message = "总价不能为空")
    @XStreamAlias("totalPrice")
    private Double totalPrice;

    /**
     * 币制
     * 限定为人民币，填写“142”。
     */
    @NotNull(message = "币制不能为空")
    @XStreamAlias("currency")
    private String currency;

    /**
     * 原产国
     * 填写海关标准的参数代码，参照《JGS-20 海关业务代码集》-国家（地区）代码表。
     */
    @NotNull(message = "原产国不能为空")
    @XStreamAlias("country")
    private String country;

    /**
     * 备注
     * 促销活动，商品单价偏离市场价格的，可以在此说明。
     */
    @XStreamAlias("note")
    private String note;

    /**
     * @return gnum
     */
    public String getGnum() {
        return gnum;
    }

    /**
     * @param gnum gnum
     */
    public void setGnum(String gnum) {
        this.gnum = gnum;
    }

    /**
     * @return itemNo
     */
    public String getItemNo() {
        return itemNo;
    }

    /**
     * @param itemNo itemNo
     */
    public void setItemNo(String itemNo) {
        this.itemNo = itemNo;
    }

    /**
     * @return itemName
     */
    public String getItemName() {
        return itemName;
    }

    /**
     * @param itemName itemName
     */
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    /**
     * @return itemDescribe
     */
    public String getItemDescribe() {
        return itemDescribe;
    }

    /**
     * @param itemDescribe itemDescribe
     */
    public void setItemDescribe(String itemDescribe) {
        this.itemDescribe = itemDescribe;
    }

    /**
     * @return barCode
     */
    public String getBarCode() {
        return barCode;
    }

    /**
     * @param barCode barCode
     */
    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    /**
     * @return unit
     */
    public String getUnit() {
        return unit;
    }

    /**
     * @param unit unit
     */
    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * @return qty
     */
    public Double getQty() {
        return qty;
    }

    /**
     * @param qty qty
     */
    public void setQty(Double qty) {
        this.qty = qty;
    }

    /**
     * @return price
     */
    public Double getPrice() {
        return price;
    }

    /**
     * @param price price
     */
    public void setPrice(Double price) {
        this.price = price;
    }

    /**
     * @return totalPrice
     */
    public Double getTotalPrice() {
        return totalPrice;
    }

    /**
     * @param totalPrice totalPrice
     */
    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
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
     * @return country
     */
    public String getCountry() {
        return country;
    }

    /**
     * @param country country
     */
    public void setCountry(String country) {
        this.country = country;
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
     * @return gmodel
     */
    public String getGmodel() {
        return gmodel;
    }

    /**
     * @param gmodel gmodel
     */
    public void setGmodel(String gmodel) {
        this.gmodel = gmodel;
    }
}
