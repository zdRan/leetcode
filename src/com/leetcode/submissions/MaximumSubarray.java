package com.leetcode.submissions;

/**
 * Create by ranzd on 2018/11/13
 *
 * @author cm.zdran@foxmail.com
 */


public class MaximumSubarray {
    public static int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int ans = max;
        for (int num : nums) {
            max = max < 0 ? num : max + num;
            ans = max > ans ? max : ans;
        }
        return ans;
    }
}
