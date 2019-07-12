package com.egoist.gzeport;

import com.alibaba.fastjson.JSON;
import com.egoist.gzeport.common.constant.CompanyConstants;
import com.egoist.gzeport.common.constant.GzEPortConstants;
import com.egoist.gzeport.common.constant.GzhgConstants;
import com.egoist.gzeport.common.constant.PddConstants;
import com.egoist.gzeport.common.enums.CiqCode;
import com.egoist.gzeport.common.enums.CustomsCode;
import com.egoist.gzeport.common.enums.GzEPortMessageType;
import com.egoist.gzeport.common.exception.MyException;
import com.egoist.gzeport.common.util.MyDateUtil;
import com.egoist.gzeport.common.util.MyMessageUtil;
import com.egoist.gzeport.common.util.MyUUIDUtil;
import com.egoist.gzeport.pojo.GzEPortParam;
import com.egoist.gzeport.pojo.MyResult;
import com.egoist.gzeport.pojo.request.*;
import com.egoist.gzeport.service.GzEPortOrderService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestGzEPortOrderService {

    @Autowired
    private GzEPortOrderService gzEPortOrderService;

    /**
     * gzEPortParam
     */
    @Autowired
    private GzEPortParam gzEPortParam;

    @Test
    public void testDeclareCEB() throws MyException {
        Date date = new Date();
        GzEPortCebOrderHead head = new GzEPortCebOrderHead();
        head.setGuid(MyUUIDUtil.randomFileUUID());
        head.setAppType(GzEPortConstants.APP_TYPE);
        head.setAppTime(MyDateUtil.toYyyyMMddHHmmssUnity(date.getTime()));
        head.setAppStatus(GzEPortConstants.APP_STATUS);
        head.setOrderType(GzEPortConstants.ORDER_TYPE);
        head.setOrderNo("拆单号");
        head.setEbpCode(PddConstants.EBP_CODE);
        head.setEbpName(PddConstants.EBP_NAME);
        head.setEbcCode(CompanyConstants.EBC_CODE);
        head.setEbcName(CompanyConstants.EBC_NAME);
        head.setGoodsValue(2.0);
        head.setFreight(0.0);
        head.setDiscount(0.0);
        head.setTaxTotal(0.0);
        head.setActuralPaid(2.0);
        head.setCurrency(GzEPortConstants.CUR);
        head.setBuyerRegNo("电话号码");
        head.setBuyerName("测试");
        head.setBuyerTelephone("电话号码");
        head.setBuyerIdType("1");
        head.setBuyerIdNumber("身份证");
        head.setPayCode(PddConstants.PAY_CODE);
        head.setPayName(PddConstants.PAY_NAME);
        head.setConsignee("测试");
        head.setConsigneeTelephone("电话号码");
        head.setConsigneeAddress("详细地址");
//        head.setConsigneeDistrict("211202");

        List<GzEPortCebOrderGoods> cebOrderGoodsList = new ArrayList<>();
        GzEPortCebOrderGoods orderGoods = new GzEPortCebOrderGoods();
        orderGoods.setGnum("1");
        orderGoods.setItemNo("企业商品货号");
        orderGoods.setItemName("企业商品名称");
        orderGoods.setGmodel("商品规格型号");
        orderGoods.setBarCode("条形码");
        orderGoods.setUnit("035");
        orderGoods.setQty(1.0);
        orderGoods.setPrice(2.0);
        orderGoods.setTotalPrice(2.0);
        orderGoods.setCurrency(GzEPortConstants.CUR);
        orderGoods.setCountry("312");
        cebOrderGoodsList.add(orderGoods);

        GzEPortCebOrder cebOrder = new GzEPortCebOrder();
        cebOrder.setCebOrderHead(head);
        cebOrder.setCebOrderGoodsList(cebOrderGoodsList);

        GzEPortCebBaseTransfer baseTransfer = new GzEPortCebBaseTransfer();
        baseTransfer.setCopCode(CompanyConstants.EBC_CODE);
        baseTransfer.setCopName(CompanyConstants.EBC_NAME);
        baseTransfer.setDxpMode(GzEPortConstants.DXP_MODE);
        baseTransfer.setDxpId(CompanyConstants.DXP_ID);

        GzEPortOrderRequest request = new GzEPortOrderRequest();
        request.setGuid(MyUUIDUtil.randomFileUUID());
        request.setCebOrder(cebOrder);
        request.setCebOrderBaseTransfer(baseTransfer);

        MyResult result = gzEPortOrderService.declareCEB(request);
        System.out.println("###########################################################");
        System.out.println(JSON.toJSONString(result));
    }

    @Test
    public void testDeclareKJ() throws MyException {
        Date date = new Date();
        // 电子订单对象
        ElectronicOrderRequest electronicOrderRequest = new ElectronicOrderRequest();

        // 报文头
        Head head = new Head();
        head.setMessageID(MyMessageUtil.getMessageId(GzEPortMessageType.KJ881111,
                gzEPortParam.getSender(), date));
        head.setMessageType(GzEPortMessageType.KJ881111);
        head.setSender(gzEPortParam.getSender());
        head.setReceiver(gzEPortParam.getReceiver());
        head.setSendTime(MyDateUtil.toYyyyMMddHHmmssUnity(date.getTime()));
        head.setFunctionCode(GzhgConstants.FUNCTION_CUSTOMS_DECLARATION);
        head.setSignerInfo("");
        head.setVersion(GzhgConstants.VERSION);

        electronicOrderRequest.setHead(head);

        // 报文体
        ElectronicOrderDeclaration electronicOrderDeclaration = new ElectronicOrderDeclaration();

        // 电子订单请求头
        ElectronicOrderHead electronicOrderHead = new ElectronicOrderHead();
        electronicOrderHead.setDeclEntNo(CompanyConstants.SINGLEWINDOW_NUMBER);
        electronicOrderHead.setDeclEntName(CompanyConstants.EBC_NAME);
        electronicOrderHead.seteBEntNo(CompanyConstants.SINGLEWINDOW_NUMBER);
        electronicOrderHead.seteBEntName(CompanyConstants.EBC_NAME);
        electronicOrderHead.seteBPEntNo(PddConstants.SINGLEWINDOW_NUMBER);
        electronicOrderHead.seteBPEntName(PddConstants.EBP_NAME);
        electronicOrderHead.setInternetDomainName(CompanyConstants.ICP_WEB_SITE);
        electronicOrderHead.setDeclTime(MyDateUtil.toYyyyMMddHHmmssUnity(date.getTime()));
        electronicOrderHead.setOpType(GzhgConstants.OPTYPE_A);
        electronicOrderHead.setIeFlag(GzhgConstants.IEFLAG_I);
        electronicOrderHead.setCustomsCode(String.valueOf(CustomsCode.NAN_SHA));
        electronicOrderHead.setcIQOrgCode(CiqCode.NANSHA_CIQORG_CODE);

        electronicOrderDeclaration.setElectronicOrderHead(electronicOrderHead);

        // 电子订单数据集合
        List<ElectronicOrderContent> electronicOrderContentList = new ArrayList<ElectronicOrderContent>();

        // 电子订单
        ElectronicOrderContent electronicOrderContent = new ElectronicOrderContent();

        // 订单详情
        ElectronicOrderDetail electronicOrderDetail = new ElectronicOrderDetail();
        electronicOrderDetail.setEntOrderNo("拆单号");
        electronicOrderDetail.setOrderStatus(GzhgConstants.ORDERSTATUS_COMPLETED);
        electronicOrderDetail.setPayStatus(GzhgConstants.PAYSTATUS_PAID);
        electronicOrderDetail.setOrderGoodTotal(2d);
        electronicOrderDetail.setOrderGoodTotalCurr(GzhgConstants.RECIPIENT_COUNTRY);
        electronicOrderDetail.setFreight(0d);
        electronicOrderDetail.setTax(0d);
        electronicOrderDetail.setOtherPayment(GzhgConstants.OTHER_PAYMENT);
        electronicOrderDetail.setOtherPayNotes(GzhgConstants.OTHER_PAYNOTES);
        electronicOrderDetail.setOtherCharges(GzhgConstants.OTHER_CHARGES);
        electronicOrderDetail.setActualAmountPaid(2d);
        electronicOrderDetail.setRecipientName("测试");
        electronicOrderDetail.setRecipientAddr("详细地址");
        electronicOrderDetail.setRecipientTel("电话号码");
        electronicOrderDetail.setRecipientCountry(GzhgConstants.RECIPIENT_COUNTRY);
        electronicOrderDetail.setRecipientProvincesCode("440100");
        electronicOrderDetail.setOrderDocAcount("电话号码");
        electronicOrderDetail.setOrderDocName("测试");
        electronicOrderDetail.setOrderDocType(GzhgConstants.ORDERDOCTYPE_SFZ);
        electronicOrderDetail.setOrderDocId("400000000000000000");
        electronicOrderDetail.setOrderDocTel("电话号码");
        electronicOrderDetail.setOrderDate(MyDateUtil.toYyyyMMddHHmmssUnity(date.getTime()));
        electronicOrderDetail.setBatchNumbers("");
//        electronicOrderDetail.setInvoiceType("S");
//        electronicOrderDetail.setInvoiceNo("");
//        electronicOrderDetail.setInvoiceTitle("");
//        electronicOrderDetail.setInvoiceIdentifyID("");
//        electronicOrderDetail.setInvoiceDesc("");
//        electronicOrderDetail.setInvoiceAmount(3.14159);
//        electronicOrderDetail.setInvoiceDate("");
//        electronicOrderDetail.setNotes("");

        // 订单商品
        List<ElectronicOrderGoods> electronicOrderGoodsList = new ArrayList<ElectronicOrderGoods>();

        ElectronicOrderGoods electronicOrderGoods = new ElectronicOrderGoods();
        electronicOrderGoods.setSeq(1);
        electronicOrderGoods.setEntGoodsNo("企业商品自编号");
        electronicOrderGoods.setcIQGoodsNo("检验检疫商品备案编号");
        electronicOrderGoods.setCusGoodsNo("海关正式备案编号");
        electronicOrderGoods.sethSCode("HS编码");
        electronicOrderGoods.setGoodsName("企业商品品名");
        electronicOrderGoods.setGoodsStyle("规格型号");
        electronicOrderGoods.setGoodsDescribe("");
        electronicOrderGoods.setOriginCountry("502");
        electronicOrderGoods.setBarCode("商品条形码");
        electronicOrderGoods.setBrand("品牌名称");
        electronicOrderGoods.setQty(1.0d);
        electronicOrderGoods.setUnit("035");
        electronicOrderGoods.setPrice(2d);
        electronicOrderGoods.setTotal(2d);
        electronicOrderGoods.setCurrCode(GzhgConstants.RECIPIENT_COUNTRY);
//        electronicOrderGoods.setNotes("测试专用02");

        electronicOrderGoodsList.add(electronicOrderGoods);

        electronicOrderDetail.setElectronicOrderGoodsList(electronicOrderGoodsList);


        electronicOrderContent.setElectronicOrderDetail(electronicOrderDetail);

        // 电子订单关联支付表体
//        ElectronicOrderPaymentRel electronicOrderPaymentRel = new ElectronicOrderPaymentRel();
//        electronicOrderPaymentRel.setPayEntNo("CO0000000017");
//        electronicOrderPaymentRel.setPayEntName("测试支付公司");
//        electronicOrderPaymentRel.setPayNo("M");
//
//        electronicOrderContent.setElectronicOrderPaymentRel(electronicOrderPaymentRel);

//        ElectronicOrderWaybillRel electronicOrderWaybillRel = new ElectronicOrderWaybillRel();
//        electronicOrderWaybillRel.seteHSEntNo("CO0000000017");
//        electronicOrderWaybillRel.seteHSEntName("测试物流公司");
//        electronicOrderWaybillRel.setWaybillNo("784174148");
//        electronicOrderWaybillRel.setNotes("测试专用03");
//
//
//        electronicOrderContent.setElectronicOrderWaybillRel(electronicOrderWaybillRel);

        electronicOrderContentList.add(electronicOrderContent);

        electronicOrderDeclaration.setElectronicOrderContentList(electronicOrderContentList);

        electronicOrderRequest.setDeclaration(electronicOrderDeclaration);
        MyResult result = gzEPortOrderService.declareKJ(electronicOrderRequest);
        System.out.println("###########################################################");
        System.out.println(JSON.toJSONString(result));
    }


    @Test
    public void testQuery() throws MyException {
        MyResult result = gzEPortOrderService.query("拆单号", GzEPortMessageType.CEB311MESSAGE);
        System.out.println("###########################################################");
        System.out.println(JSON.toJSONString(result));
    }

    @Test
    public void decodeBase64() throws Exception {
        String orignalXml = "加密的报文";
        String result = new String(java.util.Base64.getDecoder().decode(orignalXml.getBytes("UTF-8")), "UTF-8");
        System.out.println("###########################################################");
        System.out.println(result);
    }

}
