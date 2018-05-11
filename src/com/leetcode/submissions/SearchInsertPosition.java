package com.leetcode.submissions;

/**
 * Create by ranzd on 2018/1/27
 *
 * @author cm.zdran@gmail.com
 */
public class SearchInsertPosition {
    public static int searchInsert(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        int mid;
        if (target > nums[nums.length - 1]) {
            return nums.length;
        }
        while (l < r) {
            mid = (l + r) / 2;
            if (nums[mid] < target) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }
        return l;
    }

    public static void main(String[] args) {
        int ins = searchInsert(new int[]{0, 3, 4, 7}, 7);
        System.out.println(ins);
    }
}
