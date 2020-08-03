package com.wenhx.leetcode.L_201910;

import java.util.HashMap;
import java.util.Random;

/**
 * @author: wenhx
 * @date: Created in 2019/10/7 11:44
 * @description: LeetCode_535：TinyURL的加密与解密
 * @level: middle
 * @status: finish
 * @version: $1.0
 */
public class LeetCode_535 {

    private HashMap hashMap = new HashMap<String, String>();

    /**
     * 加密：将一个长的url转换为一个短的url
     * @param longUrl
     * @return
     */
    public String encode(String longUrl) {
        String keyString = "http://tinyurl.com/" + getRandomString(6);
        hashMap.put(keyString, longUrl);
        return keyString;
    }

    /**
     * 解密：将一个短的url转换为一个长的url
     * @param shortUrl
     * @return
     */
    public String decode(String shortUrl) {
        return (String) hashMap.get(shortUrl);
    }

    /**
     * 自定义方法：产生6位数的字符串随机码
     * @param length
     * @return
     */
    public static String getRandomString(int length) {
        String str = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Random random = new Random();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < length; i++) {
            int number = random.nextInt(62);
            sb.append(str.charAt(number));
        }
        return sb.toString();
    }

    /**
     * 主方法：用来测试一下
     * @param args
     */
    public static void main(String[] args) {
        LeetCode_535 codec = new LeetCode_535();
        String longUrl = "https://leetcode.com/problems/design-tinyurl";
        String shortUrl = codec.encode(longUrl);
        System.out.println("加密后的url是：" + shortUrl);
        System.out.println("解密后的url是：" + codec.decode(shortUrl));
    }
}
