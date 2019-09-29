package com.hx.leetcode.L_201909;

import java.util.Arrays;

/**
 * @author: wenhx
 * @date: Created in 2019/9/27 10:29
 * @description: LeetCode_136：只出现一个的数字
 * @level: simple
 * @status: finish
 * @version: $1.0
 */
public class LeetCode_136 {

    public int singleNumber(int[] nums) {

        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            // nums[i]小于下个数并且不等于前面那个数
            if (nums[i] < nums[i + 1] && (i == 0 || nums[i] != nums[i - 1])) {
                return nums[i];
            }
        }
        return nums[nums.length - 1];
    }

    public static void main(String[] args) {

        LeetCode_136 leetCode_136 = new LeetCode_136();
        int[] nums = {2,2,1};
        System.out.println("只出现一次的数字是：" + leetCode_136.singleNumber(nums));
    }

}
