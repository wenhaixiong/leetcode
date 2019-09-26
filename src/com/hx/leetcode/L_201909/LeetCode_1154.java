package com.hx.leetcode.L_201909;

/**
 * @author: wenhx
 * @date: Created in 2019/9/25 10:58
 * @description: LeetCode_1154：计算一年中的第几天
 * @level: simple
 * @status: finish
 * @version: $1.0
 */
public class LeetCode_1154 {


    /**
     * 计算一年中的第几天
     */
    public int dayOfYear(String date) {

        int year = Integer.parseInt(date.substring(0, 4));
        int month = Integer.parseInt(date.substring(5, 7));
        int day = Integer.parseInt(date.substring(8, 10));

        int sum = 0;
        // 判断为闰年
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {

            switch (month - 1) {
                case 11:
                    sum += 30;
                case 10:
                    sum += 31;
                case 9:
                    sum += 30;
                case 8:
                    sum += 31;
                case 7:
                    sum += 31;
                case 6:
                    sum += 30;
                case 5:
                    sum += 31;
                case 4:
                    sum += 30;
                case 3:
                    sum += 31;
                case 2:
                    sum += 29;
                case 1:
                    sum += 31;
                default:
                    sum += day;
            }

        }
        // 判断为非闰年
        else {
            switch (month - 1) {
                case 11:
                    sum += 30;
                case 10:
                    sum += 31;
                case 9:
                    sum += 30;
                case 8:
                    sum += 31;
                case 7:
                    sum += 31;
                case 6:
                    sum += 30;
                case 5:
                    sum += 31;
                case 4:
                    sum += 30;
                case 3:
                    sum += 31;
                case 2:
                    sum += 28;
                case 1:
                    sum += 31;
                default:
                    sum += day;
            }
        }
        return sum;
    }

    public static void main(String[] args) {

        LeetCode_1154 leetCode_1154 = new LeetCode_1154();
        String date = "2019-01-09";
        int sum = leetCode_1154.dayOfYear(date);
        System.out.println(sum);

    }

}
