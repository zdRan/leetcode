package com.leetcode.submissions;

import com.leetcode.extend.TreeNode;

/**
 * 1372. 二叉树中的最长交错路径
 * Create by Ranzd on 2021-03-02 20:27
 *
 * @author ranzhendong@maoyan.com
 */
public class LongestZigZagPathInABinaryTree {
    int max = 0;
    public int longestZigZag(TreeNode root) {
        dfs(root.left,true,0);
        dfs(root.right,false,0);
        return max;
    }

    public void dfs(TreeNode root, boolean left, int deep) {
        if (root == null) {
            return;
        }
        max = Math.max(deep + 1, max);
        if (left) {
            dfs(root.left, true, 0);
            dfs(root.right, false, deep + 1);
        }else {
            dfs(root.left, true, deep+1);
            dfs(root.right, false, 0);
        }
    }

    public static void main(String[] args) {
        SerializeAndDeserializeBinaryTree tree = new SerializeAndDeserializeBinaryTree();
        LongestZigZagPathInABinaryTree binaryTree = new LongestZigZagPathInABinaryTree();
        System.out.println(binaryTree.longestZigZag(tree.deserialize("[1,1,1,null,1,null,null,1,1,null,1]")));
    }
}
