package com.leetcode.submissions;

import com.leetcode.extend.TreeNode;

/**
 * 面试题 04.05. 合法二叉搜索树
 * Create by Ranzd on 2021-01-25 20:18
 *
 * @author cm.zdran@foxmail.com
 */
public class IsValidBST {
    public long MAX_VAL = Long.MIN_VALUE;

    public boolean isValidBST(TreeNode root) {
        if (root == null) {
            return true;
        }
        boolean left = isValidBST(root.left);
        if (!left) {
            return false;
        }
        if (MAX_VAL >= root.val) {
            return false;
        }
        MAX_VAL = root.val;
        return isValidBST(root.right);
    }
}
