package com.leetcode.submissions;

import com.leetcode.extend.TreeNode;
import com.leetcode.utils.TreeUtil;

/**
 * Create by ranzd on 2019-09-06 10:17
 *
 * @author ranzhendong@maoyan.com
 */
public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        //同时递归 root 节点的 两个子树
        return dfs(root.left, root.right);
    }

    /**
     * 同时递归 root 节点的 两个子树,当左子树向右遍历时，右子树向左遍历
     * @param left
     * @param right
     * @return
     */
    private boolean dfs(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        }
        if (left == null || right == null) {
            return false;
        }
        if (left.val != right.val) {
            return false;
        }
        return dfs(left.left, right.right) && dfs(left.right, right.left);
    }
}
