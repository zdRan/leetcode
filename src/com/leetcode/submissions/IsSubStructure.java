package com.leetcode.submissions;

import com.leetcode.extend.TreeNode;

/**
 * 剑指 Offer 26. 树的子结构
 * Create by Ranzd on 2021-01-13 21:25
 *
 * @author ranzhendong@maoyan.com
 */
public class IsSubStructure {
    public boolean isSubStructure(TreeNode A, TreeNode B) {
        //先判断 B
        if (B == null || A == null) {
            return false;
        }
        return dfs(A, B);
    }

    private boolean dfs(TreeNode A, TreeNode B) {
        if (B == null) {
            return true;
        }
        if (A == null) {
            return false;
        }
        if (treeEquals(A, B)){
            return true;
        }
        return dfs(A.left, B) || dfs(A.right, B);
    }

    private boolean treeEquals(TreeNode A, TreeNode B) {
        if (B == null) {
            return true;
        }
        if (A == null) {
            return false;
        }
        if (A.val != B.val) {
            return false;
        }
        return treeEquals(A.left, B.left) && treeEquals(A.right, B.right);
    }
}
