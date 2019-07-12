package com.egoist.gzeport.service;


import com.egoist.gzeport.common.exception.MyException;
import com.egoist.gzeport.pojo.MyResult;
import com.egoist.gzeport.pojo.request.ElectronicOrderRequest;
import com.egoist.gzeport.pojo.request.GzEPortOrderRequest;

/**
 * 订单接口
 */
public interface GzEPortOrderService {
    /**
     * ceb格式申报订单
     */
    MyResult declareCEB(GzEPortOrderRequest request) throws MyException;

    /**
     * kj格式申报订单
     */
    MyResult declareKJ(ElectronicOrderRequest request) throws MyException;

    /**
     * 查询订单
     */
    MyResult query(String orderSubNo, String messageType) throws MyException;
}
