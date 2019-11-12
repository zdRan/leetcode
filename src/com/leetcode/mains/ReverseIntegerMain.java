package com.leetcode.mains;

import com.leetcode.submissions.ReverseInteger;
import com.leetcode.utils.Show;

/**
 * Create by ranzd on 2017/11/20
 *
 * @author cm.zdran@foxmail.com
 */
public class ReverseIntegerMain {
    public static void main(String[] args) {
        ReverseInteger reverseInteger = new ReverseInteger();
        Show.showString("nu = " + reverseInteger.reverse(2147483647));
    }
}
