package com.leetcode.mains;

import com.leetcode.submissions.DivideIntegers;
import com.leetcode.utils.Show;

/**
 * Create by ranzd on 2017/12/26
 *
 * @author cm.zdran@foxmail.com
 */
public class DivideIntegersMain {
    public static void main(String[] args) {
        DivideIntegers divideIntegers = new DivideIntegers();
        Show.showString(divideIntegers.divide(-2147483648, 1) + "");
    }
}
