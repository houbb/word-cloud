package com.github.houbb.word.cloud.support.freq;

import com.github.houbb.heaven.support.instance.impl.Instances;

/**
 * @author binbin.hou
 * @since 1.3.0
 */
public final class WordFrequencies {

    private WordFrequencies(){}

    /**
     * 默认词频
     * @return 默认
     * @since 1.3.0
     */
    public static IWordFrequency defaults() {
        return Instances.singleton(DefaultWordFrequency.class);
    }

    /**
     * 单个词频
     * @return 词频
     * @since 1.3.0
     */
    public static IWordFrequency single() {
        return Instances.singleton(SingleWordFrequency.class);
    }

}
