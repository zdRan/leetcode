package com.leetcode.submissions;

import com.leetcode.extend.TreeNode;
import com.leetcode.utils.TreeUtil;

/**
 * Create by ranzhendong on 2019-09-30 10:30
 *
 * @author cm.zdran@foxmail.com
 */
public class MinimumDepthOfBT {
    public static int minDepth(TreeNode root) {

        if (root == null) {
            return 0;
        }
        int left = minDepth(root.left);
        int right = minDepth(root.right);
        //如果左右子树有一个为空，树的最小深度则为不是空的子树的最大高度
        return (left == 0 || right == 0) ? Math.max(left + 1, right + 1) : Math.min(left + 1, right + 1);
    }

    public static void main(String[] args) {
        TreeNode treeNode = TreeUtil.stringToTreeNode("[1,2]");

        System.out.println(minDepth(treeNode));

    }
}
