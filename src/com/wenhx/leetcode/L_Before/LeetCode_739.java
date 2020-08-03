package com.wenhx.leetcode.L_Before;

/**
 * @author: wenhx
 * @date: Created in 2019/9/25 10:58 （之前）
 * @description: LeetCode_739：每日温度
 * @level: middle
 * @status: finish
 * @version: $1.0
 */
public class LeetCode_739 {

    /**
     * 计算每日温度
     */
    public int[] dailyTemperatures(int[] T) {
        int[] TT = new int[T.length];
        int x = 0;
        for (int i = 0; i < T.length - 1; i++) {
            for (int j = i + 1; j < T.length; j++) {
                if (T[i] < T[j]) {
                    x = j - i;
                    break;
                } else {
                    x = 0;
                }
            }
            TT[i] = x;
        }
        TT[T.length - 1] = 0;
        return TT;
    }

    public static void main(String[] args) {

        LeetCode_739 leetCode_739 = new LeetCode_739();
        int[] temperatures = {73, 74, 75, 71, 69, 72, 76, 73};
        int[] b = leetCode_739.dailyTemperatures(temperatures);
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
    }
}
