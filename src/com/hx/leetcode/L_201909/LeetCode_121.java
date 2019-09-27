package com.hx.leetcode.L_201909;

/**
 * @author: wenhx
 * @date: Created in 2019/9/27 10:29
 * @description: LeetCode_121：买股票的最佳时机
 * @level: simple
 * @status: finish
 * @version: $1.0
 */
public class LeetCode_121 {

    /**
     * 计算买股票的最佳时机
     */
    public int maxProfit(int[] prices) {

        // 最大差值
        int value = 0;
        // 临时变量
        int temp;
        // 买入
        for (int i = 0; i < prices.length; i++) {
            // 卖出
            for (int j = i + 1; j < prices.length; j++) {
                if (prices[i] < prices[j]) {
                    temp = prices[j] - prices[i];
                    if (temp > value) {
                        value = temp;
                    }
                } else {
                    continue;
                }
            }
        }
        return value;
    }

    public static void main(String[] args) {

        LeetCode_121 leetCode_121 = new LeetCode_121();
        int[] prices = {7, 6, 4, 3, 1};
        System.out.println(leetCode_121.maxProfit(prices));
    }

}
