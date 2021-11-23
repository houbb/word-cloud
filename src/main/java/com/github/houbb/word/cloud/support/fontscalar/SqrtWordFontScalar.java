package com.github.houbb.word.cloud.support.fontscalar;

import com.kennycason.kumo.font.scale.FontScalar;
import com.kennycason.kumo.font.scale.LinearFontScalar;
import com.kennycason.kumo.font.scale.SqrtFontScalar;

/**
 * SQRT
 * @author binbin.hou
 * @since 1.0.0
 */
public class SqrtWordFontScalar implements IWordFontScalar {

    private final int min;

    private final int max;

    public SqrtWordFontScalar(int min, int max) {
        this.min = min;
        this.max = max;
    }

    @Override
    public FontScalar fontScalar() {
        return new SqrtFontScalar(min, max);
    }

}
