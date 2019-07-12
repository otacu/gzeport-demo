package com.egoist.gzeport.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.egoist.gzeport.common.constant.GzEPortMessageConstants;
import com.egoist.gzeport.common.enums.GzEPortMessageType;
import com.egoist.gzeport.common.exception.MyException;
import com.egoist.gzeport.common.util.*;
import com.egoist.gzeport.pojo.MyResult;
import com.egoist.gzeport.pojo.request.ElectronicOrderRequest;
import com.egoist.gzeport.pojo.request.GzEPortHead;
import com.egoist.gzeport.pojo.request.GzEPortOrderRequest;
import com.egoist.gzeport.pojo.request.GzEPortRequest;
import com.egoist.gzeport.pojo.response.GzEPortQueryResponse;
import com.egoist.gzeport.pojo.response.GzEPortResponse;
import com.egoist.gzeport.service.BaseGzEPortService;
import com.egoist.gzeport.service.GzEPortOrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * 广州海关http订单接口
 */
@Slf4j
@Service
public class GzEPortOrderServiceImpl extends BaseGzEPortService implements GzEPortOrderService {
    /**
     * ceb格式申报订单
     */
    @Override
    public MyResult declareCEB(GzEPortOrderRequest request)
            throws MyException {
        try {
            String messageType = GzEPortMessageType.CEB311MESSAGE;
            // 参数校验
            // 对象太复杂，不校验了，调用方检验
            if (request == null) {
                return MyResult.build(400, "非法参数");
            }

            // 拼接url
            Map<String, String> urlParamMap = new TreeMap<String, String>();
            urlParamMap.put("clientid", this.getGzEPortParam().getRecordNo());
            urlParamMap.put("key", this.getGzEPortParam().getKey());
            urlParamMap.put("messageType", messageType);
            String reqAction = getGzEPortParam().getDeclareUrl() + MyHttpUtil.generateLinkParameter(urlParamMap, true);

            GzEPortRequest gzEPortRequest = new GzEPortRequest();
            Map<String, String> declareParams = new HashMap<>();
            declareParams.put("encoding", "UTF-8");
            String orignalXml = XmlTransformUtil.toXml(request, declareParams);
            // 报文数据base64转码
            log.info(this.getClass().getName(), "主体内容报文==" + orignalXml);
            String data = new String(java.util.Base64.getEncoder().encode(orignalXml.getBytes("UTF-8")), "UTF-8");
            log.info(this.getClass().getName(), "BASE64加密主体内容==" + data);
            gzEPortRequest.setData(data);
            // 请求头
            GzEPortHead head = new GzEPortHead();
            head.setMessageType(messageType);
            gzEPortRequest.setHead(head);
            // 发送请求
            String returnObject = this.postXmlRequest(reqAction, gzEPortRequest);
            JSONObject jsonObject = MyJsonUtil.jsonToPojo(returnObject, JSONObject.class);
            // 处理返回结果
            GzEPortResponse response = (GzEPortResponse) ParseUtil.
                    parseMapToPojo(jsonObject, GzEPortResponse.class);
            if (response == null) {
                return MyResult.build(400, GzEPortMessageConstants.RETURN_RESULT_ERROR);
            }
            if (!response.getResult()) {
                return MyResult.build(400, response.getDescription());
            }
            return MyResult.ok(response);
        } catch (Exception e) {
            log.error(this.getClass().getName(), e,
                    " #################  申报广州海关订单失败 ################## ");
            return MyResult.build(400, GzEPortMessageConstants.DECLARE_ERROR);
        }
    }

    /**
     * kj格式申报订单
     */
    @Override
    public MyResult declareKJ(ElectronicOrderRequest request) throws MyException {
        try {
            String messageType = GzEPortMessageType.KJ881111;
            // 参数校验
            // 对象太复杂，不校验了，调用方检验
            if (request == null) {
                return MyResult.build(400, "参数非法");
            }

            // 拼接url
            Map<String, String> urlParamMap = new TreeMap<String, String>();
            urlParamMap.put("clientid", this.getGzEPortParam().getRecordNo());
            urlParamMap.put("key", this.getGzEPortParam().getKey());
            urlParamMap.put("messageType", messageType);
            String reqAction = getGzEPortParam().getDeclareUrl() + MyHttpUtil.generateLinkParameter(urlParamMap, true);

            GzEPortRequest gzEPortRequest = new GzEPortRequest();
            Map<String, String> declareParams = new HashMap<>();
            declareParams.put("encoding", "UTF-8");
            String orignalXml = XmlTransformUtil.toXml(request, declareParams);
            // 报文数据base64转码
            log.info(this.getClass().getName(), "主体内容报文==" + orignalXml);
            String data = new String(java.util.Base64.getEncoder().encode(orignalXml.getBytes("UTF-8")), "UTF-8");
            log.info(this.getClass().getName(), "BASE64加密主体内容==" + data);
            gzEPortRequest.setData(data);
            // 请求头
            GzEPortHead head = new GzEPortHead();
            head.setMessageType(messageType);
            gzEPortRequest.setHead(head);
            // 发送请求
            String returnObject = this.postXmlRequest(reqAction, gzEPortRequest);
            JSONObject jsonObject = MyJsonUtil.jsonToPojo(returnObject, JSONObject.class);
            // 处理返回结果
            GzEPortResponse response = (GzEPortResponse) ParseUtil.
                    parseMapToPojo(jsonObject, GzEPortResponse.class);
            if (response == null) {
                return MyResult.build(400, GzEPortMessageConstants.RETURN_RESULT_ERROR);
            }
            if (!response.getResult()) {
                return MyResult.build(400, response.getDescription());
            }
            return MyResult.ok(response);
        } catch (Exception e) {
            log.error(this.getClass().getName(), e,
                    " #################  申报广州海关订单失败 ################## ");
            return MyResult.build(400, GzEPortMessageConstants.DECLARE_ERROR);
        }
    }

    /**
     * 查询订单
     */
    @Override
    public MyResult query(String orderSubNo, String messageType) throws MyException {
        try {
            // 拼接url
            Map<String, String> urlParamMap = new TreeMap<String, String>();
            urlParamMap.put("clientid", this.getGzEPortParam().getRecordNo());
            urlParamMap.put("key", this.getGzEPortParam().getKey());
            urlParamMap.put("messageType", messageType);
            urlParamMap.put("entNo", orderSubNo);
            String reqAction = this.getGzEPortParam().getQueryUrl() + MyHttpUtil.generateLinkParameter(urlParamMap, true);
            String returnObject = MyOkHttp3Util.postXml(reqAction, null);
            // 处理返回结果
            GzEPortQueryResponse response = (GzEPortQueryResponse) ParseUtil.
                    parseMapToPojo(returnObject, GzEPortQueryResponse.class);
            if (response == null) {
                return MyResult.build(400, GzEPortMessageConstants.RETURN_RESULT_ERROR);
            }
            if (!response.getResult()) {
                return MyResult.build(400, response.getDescription());
            }
            return MyResult.ok(response.getContent());
        } catch (Exception e) {
            log.error(this.getClass().getName(), e,
                    " #################  查询广州海关订单失败 ################## ");
            return MyResult.build(400, GzEPortMessageConstants.QUERY_ERROR);
        }
    }
}
