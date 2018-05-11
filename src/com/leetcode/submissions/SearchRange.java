package com.leetcode.submissions;

/**
 * Create by ranzd on 2018/1/27
 *
 * @author cm.zdran@gmail.com
 */
public class SearchRange {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = new int[]{-1, -1};
        for (int i = 0; i < nums.length; i++) {
            if (ans[0] == -1 && nums[i] == target) {
                ans[0] = i;
            }
            if (ans[1] == -1 && nums[nums.length - 1 - i] == target) {
                ans[1] = nums.length - 1 - i;
            }
        }
        return ans;
    }
}
