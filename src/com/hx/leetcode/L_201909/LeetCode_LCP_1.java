package com.hx.leetcode.L_201909;

/**
 * @author: wenhx
 * @date: Created in 2019/9/30 16:40
 * @description: LeetCode_LCP_1：猜数字
 * @level: simple
 * @status: finish
 * @version: $1.0
 */
public class LeetCode_LCP_1 {

    /**
     * 计算猜中了几次
     */
    public int game(int[] guess, int[] answer) {
        int count = 0;
        for (int i = 0; i < guess.length; i++) {
            if (guess[i] == answer[i]) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        LeetCode_LCP_1 leetCode_lcp_1 = new LeetCode_LCP_1();
        int[] guess = {1, 2, 3};
        int[] answer = {1, 2, 3};
        System.out.println("小A猜对的次数为：" + leetCode_lcp_1.game(guess, answer));
    }

}
