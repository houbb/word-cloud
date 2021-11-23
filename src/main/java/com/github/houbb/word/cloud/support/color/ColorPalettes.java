package com.github.houbb.word.cloud.support.color;

import java.awt.*;

/**
 * 色彩
 *
 * @author binbin.hou
 * @since 1.3.0
 */
public final class ColorPalettes {

    private ColorPalettes(){}

    /**
     * @since 1.3.0
     * @param colors 色彩数组
     * @return 结果
     */
    public static IColorPalette arrayColor(Color[] colors) {
        return new ArrayColorPalette(colors);
    }

    /**
     * 单个色彩
     * @param r 红
     * @param g 绿
     * @param b 蓝色
     * @return 结果
     * @since 1.3.0
     */
    public static IColorPalette single(int r, int g, int b) {
        return new SingleColorPalette(r, g, b);
    }

    /**
     * 单个色彩-默认
     * @return 结果
     * @since 1.3.0
     */
    public static IColorPalette single() {
        return new SingleColorPalette();
    }

    /**
     * 随机色彩-
     * @param size 随机的色彩个数
     * @return 结果
     * @since 1.3.0
     */
    public static IColorPalette random(int size) {
        return new RandomColorPalette(size);
    }

    /**
     * 随机色彩
     * @return 结果
     * @since 1.3.0
     */
    public static IColorPalette random() {
        return new RandomColorPalette();
    }

}
