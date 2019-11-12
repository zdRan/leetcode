package com.leetcode.mains;

import com.leetcode.submissions.GenerateParentheses;
import com.leetcode.utils.Show;

import java.util.List;

/**
 * Create by ranzd on 2017/12/8
 *
 * @author cm.zdran@foxmail.com
 */
public class GenerateParenthesesMain {
    public static void main(String[] args) {
        GenerateParentheses generateParentheses = new GenerateParentheses();
        List<String> result = generateParentheses.generateParenthesis(3);

        for (String str : result) {
            Show.showString(str);
        }
    }
}
