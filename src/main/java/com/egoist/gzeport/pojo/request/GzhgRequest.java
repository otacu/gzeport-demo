package com.egoist.gzeport.pojo.request;

import com.thoughtworks.xstream.annotations.XStreamAlias;

import javax.validation.constraints.NotNull;

/**
 * 广州海关请求接口
 */
public class GzhgRequest extends Request {


    /**
     * 获取报文头
     */
    @NotNull(message = "电子订单请求头不能为空")
    @XStreamAlias("Head")
    private Head head;

    /**
     * 获取报文头
     */
    @XStreamAlias("MessageType")
    private String messageType;

    /**
     * @return head
     */
    public Head getHead() {
        return head;
    }

    /**
     * @param head head
     */
    public void setHead(Head head) {
        this.head = head;
    }

    /**
     * @return messageType
     */
    public String getMessageType() {
        return messageType;
    }

    /**
     * @param messageType messageType
     */
    public void setMessageType(String messageType) {
        this.messageType = messageType;
    }
}
