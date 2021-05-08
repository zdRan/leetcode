package com.leetcode.submissions;

import com.leetcode.extend.TreeNode;

/**
 * 剑指 Offer 54. 二叉搜索树的第k大节点
 * Create by Ranzd on 2021-01-11 20:59
 *
 * @author cm.zdran@foxmail.com
 */
public class KthLargest {
    private int count = 0;
    private int ans = 0;

    public int kthLargest(TreeNode root, int k) {
        count = k;
        dfs(root);
        return ans;
    }

    private void dfs(TreeNode root) {
        if (root == null) {
            return;
        }
        dfs(root.right);
        count--;
        if (count == 0) {
            ans = root.val;
        }
        dfs(root.left);
    }
}
