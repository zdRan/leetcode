package com.leetcode.submissions;

/**
 * Create by ranzd on 2018/12/13
 *
 * @author cm.zdran@foxmail.com
 */
public class ClimbingStairs {
    public static int climbStairs(int n) {
        if (n == 1 ||n == 2) {
            return n;
        }
        int a = 1, b = 2, c = a + b;
        while (n-- > 2) {
            a = b;
            b = c;
            c = a + b;
        }
        return b;
    }

    public static void main(String[] args) {
        System.out.println(climbStairs(3));

    }
}
