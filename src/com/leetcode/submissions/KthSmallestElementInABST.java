package com.leetcode.submissions;

import com.leetcode.extend.TreeNode;

/**
 * 230. 二叉搜索树中第K小的元素
 * Create by Ranzd on 2021-05-08 15:29
 *
 * @author ranzhendong@maoyan.com
 */
public class KthSmallestElementInABST {
    int result = -1;
    int count = 0;

    public int kthSmallest(TreeNode root, int k) {
        dfs(root, k);
        return result;
    }

    private void dfs(TreeNode root, int k) {
        if (root == null || result != -1) {
            return;
        }
        dfs(root.left, k);
        if (root.left == null || count > 0) {
            count++;
        }
        if (count == k) {
            result = root.val;
        }
        dfs(root.right, k);

    }
}
