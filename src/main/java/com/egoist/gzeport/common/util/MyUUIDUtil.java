package com.egoist.gzeport.common.util;

import org.apache.commons.lang3.StringUtils;

import java.util.UUID;

/**
 * UUID工具类
 */
public final class MyUUIDUtil {

    /**
     * UUID模块3，也就是UUID以-分隔之后的第3个数组元素
     */
    private static final int UUID_MODULE_3 = 3;

    /**
     * UUID模块4，也就是UUID以-分隔之后的第4个数组元素
     */
    private static final int UUID_MODULE_4 = 4;


    private MyUUIDUtil() {
        throw new AssertionError();
    }

    /**
     * 获取随机UUID字符串，例如：cd190158-ae9a-491b-8705-d49184bf2b36
     *
     * @return 返回随机UUID字符串
     */
    public static String randomUUID() {
        return UUID.randomUUID().toString();
    }

    /**
     * 获取去掉“-”的随机UUID字符串，例如：cd190158ae9a491b8705d49184bf2b36
     *
     * @return 返回去掉“-”的随机UUID字符串
     */
    public static String randomUUIDNotLine() {
        return randomUUID().replace("-", "");
    }

    /**
     * 获取去掉“-”之后的最后16位字符串，例如：aa698b90771f792f
     *
     * @return 返回去掉“-”之后的最后16位字符串，例如：aa698b90771f792f
     */
    public static String randomUUIDWithLast16() {
        String[] strs = randomUUID().toString().split("-");
        return strs[UUID_MODULE_3] + strs[UUID_MODULE_4];
    }

    /**
     * 获取去掉“-”之后的最后16位字符串，专门为静态资源版本号使用（CSS、JS、Images)，例如：aa698b90771f792f
     *
     * @return 返回去掉“-”之后的最后16位字符串，例如：aa698b90771f792f
     */
    public static String randomUUIDForVersion() {
        return randomUUIDWithLast16();
    }


    /**
     * 获取随机UUID字符串，例如：cd190158-ae9a-491b-8705-d49184bf2b36
     *
     * @return 返回随机FileUUID字符串
     */
    public static String randomFileUUID() {
        return UUID.randomUUID().toString();
    }


    /**
     * 获取数字UUID
     *
     * @return
     */
    public static String getNumUUID() {
        String uuid = UUID.randomUUID().toString();
        uuid = StringUtils.replace(uuid, "-", "");
        String result = "";
        if (uuid != null && !uuid.equals("")) {
            for (int i = 0; i < uuid.length(); i += 4) {
                result += Integer.valueOf(uuid.substring(i, 4 + i), 16);
            }
        }
        return result;
    }


    /**
     * 获取指定长度的数字UUID
     *
     * @param index
     * @return
     */
    public static String getNumUUID(int index) {
        return getNumUUID().substring(0, index);
    }
}
