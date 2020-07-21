package com.leetcode.submissions;

import com.leetcode.extend.TreeNode;

/**
 * 129. 求根到叶子节点数字之和
 * Create by Ranzd on 2019-11-13 10:25
 *
 * @author ranzhendong@maoyan.com
 */
public class SumRootToLeafNumbers {
    public int sumNumbers(TreeNode root) {
        TreeNode ans = new TreeNode(0);
        dfs(root, "", ans);
        return ans.val;
    }

    private void dfs(TreeNode root, String val, TreeNode ans) {
        val = val + root.val;
        if (root.left == null && root.right == null) {
            ans.val = ans.val + Integer.parseInt(val);
            return;
        }
        if (root.left != null) {
            dfs(root.left, val, ans);
        }
        if (root.right != null) {
            dfs(root.right, val, ans);
        }
    }
}
