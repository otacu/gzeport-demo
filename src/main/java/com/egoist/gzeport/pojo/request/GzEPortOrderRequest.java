package com.egoist.gzeport.pojo.request;

import com.egoist.gzeport.common.constant.GzEPortConstants;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

/**
 * 申报订单请求
 */
@XStreamAlias("CEB311Message")
public class GzEPortOrderRequest extends Request {

    /**
     * xmlns
     */
    @XStreamAsAttribute
    @XStreamAlias("xmlns")
    private String xmlnsCeb = GzEPortConstants.XMLNS_CEB;

    /**
     * xmlns:xsi
     */
    @XStreamAsAttribute
    @XStreamAlias("xmlns:xsi")
    private String xmlnsXsi = GzEPortConstants.XMLNS_XSI;

    /**
     * guid
     */
    @XStreamAsAttribute
    @XStreamAlias("guid")
    private String guid;

    /**
     * version
     */
    @XStreamAsAttribute
    @XStreamAlias("version")
    private String version = GzEPortConstants.VERSION;

    /**
     * 基础报文传输实体节点
     */
    @XStreamAlias("Order")
    private GzEPortCebOrder cebOrder;

    /**
     * 基础报文传输实体节点
     */
    @XStreamAlias("BaseTransfer")
    private GzEPortCebBaseTransfer cebOrderBaseTransfer;


    /**
     * @return xmlnsXsi
     */
    public String getXmlnsXsi() {
        return xmlnsXsi;
    }

    /**
     * @return xmlnsCeb
     */
    public String getXmlnsCeb() {
        return xmlnsCeb;
    }

    /**
     * @return version
     */
    public String getVersion() {
        return version;
    }

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
     * @param xmlnsXsi xmlnsXsi
     */
    public void setXmlnsXsi(String xmlnsXsi) {
        this.xmlnsXsi = xmlnsXsi;
    }

    /**
     * @param xmlnsCeb xmlnsCeb
     */
    public void setXmlnsCeb(String xmlnsCeb) {
        this.xmlnsCeb = xmlnsCeb;
    }

    /**
     * @param version version
     */
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * @return cebOrder
     */
    public GzEPortCebOrder getCebOrder() {
        return cebOrder;
    }

    /**
     * @param cebOrder cebOrder
     */
    public void setCebOrder(GzEPortCebOrder cebOrder) {
        this.cebOrder = cebOrder;
    }

    /**
     * @return cebOrderBaseTransfer
     */
    public GzEPortCebBaseTransfer getCebOrderBaseTransfer() {
        return cebOrderBaseTransfer;
    }

    /**
     * @param cebOrderBaseTransfer cebOrderBaseTransfer
     */
    public void setCebOrderBaseTransfer(GzEPortCebBaseTransfer cebOrderBaseTransfer) {
        this.cebOrderBaseTransfer = cebOrderBaseTransfer;
    }
}
