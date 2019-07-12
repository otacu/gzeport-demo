package com.egoist.gzeport.service;

import com.egoist.gzeport.common.constant.GzEPortConstants;
import com.egoist.gzeport.common.exception.MyException;
import com.egoist.gzeport.common.util.*;
import com.egoist.gzeport.pojo.GzEPortParam;
import com.egoist.gzeport.pojo.request.GzEPortHead;
import com.egoist.gzeport.pojo.request.GzEPortReceiver;
import com.egoist.gzeport.pojo.request.GzEPortRequest;
import com.egoist.gzeport.pojo.request.Request;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

import java.net.URLEncoder;
import java.util.Collections;
import java.util.Date;
import java.util.TreeMap;

@Slf4j
public abstract class BaseGzEPortService {
    /**
     * gzEPortParam
     */
    @Autowired
    private GzEPortParam gzEPortParam;

    /**
     * 发送请求之前处理
     *
     * @param request          请求对象
     * @return 参数map
     * @throws MyException 异常信息
     */
    protected TreeMap<String, Object> signMap(Request request)
            throws MyException {
        try {
            GzEPortRequest gzEPortRequest = (GzEPortRequest) request;
            GzEPortHead head = gzEPortRequest.getHead();
            Date date = new Date();
            String messageId = MyMessageUtil.getMessageId(head.getMessageType(),
                    gzEPortParam.getSender(), date);
            // 包装传输头
            head.setMessageID(messageId);
            head.setSender(gzEPortParam.getSender());
            GzEPortReceiver receiver = new GzEPortReceiver();
            receiver.setReceiver(gzEPortParam.getReceiver());
            head.setReceiverList(Collections.singletonList(receiver));
            head.setSendTime(MyDateUtil.formatYyyyMMddHHmmssUnity(date));
            head.setVersion(GzEPortConstants.VERSION);
            head.setFileName(messageId);
            gzEPortRequest.setHead(head);

            TreeMap<String, Object> paramMap = new TreeMap<String, Object>();
            String privateKey = this.getClass().getResource(gzEPortParam.getPrivateKeyPath()).getPath();
            log.info(this.getClass().getName(),
                    String.format("广州海关加签私钥路径：%s", privateKey));
            String publicKey = this.getClass().getResource(gzEPortParam.getPublicKeyPath()).getPath();
            log.info(this.getClass().getName(),
                    String.format("广州海关加签公钥路径：%s", publicKey));
            String gzeportTransferXmlString = XmlTransformUtil.toXml(gzEPortRequest);
            log.info(this.getClass().getName(), "传输报文加密前==" + gzeportTransferXmlString);

            String gzeportTransferXmlStringSign = XmlDigitalSignatureGenerator.
                    generateXMLDigitalSignature(gzeportTransferXmlString, privateKey, publicKey);
            log.info(this.getClass().getName(), "传输报文加密后==" + gzeportTransferXmlStringSign);
            gzeportTransferXmlStringSign = URLEncoder.encode(gzeportTransferXmlStringSign, "UTF-8");
            paramMap.put("messageText", gzeportTransferXmlStringSign);
            return paramMap;
        } catch (Exception e) {
            log.error(this.getClass().getName(), e,
                    String.format("广州海关加签异常：%s", e.toString()));
            throw new MyException("签名错误");
        }
    }

    public String postXmlRequest(String reqAction, Request request) throws MyException {
        String returnObject = null;
        TreeMap<String, Object> paramMap = signMap(request);
        try {
            returnObject = MyOkHttp3Util.postXml(reqAction, paramMap);
            return returnObject;
        } catch (Exception e) {
            log.error(this.getClass().getName(), e, " 请求失败异常");
        }
        return returnObject;
    }

    /**
     * @return GzEPortParam
     */
    public GzEPortParam getGzEPortParam() {
        return gzEPortParam;
    }
}
