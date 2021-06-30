package com.github.houbb.word.cloud.support.stopword;

import com.github.houbb.heaven.annotation.CommonEager;

/**
 * @author binbin.hou
 * @since 1.0.0
 */
@CommonEager
public interface IStopWord {

    /**
     * 是否包含
     * @param word 单词
     * @return 是否
     */
    boolean contains(final String word);

}
