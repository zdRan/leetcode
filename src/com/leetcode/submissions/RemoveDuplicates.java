package com.leetcode.submissions;

/**
 * Create by ranzd on 2017/12/19
 *
 * @author ranzd@chinaunicom.cn
 */
public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0){
            return 0;
        }
        int result = 1;
        int curr = 0;
        for (int i = 1;i<nums.length;i++){
            if (nums[i] != nums[curr]){
               curr = i;
            }else {

            }
        }
        return result;
    }
}
