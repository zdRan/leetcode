package com.leetcode.submissions;

import com.leetcode.extend.TreeNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * 94. 二叉树的中序遍历
 * Create by ranzd on 2019/5/15
 *
 * @author cm.zdran@foxmail.com
 */
public class BinaryTreeInorderTraversal {
    private static void dsfTree(List<Integer> result, TreeNode root) {
        //遍历左节点
        if (root.left != null) {
            dsfTree(result, root.left);
        }
        //访问节点
        result.add(root.val);
        //遍历右节点
        if (root.right != null) {
            dsfTree(result, root.right);
        }
    }

    private static void loopTree(List<Integer> result, TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode curr = root;
        stack.push(curr);
        curr = curr.left;
        while (!stack.empty() || curr != null) {
            if (curr != null) {
                stack.push(curr);
                curr = curr.left;
            } else {
                curr = stack.pop();
                result.add(curr.val);
                curr = curr.right;
            }
        }
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new LinkedList<>();
        if (root != null) {
            dsfTree(result, root);
        }
        return result;
    }
}
