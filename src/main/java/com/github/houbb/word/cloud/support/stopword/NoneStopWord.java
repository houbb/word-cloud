package com.github.houbb.word.cloud.support.stopword;

import com.github.houbb.heaven.annotation.CommonEager;
import com.github.houbb.heaven.annotation.ThreadSafe;
import com.github.houbb.stopword.util.StopWordHelper;

/**
 * @author binbin.hou
 * @since 1.0.0
 */
@ThreadSafe
@CommonEager
public class NoneStopWord implements IStopWord {

    @Override
    public boolean contains(String word) {
        return false;
    }

}
