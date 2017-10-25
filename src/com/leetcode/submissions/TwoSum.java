package com.leetcode.submissions;

import java.util.ArrayList;
import java.util.List;

/**
 * Create by ranzd on 2017/10/20
 *
 * @author ranzd@chinaunicom.cn
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        List<Integer> arr = new ArrayList<>();
        for (int i = 0;i<nums.length;i++){
            if (arr.contains(target-nums[i])){
                result[0] = arr.indexOf(target-nums[i]);
                result[1] = i;
                return result;
            }else {
                arr.add(nums[i]);
            }
        }
        return result;
    }

}
