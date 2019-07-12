package com.egoist.gzeport.common.util;

import com.egoist.gzeport.common.exception.MyException;
import org.apache.commons.lang3.time.DateUtils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 日期工具类
 */
public final class MyDateUtil extends DateUtils {

    /**
     * yyyy-MM-dd HH:mm:ss
     */
    public static final String YYYY_MM_DD_HH_MM_SS = "yyyy-MM-dd HH:mm:ss";

    private MyDateUtil() {

    }

    /**
     * 日期格式：yyyyMMddHHmmssSSS，例如：20170501195808988
     */
    private static final ThreadLocal<SimpleDateFormat> YYYY_MM_DD_HH_MM_SS_SSS_UNITY = new ThreadLocal<SimpleDateFormat>() {
        @Override
        protected SimpleDateFormat initialValue() {
            // Docker容器中，存在时区问题
            return new SimpleDateFormat("yyyyMMddHHmmssSSS");
            // 默认设置东8区的时区，如果是国际化，就存在问题！！！
//            SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmssSSS");
//            sdf.setTimeZone(TIME_ZONE_GMT_8);
//            return sdf;
        }
    };

    /**
     * 日期格式：yyyyMMddHHmmss，例如：20170501195808
     */
    private static final ThreadLocal<SimpleDateFormat> YYYY_MM_DD_HH_MM_SS_UNITY = new ThreadLocal<SimpleDateFormat>() {
        @Override
        protected SimpleDateFormat initialValue() {
            // Docker容器中，存在时区问题
            return new SimpleDateFormat("yyyyMMddHHmmss");
            // 默认设置东8区的时区，如果是国际化，就存在问题！！！
//            SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
//            sdf.setTimeZone(TIME_ZONE_GMT_8);
//            return sdf;
        }
    };

    /**
     * 期格式：yyyyMMddHHmmss，例如：20170501283848
     *
     * @param date 期
     * @return 返回期格式：yyyyMMddHHmmss，例如：20170501283848
     * @throws MyException 异常
     */
    public static String formatYyyyMMddHHmmssUnity(Date date) throws MyException {
        try {
            return YYYY_MM_DD_HH_MM_SS_UNITY.get().format(date);
        } catch (Exception ex) {
            throw new MyException(ex);
        }
    }


    /**
     * 期格式：yyyyMMddHHmmssSSS，例如：20170501283848988
     *
     * @param date 期
     * @return 返回期格式：yyyyMMddHHmmssSSS，例如：20170501283848988
     * @throws MyException 异常
     */
    public static String formatYyyyMMddHHmmssSSSUnity(Date date) throws MyException {
        try {
            return YYYY_MM_DD_HH_MM_SS_SSS_UNITY.get().format(date);
        } catch (Exception ex) {
            throw new MyException(ex);
        }
    }

    /**
     * 日期格式：yyyyMMddHHmmss，例如：20170501201128
     *
     * @param time 日期时间
     * @return 返回日期格式：yyyyMMddHHmmss，例如：20170501201128
     * @throws MyException 异常
     */
    public static String toYyyyMMddHHmmssUnity(long time) throws MyException {
        try {
            return formatYyyyMMddHHmmssUnity(new Date(time));
        } catch (Exception ex) {
            throw new MyException(ex);
        }
    }
}
