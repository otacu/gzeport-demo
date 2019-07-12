package com.egoist.gzeport.common.enums;

import com.egoist.gzeport.common.exception.MyException;
import com.egoist.gzeport.common.util.MyJsonUtil;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * 检查检疫机构
 */
public final class CiqCode {

    private CiqCode() {

    }

    /**
     * 定义Map
     */
    private static Map<String, String> map = new LinkedHashMap<String, String>();

    /**
     * 广州
     */
    public static final String GZ_CIQORG_CODE = "440070";

    /**
     * 深圳
     */
    public static final String SZ_CIQORG_CODE = "471800";

    /**
     * 南沙
     */
    public static final String NANSHA_CIQORG_CODE = "443400";



    static {
        map = new LinkedHashMap<String, String>();
        map.put(GZ_CIQORG_CODE, "广州");
        map.put(SZ_CIQORG_CODE, "深圳");
        map.put(NANSHA_CIQORG_CODE, "南沙");
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
        Map<String, String> newMap = getMap(ids);
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
