package com.leetcode.submissions;

import com.leetcode.extend.TreeNode;

import java.util.LinkedList;
import java.util.List;

/**
 * 257. 二叉树的所有路径
 * Create by Ranzd on 2021-05-08 15:08
 *
 * @author cm.zdran@foxmail.com
 */
public class BinaryTreePaths {
    private List<String> result = new LinkedList<>();
    public List<String> binaryTreePaths(TreeNode root) {
        dfs(root, new LinkedList<>());
        return result;
    }
    public void dfs(TreeNode root,LinkedList<TreeNode> item) {
        if (root == null) {
            return;
        }
        item.addLast(root);
        if (root.left != null) {
            dfs(root.left, item);
        }
        if (root.right != null) {
            dfs(root.right, item);
        }
        if (root.left == null && root.right == null) {
            result.add(toStr(item));
        }
        item.removeLast();
    }
    private String toStr(List<TreeNode> item){
        StringBuilder sb = new StringBuilder();
        for (TreeNode node : item) {
            sb.append(node.val).append("->");
        }
        return sb.substring(0, sb.length() - 2);
    }
}
