package com.leetcode.submissions;

import com.leetcode.extend.TreeNode;

/**
 * 222. 完全二叉树的节点个数
 * Create by Ranzd on 2021-01-13 21:02
 *
 * @author cm.zdran@foxmail.com
 */
public class CountCompleteTreeNodes {
    public int countNodes(TreeNode root) {
        return root == null ? 0 : countNodes(root.left) + countNodes(root.right) + 1;
    }
}
