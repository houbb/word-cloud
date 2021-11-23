package com.github.houbb.word.cloud.support.fontscalar;

/**
 * 字体线性
 * @author binbin.hou
 * @since 1.3.0
 */
public class WordFontScalars {

    private WordFontScalars(){}

    /**
     * 线性
     * @return 结果
     */
    public static IWordFontScalar linear() {
        return linear(10, 40);
    }

    /**
     * 线性
     * @param min 最小
     * @param max 最大
     * @return 结果
     */
    public static IWordFontScalar linear(int min, int max) {
        return new LinearWordFontScalar(min, max);
    }

    /**
     * 线性
     * @param min 最小
     * @param max 最大
     * @return 结果
     */
    public static IWordFontScalar sqrt(int min, int max) {
        return new SqrtWordFontScalar(min, max);
    }

}
