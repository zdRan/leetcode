package com.leetcode.mains;

import com.leetcode.submissions.ValidParentheses;
import com.leetcode.utils.Show;

/**
 * Create by ranzd on 2017/12/6
 *
 * @author cm.zdran@foxmail.com
 */
public class ValidParenthesesMain {
    public static void main(String[] args) {
        ValidParentheses validParentheses = new ValidParentheses();
        Show.showString("boolean = " + validParentheses.isValid("{}()[]"));
    }
}
