package com.egoist.gzeport.pojo.request;

import com.thoughtworks.xstream.annotations.XStreamAlias;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * 订单内容
 */
@XStreamAlias("OrderContent")
public class ElectronicOrderContent implements Serializable {

    /**
     * 订单详情
     */
    @NotNull(message = "订单详情不能为空")
    @XStreamAlias("OrderDetail")
    private ElectronicOrderDetail electronicOrderDetail;

    /**
     * 电子订单关联支付表体
     */
    @NotNull(message = "电子订单关联支付表体不能为空")
    @XStreamAlias("OrderPaymentRel")
    private ElectronicOrderPaymentRel electronicOrderPaymentRel;

    /**
     * 电子订单关联运单表体
     */
    @NotNull(message = "电子订单关联运单表体不能为空")
    @XStreamAlias("OrderWaybillRel")
    private ElectronicOrderWaybillRel electronicOrderWaybillRel;

    /**
     * @return electronicOrderDetail
     */
    public ElectronicOrderDetail getElectronicOrderDetail() {
        return electronicOrderDetail;
    }

    /**
     * @param electronicOrderDetail electronicOrderDetail
     */
    public void setElectronicOrderDetail(ElectronicOrderDetail electronicOrderDetail) {
        this.electronicOrderDetail = electronicOrderDetail;
    }

    /**
     * @return electronicOrderPaymentRel
     */
    public ElectronicOrderPaymentRel getElectronicOrderPaymentRel() {
        return electronicOrderPaymentRel;
    }

    /**
     * @param electronicOrderPaymentRel electronicOrderPaymentRel
     */
    public void setElectronicOrderPaymentRel(ElectronicOrderPaymentRel electronicOrderPaymentRel) {
        this.electronicOrderPaymentRel = electronicOrderPaymentRel;
    }

    /**
     * @return electronicOrderWaybillRel
     */
    public ElectronicOrderWaybillRel getElectronicOrderWaybillRel() {
        return electronicOrderWaybillRel;
    }

    /**
     * @param electronicOrderWaybillRel electronicOrderWaybillRel
     */
    public void setElectronicOrderWaybillRel(ElectronicOrderWaybillRel electronicOrderWaybillRel) {
        this.electronicOrderWaybillRel = electronicOrderWaybillRel;
    }
}
