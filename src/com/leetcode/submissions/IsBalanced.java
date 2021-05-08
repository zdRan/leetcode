package com.leetcode.submissions;

import com.leetcode.extend.TreeNode;

/**
 * 剑指 Offer 55 - II. 平衡二叉树
 * Create by Ranzd on 2021-01-15 13:25
 *
 * @author cm.zdran@foxmail.com
 */
public class IsBalanced {
    private boolean accept = false;
    public boolean isBalanced(TreeNode root) {
        dfs(root);
        return !accept;
    }

    private int dfs(TreeNode root) {
        if (accept || root == null) {
            return 0;
        }
        int left = dfs(root.left);
        int right = dfs(root.right);

        if (Math.abs(left - right) > 1) {
            accept = true;
        }
        return Math.max(left, right) + 1;
    }
}
