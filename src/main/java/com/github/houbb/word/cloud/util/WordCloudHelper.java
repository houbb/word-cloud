package com.github.houbb.word.cloud.util;

import com.github.houbb.word.cloud.bs.WordCloudBs;

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
    public static void wordCloud(final String text, final String outPath) {
        WordCloudBs.newInstance()
                .text(text)
                .outPath(outPath)
                .wordCloud();
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
