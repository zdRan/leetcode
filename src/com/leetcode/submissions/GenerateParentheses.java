package com.leetcode.submissions;

import java.util.ArrayList;
import java.util.List;

/**
 * Create by ranzd on 2017/12/8
 *
 * @author ranzd@chinaunicom.cn
 */
public class GenerateParentheses {
    private List<String> result = new ArrayList<>();

    public List<String> generateParenthesis(int n) {
        recursive(n,0,0,new StringBuilder());
        return result;
    }

    private void recursive(int n, int left, int right, StringBuilder ans) {
        if (ans.length() == n*2) {
            result.add(ans.toString());
            return;
        }
        if (left <= right) {
            ans.append('(');
            recursive(n, left + 1, right, ans);
        } else {
            ans.append(')');
            recursive(n, left, right+1, ans);
        }
    }
}
