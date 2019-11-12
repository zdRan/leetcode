package com.leetcode.submissions;

/**
 * Create by ranzd on 2017/12/19
 *
 * @author cm.zdran@foxmail.com
 */
public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0] == val ? 0 : 1;
        }
        int curr = 0;
        int index = 1;
        while (index < nums.length) {
            if (nums[curr] != val) {
                curr++;
            }
            nums[curr] = nums[index++];
        }
        if (nums[curr] != val) {
            curr++;
        }
        return curr;
    }
}
