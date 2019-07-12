package com.egoist.gzeport.pojo.request;

import com.thoughtworks.xstream.annotations.XStreamAlias;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * 基本参数
 */
public class GzEPortCebBaseTransfer implements Serializable {

    /**
     * 传输企业代码
     * 报文传输的企业代码（需要与接入客户端的企业身份一致）
     */
    @NotNull(message = "传输企业代码不能为空")
    @XStreamAlias("copCode")
    private String copCode;

    /**
     * 传输企业名称
     * 报文传输的企业名称
     */
    @NotNull(message = "传输企业名称不能为空")
    @XStreamAlias("copName")
    private String copName;


    /**
     * 报文传输模式
     * 默认为DXP；指中国电子口岸数据交换平台
     */
    @NotNull(message = "报文传输模式不能为空")
    @XStreamAlias("dxpMode")
    private String dxpMode;

    /**
     * 报文传输编号
     * 向中国电子口岸数据中心申请数据交换平台的用户编号
     */
    @NotNull(message = "报文传输编号不能为空")
    @XStreamAlias("dxpId")
    private String dxpId;

    /**
     * 备注
     */
    @XStreamAlias("note")
    private String note;

    /**
     * @return copCode
     */
    public String getCopCode() {
        return copCode;
    }

    /**
     * @param copCode copCode
     */
    public void setCopCode(String copCode) {
        this.copCode = copCode;
    }

    /**
     * @return copName
     */
    public String getCopName() {
        return copName;
    }

    /**
     * @param copName copName
     */
    public void setCopName(String copName) {
        this.copName = copName;
    }

    /**
     * @return dxpMode
     */
    public String getDxpMode() {
        return dxpMode;
    }

    /**
     * @param dxpMode dxpMode
     */
    public void setDxpMode(String dxpMode) {
        this.dxpMode = dxpMode;
    }

    /**
     * @return dxpId
     */
    public String getDxpId() {
        return dxpId;
    }

    /**
     * @param dxpId dxpId
     */
    public void setDxpId(String dxpId) {
        this.dxpId = dxpId;
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
}
