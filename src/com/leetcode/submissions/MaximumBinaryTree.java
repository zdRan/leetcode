package com.leetcode.submissions;

import com.leetcode.extend.TreeNode;

/**
 * 654. 最大二叉树
 * Create by Ranzd on 2021-01-11 19:30
 *
 * @author ranzhendong@maoyan.com
 */
public class MaximumBinaryTree {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        int[][] dp = new int[nums.length][nums.length];
        initDP(dp, nums);
        return initTree(nums, 0, nums.length - 1, dp);
    }

    private TreeNode initTree(int[] nums, int start, int end,int[][] dp) {
        if (start > end) {
            return null;
        }
        int maxIndex = maxIndex(nums, start, end);
        TreeNode root = new TreeNode(nums[maxIndex]);
        root.left = initTree(nums, start, maxIndex - 1, dp);
        root.right = initTree(nums, maxIndex + 1, end, dp);
        return root;
    }
    private int maxIndex(int[] nums, int start, int end){
        int maxIndex = start;
        for (int i = start; i <= end; i++) {
            if (nums[maxIndex]<nums[i]){
                maxIndex = i;
            }
        }
        return maxIndex;
    }
    private void initDP(int[][] dp, int[] nums) {
        for (int i = 0; i < dp.length; i++) {
            dp[i][i] = i;
            for (int j = i + 1; j < dp[i].length; j++) {
                if (nums[dp[i][j-1]]>nums[j]){
                    dp[i][j] = dp[i][j-1];
                }else {
                    dp[i][j] = j;
                }
            }
        }
    }
}
