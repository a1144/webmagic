package us.codecraft.webmagic.processor.example;

import java.util.Arrays;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.Spider;

public class DuowanBbsProcessor {

  public void spider(){
    Site site = Site.me().setTargetUrls(Arrays.asList("https://www\\.tianyancha\\.com/company/\\w{10}"))
        .setMobilePage(false)
        .setTimeOut(5000)
        .setRetryTimes(2)
        .setCycleRetryTimes(3)
        .setSleepTime(3000);

    //Spider spider = Spider.create(new )

  }

}
