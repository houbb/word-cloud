# 创作背景

可以随时生成一副很酷的云图，一直是个人的梦想。

很久以前，写过一个简单版本：http://houbb.github.io/tools/wordCloud.html。

效果如下：

![js_online](https://github.com/houbb/word-cloud/raw/master/js_online.png)

不过存在一些小问题：

1. 无法自动分词

2. 无法根据词频设置字体大小

于是自己在 github 上逛了一圈，发现了 [kumo](https://github.com/kennycason/kumo) 这一款开源工具，
入门体验发现要写 10 多行代码才能实现一个最基本的云图。

这很不优雅，于是决定基于 kumo 实现一个更加易用的版本。

# word-cloud

[word-cloud](https://github.com/houbb/word-cloud) 是一款为 java 设计的云图生成工具。

[![Build Status](https://travis-ci.com/houbb/word-cloud.svg?branch=master)](https://travis-ci.com/houbb/word-cloud)
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/com.github.houbb/word-cloud/badge.svg)](http://mvnrepository.com/artifact/com.github.houbb/word-cloud)
[![](https://img.shields.io/badge/license-Apache2-FF0080.svg)](https://github.com/houbb/word-cloud/blob/master/LICENSE.txt)
[![Open Source Love](https://badges.frapsoft.com/os/v2/open-source.svg?v=103)](https://github.com/houbb/word-cloud)

## 特性

- 极简 api，一行代码搞定一切

- 支持自定义云图背景

- 支持中英文分词，默认对用户透明

- 支持停顿词过滤，默认对用户透明

- 支持各种用户自定义配置

> [变更日志](https://github.com/houbb/word-cloud/blob/master/CHANGELOG.md)

# 快速开始

## maven 引入

```xml
<dependency>
     <groupId>com.github.houbb</groupId>
     <artifactId>word-cloud</artifactId>
     <version>1.2.2</version>
</dependency>
```

## 使用

```java
WordCloudHelper.wordCloud("该作讲述的是一个名为德特茅斯的衰落小镇下掩埋着一个古老的废弃王国，名叫圣巢。这个王国被瘟疫所侵蚀而废弃，废弃的原因则是因为名为辐光的光之古神，她可以通过思想来传播瘟疫，被瘟疫侵蚀的虫子都会被本能所支配，失去心智。\n" +
                "这个王国的主人——苍白之王，自然不会坐视不管，他在圣巢范围之下的深渊，利用另一种远古力量“虚空”可以压制光明的特性，制造了容器一族。其中一位被选中的容器用来封印瘟疫，并被命名为空洞骑士。为了封印的稳固，白王寻找了三个守梦人来进一步巩固封印，三位守梦人的名称分别为守望者 - 卢瑞恩，导师 - 莫诺蒙，野兽 - 赫拉。但之后苍白之王不知去向，不完美的容器的力量的也变得逐渐虚弱，最终被辐光控制。主角就要穿过圣巢的各地，在安息之地中，我们受到曾经辐光的信徒和眷族——飞蛾族唯一留下的族人的帮助，获得了和辐光力量同源的梦之武器——梦之钉。梦之钉可以读取生物内心的想法，并可以打破守梦人的保护，进入到其梦境之中杀死守梦人。杀死了三位守梦人并解开封印后，可选的结局有到达十字路里的黑卵神殿打败空洞骑士或去到在“寻神者”更新中新加入的地点“神居”并挑战圣巢万神殿。");
```

效果:

![out.png](https://github.com/houbb/word-cloud/raw/master/out.png)

## 支持背景

我们以鲸鱼的背景，可以让文字以图像的形式展现：

```java
String imagePath = "backgrounds\\whale_small.png";
WordCloudHelper.wordCloud(text, "out_bg.png", imagePath);
```

效果如下：

![out_bg.png](https://github.com/houbb/word-cloud/raw/master/out_bg.png)

# Road-Map

- [x] 默认的形状，图片。

- [x] 引入图片背景

- [ ] 默认的字体优化

- [ ] image 居中

# 开源

本来是抱着自娱自乐的目的写了这个小工具，但是感觉还是应该把这个应用开源出来。

因为没有 [kumo](https://github.com/kennycason/kumo) 的开源，也就没有这一款工具。 

开源地址：[https://github.com/houbb/word-cloud](https://github.com/houbb/word-cloud)

如果喜欢，不妨给个 star 鼓励一下作者。

希望和你一起，见证最好用的云图工具的成长。