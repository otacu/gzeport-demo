package com.egoist.gzeport.pojo.request;

import com.thoughtworks.xstream.annotations.XStreamAlias;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * 电子订单关联运单表体
 */
public class ElectronicOrderWaybillRel implements Serializable {

    /**
     * 物流企业代码， 申报企业的单一窗口企业注册编号
     */
    @NotNull(message = "物流企业代码不能为空")
    @XStreamAlias("EHSEntNo")
    private String eHSEntNo;

    /**
     * 申报企业名称c
     */
    @NotNull(message = "申报企业名称不能为空")
    @XStreamAlias("EHSEntName")
    private String eHSEntName;

    /**
     * 电子运单编号
     */
    @NotNull(message = "电子运单编号不能为空")
    @XStreamAlias("WaybillNo")
    private String waybillNo;

    /**
     * 备注
     */
    @XStreamAlias("Notes")
    private String notes;

    /**
     * @return eHSEntNo
     */
    public String geteHSEntNo() {
        return eHSEntNo;
    }

    /**
     * @param eHSEntNo eHSEntNo
     */
    public void seteHSEntNo(String eHSEntNo) {
        this.eHSEntNo = eHSEntNo;
    }

    /**
     * @return eHSEntName
     */
    public String geteHSEntName() {
        return eHSEntName;
    }

    /**
     * @param eHSEntName eHSEntName
     */
    public void seteHSEntName(String eHSEntName) {
        this.eHSEntName = eHSEntName;
    }

    /**
     * @return waybillNo
     */
    public String getWaybillNo() {
        return waybillNo;
    }

    /**
     * @param waybillNo waybillNo
     */
    public void setWaybillNo(String waybillNo) {
        this.waybillNo = waybillNo;
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
