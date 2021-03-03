package com.leetcode.submissions;

import com.leetcode.extend.TreeNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

/**
 * 919. 完全二叉树插入器
 * Create by Ranzd on 2021-03-03 21:07
 *
 * @author ranzhendong@maoyan.com
 */
public class CBTInserter {
    private List<TreeNode> array = new LinkedList<>();


    public CBTInserter(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            TreeNode treeNode = queue.remove();
            if (treeNode.left != null) {
                queue.add(treeNode.left);
            }
            if (treeNode.right != null) {
                queue.add(treeNode.right);
            }
            array.add(treeNode);
        }
    }

    public int insert(int v) {
        TreeNode node = new TreeNode(v);
        array.add(node);
        TreeNode p = array.get(array.size() / 2-1);
        if (p.left == null) {
            p.left = node;
        }else {
            p.right = node;
        }
        return p.val;
    }

    public TreeNode get_root() {
       return array.get(0);
    }

}
