package com.leetcode.submissions;

import com.leetcode.extend.TreeNode;

/**
 * 437. 路径总和 III
 * Create by Ranzd on 2022/2/9 下午4:28
 *
 * @author ranzhendong@maoyan.com
 */
public class PathSumIII {
    private int count = 0;

    public int pathSum(TreeNode root, int targetSum) {
        dfs(root, targetSum);
        return count;
    }

    private void dfs(TreeNode root, long targetSum) {
        if (root == null) {
            return;
        }
        dfsNode(root, targetSum);
        dfs(root.left, targetSum);
        dfs(root.right, targetSum);
    }

    private void dfsNode(TreeNode root, long targetSum) {
        if (root == null) {
            return;
        }
        if (targetSum - root.val == 0) {
            count++;
        }
        dfsNode(root.left, targetSum - root.val);
        dfsNode(root.right, targetSum - root.val);
    }


}
