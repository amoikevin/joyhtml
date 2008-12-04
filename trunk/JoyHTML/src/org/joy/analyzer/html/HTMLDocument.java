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
    private List<Anchor> anchors;
    private List<Paragraph> paragraphs;
    /**
     * ��ָ�����ַ����й���һ��HTMLDocument
     * @param str ���ƶ����ַ���
     * @return ��ָ�����ַ���������ĵ���
     */
    public static HTMLDocument createHTMLDocument(String str) {
        DOMParser parser = new DOMParser();
        org.w3c.dom.Document doc = (org.w3c.dom.Document) parser.getDocument();
        return new HTMLDocument(str, doc);
    }

    /**
     * �ܱ����Ĺ��췽����������ֱ�ӹ���
     * @param content ���ڹ����ĵ����ַ���
     * @param doc �����ķ�������������Document��
     */
    protected HTMLDocument(String content, org.w3c.dom.Document doc) {
        super(content);
        parse();
        this.doc = doc;
    }

    private void parse(){
        //TODO: ���ô����е�Document��������HTML����������д���??����֮�ᣬ���е�˽�б�������������ʵĳ�ʼֵ��
        System.out.println("H");
        throw new UnsupportedOperationException();
    }
    /**
     * ��ȡ�ı��е����Ķ���
     * @return �����ĵ��е����Ķ���ļ���
     */
    @Override
    public List<Paragraph> getParagraphs() {
        return paragraphs;
    }

    /**
     * ����HTML�ĵ������Ӽ���
     * @return HTML�ĵ������Ӽ���
     */
    public List<Anchor> getAnchors() {
        return anchors;
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
