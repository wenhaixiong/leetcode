package com.wenhx.leetcode.L_201909;

import java.util.Arrays;

/**
 * @author: wenhx
 * @date: Created in 2019/9/30 23:18
 * @description: LeetCode_561：数组拆分1
 * @level: simple
 * @status: finish
 * @version: $1.0
 */
public class LeetCode_561 {

    public int arrayPairSum(int[] nums) {

        int sum = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i=i+2) {
//            if (i % 2 == 0) {
                sum += nums[i];
//            }
        }
        return sum;
    }

    public static void main(String[] args) {

        LeetCode_561 leetCode_561 = new LeetCode_561();
        int[] nums = {1, 4, 3, 2};
        System.out.println("总和为：" + leetCode_561.arrayPairSum(nums));
    }

}
