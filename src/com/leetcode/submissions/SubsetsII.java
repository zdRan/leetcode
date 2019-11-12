package com.leetcode.submissions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * 90. 子集 II
 * Create by ranzd on 2019/4/24
 *
 * @author cm.zdran@foxmail.com
 */
public class SubsetsII {

    private static void dfs(List<List<Integer>> ans, LinkedList<Integer> item, int count, int[] nums, int index,
                            boolean[] visited) {
        if (item.size() == count) {
            ans.add(new ArrayList<>(item));
            System.out.println(Arrays.deepToString(item.toArray()));
            return;
        }

        for (int i = index; i < nums.length; i++) {
            if (i != 0 && nums[i - 1] == nums[i] && !visited[i - 1]) {
                continue;
            }
            item.add(nums[i]);
            visited[i] = true;
            dfs(ans, item, count, nums, i + 1, visited);
            visited[i] = false;
            item.removeLast();
        }

    }

    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);

        List<List<Integer>> ans = new LinkedList<>();
        boolean[] visited = new boolean[nums.length];
        for (int i = 0; i <= nums.length; i++) {
            dfs(ans, new LinkedList<>(), i, nums, 0, visited);
        }
        return ans;
    }

    public static void main(String[] args) {
        subsetsWithDup(new int[]{2, 2,2});
    }
}

/*
去重原理：如果当前元素的值和前一个元素的值相等，并且前一个元素的值没用被选择，
则当前元素不选。

先对数组排序，相同元素相邻

假设  1,2,2,2

4 选 1：
先选择1 ，和第一个2，
遇到第二个 2，第一个 2 没用被选中，不选
遇到第三个 2，第二个 2 没用被选中，不选

4 选 2：

假设已经选出 第一个 2，
遇到第二个 2，第一个 2 选中，选择当前元素,[2,2],回溯，
遇到第三个 2，第二个 2 没用被选中(已经被回溯)，不选
最终结果[2,2]

假设第一个元素遇到的是 第二个 2，
遇到第二个 2，第一个 2 没用被选中，不选
遇到第三个 2，第二个 2 没用被选中，不选
最终结果[]
 */