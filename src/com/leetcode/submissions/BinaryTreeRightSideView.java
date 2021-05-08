package com.leetcode.submissions;

import com.leetcode.extend.TreeNode;

import java.util.LinkedList;
import java.util.List;

/**
 * 199. 二叉树的右视图
 * Create by Ranzd on 2021-02-26 12:04
 *
 * @author cm.zdran@foxmail.com
 */
public class BinaryTreeRightSideView {
    List<Integer> result = new LinkedList<>();
    int maxDeep = -1;
    public List<Integer> rightSideView(TreeNode root) {
        func(root, 0);
        return result;
    }
    public void func(TreeNode root,int deep){
        if (root == null) {
            return;
        }
        if (deep>maxDeep){
            result.add(root.val);
            maxDeep = deep;
        }
        func(root.right, deep + 1);
        func(root.left, deep + 1);
    }
}
