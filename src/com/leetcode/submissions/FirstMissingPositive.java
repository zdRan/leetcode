package com.leetcode.submissions;

/**
 * Create by ranzd on 2018/2/2
 *
 * @author ranzd@chinaunicom.cn
 */
public class FirstMissingPositive {
    public static int firstMissingPositive(int[] nums) {
        if (nums.length == 0){
            return 1;
        }

        for (int i = 0;i< nums.length;i++){
            if (nums[i]-1<0 || nums[i]-1>nums.length-1){
                continue;
            }
            while (nums[i]-1>=0 && nums[i]-1<nums.length && nums[i]-1 != i){
                if (nums[nums[i]-1] == nums[i]){
                    break;
                }
                int temp = nums[nums[i]-1];
                nums[nums[i]-1] = nums[i];
                nums[i] = temp;

            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]-1!=i){
                return i+1;
            }
        }
        return nums.length+1;
    }

    public static void main(String[] args) {
        int num = firstMissingPositive(new int[]{3,4,-1,1});
        System.out.println(num);
        num = firstMissingPositive(new int[]{1,1});
        System.out.println(num);
    }
}