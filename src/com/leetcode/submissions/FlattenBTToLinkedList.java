package com.leetcode.submissions;

import com.leetcode.extend.TreeNode;

/**
 * Create by ranzhendong on 2019-10-08 15:10
 *
 * @author cm.zdran@foxmail.com
 */
public class FlattenBTToLinkedList {

    public void flatten(TreeNode root) {
        if (root == null) {
            return;
        }
        //将左子树 转换成链表
        flatten(root.left);
        //将右子树转换成链表
        flatten(root.right);
        //转换当前节点
        TreeNode right = root.right;
        root.right = root.left;
        root.left = null;
        //将右子树挂到最后一个节点的位置
        while (root.right != null) {
            root = root.right;
        }
        root.right = right;
    }
}
