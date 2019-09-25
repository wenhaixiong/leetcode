package com.hx.leetcode.L_201909;

/**
 * @author: wenhx(温海雄)
 * @date: Created in 2019/9/25 16:26
 * @description: LeetCode算法第27题：移除元素
 * @status: 未完成
 * @version: $1.0
 */
public class LeetCode_27 {

    /**
     * 计算移除元素
     */
    public int removeElement(int[] nums, int val) {
//        Arrays.sort(nums);
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                continue;
            } else {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }

    public static void main(String[] args) {
        LeetCode_27 leetCode_27 = new LeetCode_27();
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        System.out.println(leetCode_27.removeElement(nums, 2));
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

}
