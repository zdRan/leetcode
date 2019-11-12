package com.leetcode.submissions;

import java.util.ArrayList;
import java.util.List;

/**
 * Create by ranzd on 2018/6/21
 *
 * @author cm.zdran@foxmail.com
 */
public class Permutations {
    public static List<List<Integer>> permute(int[] nums) {
        boolean[] flags = new boolean[nums.length];
        List<Integer> ansItem = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        dfs(flags, nums, ansItem, result);

        return result;
    }

    private static void dfs(boolean[] flags, int[] nums, List<Integer> ansItem, List<List<Integer>> result) {
        if (ansItem.size() == flags.length) {
            List<Integer> ans = new ArrayList<>(ansItem);
            result.add(ans);
            return;
        }
        for (int i = 0; i < flags.length; i++) {
            if (!flags[i]) {
                ansItem.add(nums[i]);
                flags[i] = true;
                dfs(flags, nums, ansItem, result);
                flags[i] = false;
                ansItem.remove(ansItem.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
        List<List<Integer>> result = permute(new int[]{1,2,3});
        for (List<Integer> item:result) {
            System.out.println(item.toString());
        }
    }
}
