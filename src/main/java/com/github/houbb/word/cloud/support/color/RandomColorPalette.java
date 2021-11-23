package com.github.houbb.word.cloud.support.color;

import com.kennycason.kumo.palette.ColorPalette;

import java.awt.*;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 * @author binbin.hou
 * @since 1.0.0
 */
public class RandomColorPalette implements IColorPalette {

    private final int size;

    public RandomColorPalette(int size) {
        this.size = size;
    }

    public RandomColorPalette() {
        this(5);
    }

    @Override
    public ColorPalette color() {
        final Random random = ThreadLocalRandom.current();

        final Color[] colors = new Color[size];
        for (int i = 0; i < colors.length; i++) {
            colors[i] = new Color(random.nextInt(230) + 25, random.nextInt(230) + 25, random.nextInt(230) + 25);
        }
        return new ColorPalette(colors);
    }

}
