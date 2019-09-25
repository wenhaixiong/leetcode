package com.hx.leetcode;

import java.util.Arrays;

/**
 * @author: wenhx(温海雄)
 * @date: Created in 2019/9/25 10:58 （之前）
 * @description: LeetCode算法第977题：有序数组的平方
 * @status: 未完成
 * @version: $1.0
 */
public class LeetCode_977 {

    /**
     * 计算有序数组的平方
     */
    public int[] sortedSquares(int[] A) {
        for (int i = 0; i < A.length; i++) {
            A[i] = A[i] * A[i];
        }
        Arrays.sort(A);
        return A;
    }

    public static void main(String[] args) {

        LeetCode_977 leetCode_977 = new LeetCode_977();
        int[] a = {-4, -1, 0, 3, 10};
        int[] b = leetCode_977.sortedSquares(a);
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }

    }
}
