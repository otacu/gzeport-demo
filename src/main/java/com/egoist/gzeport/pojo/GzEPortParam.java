package com.egoist.gzeport.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * 广州海关http接口参数
 */
@Configuration
@PropertySource("classpath:gzeport.properties")
public class GzEPortParam {
    /**
     * 申报地址
     */
    @Value("${gzeport.url.declare}")
    private String declareUrl;

    /**
     * 查询地址
     */
    @Value("${gzeport.url.query}")
    private String queryUrl;

    /**
     * 私钥地址
     */
    @Value("${gzeport.private_key_path}")
    private String privateKeyPath;

    /**
     * 公钥地址
     */
    @Value("${gzeport.public_key_path}")
    private String publicKeyPath;

    /**
     * 电子口岸备案号
     */
    @Value("${gzeport.param.record_no}")
    private String recordNo;

    /**
     * 接口调用密钥
     */
    @Value("${gzeport.param.key}")
    private String key;

    /**
     * 企业证书编号
     */
    @Value("${gzeport.param.cert_no}")
    private String certNo;

    /**
     * 报文发送人编号
     */
    @Value("${gzeport.param.sender}")
    private String sender;

    /**
     * 报文接收人编号
     */
    @Value("${gzeport.param.receiver}")
    private String receiver;

    /**
     * @return declareUrl
     */
    public String getDeclareUrl() {
        return declareUrl;
    }

    /**
     * @return privateKeyPath
     */
    public String getPrivateKeyPath() {
        return privateKeyPath;
    }

    /**
     * @return publicKeyPath
     */
    public String getPublicKeyPath() {
        return publicKeyPath;
    }

    /**
     * @return recordNo
     */
    public String getRecordNo() {
        return recordNo;
    }

    /**
     * @return key
     */
    public String getKey() {
        return key;
    }

    /**
     * @return certNo
     */
    public String getCertNo() {
        return certNo;
    }

    /**
     * @return sender
     */
    public String getSender() {
        return sender;
    }

    /**
     * @return receiver
     */
    public String getReceiver() {
        return receiver;
    }

    /**
     * @return queryUrl
     */
    public String getQueryUrl() {
        return queryUrl;
    }
}
