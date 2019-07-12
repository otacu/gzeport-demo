package com.egoist.gzeport.common.util;


import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import com.thoughtworks.xstream.io.xml.XmlFriendlyNameCoder;
import org.apache.commons.io.output.StringBuilderWriter;

import java.util.Map;

/**
 * xml转型工具类
 */
public final class XmlTransformUtil {
    /**
     * 隐藏构造函数
     */
    private XmlTransformUtil() {

    }

    /**
     * xml转java对象
     *
     * @param xmlStr xml字符串
     * @param cls    bean类型.class
     * @param <T>    bean类型
     * @return 对象
     */
    public static <T> T toBean(String xmlStr, Class<T> cls) {
        if (xmlStr == null) {
            return null;
        }
        XStream xstream = new XStream(new DomDriver());
        xstream.processAnnotations(cls);
        T obj = (T) xstream.fromXML(xmlStr);
        return obj;
    }

    /**
     * bean转xml字符串
     *
     * @param obj 对象
     * @return xml字符串
     */
    public static String toXml(Object obj) {
        String xmlStr = "";
        if (obj != null) {
            XStream xstream = new XStream(new DomDriver("utf-8", new XmlFriendlyNameCoder("_-", "_"))); //解决双下划线
            xstream.autodetectAnnotations(true); //解析别名
            xstream.aliasSystemAttribute(null, "class"); // 去掉 class 属性
            xmlStr = xstream.toXML(obj);
        }

        xmlStr = xmlStr.replace("\n", "");
        xmlStr = xmlStr.replaceAll("> +", ">");

        return xmlStr;
    }

    /**
     * bean转xml字符串
     *
     * @param obj           对象
     * @param declareParams 头声明参数
     * @return xml字符串
     */
    public static String toXml(Object obj, Map<String, String> declareParams) {
        StringBuilderWriter writer = new StringBuilderWriter(getDeclaration(declareParams));

        String xmlStr = "";
        if (obj != null) {
            XStream xstream = new XStream(new DomDriver("utf-8", new XmlFriendlyNameCoder("_-", "_"))); //解决双下划线
            xstream.autodetectAnnotations(true); //解析别名
            xstream.aliasSystemAttribute(null, "class"); // 去掉 class 属性
            xstream.toXML(obj, writer);
            xmlStr = writer.toString();
        }

        xmlStr = xmlStr.replace("\n", "");
        xmlStr = xmlStr.replaceAll("> +", ">");

        return xmlStr;
    }

    /**
     * 拼装xml头声明
     *
     * @param declareParams 头声明参数
     * @return 结果
     */
    private static StringBuilder getDeclaration(Map<String, String> declareParams) {
        StringBuilder stringBuilder = new StringBuilder("<?xml version=\"1.0\" ");
        declareParams.forEach((key, value) -> {
            stringBuilder.append(key)
                    .append("=")
                    .append("\"")
                    .append(value)
                    .append("\" ");
        });
        stringBuilder.append("?>");
        return stringBuilder;
    }

}
