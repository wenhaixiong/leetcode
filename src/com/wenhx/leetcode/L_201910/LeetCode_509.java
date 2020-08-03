package com.wenhx.leetcode.L_201910;

/**
 * @author: wenhx
 * @date: Created in 2019/10/5 12:27
 * @description: LeetCode_509：斐波那契数
 * @level: simple
 * @status: finish
 * @version: $1.0
 */
public class LeetCode_509 {

    /**
     * 计算斐波那契数（利用递归）
     */
    public int fib(int N) {

        if (N == 0) {
            return 0;
        }
        if (N == 1) {
            return 1;
        }
        return fib(N - 1) + fib(N - 2);
    }

    public static void main(String[] args) {

        LeetCode_509 leetCode_509 = new LeetCode_509();
        int n = 3;
        System.out.println("斐波那契数为：" + leetCode_509.fib(n));
    }
}
