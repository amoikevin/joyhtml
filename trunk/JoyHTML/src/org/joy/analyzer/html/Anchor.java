/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.joy.analyzer.html;

/**
 * ����ê�ı�ʵ���ࡣ
 * @author Lamfeeling
 */
public class Anchor {

    private String text;
    private String URL;

    /**
     * ���캯��
     * @param text ê�ı�
     * @param URL ê�ı�ָ�������
     */
    public Anchor(String text, String URL) {
        this.text = text;
        this.URL = URL;
    }

    public Anchor() {
    }

    public String getText() {
        return text;
    }

    public String getURL() {
        return URL;
    }
}
