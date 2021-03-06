package com.wenhx.leetcode.L_201909;

/**
 * @author: wenhx
 * @date: Created in 2019/9/25 10:58
 * @description: LeetCode_66：加一
 * @level: simple
 * @status: finish no
 * @version: $1.0
 */
public class LeetCode_66 {

    /**
     * 计算加一
     */
    public int[] plusOne(int[] digits) {

        // 第一步：现将数组转换为多位数
        int sum = 0;
        int x = 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            sum += digits[i] * x;
            x *= 10;
        }
        // 第二步：多位数加一
        sum += 1;
        // 第三步：计算多位数的位数
        int tem = sum;
        int n = 0;
        do {
            tem /= 10;
            n++;
        } while (tem != 0);
        // 第四步：将多位数又转换为数组
        int[] b = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            b[i] = sum % 10;
            sum /= 10;
        }
        return b;
    }

    public static void main(String[] args) {

        LeetCode_66 leetCode_66 = new LeetCode_66();

        int[] a = {9,8,7,6,5,4,3,2,1,0};
        int[] b = leetCode_66.plusOne(a);
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
    }
}
