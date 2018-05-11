package com.leetcode.submissions;

/**
 * Create by ranzd on 2017/11/20
 *
 * @author cm.zdran@gmail.com
 */
public class ReverseInteger {
    public int reverse(int x) {
        String str = x > 0 ? new StringBuilder(Math.abs(x) + "").reverse().toString() :
                "-" + new StringBuilder(Math.abs(x) + "").reverse().toString();
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}
