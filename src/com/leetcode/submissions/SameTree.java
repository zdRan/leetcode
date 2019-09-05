package com.leetcode.submissions;

import com.leetcode.extend.TreeNode;
import com.sun.org.apache.regexp.internal.RE;

/**
 * Create by ranzd on 2019-09-05 14:53
 *
 * @author ranzhendong@maoyan.com
 */
public class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return dsf(p, q);
    }

    /**
     * 两颗树同时进行前序遍历
     * @param pRoot
     * @param qRoot
     * @return
     */
    private boolean dsf(TreeNode pRoot, TreeNode qRoot) {
        if (pRoot == null && qRoot == null) {
            return true;
        }
        if (pRoot == null || qRoot == null) {
            return false;
        }
        //剪枝，如果当前值不相同，直接返回
        if (pRoot.val != qRoot.val) {
            return false;
        }

        boolean left = dsf(pRoot.left, qRoot.left);
        //剪枝，如果左子树已经不相同，直接返回
        if (!left) {
            return false;
        }
        return dsf(pRoot.right, qRoot.right);
    }

}
