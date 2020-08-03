package com.wenhx.leetcode.L_201910;

/**
 * @author: wenhx
 * @date: Created in 2019/10/5 11:54
 * @description: LeetCode_485：最大连续1的个数
 * @level: simple
 * @status: finish
 * @version: $1.0
 */
public class LeetCode_485 {

    /**
     * 计算最大连续1的个数
     */
    public int findMaxConsecutiveOnes(int[] nums) {

        int sum = 0;
        int count = 0;
        // 遍历一遍数组，遇到不是1的时候即重新计数
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++;
            } else {
                sum = count > sum ? count : sum;
                count = 0;
            }
        }
        sum = count > sum ? count : sum;
        return sum;
    }

    public static void main(String[] args) {

        LeetCode_485 leetCode_485 = new LeetCode_485();
        int[] nums = {1, 1, 0, 1, 1, 1};
        System.out.println("最大连续1的个数：" + leetCode_485.findMaxConsecutiveOnes(nums));

    }
}
