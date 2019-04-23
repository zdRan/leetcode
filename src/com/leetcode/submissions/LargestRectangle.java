package com.leetcode.submissions;

import java.util.Stack;

/**
 *
 * Create by ranzd on 2019/4/22
 *
 * @author cm.zdran@gmail.com
 */
public class LargestRectangle {
    public static int largestRectangleArea(int[] heights) {
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

    public static void main(String[] args) {
        System.out.println(largestRectangleArea(new int[]{4,2,1,3,2,5}));
    }
}
