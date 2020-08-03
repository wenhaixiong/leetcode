package com.wenhx.leetcode.L_201910;

/**
 * @author: wenhx
 * @date: Created in 2019/10/5 12:03
 * @description: LeetCode_495：提莫攻击
 * @level: middle
 * @status: finish
 * @version: $1.0
 */
public class LeetCode_495 {

    /**
     * 计算中毒状态总时长
     */
    public int findPoisonedDuration(int[] timeSeries, int duration) {

        int sum = 0;
        if (timeSeries.length == 0) {
            return 0;
        }
        if (timeSeries.length == 1) {
            return duration;
        }
        // n个时间点有n-1个时间间隔
        int[] timeInterval = new int[timeSeries.length - 1];
        for (int i = 0; i < timeInterval.length; i++) {
            timeInterval[i] = timeSeries[i + 1] - timeSeries[i];
        }
        // 根据时间间隔来判断中毒秒数
        for (int i = 0; i < timeInterval.length; i++) {
            if (timeInterval[i] >= duration) {
                sum += duration;
            } else {
                sum += timeInterval[i];
            }
        }
        return sum + duration;
    }

    public static void main(String[] args) {
        LeetCode_495 leetCode_495 = new LeetCode_495();
        int[] timeSeries = {1, 4};
        int duration = 2;
        System.out.println("中毒状态总时长为：" + leetCode_495.findPoisonedDuration(timeSeries, duration));
    }
}
