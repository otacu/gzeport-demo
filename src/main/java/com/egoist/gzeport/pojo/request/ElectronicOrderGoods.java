package com.egoist.gzeport.pojo.request;

import com.thoughtworks.xstream.annotations.XStreamAlias;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * 电子订单商品信息
 */
@XStreamAlias("OrderGoodsList")
public class ElectronicOrderGoods implements Serializable {

    /**
     * 商品序号
     */
    @NotNull(message = "商品序号不能为空")
    @XStreamAlias("Seq")
    private int seq;

    /**
     * 企业商品自编号，电商平台自定义的商品货号（SKU）
     */
    @NotNull(message = "企业商品自编号不能为空")
    @XStreamAlias("EntGoodsNo")
    private String entGoodsNo;

    /**
     * 检验检疫商品备案编号
     */
    @NotNull(message = "检验检疫商品备案编号不能为空")
    @XStreamAlias("CIQGoodsNo")
    private String cIQGoodsNo;

    /**
     * 海关正式备案编号
     */
    @NotNull(message = "海关正式备案编号不能为空")
    @XStreamAlias("CusGoodsNo")
    private String cusGoodsNo;

    /**
     * HS编码，海关商品分类编号
     */
    @NotNull(message = "HS编码不能为空")
    @XStreamAlias("HSCode")
    private String hSCode;

    /**
     * 企业商品品名，电商平台上架的商品名称
     */
    @NotNull(message = "企业商品品名不能为空")
    @XStreamAlias("GoodsName")
    private String goodsName;

    /**
     * 规格型号
     */
    @NotNull(message = "规格型号不能为空")
    @XStreamAlias("GoodsStyle")
    private String goodsStyle;

    /**
     * 企业商品描述，电商平台上架的商品描述宣传信息
     */
    @XStreamAlias("GoodsDescribe")
    private String goodsDescribe;

    /**
     * 原产国，国家代码
     */
    @NotNull(message = "原产国不能为空")
    @XStreamAlias("OriginCountry")
    private String originCountry;

    /**
     * 商品条形码，商品条形码一般由前缀部分、制造厂商代码、商品代码和校验码组成。
     */
    @XStreamAlias("BarCode")
    private String barCode;


    /**
     * 品牌
     */
    @XStreamAlias("Brand")
    private String brand;

    /**
     * 数量
     */
    @NotNull(message = "数量不能为空")
    @XStreamAlias("Qty")
    private Double qty;

    /**
     * 计量单位, 海关标准的参数代码 海关标准的参数代码 《JGS-20 海关业务代码集》- 计量单位代码
     */
    @NotNull(message = "计量单位不能为空")
    @XStreamAlias("Unit")
    private String unit;

    /**
     * 单价
     */
    @NotNull(message = "单价不能为空")
    @XStreamAlias("Price")
    private Double price;

    /**
     * 总价，该商品的合计费用，不包含运费
     */
    @NotNull(message = "总价不能为空")
    @XStreamAlias("Total")
    private Double total;

    /**
     * 币制 ：海关标准的参数代码 海关标准的参数代码 《JGS-20 海关业务代码集》- 货币代码
     */
    @NotNull(message = "币制不能为空")
    @XStreamAlias("CurrCode")
    private String currCode;

    /**
     * 备注
     */
    @XStreamAlias("Notes")
    private String notes;


    /**
     * @return seq
     */
    public int getSeq() {
        return seq;
    }

    /**
     * @param seq seq
     */
    public void setSeq(int seq) {
        this.seq = seq;
    }

    /**
     * @return entGoodsNo
     */
    public String getEntGoodsNo() {
        return entGoodsNo;
    }

    /**
     * @param entGoodsNo entGoodsNo
     */
    public void setEntGoodsNo(String entGoodsNo) {
        this.entGoodsNo = entGoodsNo;
    }

    /**
     * @return cIQGoodsNo
     */
    public String getcIQGoodsNo() {
        return cIQGoodsNo;
    }

    /**
     * @param cIQGoodsNo cIQGoodsNo
     */
    public void setcIQGoodsNo(String cIQGoodsNo) {
        this.cIQGoodsNo = cIQGoodsNo;
    }

    /**
     * @return cusGoodsNo
     */
    public String getCusGoodsNo() {
        return cusGoodsNo;
    }

    /**
     * @param cusGoodsNo cusGoodsNo
     */
    public void setCusGoodsNo(String cusGoodsNo) {
        this.cusGoodsNo = cusGoodsNo;
    }

    /**
     * @return hSCode
     */
    public String gethSCode() {
        return hSCode;
    }

    /**
     * @param hSCode hSCode
     */
    public void sethSCode(String hSCode) {
        this.hSCode = hSCode;
    }

    /**
     * @return goodsName
     */
    public String getGoodsName() {
        return goodsName;
    }

    /**
     * @param goodsName goodsName
     */
    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    /**
     * @return goodsStyle
     */
    public String getGoodsStyle() {
        return goodsStyle;
    }

    /**
     * @param goodsStyle goodsStyle
     */
    public void setGoodsStyle(String goodsStyle) {
        this.goodsStyle = goodsStyle;
    }

    /**
     * @return goodsDescribe
     */
    public String getGoodsDescribe() {
        return goodsDescribe;
    }

    /**
     * @param goodsDescribe goodsDescribe
     */
    public void setGoodsDescribe(String goodsDescribe) {
        this.goodsDescribe = goodsDescribe;
    }

    /**
     * @return originCountry
     */
    public String getOriginCountry() {
        return originCountry;
    }

    /**
     * @param originCountry originCountry
     */
    public void setOriginCountry(String originCountry) {
        this.originCountry = originCountry;
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
     * @return brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * @param brand brand
     */
    public void setBrand(String brand) {
        this.brand = brand;
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
     * @return total
     */
    public Double getTotal() {
        return total;
    }

    /**
     * @param total total
     */
    public void setTotal(Double total) {
        this.total = total;
    }

    /**
     * @return currCode
     */
    public String getCurrCode() {
        return currCode;
    }

    /**
     * @param currCode currCode
     */
    public void setCurrCode(String currCode) {
        this.currCode = currCode;
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
