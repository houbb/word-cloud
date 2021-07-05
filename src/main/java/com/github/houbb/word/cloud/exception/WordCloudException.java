package com.github.houbb.word.cloud.exception;

/**
 * @author binbin.hou
 * @since 1.2.0
 */
public class WordCloudException extends RuntimeException {

    public WordCloudException() {
    }

    public WordCloudException(String message) {
        super(message);
    }

    public WordCloudException(String message, Throwable cause) {
        super(message, cause);
    }

    public WordCloudException(Throwable cause) {
        super(cause);
    }

    public WordCloudException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
