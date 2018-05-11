package com.leetcode.submissions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Create by ranzd on 2017/11/30
 *
 * @author cm.zdran@gmail.com
 */
public class FourSum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        threeSum(nums, result, target);
        return result;
    }

    private void threeSum(int[] nums, List<List<Integer>> result, int target) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            for (int j = i + 1; j < nums.length; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }
                result = twoSum(nums, j + 1, nums.length - 1, nums[i], nums[j], result, target);
            }
        }
    }

    private List<List<Integer>> twoSum(int[] nums, int start, int end, int first, int two, List<List<Integer>> result, int target) {
        while (start < end) {
            int sum = first + two + nums[start] + nums[end];
            if (sum == target) {
                List<Integer> item = new ArrayList<>();
                item.add(first);
                item.add(two);
                item.add(nums[start]);
                item.add(nums[end]);
                result.add(item);
                //跳过重复的数据
                while (start < end && nums[start] == nums[start + 1]) {
                    start++;
                }
                while (start < end && nums[end] == nums[end - 1]) {
                    end--;
                }
                start++;
                end--;
                continue;
            }
            if (sum < target) {
                //跳过重复的数据
                while (start < end && nums[start] == nums[start + 1]) {
                    start++;
                }
                start++;
            }
            if (sum > target) {
                while (start < end && start < end && nums[end] == nums[end - 1]) {
                    end--;
                }
                end--;
            }
        }
        return result;
    }
}
