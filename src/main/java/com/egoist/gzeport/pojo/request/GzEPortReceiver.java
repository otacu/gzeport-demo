package com.egoist.gzeport.pojo.request;

import com.thoughtworks.xstream.annotations.XStreamAlias;

import java.io.Serializable;

/**
 * 报文接收者
 */
@XStreamAlias("Receivers")
public class GzEPortReceiver implements Serializable {
    /**
     * ReceiverName
     */
    @XStreamAlias("Receiver")
    private String receiver;

    /**
     * @return Receiver
     */
    public String getReceive() {
        return receiver;
    }

    /**
     * @param receiver Receiver
     */
    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }
}
