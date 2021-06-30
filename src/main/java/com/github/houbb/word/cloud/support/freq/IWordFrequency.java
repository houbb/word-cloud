package com.github.houbb.word.cloud.support.freq;

import com.github.houbb.heaven.annotation.CommonEager;
import com.kennycason.kumo.WordFrequency;

import java.util.List;

/**
 * @author binbin.hou
 * @since 1.0.0
 */
@CommonEager
public interface IWordFrequency {

    List<WordFrequency> freq(final WordFrequencyContext context);

}
