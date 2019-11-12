package com.leetcode.submissions;

/**
 * Create by ranzd on 2018/11/18
 *
 * @author cm.zdran@foxmail.com
 */
public class JumpGame2 {
    public static boolean canJump(int[] nums) {

        int max = nums[0];
        for (int i = 0; i <= max; i++) {
            max = i + nums[i] > max ? (i + nums[i]) : max;
            if (max >= nums.length-1) {
                break;
            }
        }
        return max >= nums.length-1;
    }

    public static void main(String[] args) {
        System.out.println(canJump(new int[]{2, 3, 1, 1, 4}));

        System.out.println(canJump(new int[]{1,2,3}));
    }

}
