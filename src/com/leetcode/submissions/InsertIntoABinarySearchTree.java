package com.leetcode.submissions;

import com.leetcode.extend.TreeNode;

/**
 * 701. 二叉搜索树中的插入操作
 * Create by Ranzd on 2021-03-06 21:39
 *
 * @author cm.zdran@foxmail.com
 */
public class InsertIntoABinarySearchTree {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val);
        }
        if (root.val < val) {
            root.left = insertIntoBST(root.left, val);
        }else {
            root.right = insertIntoBST(root.right, val);
        }
        return root;
    }

}
