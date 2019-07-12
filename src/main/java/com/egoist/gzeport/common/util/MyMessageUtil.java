package com.egoist.gzeport.common.util;

import com.egoist.gzeport.common.exception.MyException;

import java.util.Date;

/**
 * 发送消息工具类
 */
public final class MyMessageUtil {

    private MyMessageUtil() {

    }


    /**
     * 格式例如：KJ881111_test1_2016061609460872271
     */
    private static final String MESSAGE_ID_STRING = "%s_%s_%s%s";


    /**
     * 获取messageId
     * 不支持并发
     *
     * @param messageType 消息类型
     * @param companyCode 企业编码
     * @param date        日期
     * @return String 返回文件名字符串
     * @throws MyException 异常
     */
    public static String getMessageId(String messageType, String companyCode, Date date) throws MyException {
        String dateString = MyDateUtil.formatYyyyMMddHHmmssSSSUnity(date);
        final int randLength = 6;
        String randString = MyRandomUtil.getRandomNumbers(randLength);
        return String.format(MESSAGE_ID_STRING, messageType, companyCode, dateString, randString);
    }
}
