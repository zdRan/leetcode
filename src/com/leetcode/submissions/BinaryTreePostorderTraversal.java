package com.leetcode.submissions;

import com.leetcode.extend.TreeNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * 145. 二叉树的后序遍历
 * Create by Ranzd on 2021-05-07 15:35
 *
 * @author cm.zdran@foxmail.com
 */
public class BinaryTreePostorderTraversal {
    /**
     * 后序遍历
     * @param root
     * @return
     */
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new LinkedList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode preNode = null;
        while (!stack.empty() || root != null) {
            if (root != null) {
                stack.push(root);
                root = root.left;
            }else {
                TreeNode top = stack.peek();
                if (top.right != null && preNode != top.right) {
                    root = top.right;
                }else {
                    result.add(top.val);
                    preNode = top;
                    stack.pop();
                }
            }
        }
        return result;
    }

    /**
     * 前序遍历
     * @param root
     * @return
     */
    public List<Integer> preorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> result = new LinkedList<>();
        while (root != null || !stack.empty()) {
            if (root != null) {
                stack.push(root);
                result.add(root.val);
                root = root.left;
            }else {
                TreeNode pop = stack.pop();
                root = pop.right;
            }
        }
        return result;
    }

    /**
     * 中序遍历
     * @param root
     * @return
     */
    public List<Integer> inorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> result = new LinkedList<>();
        while (root != null || !stack.empty()) {
            if (root != null) {
                stack.push(root);
                root = root.left;
            }else {
                TreeNode pop = stack.pop();
                result.add(pop.val);
                root = pop.right;
            }
        }
        return result;
    }
}
