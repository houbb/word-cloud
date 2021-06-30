package com.github.houbb.word.cloud.bs;

import com.github.houbb.word.cloud.support.freq.DefaultWordFrequency;
import com.github.houbb.word.cloud.support.freq.IWordFrequency;
import com.github.houbb.word.cloud.support.freq.WordFrequencyContext;
import com.github.houbb.word.cloud.support.stopword.DefaultStopWord;
import com.github.houbb.word.cloud.support.stopword.IStopWord;
import com.kennycason.kumo.CollisionMode;
import com.kennycason.kumo.WordCloud;
import com.kennycason.kumo.WordFrequency;
import com.kennycason.kumo.bg.Background;
import com.kennycason.kumo.font.FontWeight;
import com.kennycason.kumo.font.KumoFont;
import com.kennycason.kumo.font.scale.FontScalar;
import com.kennycason.kumo.font.scale.LinearFontScalar;
import com.kennycason.kumo.palette.ColorPalette;

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
     * 词频实现
     * @since 1.0.0
     */
    private IWordFrequency wordFrequency = new DefaultWordFrequency();

    /**
     * 停顿词实现
     * @since 1.0.0
     */
    private IStopWord stopWord = new DefaultStopWord();

    /**
     * 文本内容
     * @since 1.0.0
     */
    private String text = "我爱云图，云图爱我";

    /**
     * 限制个数
     * @since 1.0.0
     */
    private int limit = Integer.MAX_VALUE;

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
     * 碰撞模式
     * @since 1.0.0
     */
    private CollisionMode collisionMode = CollisionMode.PIXEL_PERFECT;

    /**
     * padding 的大小
     * @since 1.0.0
     */
    private int padding = 0;

    /**
     * 背景色
     */
    private Color backgroundColor = Color.WHITE;

    /**
     * 背景
     */
    private Background background;

    private FontScalar fontScalar = new LinearFontScalar(10, 40);

    private KumoFont kumoFont = new KumoFont("Default", FontWeight.BOLD);

    private ColorPalette colorPalette = new ColorPalette(new Color(177906), new Color(3654384), new Color(8178662),
            new Color(12904434), new Color(16777215));

    public WordCloudBs outPath(String outPath) {
        this.outPath = outPath;
        return this;
    }

    public WordCloudBs wordFrequency(IWordFrequency wordFrequency) {
        this.wordFrequency = wordFrequency;
        return this;
    }

    public WordCloudBs stopWord(IStopWord stopWord) {
        this.stopWord = stopWord;
        return this;
    }

    public WordCloudBs text(String text) {
        this.text = text;
        return this;
    }

    public WordCloudBs limit(int limit) {
        this.limit = limit;
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

    public WordCloudBs collisionMode(CollisionMode collisionMode) {
        this.collisionMode = collisionMode;
        return this;
    }

    public WordCloudBs padding(int padding) {
        this.padding = padding;
        return this;
    }

    public WordCloudBs backgroundColor(Color backgroundColor) {
        this.backgroundColor = backgroundColor;
        return this;
    }

    public WordCloudBs background(Background background) {
        this.background = background;
        return this;
    }

    public WordCloudBs fontScalar(FontScalar fontScalar) {
        this.fontScalar = fontScalar;
        return this;
    }

    public WordCloudBs kumoFont(KumoFont kumoFont) {
        this.kumoFont = kumoFont;
        return this;
    }

    public WordCloudBs colorPalette(ColorPalette colorPalette) {
        this.colorPalette = colorPalette;
        return this;
    }

    /**
     * 执行
     * @since 1.0.0
     */
    public void wordCloud() {
        //1. 获取词频
        WordFrequencyContext frequencyContext = new WordFrequencyContext();
        frequencyContext.text(text).limit(limit).stopWord(stopWord);
        final List<WordFrequency> wordFrequencies = this.wordFrequency.freq(frequencyContext);

        final Dimension dimension = new Dimension(width, height);
        final WordCloud wordCloud = new WordCloud(dimension, collisionMode);
        wordCloud.setPadding(padding);
        wordCloud.setBackgroundColor(this.backgroundColor);
        if(background != null) {
            wordCloud.setBackground(background);
        }

        wordCloud.setKumoFont(kumoFont);
        wordCloud.setColorPalette(colorPalette);
        wordCloud.setFontScalar(fontScalar);

        wordCloud.build(wordFrequencies);
        wordCloud.writeToFile(this.outPath);
    }

}
