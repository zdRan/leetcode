package com.leetcode.submissions;

import com.leetcode.extend.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 297. 二叉树的序列化与反序列化
 * Create by Ranzd on 2021-02-22 17:27
 *
 * @author cm.zdran@foxmail.com
 */
public class SerializeAndDeserializeBinaryTree {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        if (root == null) {
            sb.append("]");
            return sb.toString();
        }
        int count = 0;

        queue.add(root);
        count++;

        while (count > 0) {
            TreeNode item = queue.remove();
            if (item == null) {
                sb.append("null,");
            }else {
                count--;
                queue.add(item.left);
                if (item.left != null) {
                    count++;
                }

                queue.add(item.right);
                if (item.right != null) {
                    count++;
                }
                sb.append(item.val).append(",");
            }
        }
        sb.deleteCharAt(sb.length() - 1);
        sb.append("]");
        return sb.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        data = data.substring(1, data.length() - 1);
        String[] dataArr = data.split(",");

        if (data.equals("")||dataArr.length == 0) {
            return null;
        }
        TreeNode root = new TreeNode(Integer.parseInt(dataArr[0]));
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        for (int i = 1; i < dataArr.length;) {
            TreeNode item = queue.remove();
            if (item == null) {
                continue;
            }
            if (!dataArr[i].equals("null")) {
                item.left = new TreeNode(Integer.parseInt(dataArr[i]));
            }
            i++;
            if (i == dataArr.length) {
                continue;
            }
            queue.add(item.left);
            if (!dataArr[i].equals("null")) {
                item.right = new TreeNode(Integer.parseInt(dataArr[i]));
            }
            queue.add(item.right);
            i++;
        }
        return root;
    }

    public static void main(String[] args) {
        SerializeAndDeserializeBinaryTree tree = new SerializeAndDeserializeBinaryTree();
        System.out.println(tree.serialize(tree.deserialize("[]")));
    }
}
