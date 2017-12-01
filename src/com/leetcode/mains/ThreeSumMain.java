package com.leetcode.mains;

import com.leetcode.submissions.ThreeSum;
import com.leetcode.utils.Show;

import java.util.List;

/**
 * Create by ranzd on 2017/11/30
 *
 * @author ranzd@chinaunicom.cn
 */
public class ThreeSumMain {
    public static void main(String[] args){
        ThreeSum threeSum = new ThreeSum();
        List<List<Integer>> result = threeSum.threeSum(new int[]{-1,0,1,2,-1,-4});

        for (List<Integer> nums:result) {
            Show.showString("result = "+nums);
        }

        List<List<Integer>> result2 = threeSum.threeSum(new int[]{0,0,0,0,0});

        for (List<Integer> nums:result2) {
            Show.showString("result = "+nums);
        }
    }
}
