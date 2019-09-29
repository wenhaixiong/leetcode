package com.hx.leetcode.L_201909;

/**
 * @author: wenhx
 * @date: Created in 2019/9/28 15:26
 * @description: LeetCode_35：搜索插入位置
 * @level: simple
 * @status: finish
 * @version: $1.0
 */
public class LeetCode_35 {

    /**
     * 计算搜索插入位置
     */
    public int searchInsert(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            if (target <= nums[i]) {
                return i;
            }
        }
        return nums.length;

    }

    public static void main(String[] args) {

        LeetCode_35 leetCode_35 = new LeetCode_35();
        int[] nums = {1, 3, 5, 6};
        int target = 0;
        System.out.println(leetCode_35.searchInsert(nums, target));
    }
}
