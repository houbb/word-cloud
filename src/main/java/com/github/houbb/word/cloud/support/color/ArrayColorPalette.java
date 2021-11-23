package com.github.houbb.word.cloud.support.color;

import com.kennycason.kumo.palette.ColorPalette;

import java.awt.*;

/**
 * 指定色彩列表
 * @author binbin.hou
 * @since 1.3.0
 */
public class ArrayColorPalette implements IColorPalette {

    private final Color[] colorArray;

    public ArrayColorPalette(Color[] colorArray) {
        this.colorArray = colorArray;
    }

    @Override
    public ColorPalette color() {
        return new ColorPalette(colorArray);
    }

}
