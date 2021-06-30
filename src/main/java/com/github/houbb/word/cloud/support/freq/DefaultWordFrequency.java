package com.github.houbb.word.cloud.support.freq;

import com.github.houbb.heaven.annotation.CommonEager;
import com.github.houbb.heaven.util.lang.StringUtil;
import com.github.houbb.segment.support.segment.result.impl.SegmentResultHandlers;
import com.github.houbb.segment.util.SegmentHelper;
import com.kennycason.kumo.WordFrequency;

import java.util.*;

/**
 * @author binbin.hou
 * @since 1.0.0
 */
@CommonEager
public class DefaultWordFrequency implements IWordFrequency {

    @Override
    public List<WordFrequency> freq(WordFrequencyContext context) {
        String text = context.text();
        int limit = context.limit();

        if(StringUtil.isEmptyTrim(text)
            || limit <= 0) {
            return Collections.emptyList();
        }

        //1. 分词
        Map<String, Integer> wordCountMap = SegmentHelper.segment(text, SegmentResultHandlers.wordCount());

        //2. 筛选停顿词
        int actualLimit = wordCountMap.size();
        if(actualLimit > limit) {
            actualLimit = limit;
        }
        PriorityQueue<WordFrequency> priorityQueues = new PriorityQueue<>(actualLimit, new Comparator<WordFrequency>() {
            @Override
            public int compare(WordFrequency o1, WordFrequency o2) {
                return o2.getFrequency() - o1.getFrequency();
            }
        });

        for(Map.Entry<String,Integer> entry : wordCountMap.entrySet()) {
            String key = entry.getKey();
            if(!context.stopWord().contains(key) && key.length() > 1) {
                WordFrequency frequency = new WordFrequency(key, entry.getValue());
                priorityQueues.add(frequency);
            }
        }

        //4. 过滤只保留结果
        List<WordFrequency> results = new ArrayList<>(actualLimit);
        int count = 0;
        while (count < actualLimit && !priorityQueues.isEmpty()) {
            results.add(priorityQueues.poll());
            count++;
        }

        return results;
    }

}
