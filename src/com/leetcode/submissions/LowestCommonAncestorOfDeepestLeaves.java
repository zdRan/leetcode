package com.leetcode.submissions;

import com.leetcode.extend.TreeNode;

/**
 * 1123. 最深叶节点的最近公共祖先
 * Create by Ranzd on 2021-02-23 18:37
 *
 * @author cm.zdran@foxmail.com
 */
public class LowestCommonAncestorOfDeepestLeaves {
    public TreeNode ans = null;
    public int max = -1;
    public TreeNode subtreeWithAllDeepest(TreeNode root) {
        ans = root;
        dfs(root, 1);
        return ans;
    }
    public int dfs(TreeNode root,int deep){
        if (root == null) {
            return deep - 1;
        }
        int left = dfs(root.left, deep + 1);
        int right = dfs(root.right, deep + 1);
        if (left == right && max <= left) {
            ans = root;
            max = Math.max(max, deep);
        }
        return Math.max(left, right);
    }
}
