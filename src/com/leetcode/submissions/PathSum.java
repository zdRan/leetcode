package com.leetcode.submissions;

import com.leetcode.extend.TreeNode;

/**
 * Create by ranzhendong on 2019-09-30 11:24
 *
 * @author cm.zdran@foxmail.com
 */
public class PathSum {
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null){
            return false;
        }
        return dfs(root, sum);
    }
    private boolean dfs(TreeNode root,int sum){
        if (root == null){
            return sum == 0;
        }
        //左子树为空，只计算右子树
        if (root.left == null){
            return dfs(root.right, sum - root.val);
        }
        //右子树为空只计算左子树
        if (root.right == null) {
            dfs(root.left, sum - root.val);
        }
        return dfs(root.left, sum - root.val) || dfs(root.right, sum - root.val);
    }
}
