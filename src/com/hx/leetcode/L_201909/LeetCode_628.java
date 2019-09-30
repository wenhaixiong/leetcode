package com.hx.leetcode.L_201909;

import java.util.Arrays;

/**
 * @author: wenhx
 * @date: Created in 2019/9/30 13:52
 * @description: LeetCode_628：三个数的最大乘积
 * @level: simple
 * @status: finish
 * @version: $1.0
 */
public class LeetCode_628 {

    /**
     * 计算三个数的最大乘积
     */
    public int maximumProduct(int[] nums) {

        // 数组从小到大排列
        Arrays.sort(nums);
        // 3个数字相乘最大的莫非是：1.负数情况：开头两个，最后一个。  2.后面三个
        return Math.max(nums[0] * nums[1] * nums[nums.length - 1],
            nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3]);
    }

    public static void main(String[] args) {
        LeetCode_628 leetCode_628 = new LeetCode_628();
        int[] nums = {-4, -3, -2, -1, 60};
        System.out.println(leetCode_628.maximumProduct(nums));

    }
}
