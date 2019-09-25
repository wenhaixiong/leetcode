package com.hx.leetcode;

import java.util.Stack;

/**
 * @author: wenhx(温海雄)
 * @date: Created in 2019/9/25 10:58 （之前）
 * @description: LeetCode算法第20题：有效的括号
 * @status: 已完成
 * @version: $1.0
 */
public class LeetCode_20 {

    /**
     * 计算是否有效的括号
     */
    public boolean isValid(String s) {
        Stack<String> m = new Stack<>();
        while (!s.isEmpty()) {
            if (m.empty()) {
                m.push(s.substring(s.length() - 1));
            } else {
                if (m.peek().equals(")") && s.substring(s.length() - 1).equals("(")
                    || m.peek().equals("]") && s.substring(s.length() - 1).equals("[")
                    || m.peek().equals("}") && s.substring(s.length() - 1).equals("{")) {
                    m.pop();
                } else {
                    m.push(s.substring(s.length() - 1));
                }
            }
            s = s.substring(0, s.length() - 1);
        }
        if (m.empty()) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        LeetCode_20 leetCode_20 = new LeetCode_20();
        String s = "()(){}";
        System.out.println(leetCode_20.isValid(s));

    }
}
