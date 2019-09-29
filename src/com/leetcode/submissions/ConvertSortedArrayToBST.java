package com.leetcode.submissions;

import com.leetcode.extend.TreeNode;

/**
 * Create by ranzhendong on 2019-09-29 18:50
 *
 * @author ranzhendong@maoyan.com
 */
public class ConvertSortedArrayToBST {
    public TreeNode sortedArrayToBST(int[] nums) {
       return dsf(nums, 0, nums.length - 1);
    }

    private TreeNode dsf(int[] nums, int left, int right) {
        if (left > right) {
            return null;
        }
        int mid = left + (right - left) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = dsf(nums, left, mid - 1);
        root.right = dsf(nums, mid + 1, right);
        return root;
    }
}
