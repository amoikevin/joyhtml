/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.joy.analyzer.scoring;

import org.joy.analyzer.Paragraph;

/**
 * Paragraph Weighted Frequency Scorer，包含段落权重的频率打分法
 * @note 需要的传入bean参数：paragraphs
 * @author Administrator
 */
public class PWFScorer extends Scorer {

    public PWFScorer() {
    }

    @Override
    public double getScore(String term) {
        double score = .0;
        for (Paragraph p : paragraphs) {
            int freqInP = 0, index;
            index = p.getText().indexOf(term);
            while (index != -1) {
                freqInP++;
                index = p.getText().indexOf(term, index + 1);
            }
            score += freqInP * p.getWeight();
        }
        return score;
    }
}
