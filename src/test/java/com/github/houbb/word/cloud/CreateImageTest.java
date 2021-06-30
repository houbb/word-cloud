//package com.github.houbb.word.cloud;
//
//import com.kennycason.kumo.CollisionMode;
//import com.kennycason.kumo.WordCloud;
//import com.kennycason.kumo.WordFrequency;
//import com.kennycason.kumo.bg.PixelBoundryBackground;
//import com.kennycason.kumo.font.scale.LinearFontScalar;
//import com.kennycason.kumo.nlp.FrequencyAnalyzer;
//import com.kennycason.kumo.palette.ColorPalette;
//import org.junit.Test;
//
//import java.awt.*;
//import java.io.IOException;
//
//import static com.github.houbb.heaven.util.io.StreamUtil.getInputStream;
//
///**
// * @author binbin.hou
// * @since 1.0.0
// */
//public class CreateImageTest {
//
//    @Test
//    public void genTest() throws IOException {
//        final FrequencyAnalyzer frequencyAnalyzer = new FrequencyAnalyzer();
//        frequencyAnalyzer.setWordFrequenciesToReturn(300);
//        frequencyAnalyzer.setMinWordLength(4);
//        frequencyAnalyzer.setStopWords(loadStopWords());
//
//        List<WordFrequency> wordFrequencies = frequencyAnalyzer.load(getInputStream("text/datarank.txt"));
//        final Dimension dimension = new Dimension(500, 312);
//        final WordCloud wordCloud = new WordCloud(dimension, CollisionMode.PIXEL_PERFECT);
//        wordCloud.setPadding(2);
//        wordCloud.setBackground(new PixelBoundryBackground(getInputStream("backgrounds/whale_small.png")));
//        wordCloud.setColorPalette(new ColorPalette(new Color(0x4055F1), new Color(0x408DF1), new Color(0x40AAF1), new Color(0x40C5F1), new Color(0x40D3F1), new Color(0xFFFFFF)));
//        wordCloud.setFontScalar(new LinearFontScalar(10, 40));
//        wordCloud.build(wordFrequencies);
//        wordCloud.writeToFile("output/whale_wordcloud_small.png");
//    }
//
//}
