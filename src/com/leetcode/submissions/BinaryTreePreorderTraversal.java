package com.leetcode.submissions;

import com.leetcode.extend.TreeNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * 144. 二叉树的前序遍历
 * Create by Ranzd on 2020-08-18 19:37
 *
 * @author ranzhendong@maoyan.com
 */
public class BinaryTreePreorderTraversal {

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ans = new LinkedList<>();
        iteratively(root,ans);
        return ans;
    }

    /**
     * 递归版
     * @param root
     * @param ans
     */
    private void dfs(TreeNode root, List<Integer> ans){
        if(root == null){
            return;
        }
        ans.add(root.val);
        dfs(root.left,ans);
        dfs(root.right,ans);
    }
    private void iteratively(TreeNode root, List<Integer> ans){
        Stack<TreeNode> stack = new Stack<>();
        stack.add(root);
        while (!stack.empty()) {
            TreeNode curr = stack.pop();
            ans.add(curr.val);
            if (curr.left != null) {
                stack.push(curr.left);
            }
            if (curr.right != null) {
                stack.push(curr.right);
            }
        }
    }

}
