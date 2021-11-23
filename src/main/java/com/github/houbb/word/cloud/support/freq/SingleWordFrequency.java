package com.github.houbb.word.cloud.support.freq;

import com.github.houbb.heaven.annotation.CommonEager;
import com.github.houbb.heaven.support.handler.IHandler;
import com.github.houbb.heaven.util.util.CollectionUtil;
import com.github.houbb.word.freq.core.WordFreqResult;
import com.github.houbb.word.freq.util.WordFreqHelper;
import com.kennycason.kumo.WordFrequency;

import java.util.ArrayList;
import java.util.List;

/**
 * 单个汉字，每个字都是当做一个词处理
 * @author binbin.hou
 * @since 1.3.0
 */
@CommonEager
public class SingleWordFrequency implements IWordFrequency {

    @Override
    public List<WordFrequency> freq(WordFrequencyContext context) {
        String text = context.text();
        int limit = Math.min(context.limit(), text.length());

        List<WordFrequency> list = new ArrayList<>(limit);

        for(int i = 0; i < limit; i++) {
            String word = text.charAt(i) + "";
            int freq = 1;

            WordFrequency frequency = new WordFrequency(word, freq);
            list.add(frequency);
        }

        return list;
    }

}
