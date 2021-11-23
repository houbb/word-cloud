package com.github.houbb.word.cloud.support.font;

import com.kennycason.kumo.font.FontWeight;
import com.kennycason.kumo.font.KumoFont;

/**
 * 默认的字体实现
 *
 * @author binbin.hou
 * @since 1.3.0
 */
public final class WordKumoFonts {

    private WordKumoFonts(){}

    public static IWordKumoFont kumo(String type, FontWeight weight) {
        return new WordKumoFont(type, weight);
    }

    public static IWordKumoFont kumo() {
        return new WordKumoFont("Default", FontWeight.BOLD);
    }

}
