package com.leetcode.submissions;

import com.leetcode.extend.TreeNode;

/**
 * Create by ranzhendong on 2019-09-13 16:28
 *
 * @author ranzhendong@maoyan.com
 */
public class MaximumDepthOfBT {
    /**
     * 树的最大高度为 左子树的高度与右子树的高度的最大值 + 1
     * @param root
     * @return
     */
    public int maxDepth(TreeNode root) {
        return root == null ? 0 : Math.max(maxDepth(root.left) + 1, maxDepth(root.right) + 1);
    }
}
