package com.leetcode.submissions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Create by ranzd on 2018/6/26
 *
 * @author cm.zdran@gmail.com
 */
public class PermutationsII {
    public static List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        boolean[] flags = new boolean[nums.length];
        List<Integer> ansItem = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        dsf(flags, nums, ansItem, result);
        return result;
    }

    private static void dsf(boolean[] flags, int[] nums, List<Integer> ansItem, List<List<Integer>> result) {
        if (ansItem.size() == flags.length) {
            List<Integer> ans = new ArrayList<>(ansItem);
            result.add(ans);
            return;
        }
        for (int i = 0; i < flags.length; i++) {
            if (i != 0 && !flags[i - 1] && nums[i] == nums[i - 1]) {
                continue;
            }
            if (!flags[i]) {
                ansItem.add(nums[i]);
                flags[i] = true;
                dsf(flags, nums, ansItem, result);
                flags[i] = false;
                ansItem.remove(ansItem.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
        List<List<Integer>> result = permuteUnique(new int[]{3, 1, 1});
        for (List<Integer> item : result) {
            System.out.println(item.toString());
        }
    }
}
