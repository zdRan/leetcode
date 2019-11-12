package com.leetcode.submissions;

import com.leetcode.extend.TreeNode;

/**
 * Create by ranzhendong on 2019-09-29 19:20
 *
 * @author cm.zdran@foxmail.com
 */
public class BalancedBT {
    public boolean isBalanced(TreeNode root) {
        return dfs(root) != -1;
    }
    private int dfs(TreeNode root){
        if (root == null){
            return 0;
        }
        int left = dfs(root.left);
        //说明左子树不是平衡二叉树
        if (left == -1) {
            return left;
        }
        int right = dfs(root.right);
        //说明右子树不是平衡二叉树
        if (right == -1) {
            return right;
        }
        // 说明当前节点不是平衡二叉树
        if (Math.abs(left - right) > 1) {
            return -1;
        }
        //返回当前节点的树的高度
        return Math.max(left + 1, right + 1);
    }

}
