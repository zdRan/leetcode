package com.leetcode.submissions;

import java.util.Stack;

/**
 * 84. 柱状图中最大的矩形
 * Create by ranzd on 2019/4/22
 *
 * @author cm.zdran@foxmail.com
 */
public class LargestRectangle {
    /**
     * 使用 单调递增栈求解。
     * 栈为空入栈，当前元素小于等于栈顶元素入栈。否则出栈。
     *
     * 出栈时计算出栈元素的最大面积，
     *
     * 栈顶元素出栈，计算面积
     *
     * 右边界为当前元素位置，左边界为当前栈顶元素位置
     *
     * @param heights
     * @return
     */
    public static int largestRectangleArea(int[] heights) {
        int ans = 0;

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < heights.length; i++) {
            while (!stack.isEmpty() && heights[stack.peek()] > heights[i]) {
                int item = stack.pop();
                int len = stack.empty() ? i : (i - stack.peek() - 1);
                ans = Math.max(len * heights[item], ans);
            }
            stack.push(i);
        }
        while (!stack.empty()) {
            int item = stack.pop();
            int len = stack.empty() ? heights.length : (heights.length - stack.peek() - 1);
            ans = Math.max(len * heights[item], ans);
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(largestRectangleArea(new int[]{4, 2, 1, 3, 2, 5}));
    }
}
