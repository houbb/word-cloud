package com.github.houbb.word.cloud.support.freq;

/**
 * @author binbin.hou
 * @since 1.0.0
 */
public class WordFrequencyContext {

    private String text;

    private int limit;

    public String text() {
        return text;
    }

    public WordFrequencyContext text(String text) {
        this.text = text;
        return this;
    }

    public int limit() {
        return limit;
    }

    public WordFrequencyContext limit(int limit) {
        this.limit = limit;
        return this;
    }

    @Override
    public String toString() {
        return "WordFrequencyContext{" +
                "text='" + text + '\'' +
                ", limit=" + limit +
                '}';
    }

}
