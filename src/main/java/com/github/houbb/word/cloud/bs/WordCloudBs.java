package com.github.houbb.word.cloud.bs;

import com.github.houbb.word.cloud.support.background.Backgrounds;
import com.github.houbb.word.cloud.support.background.IBackground;
import com.github.houbb.word.cloud.support.color.ColorPalettes;
import com.github.houbb.word.cloud.support.color.IColorPalette;
import com.github.houbb.word.cloud.support.font.IWordKumoFont;
import com.github.houbb.word.cloud.support.font.WordKumoFonts;
import com.github.houbb.word.cloud.support.fontscalar.IWordFontScalar;
import com.github.houbb.word.cloud.support.fontscalar.WordFontScalars;
import com.github.houbb.word.cloud.support.freq.IWordFrequency;
import com.github.houbb.word.cloud.support.freq.WordFrequencies;
import com.github.houbb.word.cloud.support.freq.WordFrequencyContext;
import com.kennycason.kumo.CollisionMode;
import com.kennycason.kumo.WordCloud;
import com.kennycason.kumo.WordFrequency;
import com.kennycason.kumo.bg.Background;

import java.awt.*;
import java.util.List;

/**
 * @author binbin.hou
 * @since 1.0.0
 */
public class WordCloudBs {

    private WordCloudBs(){}

    public static WordCloudBs newInstance() {
        return new WordCloudBs();
    }

    /**
     * 目标路径
     * @since 1.0.0
     */
    private String outPath = "out.png";

    /**
     * 文本内容
     * @since 1.0.0
     */
    private String text = "我爱云图，云图爱我";

    /**
     * 宽度
     * @since 1.0.0
     */
    private int width = 800;

    /**
     * 高度
     * @since 1.0.0
     */
    private int height = 600;

    /**
     * padding 的大小
     * @since 1.0.0
     */
    private int padding = 0;

    /**
     * 碰撞模式
     * @since 1.0.0
     */
    private CollisionMode collisionMode = CollisionMode.PIXEL_PERFECT;

    /**
     * 背景色
     */
    private Color backgroundColor = Color.WHITE;

    /**
     * 词频实现
     * @since 1.0.0
     */
    private IWordFrequency wordFrequency = WordFrequencies.defaults();

    /**
     * 背景
     */
    private IBackground background = Backgrounds.none();

    /**
     * 色彩
     * @since 1.3.0
     */
    private IColorPalette colorPalette = ColorPalettes.random();

    /**
     * 字体标量
     * @since 1.3.0
     */
    private IWordFontScalar fontScalar = WordFontScalars.linear();

    /**
     * 字体
     * @since 1.3.0
     */
    private IWordKumoFont kumoFont = WordKumoFonts.kumo();

    /**
     * 限制数量
     * @since 1.3.0
     */
    private int limit = Integer.MAX_VALUE;

    public WordCloudBs outPath(String outPath) {
        this.outPath = outPath;
        return this;
    }

    public WordCloudBs text(String text) {
        this.text = text;
        return this;
    }

    public WordCloudBs width(int width) {
        this.width = width;
        return this;
    }

    public WordCloudBs height(int height) {
        this.height = height;
        return this;
    }

    public WordCloudBs padding(int padding) {
        this.padding = padding;
        return this;
    }

    public WordCloudBs collisionMode(CollisionMode collisionMode) {
        this.collisionMode = collisionMode;
        return this;
    }

    public WordCloudBs backgroundColor(Color backgroundColor) {
        this.backgroundColor = backgroundColor;
        return this;
    }

    public WordCloudBs wordFrequency(IWordFrequency wordFrequency) {
        this.wordFrequency = wordFrequency;
        return this;
    }

    public WordCloudBs background(IBackground background) {
        this.background = background;
        return this;
    }

    public WordCloudBs colorPalette(IColorPalette colorPalette) {
        this.colorPalette = colorPalette;
        return this;
    }

    public WordCloudBs fontScalar(IWordFontScalar fontScalar) {
        this.fontScalar = fontScalar;
        return this;
    }

    public WordCloudBs kumoFont(IWordKumoFont kumoFont) {
        this.kumoFont = kumoFont;
        return this;
    }

    public WordCloudBs limit(int limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 执行
     * @since 1.0.0
     */
    public void wordCloud() {
        //1. 获取词频
        WordFrequencyContext frequencyContext = new WordFrequencyContext();
        frequencyContext.text(text).limit(limit);
        final List<WordFrequency> wordFrequencies = this.wordFrequency.freq(frequencyContext);

        final Dimension dimension = new Dimension(width, height);
        final WordCloud wordCloud = new WordCloud(dimension, collisionMode);
        wordCloud.setPadding(padding);
        wordCloud.setBackgroundColor(this.backgroundColor);

        wordCloud.setColorPalette(colorPalette.color());
        Background backgroundVal = background.background();
        if(backgroundVal != null) {
            wordCloud.setBackground(backgroundVal);
        }
        wordCloud.setFontScalar(fontScalar.fontScalar());
        wordCloud.setKumoFont(kumoFont.font());

        wordCloud.build(wordFrequencies);
        wordCloud.writeToFile(this.outPath);
    }

}
