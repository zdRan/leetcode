package com.leetcode.submissions;

import com.leetcode.extend.TreeNode;

/**
 * Create by Ranzd on 2021-02-13 10:12
 *
 * @author cm.zdran@foxmail.com
 */
public class ConstructStringFromBinaryTree {
    StringBuilder sb = new StringBuilder();
    public String tree2str(TreeNode t) {
        func(t);
        return sb.toString();
    }

    public void func(TreeNode root){
        if (root == null) {
            return;
        }
        sb.append(root.val);
        if (root.left != null || root.right != null) {
            sb.append("(");
            func(root.left);
            sb.append(")");
        }
        if (root.right != null) {
            sb.append("(");
            func(root.right);
            sb.append(")");
        }
    }


}
