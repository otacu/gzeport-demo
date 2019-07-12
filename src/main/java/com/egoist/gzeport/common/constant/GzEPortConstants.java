package com.egoist.gzeport.common.constant;

/**
 * 广州海关http接口常量
 */
public final class GzEPortConstants {
    private GzEPortConstants() {

    }

    /**
     * XMLNS_XSI
     */
    public static final String XMLNS_XSI = "http://www.w3.org/2001/XMLSchema-instance";

    /**
     * XMLNS_DS
     */
    public static final String XMLNS_DS = "http://www.w3.org/2000/09/xmldsig#";

    /**
     * XMLNS_NS2
     */
    public static final String XMLNS_NS2 = "http://www.w3.org/2000/09/xmldsig#";

    /**
     * XMLNS_N1
     */
    public static final String XMLNS_N1 = "http://www.altova.com/samplexml/other-namespace";

    /**
     * XMLNS_CEB
     */
    public static final String XMLNS_CEB = "http://www.chinaport.gov.cn/ceb";

    /**
     * 版本号 1.0
     */
    public static final String VERSION = "1.0";

    /**
     * 报文传输模式
     * 默认为DXP；指中国电子口岸数据交换平台
     */
    public static final String DXP_MODE = "DXP";

    /**
     * 币制
     */
    public static final String CUR = "142";

    /**
     * 订单类型
     * 电子订单类型：I进口
     */
    public static final String ORDER_TYPE = "I";

    /**
     * 业务状态
     * 业务状态:1-暂存,2-申报,默认为2。
     */
    public static final String APP_STATUS = "2";

    /**
     * 报送类型
     * 企业报送类型。1-新增 2-变更 3-删除。默认为1。
     */
    public static final String APP_TYPE = "1";

}
