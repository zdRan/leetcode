package com.leetcode.mains;

import com.leetcode.submissions.FourSum;
import com.leetcode.utils.Show;

import java.util.List;

/**
 * Create by ranzd on 2017/12/5
 *
 * @author ranzd@chinaunicom.cn
 */
public class FourSumMain {
    public static void main(String[] args){
        FourSum fourSum = new FourSum();
        List<List<Integer>> result = fourSum.fourSum(new int[]{-1,0,1,2,-1,-4},0);

        for (List<Integer> nums:result) {
            Show.showString("result = "+nums);
        }

        List<List<Integer>> result2 = fourSum.fourSum(new int[]{0,0,0,0},1);

        for (List<Integer> nums:result2) {
            Show.showString("result2 = "+nums);
        }

        List<List<Integer>> result3 = fourSum.fourSum(new int[]{1, 0, -1, 0, -2, 2},0);

        for (List<Integer> nums:result3) {
            Show.showString("result3 = "+nums);
        }

        List<List<Integer>> result4 = fourSum.fourSum(new int[]{0,0,0,0,0},0);

        for (List<Integer> nums:result4) {
            Show.showString("result4 = "+nums);
        }
    }
}
