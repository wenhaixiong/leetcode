package com.hx.leetcode.L_201910;

/**
 * @author: wenhx
 * @date: Created in 2019/10/6 14:40
 * @description: LeetCode_392：判断子序列
 * @level: simple
 * @status: finish no
 * @version: $1.0
 */
public class LeetCode_392 {

    /**
     * 判断一个序列是否为另一个序列的子序列
     */
    public boolean isSubsequence(String s, String t) {
        int temp = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = temp; j < t.length(); j++) {
                if (s.charAt(i) == t.charAt(j)) {
                    temp = j + 1;
                    break;
                } else {
                    temp = j + 1;
                }
            }
            // 此时字符串t已结束遍历 temp == 6
            if (i != s.length() - 1 && temp == t.length()) {
                return false;
            } else {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        LeetCode_392 leetCode_392 = new LeetCode_392();
        String s = "abgfdd";
        String t = "ahbgdc";
        System.out.println(leetCode_392.isSubsequence(s, t));
    }
}
