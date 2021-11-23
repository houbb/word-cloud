package com.github.houbb.word.cloud.support.color;

import com.kennycason.kumo.palette.ColorPalette;

import java.awt.*;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 * 固定单个色彩
 * @author binbin.hou
 * @since 1.3.0
 */
public class SingleColorPalette implements IColorPalette {

    /**
     * 红
     */
    private final int red;

    /**
     * 绿
     */
    private final int green;

    /**
     * 蓝
     */
    private final int blue;

    public SingleColorPalette(int red, int green, int blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    public SingleColorPalette() {
        this(0,0,0);
    }

    @Override
    public ColorPalette color() {
        final Color[] colors = new Color[1];
        colors[0] = new Color(red, green, blue);
        return new ColorPalette(colors);
    }

}
