package com.hx.leetcode.L_Before;

/**
 * @author: wenhx
 * @date: Created in 2019/9/25 10:58 （之前）
 * @description: LeetCode_263：丑数
 * @level: simple
 * @status: finish
 * @version: $1.0
 */
public class LeetCode_263 {

    /**
     * 计算丑数
     */
    public boolean isUgly(int num) {
        if (num == 0) {
            return false;
        }
        while (num % 2 == 0) {
            num = num / 2;
        }
        if (num == 1) {
            return true;
        }
        while (num % 3 == 0) {
            num = num / 3;
        }
        if (num == 1) {
            return true;
        }
        while (num % 5 == 0) {
            num = num / 5;
        }
        if (num == 1) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        LeetCode_263 leetCode_263 = new LeetCode_263();
        int a = 8;
        System.out.println(leetCode_263.isUgly(a));
    }
}
