package com.wenhx.it.code1;

import java.util.Stack;

/**
 * 设计一个由getMin功能的最小栈
 *
 * @author wenhx
 * @since 2020 /8/4
 */
public class MinStack {

    /* 数据栈 */
    private final Stack<Integer> stackData = new Stack<>();

    /* 最小栈 */
    private final Stack<Integer> stackMin = new Stack<>();

    /**
     * 入栈
     *
     * @param newNum the new num
     */
    public void push(Integer newNum) {
        if (stackMin.empty()) {
            stackMin.push(newNum);
        } else {
            if (stackMin.peek() >= newNum) {
                stackMin.push(newNum);
            }
        }
        stackData.push(newNum);
    }

    /**
     * 出栈
     */
    public void pop() {
        if (stackMin.empty()) {
            throw new RuntimeException("最小栈为空！");
        }
        /* 若数据栈栈顶元素 = 最小栈栈顶元素   ->   则最小栈出栈 */
        if (stackData.peek().equals(stackMin.peek())) {
            stackMin.pop();
        }
        stackData.pop();
    }

    /**
     * 取最小值
     *
     * @return the min
     */
    public Integer getMin() {
        if (stackMin.empty()) {
            throw new RuntimeException("最小栈为空！");
        }
        return stackMin.peek();
    }

    /* 测试 */
    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(2);
        minStack.push(1);
        minStack.push(3);
        System.out.println(minStack.getMin());
        minStack.pop();
        minStack.pop();
        System.out.println(minStack.getMin());
    }

}
