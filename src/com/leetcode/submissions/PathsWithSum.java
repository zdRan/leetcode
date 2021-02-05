package com.leetcode.submissions;

import com.leetcode.extend.TreeNode;

/**
 * 面试题 04.12. 求和路径
 * Create by Ranzd on 2021-02-05 19:39
 *
 * @author ranzhendong@maoyan.com
 */
public class PathsWithSum {
    public int total = 0;
    public int pathSum(TreeNode root, int sum) {
        dfs(root, sum);
        return total;
    }

    private void dfs(TreeNode root, int sum) {
        if (root == null) {
            return;
        }
        accept(root, sum);
        dfs(root.left, sum);
        dfs(root.right, sum);
    }
    private void accept(TreeNode root,int sum){
        if (root == null) {
            return;
        }
        if (root.val == sum) {
            total++;
        }
        accept(root.left, sum - root.val);
        accept(root.right, sum - root.val);
    }
}
