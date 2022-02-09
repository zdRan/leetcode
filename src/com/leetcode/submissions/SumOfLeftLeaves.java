package com.leetcode.submissions;

import com.leetcode.extend.TreeNode;

/**
 * 404. 左叶子之和
 * Create by Ranzd on 2022/2/9 下午3:57
 *
 * @author ranzhendong@maoyan.com
 */
public class SumOfLeftLeaves {

    private int sum = 0;

    private void dfs(TreeNode root, boolean isLeft) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null && isLeft) {
            sum += root.val;
            return;
        }
        dfs(root.left, true);
        dfs(root.right, false);
    }
    public int sumOfLeftLeaves(TreeNode root) {
        dfs(root, false);
        return sum;
    }
}
