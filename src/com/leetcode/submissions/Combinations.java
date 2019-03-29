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
public class Combinations {
    public static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new LinkedList<>();
        dsf(ans, new LinkedList<>(), 1, n+1, k);
        return ans;
    }

    private static void dsf(List<List<Integer>> ans, LinkedList<Integer> item, int index, int n, int k) {
        if (item.size() == k) {
            ans.add(new ArrayList<>(item));
            System.out.println(Arrays.deepToString(item.toArray()));
            return;
        }
        for (int i = index; i <= n - (k - item.size()); i++) {
            item.addLast(i);
            dsf(ans, item, i + 1, n, k);
            item.removeLast();
        }
    }

    public static void main(String[] args) {
        combine(4, 2);
    }
}
