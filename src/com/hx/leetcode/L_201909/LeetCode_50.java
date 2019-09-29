package com.hx.leetcode.L_201909;

/**
 * @author: wenhx
 * @date: Created in 2019/9/28 13:38
 * @description: LeetCode_50：Pow(x,n)
 * @level: middle
 * @status: finish no: 时间超出限制
 * @version: $1.0
 */
public class LeetCode_50 {

    /**
     * 计算x的n次幂
     */
    public double myPow(double x, int n) {

        double result = 1.0;
        if (n == 0) {
            result = 1;
        } else if (n > 0) {
            for (int i = 0; i < n; i++) {
                result *= x;
            }
        } else {
            n = -n;
            for (int i = 0; i < n; i++) {
                result *= x;
            }
            result = 1 / result;
        }
        return result;
    }

    public static void main(String[] args) {
        LeetCode_50 leetCode_50 = new LeetCode_50();
        System.out.println(leetCode_50.myPow(2.00000, -2));
    }

}
