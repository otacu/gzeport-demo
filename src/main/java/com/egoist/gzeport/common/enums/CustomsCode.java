package com.egoist.gzeport.common.enums;

import com.egoist.gzeport.common.exception.MyException;
import com.egoist.gzeport.common.util.MyJsonUtil;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * 海关关区代码
 * 查询地址：http://www.haiguan.info/OnLineSearch/CustomsParam/Default.aspx?t=CUSTOMS_CODE
 */
public final class CustomsCode {

    private CustomsCode() {

    }

    /**
     * 定义Map
     */
    private static Map<Integer, String> map = new LinkedHashMap<Integer, String>();

    /**
     * 广州萝岗
     */
    public static final int GZ_LUO_GANG = 5130;

    /**
     * 广州机场
     */
    public static final int BAI_YUN = 5141;

    /**
     * 南沙海关
     */
    public static final int NAN_SHA = 5165;

    /**
     * 黄埔海关(状元谷)
     */
    public static final int ZHUANG_YUAN_GU = 5208;

    /**
     * 天津关区
     */
    public static final int TIAN_JIN = 0200;

    /**
     * 萝岗石牌
     */
    public static final int SHI_PAI = 5133;

    /**
     * 杭州保税物流中心
     */
    public static final int HANG_ZHOU = 2992;


    /**
     * 深圳前海
     */
    public static final int SZ_QIAN_HAI = 5349;


    static {
        map = new LinkedHashMap<Integer, String>();
        map.put(GZ_LUO_GANG, "广州萝岗");
        map.put(BAI_YUN, "广州机场");
        map.put(NAN_SHA, "南沙海关");
        map.put(ZHUANG_YUAN_GU, "黄埔海关(状元谷)");
        map.put(TIAN_JIN, "天津关区");
        map.put(SHI_PAI, "萝岗石牌");
        map.put(HANG_ZHOU, "杭州保税物流中心");
        map.put(SZ_QIAN_HAI, "深圳前海");
    }

    /**
     * 得到描述
     *
     * @param id 传入id
     * @return String
     */
    public static String getDescription(Integer id) {
        return map.get(id);
    }

    /**
     * @return String
     */
    public static String toJson() {
        try {
            return MyJsonUtil.objectToJson(map);
        } catch (MyException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * @param ids 传入ids
     * @return String
     */
    public static String toJson(Integer... ids) {
        Map<Integer, String> newMap = getMap(ids);
        try {
            return MyJsonUtil.objectToJson(newMap);
        } catch (MyException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * @return Map
     */
    public static Map getMap() {
        return map;
    }

    /**
     * @param ids 传入ids
     * @return Map
     */
    public static Map getMap(Integer... ids) {
        Map<Integer, String> newMap = new LinkedHashMap<Integer, String>(map);
        List<Integer> keys = Arrays.asList(ids);
        newMap.keySet().retainAll(keys);

        return newMap;
    }
}
