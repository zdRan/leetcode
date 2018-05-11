package com.leetcode.submissions;

import java.util.ArrayList;
import java.util.List;

/**
 * Create by ranzd on 2017/12/8
 *
 * @author cm.zdran@gmail.com
 */
public class GenerateParentheses {
    private List<String> result = new ArrayList<>();

    public List<String> generateParenthesis(int n) {
        recursive(n, n, new StringBuilder());
        return result;
    }

    private void recursive(int left, int right, StringBuilder ans) {
        if (left == 0 && right == 0) {
            result.add(ans.toString());
            return;
        }
        if (left > 0) {
            ans.append('(');
            recursive(left - 1, right, ans);
            ans.deleteCharAt(ans.length() - 1);
        }
        if (left < right) {
            ans.append(')');
            recursive(left, right - 1, ans);
            ans.deleteCharAt(ans.length() - 1);
        }
    }
}
