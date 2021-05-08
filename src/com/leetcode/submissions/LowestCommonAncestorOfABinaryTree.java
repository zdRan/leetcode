package com.leetcode.submissions;

import com.leetcode.extend.TreeNode;

/**
 * 236. 二叉树的最近公共祖先
 * Create by Ranzd on 2021-05-08 14:49
 *
 * @author ranzhendong@maoyan.com
 */
public class LowestCommonAncestorOfABinaryTree {
    private TreeNode result = null;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        dfs(root, p.val, q.val);
        return result;
    }
    private boolean dfs(TreeNode root,int p,int q) {
        if (root == null || result != null) {
            return false;
        }
        boolean left = dfs(root.left, p, q);
        boolean right = dfs(root.right, p, q);
        if (left && right) {
            result = root;
            return true;
        }
        if ((left || right) && (root.val == p || root.val == q)) {
            result = root;
            return true;
        }
        if (root.val == p || root.val == q) {
            return true;
        }
        return left || right;
    }

}
