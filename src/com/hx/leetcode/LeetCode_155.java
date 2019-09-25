package com.hx.leetcode;

import java.util.Stack;

/**
 * @author: wenhx(温海雄)
 * @date: Created in 2019/9/25 10:58 （之前）
 * @description: LeetCode算法第155题：最小栈
 * @status: 已完成
 * @version: $1.0
 */
public class LeetCode_155 {

    private Stack<Integer> s1;
    private Stack<Integer> s2;

    /**
     * initialize your data structure here.
     */
    public LeetCode_155() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }

    public void push(int x) {
        s1.push(x);
        if (s2.empty() == true || s2.peek() >= x) {
            s2.push(x);
        }
    }

    public void pop() {
        if (s1.peek() - s2.peek() == 0) {
            s2.pop();
        }
        s1.pop();
    }

    public int top() {
        return s1.peek();
    }

    public int getMin() {
        return s2.peek();
    }

    public static void main(String[] args) {

        LeetCode_155 minStack = new LeetCode_155();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.top());
        System.out.println(minStack.getMin());
    }
}
