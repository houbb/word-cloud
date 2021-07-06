package com.github.houbb.word.cloud.util;

import com.github.houbb.heaven.util.lang.ObjectUtil;
import com.github.houbb.heaven.util.lang.StringUtil;
import com.github.houbb.word.cloud.bs.WordCloudBs;
import com.github.houbb.word.cloud.exception.WordCloudException;
import com.kennycason.kumo.bg.Background;
import com.kennycason.kumo.bg.PixelBoundryBackground;

import java.io.IOException;
import java.io.InputStream;

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
     * @param backgroundImagePath 背景图路径
     * @since 1.0.0
     */
    public static void wordCloud(final String text,
                                 final String outPath,
                                 final String backgroundImagePath) {
        try {
            Background background = null;
            if(StringUtil.isNotEmptyTrim(backgroundImagePath)) {
                background = new PixelBoundryBackground(backgroundImagePath);
            }
            WordCloudBs.newInstance()
                    .text(text)
                    .outPath(outPath)
                    .background(background)
                    .wordCloud();
        } catch (IOException e) {
            throw new WordCloudException(e);
        }
    }

    /**
     * 云图
     * @param text 文本
     * @param outPath 输出路径
     * @param inputStreamBg 背景图输入流
     * @since 1.2.0
     */
    public static void wordCloud(final String text,
                                 final String outPath,
                                 final InputStream inputStreamBg) {
        try {
            Background background = null;
            if(ObjectUtil.isNotNull(inputStreamBg)) {
                background = new PixelBoundryBackground(inputStreamBg);
            }
            WordCloudBs.newInstance()
                    .text(text)
                    .outPath(outPath)
                    .background(background)
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
        String imagePath = null;
        wordCloud(text, outPath, imagePath);
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
