package com.github.houbb.word.cloud.support.freq;

import com.github.houbb.heaven.annotation.CommonEager;
import com.github.houbb.heaven.support.handler.IHandler;
import com.github.houbb.heaven.util.util.CollectionUtil;
import com.github.houbb.word.freq.core.WordFreqResult;
import com.github.houbb.word.freq.util.WordFreqHelper;
import com.kennycason.kumo.WordFrequency;

import java.util.List;

/**
 * @author binbin.hou
 * @since 1.0.0
 */
@CommonEager
public class DefaultWordFrequency implements IWordFrequency {

    @Override
    public List<WordFrequency> freq(WordFrequencyContext context) {
        List<WordFreqResult> wordFreqResults = WordFreqHelper.wordFreq(context.text(),
                context.limit());

        return CollectionUtil.toList(wordFreqResults, new IHandler<WordFreqResult, WordFrequency>() {
            @Override
            public WordFrequency handle(WordFreqResult wordFreqResult) {
                return new WordFrequency(wordFreqResult.word(), wordFreqResult.freq());
            }
        });
    }

}
