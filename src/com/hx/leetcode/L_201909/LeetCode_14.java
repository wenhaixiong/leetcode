package com.hx.leetcode.L_201909;

/**
 * @author: wenhx
 * @date: Created in 2019/9/29 09:24
 * @description: LeetCode_14：最长公共前缀
 * @level: simple
 * @status: finish
 * @version: $1.0
 */
public class LeetCode_14 {
    /**
     * 计算最长公共前缀
     */
    public String longestCommonPrefix(String[] strs) {
        String result = "";
        if (strs.length == 0) {
            result = "";
        } else {
            // 寻找一个最短字符串的长度
            int minLen = strs[0].length();
            for (String str : strs) {
                int length = str.length();
                minLen = length < minLen ? length : minLen;
            }
            for (int i = 0; i < minLen; i++) {
                for (int j = 0; j < strs.length - 1; j++) {
                    // 第i个位置，每个字符逐个比对
                    if (strs[j].charAt(i) != strs[j + 1].charAt(i)) {
                        return result;
                    }
                }
                result += strs[0].charAt(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        LeetCode_14 leetCode_14 = new LeetCode_14();
        String[] strs = {};
        System.out.println("最长公共前缀为：" + leetCode_14.longestCommonPrefix(strs));
    }
}
