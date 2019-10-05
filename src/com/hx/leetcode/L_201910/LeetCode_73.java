package com.hx.leetcode.L_201910;

import java.util.HashSet;
import java.util.Set;

/**
 * @author: wenhx
 * @date: Created in 2019/10/1 23:03
 * @description: LeetCode_73：矩阵置零
 * @level: middle
 * @status: finish
 * @version: $1.0
 */
public class LeetCode_73 {

    /**
     * 将矩阵中所有0的行列置为0
     */
    public void setZeroes(int[][] matrix) {

        // 定义两个集合用来存放为0所有的下标
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    set1.add(i);
                    set2.add(j);
                }
            }
        }
        // 行置为0
        for (Integer a : set1
        ) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[a][j] = 0;
            }

        }
        // 列置为0
        for (Integer b : set2
        ) {
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][b] = 0;
            }

        }
    }

    public static void main(String[] args) {

        LeetCode_73 leetCode_73 = new LeetCode_73();
        int[][] matrix = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        leetCode_73.setZeroes(matrix);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
        }
    }
}
