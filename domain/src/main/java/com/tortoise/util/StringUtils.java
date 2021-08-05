package com.tortoise.util;

/**
 * @author pengli
 * @create 2021-08-05 15:27
 *
 * 字符串处理工具类
 */
public class StringUtils {

    /**
     * 组装baidu . url字符串
     * @return
     */
    public static String AssembleStringBaiduUrl(String key,int num){
        //https://www.baidu.com/s?wd=key & pn=30    pn=30/10;
        StringBuilder sb=new StringBuilder();
        sb.append("https://www.baidu.com/s?wd=");
        sb.append(key+"&pn=");
        sb.append(num*10);
        return sb.toString();
    }
}
