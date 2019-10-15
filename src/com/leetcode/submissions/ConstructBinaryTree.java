package com.leetcode.submissions;

import com.leetcode.extend.TreeNode;

import java.util.HashMap;
import java.util.Map;

/**
 * Create by ranzhendong on 2019-09-16 14:43
 *
 * @author ranzhendong@maoyan.com
 */
public class ConstructBinaryTree {
    public static TreeNode buildTree(int[] preorder, int[] inorder) {

        Map<Integer, Integer> index = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            index.put(inorder[i], i);
        }
        return dfs(index,preorder, 0,preorder.length,inorder, 0, preorder.length);

    }

    /**
     * 递归与分治，
     * 前序遍历的第一个元素，在中序遍历中的位置为 i，则 i 左边的元素是根节点的左子树，i 右边的元素是根节点的右子树。
     * 并且，的前 i 个元素是 左子树的根节点，之后的元素是右子树的根节点。
     * 优化，空间换时间，可以for 循环用 HashMap替代。
     *
     * @param preorder
     * @param pl
     * @param pr
     * @param inorder
     * @param il
     * @param ir
     * @return
     */
    private static TreeNode dfs(Map<Integer, Integer> index, int[] preorder, int pl, int pr, int[] inorder, int il, int ir) {
        if (pl >= pr) {
            return null;
        }
        TreeNode root = new TreeNode(preorder[pl]);
        int i = index.get(preorder[pl]);
        root.left = dfs(index,preorder, pl + 1, pl + (i - il) + 1, inorder, il, i);
        root.right = dfs(index,preorder, pl + (i - il) + 1, pr, inorder, i + 1, ir);
        return root;
    }

    public static void main(String[] args) {
        //buildTree(new int[]{3,9,20,15,7},new int[]{9,3,15,20,7});
//        buildTree(new int[]{1,2,3},new int[]{3,2,1});
        buildTree(new int[]{1,2},new int[]{1,2});
    }
}

