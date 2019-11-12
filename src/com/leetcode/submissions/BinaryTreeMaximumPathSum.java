package com.leetcode.submissions;

import com.leetcode.extend.TreeNode;
import com.leetcode.utils.TreeUtil;

/**
 * Create by ranzhendong on 2019-10-14 16:18
 *
 * @author cm.zdran@foxmail.com
 */
public class BinaryTreeMaximumPathSum {
    static int max = Integer.MIN_VALUE;
    public static int maxPathSum(TreeNode root) {
        dsf(root);
        return max;
    }
    private static int dsf(TreeNode root){
        if (root == null) {
            return 0;
        }
        int left = Math.max(dsf(root.left), 0);
        int right = Math.max(dsf(root.right), 0);
        max = Math.max(max, left + right + root.val);
        return Math.max(left, right) + root.val;
    }

    public static void main(String[] args) {
        System.out.println(maxPathSum(TreeUtil.stringToTreeNode("[-10,9,20,null,null,15,7]")));
    }

}
