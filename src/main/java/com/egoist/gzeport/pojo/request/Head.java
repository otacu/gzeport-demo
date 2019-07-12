package com.egoist.gzeport.pojo.request;

import com.thoughtworks.xstream.annotations.XStreamAlias;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * 报文头
 */
public class Head implements Serializable {

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
    @NotNull(message = "报文发送者标识不能为空")
    @XStreamAlias("Sender")
    private String sender;


    /**
     * 报文接收人标识
     * 广州电子口岸数据交换编号，跨境系统可固定:KJPUBLIC
     */
    @NotNull(message = "报文发送者标识不能为空")
    @XStreamAlias("Receiver")
    private String receiver;

    /**
     * 发送时间
     * 报文生成的系统时间 YYYYMMDDHHMMSS
     */
    @NotNull(message = "发送时间不能为空")
    @XStreamAlias("SendTime")
    private String sendTime;

    /**
     * 业务类型
     * 单向海关申报填CUS
     * 单向国检申报填CIQ
     * 同时发送时填写“BOTH”
     */
    @NotNull(message = "发送时间不能为空")
    @XStreamAlias("FunctionCode")
    private String functionCode;

    /**
     * 签名信息
     * 按照特定算法生成的企业数字签名信息。
     */
    @NotNull(message = "签名信息不能为空")
    @XStreamAlias("SignerInfo")
    private String signerInfo;


    /**
     * 版本号
     * 默认为3.0
     */
    @NotNull(message = "版本号不能为空")
    @XStreamAlias("Version")
    private String version;


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
     * @return receiver
     */
    public String getReceiver() {
        return receiver;
    }

    /**
     * @param receiver receiver
     */
    public void setReceiver(String receiver) {
        this.receiver = receiver;
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
     * @return functionCode
     */
    public String getFunctionCode() {
        return functionCode;
    }

    /**
     * @param functionCode functionCode
     */
    public void setFunctionCode(String functionCode) {
        this.functionCode = functionCode;
    }

    /**
     * @return signerInfo
     */
    public String getSignerInfo() {
        return signerInfo;
    }

    /**
     * @param signerInfo signerInfo
     */
    public void setSignerInfo(String signerInfo) {
        this.signerInfo = signerInfo;
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
}
