package com.leetcode.submissions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Create by ranzd on 2019/3/29
 *
 * @author cm.zdran@gmail.com
 */
public class Subsets {
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new LinkedList<>();
        for (int i = 0; i <= nums.length; i++) {
            dsf(ans, new LinkedList<>(), i, nums, 0);
        }
        return ans;
    }

    private static void dsf(List<List<Integer>> ans, LinkedList<Integer> item, int count, int[] nums,int index) {
        if (item.size() == count){
            ans.add(new ArrayList<>(item));
            System.out.println(Arrays.deepToString(item.toArray()));
            return;
        }

        for (int i = index; i < nums.length; i++) {
            item.add(nums[i]);
            dsf(ans, item, count, nums, i + 1);
            item.removeLast();
        }
        
    }

    public static void main(String[] args) {
        subsets(new int[]{1, 2, 3});
    }
}
