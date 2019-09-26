package com.hx.leetcode.L_Before;

/**
 * @author: wenhx
 * @date: Created in 2019/9/25 10:58 （之前）
 * @description: LeetCode_231：2的幂
 * @level: simple
 * @status: finish
 * @version: $1.0
 */
public class LeetCode_231 {

    /**
     * 计算2的幂
     * @param n
     * @return
     */
    public boolean isPowerOfTwo(int n) {
        if (n<0) return false;
        while(n>=0){
            if(n==0) return false;
            if(n==1) return true;
            if(n%2==1) return false;
            else n /= 2;
        }
        return true;
    }

    public static void main(String[] args) {

        LeetCode_231 leetCode_231 = new LeetCode_231();
        int a = 16;
        System.out.println(leetCode_231.isPowerOfTwo(a));
    }
}
