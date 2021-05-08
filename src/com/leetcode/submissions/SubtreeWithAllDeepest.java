package com.leetcode.submissions;

import com.leetcode.extend.TreeNode;

/**
 * 865. 具有所有最深节点的最小子树
 * Create by Ranzd on 2021-02-05 16:32
 *
 * @author cm.zdran@foxmail.com
 */
public class SubtreeWithAllDeepest {
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
