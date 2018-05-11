package com.leetcode.submissions;

/**
 * Create by ranzd on 2017/12/19
 *
 * @author cm.zdran@gmail.com
 */
public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int curr = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[curr] != nums[i]) {
                nums[++curr] = nums[i];
            }
        }
        return curr + 1;
    }
}
