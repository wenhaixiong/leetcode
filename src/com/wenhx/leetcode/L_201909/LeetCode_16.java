package com.wenhx.leetcode.L_201909;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author: wenhx
 * @date: Created in 2019/9/26 10:33
 * @description: LeetCode_16：最接近的三数之和
 * @level: middle
 * @status: finish no
 * @version: $1.0
 */
public class LeetCode_16 {

    /**
     * 计算最接近的三数之和
     */
    public int threeSumClosest(int[] nums, int target) {

        // 第一步：求得数组nums与target的绝对距离，放在b[]中
        int[] b = new int[nums.length];
        Map<String, Integer> map = new HashMap<>();
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            b[i] = nums[i] - target;
            if (b[i] < 0) {
                b[i] *= -1;
            }
        }
        // 第二步：将“距离”数组放入HashMap中
        for (int i = 0; i < b.length; i++) {
            map.put(b[i]+"s"+10*i, i);
        }
        // 第三步：排序，并取出下标
        Arrays.sort(b);
        for (int i = 0; i < 3; i++) {
            sum += nums[map.get(b[i]+"s"+10*i)];
        }
        return sum;
    }

    public static void main(String[] args) {

        LeetCode_16 leetCode_16 = new LeetCode_16();
        int[] nums = {0,0,0};
        System.out.println("最接近的三数之和为：" + leetCode_16.threeSumClosest(nums, 1));
    }
}
