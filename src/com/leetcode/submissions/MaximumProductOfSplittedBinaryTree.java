package com.leetcode.submissions;

import com.leetcode.extend.TreeNode;

/**
 * 1339. 分裂二叉树的最大乘积
 * Create by Ranzd on 2021-02-26 14:17
 *
 * @author ranzhendong@maoyan.com
 */
public class MaximumProductOfSplittedBinaryTree {
    long abs = 0;
    long mid = 0;
    long max = 0;

    public int maxProduct(TreeNode root) {
        max = sumTree(root);
        abs = max;
        findMid(root);
        return (int) (mid * (max - mid) % 1000000007);
    }

    public int sumTree(TreeNode root) {
        if (root == null) {
            return 0;
        }
        root.val = root.val + sumTree(root.left) + sumTree(root.right);
        return root.val;
    }

    public void findMid(TreeNode root) {
        if (root == null) {
            return;
        }
        if (Math.abs(max / 2 - root.val) < abs) {
            abs = Math.abs(max / 2 - root.val);
            mid = root.val;
        }
        findMid(root.left);
        findMid(root.right);
    }

    public static void main(String[] args) {
        SerializeAndDeserializeBinaryTree tree = new SerializeAndDeserializeBinaryTree();
        MaximumProductOfSplittedBinaryTree binaryTree = new MaximumProductOfSplittedBinaryTree();
        System.out.println(binaryTree.maxProduct(tree.deserialize("[2,3,9,10,7,8,6,5,4,11,1]")));


    }
}
