package com.egoist.gzeport.pojo.request;

import com.egoist.gzeport.common.constant.GzEPortConstants;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

import javax.validation.constraints.NotNull;

/**
 * 电子订单报文头
 */
@XStreamAlias("InternationalTrade")
public class ElectronicOrderRequest extends GzhgRequest {

    /**
     * xmlns
     */
    @XStreamAsAttribute
    @XStreamAlias("xmlns:xsi")
    private String xmlns = GzEPortConstants.XMLNS_XSI;

    /**
     * 报文体
     */
    @NotNull(message = "报文体不能为空")
    @XStreamAlias("Declaration")
    private ElectronicOrderDeclaration declaration;


    /**
     * @return xmlns
     */
    public String getXmlns() {
        return xmlns;
    }

    /**
     * @param xmlns xmlns
     */
    public void setXmlns(String xmlns) {
        this.xmlns = xmlns;
    }

    /**
     * @return declaration
     */
    public ElectronicOrderDeclaration getDeclaration() {
        return declaration;
    }

    /**
     * @param declaration declaration
     */
    public void setDeclaration(ElectronicOrderDeclaration declaration) {
        this.declaration = declaration;
    }
}
