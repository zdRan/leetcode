package com.leetcode.submissions;

import java.util.Arrays;

/**
 * Create by ranzd on 2018/1/23
 *
 * @author ranzd@chinaunicom.cn
 */
public class NextPermutation {
    public static void nextPermutation(int[] nums) {

        int currnetMax = nums[nums.length-1];
        //外循环 往前移动
        for (int i = nums.length-1;i>=0;i--){
            int temp = nums[i];
            if (currnetMax>temp){
                //后面的部分有比temp大的值,可以确定结果了
                for (int j = i+1; j < nums.length; j++) {
                    if (nums[j]>temp){
                        int t = nums[i];
                        nums[i] = nums[j];
                        nums[j] = t;
                        break;
                    }
                }
                break;
            }else {
                //后面的部分没有比temp大的值
                for (int j = i+1;j<nums.length;j++){
                    nums[j-1] = nums[j];
                }
                nums[nums.length-1] = temp;
                currnetMax = temp;
            }
        }
        System.out.println("ans = "+Arrays.toString(nums));
    }
    public static void main(String[] args) {
        nextPermutation(new int[]{6,5,4,8,7,5,1});
        nextPermutation(new int[]{1,2,3});
        nextPermutation(new int[]{3,2,1});
        nextPermutation(new int[]{1,1,5});
        nextPermutation(new int[]{1});
        nextPermutation(new int[]{6,3,4,5,4,3,2,1,2});
    }
}


