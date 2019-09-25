package com.hx.leetcode;

import java.util.Arrays;

/**
 * @author: wenhx(温海雄)
 * @date: Created in 2019/9/25 10:58 （之前）
 * @description: LeetCode算法第976题：三角形的最大周长
 * @status: 未完成
 * @version: $1.0
 */
public class LeetCode_976 {

    /**
     * 计算三角形的最大周长
     */
    public int largestPerimeter(int[] A) {
        Arrays.sort(A);
        for (int i = A.length - 1; i > 1; i--) {
            if (A[i] < A[i - 1] + A[i - 2]) {
                return A[i] + A[i - 1] + A[i - 2];
            }
        }
        return 0;
    }

    public static void main(String[] args) {

        LeetCode_976 leetCode_976 = new LeetCode_976();
        int[] a = {2, 1, 2};
        System.out.println(leetCode_976.largestPerimeter(a));
    }
}
