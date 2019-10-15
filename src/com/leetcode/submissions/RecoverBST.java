package com.leetcode.submissions;

import com.leetcode.extend.TreeNode;
import com.leetcode.utils.TreeUtil;

/**
 * Create by ranzd on 2019-09-04 11:26
 *
 * @author ranzhendong@maoyan.com
 */
public class RecoverBST {
    private TreeNode left, right;
    private TreeNode min = new TreeNode(Integer.MIN_VALUE);

    public void recoverTree(TreeNode root) {
        dfs(root);
        int temp = left.val;
        left.val = right.val;
        right.val = temp;

    }

    /**
     *
     * @param root
     */
    private void dfs(TreeNode root) {
        if (root == null) {
            return;
        }
        dfs(root.left);

        if (root.val < min.val ) {
            if (left == null) {
                left = min;
            }
            //相邻两个元素交换了位置，那么 right 应该为 当前的 root
            right = root;
        }else {
            min = root;
        }
        dfs(root.right);
    }

    public static void main(String[] args) {
        TreeNode root = TreeUtil.stringToTreeNode("[3,1,4,null,null,2]");
        RecoverBST recoverBST = new RecoverBST();
        recoverBST.recoverTree(root);

    }
}
