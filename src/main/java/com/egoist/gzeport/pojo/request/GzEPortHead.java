package com.egoist.gzeport.pojo.request;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.List;

/**
 * 报文头
 */
public class GzEPortHead implements Serializable {

    /**
     * 报文编号
     * 报文唯一编号，建议与报文名相同
     */
    @NotNull(message = "报文编号不能为空")
    @XStreamAlias("MessageID")
    private String messageID;

    /**
     * 报文类型
     * 参见报文类型说明
     */
    @NotNull(message = "报文类型不能为空")
    @XStreamAlias("MessageType")
    private String messageType;

    /**
     * 报文发送者标识
     * 广州电子口岸数据交换企业编号。
     */
    @NotNull(message = "报文发送者不能为空")
    @XStreamAlias("Sender")
    private String sender;

    /**
     * 报文接收人标识
     */
    @NotNull(message = "报文接收者不能为空")
    @XStreamImplicit
    private List<GzEPortReceiver> receiverList;

    /**
     * 发送时间
     * 报文生成的系统时间 YYYYMMDDHHMMSS
     */
    @NotNull(message = "发送时间不能为空")
    @XStreamAlias("SendTime")
    private String sendTime;


    /**
     * 版本号
     * 默认为3.0
     */
    @NotNull(message = "版本号不能为空")
    @XStreamAlias("Version")
    private String version;

    /**
     * 文件名
     */
    @NotNull(message = "文件名不能为空")
    @XStreamAlias("FileName")
    private String fileName;

    /**
     * @return messageID
     */
    public String getMessageID() {
        return messageID;
    }

    /**
     * @param messageID messageID
     */
    public void setMessageID(String messageID) {
        this.messageID = messageID;
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

    /**
     * @return sender
     */
    public String getSender() {
        return sender;
    }

    /**
     * @param sender sender
     */
    public void setSender(String sender) {
        this.sender = sender;
    }

    /**
     * @return receiverList
     */
    public List<GzEPortReceiver> getReceiverList() {
        return receiverList;
    }

    /**
     * @param receiverList receiverList
     */
    public void setReceiverList(List<GzEPortReceiver> receiverList) {
        this.receiverList = receiverList;
    }

    /**
     * @return sendTime
     */
    public String getSendTime() {
        return sendTime;
    }

    /**
     * @param sendTime sendTime
     */
    public void setSendTime(String sendTime) {
        this.sendTime = sendTime;
    }

    /**
     * @return version
     */
    public String getVersion() {
        return version;
    }

    /**
     * @param version version
     */
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * @return fileName
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * @param fileName fileName
     */
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
}
