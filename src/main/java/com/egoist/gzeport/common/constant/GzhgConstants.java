package com.egoist.gzeport.common.constant;

/**
 * 描述信息
 */
public final class GzhgConstants {


    private GzhgConstants() {

    }


    /**
     * success
     */
    public static final String SUCCESS = "success";


    /**
     * fail
     */
    public static final String FAIL = "fail";

    /**
     * XMLNS_XSI
     */
    public static final String XMLNS_XSI = "http://www.w3.org/2001/XMLSchema-instance";

    /**
     * XMLNS_DS
     */
    public static final String XMLNS_DS = "http://www.w3.org/2000/09/xmldsig#";


    /**
     * XMLNS_N1
     */
    public static final String XMLNS_N1 = "http://www.altova.com/samplexml/other-namespace";


    /**
     * 单向海关申报填CUS
     */
    public static final String FUNCTION_CUSTOMS_DECLARATION = "CUS";

    /**
     * 单向国检申报填CIQ
     */
    public static final String FUNCTION_STATE_INSPECTION_DECLARATION = "CIQ";

    /**
     * 同时申报填写 BOTH
     */
    public static final String FUNCTION_BOTH = "BOTH";


    /**
     * 新增
     */
    public static final String OPTYPE_A = "A";

    /**
     * 变更
     */
    public static final String OPTYPE_M = "M";

    /**
     * 删除
     */
    public static final String OPTYPE_D = "D";


    /**
     * 进出口标示 I-进口商品订单
     */
    public static final String IEFLAG_I = "I";

    /**
     * 进出口标示 E-出口商品订单
     */
    public static final String IEFLAG_E = "E";

    /**
     * 主管海关代码
     */
    public static final String CUSTOMSCODE = "5130";

    /**
     * 检验检疫机构代码
     */
    public static final String CIQORGCODE = "442100";


    /**
     * 广州电子口岸数据交换编号，跨境系统可固定:KJPUBLIC
     */
    public static final String RECEIVER = "KJPUBLIC";


    /**
     * 版本号 默认为3.0
     */
    public static final String VERSION = "3.0";


    /**
     * 0-订单确认
     */
    public static final String ORDERSTATUS_CONFIRMED = "0";

    /**
     * 1-订单完成
     */
    public static final String ORDERSTATUS_COMPLETED = "1";

    /**
     * 2-订单取消
     */
    public static final String ORDERSTATUS_CANCELED = "2";


    /**
     * 支付状态 - 已付款
     */
    public static final String PAYSTATUS_PAID = "0";

    /**
     * 支付状态 - 未付款
     */
    public static final String PAYSTATUS_NOT_PAY = "1";

    /**
     * 订单商品总额币制
     */
    public static final String ORDER_GOOD_TOTAL_CURR = "142";

    /**
     * 价格保留小数位
     */
    public static final int PRICE_LENGTH = 2;


    /**
     * 抵付金额
     * 优惠减免金额，无则填“0”
     */
    public static final double OTHER_PAYMENT = 0;

    /**
     * 抵付说明
     * 抵付情况说明。如果填写抵付金额时，此项必填。
     */
    public static final String OTHER_PAYNOTES = "";


    /**
     * 其它费用
     * 无则填“0”
     */
    public static final double OTHER_CHARGES = 0;

    /**
     * 收货人所在国
     */
    public static final String RECIPIENT_COUNTRY = "142";

    /**
     * 下单人证件类型 - 身份证
     */
    public static final String ORDERDOCTYPE_SFZ = "01";


    /**
     * 下单人证件类型 - 护照
     */
    public static final String ORDERDOCTYPE_HZ = "02";


    /**
     * 下单人证件类型 - 其他
     */
    public static final String ORDERDOCTYPE_OTHER = "03";


    /**
     * 发票类型 - 电子发票
     */
    public static final String INVOICETYPE_DZ = "1";

    /**
     * 发票类型 - 普通发票（纸质）
     */
    public static final String INVOICETYPE_PT = "2";

    /**
     * 发票类型 - 专用发票（纸质）
     */
    public static final String INVOICETYPE_ZY = "3";

    /**
     * 发票类型 - 其它
     */
    public static final String INVOICETYPE_OTHER = "0";

    /**
     * 发票类型 - 无
     */
    public static final String INVOICETYPE_NONE = "";

}
