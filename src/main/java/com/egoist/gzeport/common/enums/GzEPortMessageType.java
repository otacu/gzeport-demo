package com.egoist.gzeport.common.enums;


import com.egoist.gzeport.common.exception.MyException;
import com.egoist.gzeport.common.util.MyJsonUtil;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * 报文类型
 */
public final class GzEPortMessageType {
    private GzEPortMessageType() {

    }

    /**
     * 定义Map
     */
    private static Map<String, String> map = new LinkedHashMap<String, String>();

    /**
     * 电子订单CEB报文
     */
    public static final String CEB311MESSAGE = "CEB311Message";

    /**
     * 电子订单KJ报文
     */
    public static final String KJ881111 = "KJ881111";

    static {
        map = new LinkedHashMap<String, String>();
        map.put(CEB311MESSAGE, "电子订单CEB报文");
        map.put(KJ881111, "电子订单KJ报文");
    }

    /**
     * 得到描述
     *
     * @param id 传入id
     * @return String
     */
    public static String getDescription(String id) {
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
    public static String toJson(String... ids) {
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
    public static Map getMap(String... ids) {
        Map<String, String> newMap = new LinkedHashMap<String, String>(map);
        List<String> keys = Arrays.asList(ids);
        newMap.keySet().retainAll(keys);

        return newMap;
    }
}
