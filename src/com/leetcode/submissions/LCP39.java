package com.leetcode.submissions;

import java.util.Arrays;

/**
 * https://leetcode.cn/problems/0jQkd0/
 * Create by Ranzd on 2022/9/8 下午7:26
 *
 * @author ranzhendong@maoyan.com
 */
public class LCP39 {

    public static int minimumSwitchingTimes(int[][] source, int[][] target) {
        int[] number = new int[1000];
        Arrays.fill(number, 0);
        for (int i = 0; i < source.length; i++) {
            for (int j = 0; j < source[i].length; j++) {
                number[source[i][j]]++;
                number[target[i][j]]--;
            }
        }
        int count = 0;
        for (int i = 0; i < number.length; i++) {
            count += Math.abs(number[i]);
        }
        return count / 2;
    }

}