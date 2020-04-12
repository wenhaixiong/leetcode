package com.hx.leetcode.L_202004;

import java.util.Arrays;

/**
 * 面试题 16.03. 交点
 *
 * @author wenhx
 * @level 困难
 * @link https://leetcode-cn.com/problems/intersection-lcci/
 * @since 2020/4/12
 */
public class IntersectionPoint {

    /**
     * 计算两条线段的交点
     *
     * @param start1 线段1起点
     * @param end1   线段2终点
     * @param start2 线程2起点
     * @param end2   线段2终点
     * @return 两个线段的交点
     */
    public static double[] intersection(int[] start1, int[] end1, int[] start2, int[] end2) {

        double[] intersectionPoint = new double[2];

        /*
          两点确定一条直线
          计算两条直线的斜率: k=(y2-y1)/(x2-x1)
          直线表达式: y=kx+b
        */
        double k1 = (end1[1] - start1[1]) / (end1[0] - start1[0]) * 1.0;
        double b1 = start1[1] - start1[0] * k1;
        double k2 = (end2[1] - start2[1]) / (end2[0] - start2[0]) * 1.0;
        double b2 = start2[1] - start2[0] * k2;

        double resultX;
        double resultY;
        /*
          两直线状态: 重合、平行、相交
         */
        if (k1 == k2 && b1 == b2) {
            /*
              两直线重叠 -> 判断线段是否重叠
             */
            if (start2[0] >= start1[0] && start2[0] <= end1[0] && end1[1] >= end2[1]) {
                intersectionPoint[0] = start2[0];
                intersectionPoint[1] = start2[1];
            } else if (end2[0] >= start1[0] && end2[0] <= end1[0] && end1[1] >= start2[1]) {
                intersectionPoint[0] = end2[0];
                intersectionPoint[1] = end2[1];
            } else if (start2[0] >= end1[0] && start2[0] <= start1[0] && start1[1] >= end2[1]) {
                intersectionPoint[0] = start2[0];
                intersectionPoint[1] = start2[1];
            } else if (end2[0] >= end1[0] && end2[0] <= start1[0] && start1[1] >= start2[1]) {
                intersectionPoint[0] = end2[0];
                intersectionPoint[1] = end2[1];
            } else if (start1[0] >= start2[0] && start1[0] <= end2[0] && end2[1] >= end1[1]) {
                intersectionPoint[0] = start1[0];
                intersectionPoint[1] = start1[1];
            } else if (end1[0] >= start2[0] && end1[0] <= end2[0] && end2[1] >= start1[1]) {
                intersectionPoint[0] = end1[0];
                intersectionPoint[1] = end1[1];
            } else if (start1[0] >= end2[0] && start1[0] <= start2[0] && start2[1] >= end1[1]) {
                intersectionPoint[0] = start1[0];
                intersectionPoint[1] = start1[1];
            } else if (end1[0] >= end2[0] && end1[0] <= start2[0] && start2[1] >= start1[1]) {
                intersectionPoint[0] = end1[0];
                intersectionPoint[1] = end1[1];
            }
        } else if (k1 == k2 && b1 != b2) {
            intersectionPoint = null;
        } else {
            /*
            直线相交 -> 求交点 -> 判断线段是否相交
             */
            resultX = (b2 - b1) / (k1 - k2);
            resultY = k1 * resultX + b1;
            if (((resultX >= start1[0] && resultX <= end1[0]) || (resultX >= end1[0] && resultX <= start1[0]))
                    && ((resultY >= start1[1] && resultY <= end1[1]) || (resultY >= end1[1] && resultY <= start1[1]))
                    && ((resultX >= start2[0] && resultX <= end2[0]) || (resultX >= end2[0] && resultX <= start2[0]))
                    && ((resultY >= start2[1] && resultY <= end2[1]) || (resultY >= end2[1] && resultY <= start2[1]))
            ) {
                intersectionPoint[0] = resultX;
                intersectionPoint[1] = resultY;
            } else intersectionPoint = null;
        }

        return intersectionPoint;
    }

    /**
     * 测试类
     *
     * @param args args
     */
    public static void main(String[] args) {

//        int[] start1 = {0, 0};
//        int[] end1 = {1, 0};
//        int[] start2 = {1, 1};
//        int[] end2 = {0, -1};

//        int[] start1 = {0, 0};
//        int[] end1 = {3, 3};
//        int[] start2 = {1, 1};
//        int[] end2 = {2, 2};

        int[] start1 = {0, 0};
        int[] end1 = {1, 1};
        int[] start2 = {3, 3};
        int[] end2 = {2, 2};

//        int[] start1 = {0, 0};
//        int[] end1 = {1, 1};
//        int[] start2 = {1, 0};
//        int[] end2 = {2, 1};
        System.out.println(Arrays.toString(IntersectionPoint.intersection(start1, end1, start2, end2)));
    }
}
