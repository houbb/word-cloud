package com.github.houbb.word.cloud.support.background;

import com.github.houbb.heaven.support.instance.impl.Instances;
import com.github.houbb.heaven.util.common.ArgUtil;
import com.github.houbb.word.cloud.exception.WordCloudException;
import com.kennycason.kumo.bg.Background;
import com.kennycason.kumo.bg.PixelBoundryBackground;

import java.io.IOException;

/**
 * 背景
 * @author binbin.hou
 * @since 1.3.0
 */
public final class Backgrounds {

    private Backgrounds(){}

    /**
     * 没有背景
     *
     * @return 背景
     */
    public static IBackground none() {
        return Instances.singleton(BackgroundNone.class);
    }

    /**
     * 图片背景
     *
     * @param path 图片路径
     * @return 背景
     */
    public static IBackground image(String path) {
        return new BackgroundImage(path);
    }

}
