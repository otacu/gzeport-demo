package com.egoist.gzeport.common.util;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.egoist.gzeport.common.exception.MyException;

import java.util.List;
import java.util.TreeMap;

/**
 * pojo解析为json工具类
 */
public final class ParseUtil {

    private ParseUtil() {

    }

    /**
     * 解析POJO为TreeMap
     *
     * @param object pojo
     * @return TreeMap<String, Object>
     * @throws MyException exception
     */
    public static TreeMap<String, Object> parsePojoToMap(Object object) throws MyException {
        try {
            String jsonString = JSONObject.toJSONString(object, SerializerFeature.WriteNonStringKeyAsString);
            TreeMap<String, Object> params = JSONObject.parseObject(jsonString,
                    new TypeReference<TreeMap<String, Object>>() {
                    });
            return params;
        } catch (Exception e) {
            throw new MyException(e);
        }
    }

    /**
     * 解析JSONObject为POJO
     *
     * @param jsonObject jsonObject
     * @param clazz      clazz
     * @return Object
     * @throws MyException exception
     */
    public static Object parseMapToPojo(JSONObject jsonObject, Class clazz) throws MyException {
        try {
            return JSONObject.parseObject(jsonObject.toJSONString(), clazz);
        } catch (Exception e) {
            throw new MyException(e);
        }
    }

    /**
     * 解析JSONObject为POJO
     *
     * @param jsonObjectStr jsonObjectStr
     * @param clazz         clazz
     * @return Object
     * @throws MyException exception
     */
    public static Object parseMapToPojo(String jsonObjectStr, Class clazz) throws MyException {
        try {
            return JSONObject.parseObject(jsonObjectStr, clazz);
        } catch (Exception e) {
            throw new MyException(e);
        }
    }

    /**
     * 解析JSONArray为POJO List
     *
     * @param jsonArray jsonArray
     * @param clazz     clazz
     * @return Object
     * @throws MyException exception
     */
    public static List parseMapToPojo(JSONArray jsonArray, Class clazz) throws MyException {
        try {
            return JSONObject.parseArray(jsonArray.toJSONString(), clazz);
        } catch (Exception e) {
            throw new MyException(e);
        }
    }

}
