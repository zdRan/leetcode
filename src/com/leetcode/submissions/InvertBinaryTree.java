package com.leetcode.submissions;

import com.leetcode.extend.TreeNode;

/**
 * 226. 翻转二叉树
 * Create by Ranzd on 2021-03-03 19:52
 *
 * @author cm.zdran@foxmail.com
 */
public class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        dfs(root);
        return root;
    }
    public void dfs(TreeNode root){
        if (root == null) {
            return;
        }
        dfs(root.left);
        dfs(root.right);
        TreeNode temp = root.right;
        root.right = root.left;
        root.left = temp;
    }
}
