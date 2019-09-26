package com.hx.leetcode.L_Before;

/**
 * @author: wenhx
 * @date: Created in 2019/9/25 10:58 （之前）
 * @description: LeetCode_622：设计循环队列
 * @level: middle
 * @status: finish
 * @version: $1.0
 */
public class LeetCode_622 {

    int[] data;
    private int length;
    private int front;
    private int back;
    private int currentSize;

    public LeetCode_622(int k) {
        data = new int[k];
        length = k;       //循环队列长度
        front = 0;        //队头标记
        back = k - 1;     //队尾标记
        currentSize = 0;  //队列当前大小
    }

    //取得循环队列的长度
    public int getLength() {
        return length;
    }

    //入队
    public boolean enQueue(int value) {
        if (isFull() == true) {
            return false;
        } else {
            data[(back + 1) % getLength()] = value;
            back = (back + 1) % getLength();
            currentSize++;
            return true;
        }
    }

    //出队
    public boolean deQueue() {
        if (isEmpty() == true) {
            return false;
        } else {
            front = (front + 1) % getLength();
            currentSize--;
            return true;
        }
    }

    //取得队头元素
    public int Front() {
        if (currentSize == 0) {
            return -1;
        }
        return data[front];
    }

    //取得队尾元素
    public int Rear() {
        if (currentSize == 0) {
            return -1;
        }
        return data[back];
    }

    //判空
    public boolean isEmpty() {
        return currentSize == 0;

    }

    //判满
    public boolean isFull() {
        return currentSize == getLength();
    }

    public static void main(String[] args) {

        LeetCode_622 circularQueue = new LeetCode_622(3);
        System.out.println(circularQueue.enQueue(1));
        System.out.println(circularQueue.enQueue(2));
        System.out.println(circularQueue.enQueue(3));
        System.out.println(circularQueue.enQueue(4));
        System.out.println(circularQueue.Rear());
        System.out.println(circularQueue.isFull());
        System.out.println(circularQueue.deQueue());
        System.out.println(circularQueue.enQueue(4));
        System.out.println(circularQueue.Rear());
    }
}
