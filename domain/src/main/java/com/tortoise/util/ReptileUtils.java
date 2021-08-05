package com.tortoise.util;

import com.tortoise.dto.ReptileObject;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author pengli
 * @create 2021-08-05 14:26
 *
 * 爬虫工具类
 */
public class ReptileUtils {

    /**
     *  只能爬取百度结果的时候
     *  通过关键词爬取百度的结果集
     */
    public static ReptileObject getBaiduResultByKey(String key,int num) throws IOException {
        String url = StringUtils.AssembleStringBaiduUrl(key, num);
        Document document = getDocumentByUrl(url);
        Elements a = document.select(".result").select(".t").select("a");
        List<String> href = a.eachAttr("href");
        ReptileObject reptileObject=ReptileObject.builder().result(href).build();
        return reptileObject;
    }
    /**
     * 获取直接url的网页文本对象 Document
     *
     * 需要换Accept ！！！！
     * @param url
     * @return
     */
    public static Document getDocumentByUrl(String url){
        Document document =null;
        try {
            document=Jsoup.connect(url)
                    .timeout(10000)
                    .ignoreContentType(true)
                    .userAgent("Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/71.0.3578.98 Safari/537.36")
                    .header("Accept","text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9")
                    .get();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return document;
    }


}
