/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.joy.analyzer.html;

import java.util.List;
import org.cyberneko.html.parsers.DOMParser;
import org.joy.analyzer.Document;
import org.joy.analyzer.Paragraph;

/**
 * HTML�ı��ࡣ
 * @author Lamfeeling
 */
public class HTMLDocument extends Document {

    private org.w3c.dom.Document doc;

    /**
     * ��ָ�����ַ����й���һ��HTMLDocument
     * @param str ���ƶ����ַ���
     * @return ��ָ�����ַ���������ĵ���
     */
    public HTMLDocument createHTMLDocument(String str) {
        DOMParser parser = new DOMParser();
        Document doc = (Document) parser.getDocument();
        //TODO: ������������HTML�Ĵ���
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * �ܱ����Ĺ��췽����������ֱ�ӹ���
     * @param content ���ڹ����ĵ����ַ���
     * @param doc �����ķ�������������Document��
     */
    protected HTMLDocument(String content, org.w3c.dom.Document doc) {
        super(content);
        this.doc = doc;
    }

    /**
     * ��ȡ�ı��е����Ķ���
     * @return �����ĵ��е����Ķ���ļ���
     */
    @Override
    public List<Paragraph> getParagraphs() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * ����HTML�ĵ������Ӽ���
     * @return HTML�ĵ������Ӽ���
     */
    public List<Anchor> getAnchors() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * ����HTML�ı��ı���
     * @return HTML�ı��ı���
     */
    @Override
    public String getTitle() {
        return doc.getElementsByTagName("TITLE").item(0).getTextContent();
    }

    /**
     * �����ı������ĵ�DOM��
     * @return Dom���ĵ�����
     */
    public org.w3c.dom.Document getDoc() {
        return doc;
    }
}
