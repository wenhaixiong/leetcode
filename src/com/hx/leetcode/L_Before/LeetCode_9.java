package com.hx.leetcode.L_Before;

/**
 * @author: wenhx(温海雄)
 * @date: Created in 2019/9/25 10:58 （之前）
 * @description: LeetCode算法第9题：回文数
 * @status: 已完成
 * @version: $1.0
 */
public class LeetCode_9 {

    /**
     * 计算回文数
     */
    public boolean isPalindrome(int x) {
        if (x == -1) {
            return false;
        }
        int[] a = new int[256];
        int y = x;
        int z = x;
        int cnt = 0;
        int sum = 0;
        int t = 1;
        do {
            y /= 10;
            cnt++;
        } while (y > 0);

        for (int i = 0; i < cnt; i++) {
            a[i] = x % 10;
            x /= 10;
        }
        for (int i = cnt - 1; i >= 0; i--) {
            sum += a[i] * t;
            t *= 10;
        }
        if (z == sum) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        LeetCode_9 leetCode_9 = new LeetCode_9();
        int num = 121;
        System.out.println(leetCode_9.isPalindrome(num));

    }
}
