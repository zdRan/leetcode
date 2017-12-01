package com.leetcode.submissions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Create by ranzd on 2017/11/30
 *
 * @author ranzd@chinaunicom.cn
 */
public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (i>0 && nums[i] == nums[i-1]){
                continue;
            }
            result = twoSum(nums,i+1,nums.length-1,nums[i],result);
        }
        return result;
    }
    private List<List<Integer>> twoSum(int[] nums,int start,int end,int first,List<List<Integer>> result){
        while (start<end){
            int sum = first+nums[start]+nums[end];
            if (sum == 0){
                List<Integer> item = new ArrayList<>();
                item.add(first);
                item.add(nums[start]);
                item.add(nums[end]);
                result.add(item);
                //跳过重复的数据
                while (start<end && nums[start] == nums[start+1]){
                    start++;
                }
                while (start<end && nums[end] == nums[end-1]){
                    end--;
                }
                start++;
                end--;
                continue;
            }
            if (sum<0){
                //跳过重复的数据
                while (start<end && nums[start] == nums[start+1]){
                    start++;
                }
                start++;
            }
            if (sum>0){
                while (start<end && start<end && nums[end] == nums[end-1]){
                    end--;
                }
                end--;
            }
        }
        return result;
    }
}
