package com.leetcode.submissions;

import java.util.Stack;

/**
 * Create by ranzd on 2018/1/23
 *
 * @author ranzd@chinaunicom.cn
 */
public class LongestValidParentheses {
    public static int longestValidParentheses(String s) {
        int ans = 0;
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                stack.push(i);
            } else {
                stack.pop();
                if (stack.empty()) {
                    stack.push(i);
                } else {
                    ans = i - stack.peek() > ans ? i - stack.peek() : ans;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int ans = longestValidParentheses(")()())");
        System.out.println("ans = " + ans);

        ans = longestValidParentheses("((((()");
        System.out.println("ans = " + ans);

        ans = longestValidParentheses("()((())");
        System.out.println("ans = " + ans);
    }
}
