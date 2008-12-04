/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.joy.analyzer;

import java.util.List;

/**
 * �����ĵ���
 * @author Lamfeeling
 */
public abstract class Document {
    private String content;

    protected abstract List<Paragraph> getParagraphs();
    protected abstract String getTitle();

    /**
     * ����һ�������ĵ�
     * @param content �ĵ����Ը�������ʽ����δ���ı�Ĵ��ַ�����ʽ
     */
    public Document(String content) {
        this.content = content;
    }

    /**
     * ��ȡ�ĵ��Ĵ��ַ�����ʽ��
     * @return Ҫ�������ĵ��ַ�����ʽ
     */
    public String getContent() {
        return content;
    }
}
