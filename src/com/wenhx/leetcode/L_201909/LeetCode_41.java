package com.wenhx.leetcode.L_201909;

import java.util.Arrays;

/**
 * @author: wenhx
 * @date: Created in 2019/9/26 09:23
 * @description: LeetCode_41：缺失的第一个正数
 * @level: hard
 * @status: finish
 * @version: $1.0
 */
public class LeetCode_41 {

    /**
     * 计算缺失的第一个正数
     */
    public int firstMissingPositive(int[] nums) {
        // 对数组进行排序
        Arrays.sort(nums);
        // 定义一个从1开始自增的正数
        int j = 1;
        // 定义一个临时变量，用来判断相邻值是否相同
        int temp = 0;
        for (int i = 0; i < nums.length; i++) {
            // 当数组中某值大于自增j时
            if (nums[i] > j) {
                return j;
            }
            // 当数组中某值大于0并且不大于j时
            else if (nums[i] > 0 && nums[i] <= j) {
                // 数组中连续一样
                if (temp == nums[i]) {
                    continue;
                }
                j++;
            } else {
                continue;
            }
            // 更新临时变量
            temp = nums[i];
        }
        return j;
    }

    public static void main(String[] args) {

        LeetCode_41 leetCode_41 = new LeetCode_41();
        int[] nums = {1, 2, 0};
        System.out.println("缺失的第一个正数为：" + leetCode_41.firstMissingPositive(nums));
    }

}
