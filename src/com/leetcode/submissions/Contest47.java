package com.leetcode.submissions;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Create by Ranzd on 2021-03-06 22:29
 *
 * @author cm.zdran@foxmail.com
 */
public class Contest47 {
    public static void main(String[] args) {

    }

    public int nearestValidPoint(int x, int y, int[][] points) {
        int min = Integer.MAX_VALUE;
        int minIndex = -1;
        for (int i = 0; i < points.length; i++) {
            if (x != points[i][0] && y != points[i][1]) {
                continue;
            }
            if (Math.abs(x - points[i][0]) + Math.abs(y - points[i][1]) < min) {
                minIndex = i;
                min = Math.abs(x - points[i][0]) + Math.abs(y - points[i][1]);
            }
        }
        return minIndex;
    }

}
