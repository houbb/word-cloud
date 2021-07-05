package com.github.houbb.word.cloud.util;

import com.github.houbb.word.cloud.bs.WordCloudBs;
import com.github.houbb.word.cloud.exception.WordCloudException;
import com.kennycason.kumo.bg.PixelBoundryBackground;

import java.io.IOException;

/**
 * @author binbin.hou
 * @since 1.0.0
 */
public final class WordCloudHelper {

    private WordCloudHelper(){}

    /**
     * 云图
     * @param text 文本
     * @param outPath 输出路径
     * @since 1.0.0
     */
    public static void wordCloud(final String text,
                                 final String outPath,
                                 final String backgroundImagePath) {
        try {
            WordCloudBs.newInstance()
                    .text(text)
                    .outPath(outPath)
                    .background(new PixelBoundryBackground(backgroundImagePath))
                    .wordCloud();
        } catch (IOException e) {
            throw new WordCloudException(e);
        }
    }

    /**
     * 云图
     * @param text 文本
     * @param outPath 输出路径
     * @since 1.0.0
     */
    public static void wordCloud(final String text, final String outPath) {
        wordCloud(text, outPath, null);
    }

    /**
     * 云图
     * @param text 文本
     * @since 1.0.0
     */
    public static void wordCloud(final String text) {
        wordCloud(text, "out.png");
    }

}
