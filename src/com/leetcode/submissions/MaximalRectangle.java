package com.leetcode.submissions;

import java.util.Stack;

public class MaximalRectangle {
    public int maximalRectangle(char[][] matrix) {
        if (matrix.length == 0 || matrix[0].length == 0) {
            return 0;
        }
        int ans = 0;
        int[][] dp = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix[0].length; i++) {
            dp[0][i] = matrix[0][i] - '0';
        }
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                dp[i][j] = matrix[i][j] == '1' ? dp[i - 1][j] + 1 : 0;
            }
        }
        for (int i = 0; i < dp.length; i++) {
            ans = Math.max(ans, largestRectangleArea(dp[i]));
        }
        return ans;
    }
    public int largestRectangleArea(int[] heights) {
        int ans = 0;

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < heights.length; i++) {
            while (!stack.isEmpty() && heights[stack.peek()] > heights[i]) {
                int item = stack.pop();
                int len = stack.empty() ? i : (i - stack.peek() -1);
                ans = Math.max(len * heights[item], ans);
            }
            stack.push(i);
        }
        while (!stack.empty()) {
            int item = stack.pop();
            int len = stack.empty() ? heights.length : (heights.length - stack.peek() -1);
            ans = Math.max(len * heights[item], ans);
        }
        return ans;
    }
}
