package com.hx.leetcode;

/**
 * @author: wenhx(温海雄)
 * @date: Created in 2019/9/25 10:58 （之前）
 * @description: LeetCode算法第1题：计算两数之和
 * @status: 已完成
 * @version: $1.0
 */
public class LeetCode_1 {

    /**
     * 计算两数之和
     */
    public int[] twoSum(int[] nums, int target) {
        int[] b = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    b[0] = i;
                    b[1] = j;
                    return b;
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {

        LeetCode_1 leetCode_1 = new LeetCode_1();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] b = leetCode_1.twoSum(nums, target);
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
    }
}
