package com.leetcode.submissions;

import com.leetcode.extend.TreeNode;

import java.util.HashMap;
import java.util.Map;

/**
 * 1530. 好叶子节点对的数量
 * Create by Ranzd on 2021-01-12 21:12
 *
 * @author cm.zdran@foxmail.com
 */
public class NumberOfGoodLeafNodesPairs {
    private int ans = 0;
    private int dis = 0;

    public int countPairs(TreeNode root, int distance) {
        dis = distance;
        dfs(root);
        return ans;
    }

    private Map<TreeNode, Integer> dfs(TreeNode root) {
        if (root == null) {
            return new HashMap<>();
        }
        if (root.left == null && root.right == null) {
            Map<TreeNode, Integer> result = new HashMap<>();
            result.put(root, 0);
            return result;
        }

        Map<TreeNode, Integer> leftMap = dfs(root.left);
        Map<TreeNode, Integer> rightMap = dfs(root.right);


        Map<TreeNode, Integer> leftFilterMap = new HashMap<>(leftMap.size());
        Map<TreeNode, Integer> rightFilterMap = new HashMap<>(rightMap.size());
        //左右子树距离 + 1，并过滤掉不合适的节点
        for (TreeNode node : leftMap.keySet()) {
            if (leftMap.get(node) < dis) {
                leftFilterMap.put(node, leftMap.get(node) + 1);
            }
        }
        for (TreeNode node : rightMap.keySet()) {
            if (rightMap.get(node) < dis) {
                rightFilterMap.put(node, rightMap.get(node) + 1);
            }
        }

        for (TreeNode left : leftFilterMap.keySet()) {
            for (TreeNode right : rightFilterMap.keySet()) {
                if (leftFilterMap.get(left) + rightFilterMap.get(right) <= dis) {
                    ans++;
                }
            }
        }
        leftFilterMap.putAll(rightFilterMap);
        return leftFilterMap;
    }
}
