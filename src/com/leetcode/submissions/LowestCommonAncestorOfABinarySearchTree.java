package com.leetcode.submissions;

import com.leetcode.extend.TreeNode;

/**
 * 235. 二叉搜索树的最近公共祖先
 * Create by Ranzd on 2021-03-06 21:34
 *
 * @author cm.zdran@foxmail.com
 */
public class LowestCommonAncestorOfABinarySearchTree {
    TreeNode result = null;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        dfs(root,p.val,q.val);
        return result;
    }

    public boolean dfs(TreeNode root, int p, int q){
        if (root ==null){
            return false;
        }
        boolean left = dfs(root.left,p,q);
        boolean right = dfs(root.right,p,q);

        if(left && right && result==null){
            result = root;
            return true;
        }
        if((left||right)&&(root.val == p||root.val == q)&&result==null){
            result = root;
            return true;
        }
        return left||right||(root.val == p||root.val == q);
    }

}
