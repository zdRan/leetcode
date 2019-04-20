package com.leetcode.submissions;

/**
 * Create by ranzd on 2019/4/10
 *
 * @author cm.zdran@gmail.com
 */
public class SearchArrayII {
    public static boolean search(int[] nums, int target) {
        if (nums.length == 0) {
            return false;
        }
        if(target == nums[0]){
            return true;
        }
        if (target < nums[0]) {
            for (int i = nums.length - 1; i > 0; i--) {
                if (target == nums[i]) {
                    return true;
                }
                if (nums[i - 1] > nums[i]) {
                    return false;
                }
            }
        }else {
            for (int i = 1; i <nums.length ; i++) {
                if (target == nums[i]) {
                    return true;
                }
                if (nums[i] < nums[i - 1]) {
                    return false;
                }

            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(search(new int[]{1,3,5}, 5));
    }
}
