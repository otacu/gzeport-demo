package com.egoist.gzeport.pojo.request;

import com.thoughtworks.xstream.annotations.XStreamAlias;

import javax.validation.constraints.NotNull;

/**
 * 广州海关http接口报文体
 */
@XStreamAlias("GzeportTransfer")
public class GzEPortRequest extends Request {

    /**
     * 报文头
     */
    @NotNull(message = "报文头不能为空")
    @XStreamAlias("Head")
    private GzEPortHead head;

    /**
     * 报文密文
     */
    @NotNull(message = "报文密文不能为空")
    @XStreamAlias("Data")
    private String data;

    /**
     * @return head
     */
    public GzEPortHead getHead() {
        return head;
    }

    /**
     * @param head head
     */
    public void setHead(GzEPortHead head) {
        this.head = head;
    }

    /**
     * @return data
     */
    public String getData() {
        return data;
    }

    /**
     * @param data data
     */
    public void setData(String data) {
        this.data = data;
    }
}
