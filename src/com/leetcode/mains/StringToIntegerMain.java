package com.leetcode.mains;

import com.leetcode.submissions.StringToInteger;
import com.leetcode.utils.Show;

/**
 * Create by ranzd on 2017/11/21
 *
 * @author cm.zdran@gmail.com
 */
public class StringToIntegerMain {
    public static void main(String[] args) {
        StringToInteger stringToInteger = new StringToInteger();
        int a = stringToInteger.myAtoi("   +1233");
        Show.showString("a = " + a);
    }
}
