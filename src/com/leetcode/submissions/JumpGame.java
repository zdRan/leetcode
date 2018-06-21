package com.leetcode.submissions;

/**
 * 45. Jump Game II
 * Create by ranzd on 2018/6/14
 *
 * @author cm.zdran@gmail.com
 */
public class JumpGame {
    public static int jump(int[] nums) {
        int start = 0;
        int end = 0;
        int step = 0;
        while (end < nums.length - 1) {
            int currMax = nums[start];
            for (int i = start; i <= end; i++) {
                currMax = nums[i] + i > currMax ? nums[i] + i : currMax;
            }
            step++;
            start = end;
            end = currMax;
        }
        return step;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2, 3, 1, 1, 4};
        System.out.println(jump(arr));
    }
}
