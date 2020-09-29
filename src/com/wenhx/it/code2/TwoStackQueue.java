package com.wenhx.it.code2;

import java.util.Stack;

/**
 * 由两个栈构造一个队列
 *
 * @author wenhx
 * @since 2020 /8/4
 */
public class TwoStackQueue {

    private final Stack<Integer> stackA = new Stack<>();

    private final Stack<Integer> stackB = new Stack<>();

    /**
     * 入队
     *
     * @param newNum the new num
     */
    public void add(Integer newNum) {
        stackA.push(newNum);
        aToB();
    }

    private void aToB() {

        while (!stackA.empty()) {
            stackB.push(stackA.pop());
        }
    }

    /**
     * 出队
     */
    public Integer poll() {
        if (stackB.empty()) {
            throw new RuntimeException("队列为空！");
        }
        aToB();
        return stackB.pop();
        // TODO: 2020/8/4 wenhx : 这里逻辑有问题？stackA？
    }

    /**
     * 获得对头元素
     *
     * @return the peek
     */
    public Integer peek() {
        if (stackB.empty()) {
            throw new RuntimeException("队列为空！");
        }
        aToB();
        return stackB.peek();
    }

    /* 测试 */
    public static void main(String[] args) {
        TwoStackQueue twoStackQueue = new TwoStackQueue();
        twoStackQueue.add(1);
        twoStackQueue.add(2);
        twoStackQueue.add(3);
        twoStackQueue.add(4);
        twoStackQueue.add(5);
//        System.out.println(twoStackQueue.peek());
        System.out.println(twoStackQueue.poll());
        System.out.println(twoStackQueue.poll());
//        System.out.println(twoStackQueue.peek());
    }

}
