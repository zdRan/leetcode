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

        for (int i = 0; i < nums.length; i++) {
            result = twoSum(nums,i+1,0-nums[i],nums[i],result);
        }
        return result;
    }
    private List<List<Integer>> twoSum(int[] nums,int start,int target,int first,List<List<Integer>> result){
        List<Integer> left = new ArrayList<>();

        for (int i = start; i < nums.length; i++) {
            if (left.contains(target-nums[i])){
                int index = left.indexOf(target-nums[i]);

                List<Integer> item = new ArrayList<>();
                item.add(first);
                item.add(left.get(index));
                item.add(nums[i]);
                result.add(item);
            }else {

            }
            left.add(nums[i]);
        }
        return result;
    }
}
