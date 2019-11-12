package com.leetcode.submissions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Create by ranzd on 2018/2/1
 *
 * @author cm.zdran@foxmail.com
 */
public class CombinationSum {
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<Integer> item = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();

        dfs(0, candidates, target, item, ans);

        return ans;
    }

    private static void dfs(int index, int[] arr, int target, List<Integer> item, List<List<Integer>> ans) {
        for (int i = index; i < arr.length; i++) {

            if (target < 0) {
                return;
            }
            if (target == 0) {
                ans.add(new ArrayList<>(item));
                return;
            }
            item.add(arr[i]);
            dfs(i, arr, target - arr[i], item, ans);
            item.remove(item.size() - 1);
        }
    }

    public static void main(String[] args) {
        List<List<Integer>> ans = combinationSum(new int[]{2, 3, 6, 7}, 7);

        for (int i = 0; i < ans.size(); i++) {
            System.out.println(ans.get(i).toString());
        }
    }
}
