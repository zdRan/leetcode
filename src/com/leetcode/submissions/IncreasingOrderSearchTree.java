package com.leetcode.submissions;

import com.leetcode.extend.TreeNode;

/**
 * 897. 递增顺序查找树
 * Create by Ranzd on 2021-01-11 20:33
 *
 * @author cm.zdran@foxmail.com
 */
public class IncreasingOrderSearchTree {
    private TreeNode pRoot = new TreeNode(0);
    private TreeNode index = pRoot;

    public TreeNode increasingBST(TreeNode root) {
        dfs(root);
        return pRoot.right;
    }

    private void dfs(TreeNode treeNode) {
        if (treeNode == null) {
            return;
        }
        dfs(treeNode.left);
        index.right = new TreeNode(treeNode.val);
        index = index.right;
        dfs(treeNode.right);
    }
}
