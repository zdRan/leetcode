package com.leetcode.submissions;

/**
 * Create by ranzd on 2018/11/13
 *
 * @author cm.zdran@foxmail.com
 */
public class PowXN {
    public static double myPow(double x, int n) {
        if (n == 0) {
            return 1;
        }
        double temp = myPow(x, n / 2);
        if (n % 2 == 0) {
            return temp * temp;
        } else {
            if (n > 0) {
                return x * temp * temp;
            } else {
                return 1 / x * temp * temp;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(myPow(0.00001,2147483647));
    }
}
