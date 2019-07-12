package com.egoist.gzeport.common.util;

import org.w3c.dom.Document;

import javax.xml.crypto.dsig.*;
import javax.xml.crypto.dsig.dom.DOMSignContext;
import javax.xml.crypto.dsig.keyinfo.KeyInfo;
import javax.xml.crypto.dsig.keyinfo.KeyInfoFactory;
import javax.xml.crypto.dsig.keyinfo.KeyValue;
import javax.xml.crypto.dsig.spec.C14NMethodParameterSpec;
import javax.xml.crypto.dsig.spec.TransformParameterSpec;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.Collections;

/**
 *
 */
public class XmlDigitalSignatureGenerator {


    /**
     * Method used to get the KeyInfo
     *
     * @param xmlSigFactory XMLSignatureFactory
     * @param publicKeyPath publicKeyPath
     * @return KeyInfo
     * @throws Exception 异常
     */
    private static KeyInfo getKeyInfo(XMLSignatureFactory xmlSigFactory, String publicKeyPath)
            throws Exception {
        PublicKey publicKey = new KryptoUtil().getStoredPublicKey(publicKeyPath);
        KeyInfoFactory keyInfoFact = xmlSigFactory.getKeyInfoFactory();
        KeyValue keyValue = keyInfoFact.newKeyValue(publicKey);
        KeyInfo keyInfo = keyInfoFact.newKeyInfo(Collections.singletonList(keyValue));
        return keyInfo;
    }

    /**
     * Method used to get the KeyInfo
     *
     * @param xmlSigFactory XMLSignatureFactory
     * @param x509CertFilePath x509CertFilePath
     * @return KeyInfo
     */
//    private static KeyInfo getKeyInfo(XMLSignatureFactory xmlSigFactory, String x509CertFilePath) {
//        KeyInfo keyInfo = null;
//        KeyInfoFactory keyInfoFact = xmlSigFactory.getKeyInfoFactory();
//        KeyName keyName = null;
//        X509Data x509Data = null;
//        List<Object> list = new ArrayList<>();
//        try {
//            CertificateInfo certificateInfo = new CertificateInfo(x509CertFilePath);
//            keyName = keyInfoFact.newKeyName(certificateInfo.getSerialNumber());
//            x509Data = keyInfoFact.newX509Data(Collections.singletonList(certificateInfo.getX509Certificate()));
//            list.add(keyName);
//            list.add(x509Data);
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }
//        keyInfo = keyInfoFact.newKeyInfo(list);
//        return keyInfo;
//    }

    /**
     * 生成文件
     *
     * @param doc                    doc
     * @param destnSignedXmlFilePath destnSignedXmlFilePath
     * @return boolean 上传成功/失败
     */
    public static boolean storeSignedDoc(Document doc, String destnSignedXmlFilePath) {
        TransformerFactory transFactory = TransformerFactory.newInstance();
        Transformer trans = null;
        boolean isOk = false;
        try {
            trans = transFactory.newTransformer();
            StreamResult streamRes = new StreamResult(new File(destnSignedXmlFilePath));
            trans.transform(new DOMSource(doc), streamRes);
            isOk = true;
        } catch (Exception ex) {
            isOk = false;
        }
        return isOk;
    }

    /**
     * 生成签名文件
     *
     * @param originalXmlFilePath    未加密xml文件位置
     * @param destnSignedXmlFilePath 加密后文件存放位置
     * @param privateKeyFilePath     私钥路径
     * @param publicKeyFilePath      公钥路径
     * @throws Exception 异常
     */
    public void generateXMLDigitalSignature(String originalXmlFilePath,
                                            String destnSignedXmlFilePath, String privateKeyFilePath, String publicKeyFilePath)
            throws Exception {
        //Get the XML Document object
        Document doc = XmlDocumentCreate.getXmlDocument(originalXmlFilePath);
        //Create XML Signature Factory
        XMLSignatureFactory xmlSigFactory = XMLSignatureFactory.getInstance("DOM");
        PrivateKey privateKey = new KryptoUtil().getStoredPrivateKey(privateKeyFilePath);

        DOMSignContext domSignCtx = new DOMSignContext(privateKey, doc.getDocumentElement());
        Reference ref = null;
        SignedInfo signedInfo = null;

        ref = xmlSigFactory.newReference("", xmlSigFactory.newDigestMethod(DigestMethod.SHA1, null),
                Collections.singletonList(xmlSigFactory.newTransform(Transform.ENVELOPED,
                        (TransformParameterSpec) null)), null, null);
        signedInfo = xmlSigFactory.newSignedInfo(
                xmlSigFactory.newCanonicalizationMethod(CanonicalizationMethod.INCLUSIVE,
                        (C14NMethodParameterSpec) null),
                xmlSigFactory.newSignatureMethod(SignatureMethod.RSA_SHA1, null),
                Collections.singletonList(ref));

        KeyInfo keyInfo = getKeyInfo(xmlSigFactory, publicKeyFilePath);
        XMLSignature xmlSignature = xmlSigFactory.newXMLSignature(signedInfo, keyInfo);

        //Sign the document
        xmlSignature.sign(domSignCtx);

        //Store the digitally signed document inta a location
        storeSignedDoc(doc, destnSignedXmlFilePath);
    }


    /**
     * 生成加密密文
     *
     * @param originalXmlContent 原始xml内容
     * @param privateKeyFilePath 私钥路径
     * @param publicKeyFilePath  公钥路径
     * @return String 加签后的报文
     * @throws Exception Exception
     */
    public static String generateXMLDigitalSignature(String originalXmlContent, String privateKeyFilePath,
                                                     String publicKeyFilePath) throws Exception {
        try {
            Document doc = XmlDocumentCreate.getXmlDocumentByStr(originalXmlContent);
            //Create XML Signature Factory
            XMLSignatureFactory xmlSigFactory = XMLSignatureFactory.getInstance("DOM");
            PrivateKey privateKey = new KryptoUtil().getStoredPrivateKey(privateKeyFilePath);
            DOMSignContext domSignCtx = new DOMSignContext(privateKey, doc.getDocumentElement());
            Reference ref = xmlSigFactory.newReference("", xmlSigFactory.newDigestMethod(DigestMethod.SHA1, null),
                    Collections.singletonList(xmlSigFactory.newTransform(Transform.ENVELOPED,
                            (TransformParameterSpec) null)), null, null);
            SignedInfo signedInfo = xmlSigFactory.newSignedInfo(
                    xmlSigFactory.newCanonicalizationMethod(CanonicalizationMethod.INCLUSIVE,
                            (C14NMethodParameterSpec) null),
                    xmlSigFactory.newSignatureMethod(SignatureMethod.RSA_SHA1, null),
                    Collections.singletonList(ref));

            //Pass the Public Key File Path
            KeyInfo keyInfo = getKeyInfo(xmlSigFactory, publicKeyFilePath);
            //Create a new XML Signature
            XMLSignature xmlSignature = xmlSigFactory.newXMLSignature(signedInfo, keyInfo);

            //Sign the document
            xmlSignature.sign(domSignCtx);

            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer t = tf.newTransformer();
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            t.transform(new DOMSource(doc), new StreamResult(bos));
            String xmlStr = bos.toString();
            return xmlStr;
        } catch (Exception e) {
            throw e;
        }
    }
}
