package com.leetcode.submissions;

import java.util.ArrayList;
import java.util.List;

/**
 * 448. 找到所有数组中消失的数字
 * Create by Ranzd on 2021-02-13 18:15
 *
 * @author cm.zdran@foxmail.com
 */
public class FindAllNumbersDisappearedInAnArray {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == i + 1) {
                continue;
            }
            int nextIndex = nums[i] - 1;
            while (true) {
                if (nums[nextIndex] == nextIndex + 1) {
                    break;
                }
                int temp = nums[nextIndex];
                nums[nextIndex] = nextIndex+1;
                nextIndex = temp - 1;
            }
        }
        //System.out.println(Arrays.toString(nums));
        List<Integer> ans = new ArrayList<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i+1) {
                ans.add(i+1);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(findDisappearedNumbers(new int[]{4, 3, 2, 7, 8, 2, 3, 1}));
    }
}
