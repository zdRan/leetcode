package com.leetcode.submissions;

import java.util.Arrays;

/**
 * Create by ranzd on 2017/11/30
 *
 * @author cm.zdran@foxmail.com
 */
public class ThreeSumClosest {
    int abs = Integer.MAX_VALUE;
    int result = abs;

    public int threeSumClosest(int[] nums, int target) {

        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            twoSum(nums, i + 1, nums.length - 1, nums[i], target);
        }
        return result;
    }

    private int twoSum(int[] nums, int start, int end, int first, int target) {
        while (start < end) {
            int sum = first + nums[start] + nums[end];
            int val = Math.abs(target - sum);
            if (val < abs) {
                abs = val;
                result = sum;
            }
            if (sum < target) {
                //跳过重复的数据
                while (start < end && nums[start] == nums[start + 1]) {
                    start++;
                }
                start++;
            } else {
                while (start < end && start < end && nums[end] == nums[end - 1]) {
                    end--;
                }
                end--;
            }
        }
        return abs;
    }

    public int threeSumClosest2(int[] nums, int target) {
        if (nums == null || nums.length == 0)
            return 0;
        Arrays.sort(nums);
        int len = nums.length;
        int min = nums[0] + nums[1] + nums[2], max = nums[len - 1] + nums[len - 2] + nums[len - 3];
        if (target < min)
            return min;
        if (target > max)
            return max;
        for (int i = 0; i < len - 2; i++) {
            int lo = nums[i] + nums[i + 1] + nums[i + 2];
            int hi = nums[i] + nums[len - 2] + nums[len - 1];
            if (target < lo) {
                if (lo < max)
                    max = lo;
                continue;
            }
            if (target > hi) {
                if (hi > min)
                    min = hi;
                continue;
            }
            int l = i + 1, r = len - 1;
            while (l < r) {
                int sum = nums[i] + nums[l] + nums[r];
                if (sum == target)
                    return sum;
                if (sum > target) {
                    if (sum < max)
                        max = sum;
                    while (r > l && nums[r] == nums[r - 1])
                        r--;
                    r--;
                } else {
                    if (sum > min)
                        min = sum;
                    while (l < r && nums[l] == nums[l + 1])
                        l++;
                    l++;
                }
            }
        }
        return (max - target) < (target - min) ? max : min;
    }

}
