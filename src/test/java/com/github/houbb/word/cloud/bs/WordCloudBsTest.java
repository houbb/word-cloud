package com.github.houbb.word.cloud.bs;

import com.github.houbb.nlp.hanzi.similar.util.ChaiziHelper;
import com.github.houbb.word.cloud.support.background.Backgrounds;
import com.github.houbb.word.cloud.support.color.ColorPalettes;
import com.github.houbb.word.cloud.support.freq.WordFrequencies;
import org.junit.Ignore;
import org.junit.Test;

import java.awt.*;

/**
 * @author binbin.hou
 * @since 1.0.0
 */
@Ignore
public class WordCloudBsTest {

    @Test
    public void enTest() {
        WordCloudBs.newInstance()
                .text("hello world! hello word cloud!")
                .wordCloud();
    }

    @Test
    public void zhTest() {
        final String text  = "怒发冲冠，凭栏处、潇潇雨歇。抬望眼，仰天长啸，壮怀激烈。三十功名尘与土，八千里路云和月。";

        String result = ChaiziHelper.chai(text);

        String imagePath = "D:\\gitee2\\word-cloud\\src\\test\\resources\\backgrounds\\扇子.png";

        Color[] colors = new Color[]{new Color(130, 130, 130), new Color(200, 200, 200)};
        WordCloudBs.newInstance().text(result)
                .wordFrequency(WordFrequencies.single())
                .background(Backgrounds.image(imagePath))
                .backgroundColor(Color.BLACK)
                .colorPalette(ColorPalettes.arrayColor(colors))
                .outPath("out_chaizi.png")
                .wordCloud();
    }

}
