package com.leetcode.submissions;

/**
 * 167. 两数之和 II - 输入有序数组
 * Create by Ranzd on 2020-07-20 19:26
 *
 * @author cm.zdran@foxmail.com
 */
public class TwoSumII {
    public int[] twoSum(int[] numbers, int target) {
        int[] ans = new int[2];
        for (int i = 0; i < numbers.length; i++) {
            for (int j = numbers.length - 1; j > i; j--) {
                if (numbers[i] + numbers[j] == target) {
                    ans[0] = i+1;
                    ans[1] = j+1;
                    return ans;
                }
            }
        }
        return ans;
    }
}
