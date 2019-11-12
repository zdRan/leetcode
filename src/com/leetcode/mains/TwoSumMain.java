package com.leetcode.mains;

import com.leetcode.submissions.TwoSum;
import com.leetcode.utils.Show;

/**
 * Create by ranzd on 2017/10/22
 *
 * @author cm.zdran@foxmail.com
 */
public class TwoSumMain {
    public static void main(String[] args) {
        int[] nums = new int[]{};
        int target = 9;

        TwoSum twoSum = new TwoSum();

        Show.showArray(twoSum.twoSum(nums, target));


    }
}
