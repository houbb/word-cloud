package com.github.houbb.word.cloud.support.font;

import com.kennycason.kumo.font.FontWeight;
import com.kennycason.kumo.font.KumoFont;

/**
 * 默认的字体实现
 *
 * @author binbin.hou
 * @since 1.3.0
 */
public class WordKumoFont implements IWordKumoFont {

    private final String type;

    private final FontWeight weight;

    public WordKumoFont(String type, FontWeight weight) {
        this.type = type;
        this.weight = weight;
    }

    @Override
    public KumoFont font() {
        return new KumoFont(type, weight);
    }

}
