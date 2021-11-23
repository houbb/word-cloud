package com.github.houbb.word.cloud.support.background;

import com.github.houbb.heaven.util.common.ArgUtil;
import com.github.houbb.word.cloud.exception.WordCloudException;
import com.kennycason.kumo.bg.Background;
import com.kennycason.kumo.bg.PixelBoundryBackground;

import java.io.IOException;

/**
 * 图片背景
 * @author binbin.hou
 * @since 1.3.0
 */
public class BackgroundImage implements IBackground{

    private final String imagePath;

    public BackgroundImage(String imagePath) {
        ArgUtil.notEmpty(imagePath, "imagePath");
        this.imagePath = imagePath;
    }

    /**
     * 没有背景
     *
     * @return 背景
     */
    public Background background() {
        try {
            return new PixelBoundryBackground(imagePath);
        } catch (IOException e) {
            throw new WordCloudException(e);
        }
    }

}
