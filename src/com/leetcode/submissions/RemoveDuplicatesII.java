package com.leetcode.submissions;

import java.util.Arrays;

/**
 * 80. 删除排序数组中的重复项 II
 * Create by ranzd on 2019/4/10
 *
 * @author cm.zdran@gmail.com
 */
public class RemoveDuplicatesII {
    /**
     * 双指针，[0,start)为符合规则的数组，end指针向后遍历
     * @param nums
     * @return
     */
    public static int removeDuplicates(int[] nums) {
        if (nums.length < 2) {
            return nums.length;
        }
        int start, end;
        for (start = 2, end = 2; end < nums.length; end++) {
            if (start != end) {
                nums[start] = nums[end];
            }
            if (nums[start] == nums[start - 1] && nums[start] == nums[start - 2]) {
                nums[start] = nums[end];
            } else {
                start++;
            }
        }
        System.out.println(Arrays.toString(nums));

        return start;
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{1, 1, 1, 2, 2, 3}));
    }
}
