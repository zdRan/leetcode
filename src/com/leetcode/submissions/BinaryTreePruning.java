package com.leetcode.submissions;

import com.leetcode.extend.TreeNode;

/**
 * 814. 二叉树剪枝
 * Create by Ranzd on 2021-01-15 13:47
 *
 * @author cm.zdran@foxmail.com
 */
public class BinaryTreePruning {
    public TreeNode pruneTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        dfs(root);
        //剩最后一个0 节点
        if (root.val == 0 && root.left == null && root.right == null) {
            return null;
        }
        return root;
    }

    private boolean dfs(TreeNode root) {
        if (root == null) {
            return true;
        }
        boolean left = dfs(root.left);
        if (left) {
            root.left = null;
        }
        boolean right = dfs(root.right);
        if (right) {
            root.right = null;
        }
        return root.val == 0 && left && right;
    }
}
