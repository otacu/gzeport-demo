package com.egoist.gzeport.common.util;

import com.egoist.gzeport.common.exception.MyException;

import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class MyHttpUtil {

    private MyHttpUtil() {

    }

    /**
     * 把一个Map的键值对拼接成“参数=值&参数=值”即“username=yt&word=Ok”，默认是排序的和编码的
     *
     * @param params 需要排序并参与字符拼接的参数组
     * @return 拼接后字符串，例如：username=yt&password=12345688
     * @throws MyException 异常
     */
    public static String generateLinkParameter(Map<String, String> params) throws MyException {
        return generateLinkParameter(params, true, true, false);
    }

    /**
     * 把一个Map的键值对拼接成“参数=值&参数=值”即“username=yt&word=Ok”，默认是排序的和编码的
     *
     * @param params          需要排序并参与字符拼接的参数组
     * @param hasQuestionMark 是否需要?
     * @return 拼接后字符串，例如：username=yt&password=12345688、?username=yt&password=12345688
     * @throws MyException 异常
     */
    public static String generateLinkParameter(Map<String, String> params, boolean hasQuestionMark) throws MyException {
        return generateLinkParameter(params, true, true, hasQuestionMark);
    }

    /**
     * 把一个Map的键值对拼接成“参数=值&参数=值”即“username=yt&password=12345688”
     *
     * @param params          需要排序并参与字符拼接的参数组
     * @param isEncode        是否需要url Encode
     * @param isSort          参数是否需要排序
     * @param hasQuestionMark 是否需要?
     * @return 拼接后字符串，例如：username=yt&password=12345688、?username=yt&password=12345688
     * @throws MyException 异常
     */
    public static String generateLinkParameter(Map<String, String> params, boolean isSort, boolean isEncode,
                                               boolean hasQuestionMark) throws MyException {
        try {
            List<String> keys = new ArrayList<String>(params.keySet());
            // 按首字母排序
            if (isSort) {
                Collections.sort(keys);
            }
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < keys.size(); i++) {
                String key = keys.get(i);
                String value = params.get(key);
                // 是否需要urlEncode
                if (isEncode) {
                    value = URLEncoder.encode(value, "UTF-8");
                }
                // 拼接时，不包括最后一个&字符
                if (i == keys.size() - 1) {
                    sb.append(key).append("=").append(value);
                } else {
                    sb.append(key).append("=").append(value).append("&");
                }
            }
            // 是否需要?
            if (hasQuestionMark) {
                return String.format("?%s", sb.toString());
            } else {
                return sb.toString();
            }
        } catch (Exception ex) {
            throw new MyException(ex);
        }
    }


}
