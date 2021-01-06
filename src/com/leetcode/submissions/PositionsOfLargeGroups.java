package com.leetcode.submissions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 830. 较大分组的位置
 * Create by Ranzd on 2021-01-05 19:17
 *
 * @author ranzhendong@maoyan.com
 */
public class PositionsOfLargeGroups {
    public static List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> ans = new ArrayList<>(s.length() / 3);
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            int end = i+1;
            while (end < arr.length && arr[end] == arr[i]) {
                end++;
            }
            end--;

            if (end - i >= 2) {
                List<Integer> item = new ArrayList<>(2);
                item.add(i);
                item.add(end);
                ans.add(item);
            }
            i = end;
        }
        return ans;
    }
    public static List<List<Integer>> largeGroupPositions2(String s) {
        List<List<Integer>> ans = new ArrayList<>(s.length() / 3);
        char[] arr = s.toCharArray();
        int start = 0;
        int end = 0;
        while (end < arr.length) {
            while (end < arr.length && arr[start] == arr[end]) {
                end++;
            }
            if (end - start >= 3) {
                List<Integer> item = new ArrayList<>(2);
                item.add(start);
                item.add(end-1);
                ans.add(item);
            }
            start = end;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(largeGroupPositions2("aabbbdddccc").toArray()));
    }
}
