package com.leetcode.submissions;

import com.leetcode.extend.TreeNode;

/**
 * 剑指 Offer 55 - I. 二叉树的深度
 * Create by Ranzd on 2021-02-25 17:47
 *
 * @author cm.zdran@foxmail.com
 */
public class MaxDepth {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }
}
