package com.egoist.gzeport.common.util;

import org.w3c.dom.Document;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.*;

/**
 * xml String 转document
 */
public final class XmlDocumentCreate {

    private XmlDocumentCreate() {

    }

    /**
     * 根据xml 文件 生成Document对象
     *
     * @param xmlFilePath , file path of the XML document
     * @return Document
     */
    public static Document getXmlDocument(String xmlFilePath) {
        Document doc = null;
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        dbf.setNamespaceAware(true);
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(xmlFilePath);
            doc = dbf.newDocumentBuilder().parse(fileInputStream);
        } catch (ParserConfigurationException ex) {
            ex.printStackTrace();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (SAXException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }finally {
            if (fileInputStream != null){
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return doc;
    }

    /**
     * 根据xml 字符串 生成Document对象
     *
     * @param xmlFileContent 文件内容
     * @return Document Document
     * @throws Exception Exception
     */
    public static Document getXmlDocumentByStr(String xmlFileContent) throws Exception {
        StringReader sr = new StringReader(xmlFileContent);
        InputSource is = new InputSource(sr);
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        factory.setNamespaceAware(true);
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document doc = builder.parse(is);
        return doc;
    }

    /**
     * 生成XML文件
     * @param xmlContent xml文件内容
     * @param destnSignedXmlFilePath 生成存放的路劲
     * @return 成功/失败
     */
    public static boolean storeXMLDoc(String xmlContent, String destnSignedXmlFilePath) {
        TransformerFactory transFactory = TransformerFactory.newInstance();
        Transformer trans = null;
        boolean isOk = false;
        try {
            Document doc = XmlDocumentCreate.getXmlDocumentByStr(xmlContent);
            trans = transFactory.newTransformer();
            StreamResult streamRes = new StreamResult(new File(destnSignedXmlFilePath));
            trans.transform(new DOMSource(doc), streamRes);
            isOk = true;
        } catch (Exception ex) {
            isOk = false;
        }
        return isOk;
    }


}
