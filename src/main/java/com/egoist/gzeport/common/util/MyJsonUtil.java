package com.egoist.gzeport.common.util;

import com.alibaba.fastjson.JSON;
import com.egoist.gzeport.common.exception.MyException;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.lang3.StringUtils;

import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Map;

/**
 * son工具类
 */
public final class MyJsonUtil {

    private MyJsonUtil() {
    }

    /**
     * 定义Jackson的ObjectMapper实例对象
     */
    private static final ObjectMapper MAPPER = new ObjectMapper();

    /**
     * 定义Jackson的ObjectMapper实例对象
     */
    private static final ObjectMapper MAPPER_NON_NULL = new ObjectMapper();


    static {
        MAPPER.setDateFormat(new SimpleDateFormat(MyDateUtil.YYYY_MM_DD_HH_MM_SS));
    }

    /**
     * 将对象转换成json字符串。
     *
     * @param data 目标数据
     * @return 返回Json字符串
     */
    public static String objectToJson(Object data) throws MyException {
//        if (null == data) {
//            return null;
//        }
        try {
            return MAPPER.writeValueAsString(data);
        } catch (Exception e) {
            throw new MyException(e);
        }
    }

    /**
     * 将json结果集转化为对象
     *
     * @param json     json数据
     * @param beanType 对象中的object类型
     * @param <T>      POJO类型
     * @return 返回目标POJO实例对象
     */
    public static <T> T jsonToPojo(String json, Class<T> beanType) throws MyException {
        try {
            if (StringUtils.isBlank(json) || null == beanType) {
                return null;
            }
            T t = MAPPER.readValue(json, beanType);
            return t;
        } catch (Exception e) {
            throw new MyException(e);
        }
    }

    /**
     * 将json数据转换成pojo对象list
     *
     * @param json     Json字符串
     * @param beanType POJO的Class
     * @param <T>      POJO类型
     * @return 返回目标POJO的集合
     */
    public static <T> List<T> jsonToList(String json, Class<T> beanType) throws MyException {
        try {
            JavaType javaType = MAPPER.getTypeFactory().constructParametricType(List.class, beanType);
            return MAPPER.readValue(json, javaType);
        } catch (Exception e) {
            throw new MyException(e);
        }
    }

    /**
     * 将map转化成pojo对象
     *
     * @param map   源数据
     * @param clazz POJO的Class
     * @param <T>   POJO类型
     * @return 返回目标POJO
     */
    public static <T> T map2obj(Map<?, ?> map, Class<T> clazz) throws MyException {
        try {
            return JSON.parseObject(JSON.toJSONString(map), clazz);
        } catch (Exception e) {
            throw new MyException(e);
        }
    }

    /**
     * 将对象转换成json字符串。
     */
    public static String objectToJsonIgnoreNull(Object data) throws MyException {
//        if (null == data) {
//            return null;
//        }
        try {
            return MAPPER_NON_NULL.writeValueAsString(data);
        } catch (Exception e) {
            throw new MyException(e);
        }
    }
}
