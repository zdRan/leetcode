package com.leetcode.submissions;

import com.leetcode.extend.TreeNode;

import java.util.LinkedList;
import java.util.List;

/**
 * 449. 序列化和反序列化二叉搜索树
 * Create by Ranzd on 2022/2/9 下午5:07
 *
 * @author ranzhendong@maoyan.com
 */
public class Codec {
    private List<Integer> str = new LinkedList<>();

    public String serialize(TreeNode root) {
        dfs(root);
        if (str.size() == 0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (Integer item : str) {
            sb.append(item).append(",");
        }
        sb.deleteCharAt(sb.length() - 1);
        sb.append("]");
        return sb.toString();
    }

    private void dfs(TreeNode root) {
        if (root == null) {
            return;
        }
        str.add(root.val);
        dfs(root.left);
        dfs(root.right);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if (data.length() <= 2) {
            return null;
        }
        String[] dataArr = data.substring(1, data.length() - 1).split(",");
        if (dataArr.length == 0) {
            return null;
        }
        TreeNode root = new TreeNode(Integer.parseInt(dataArr[0]));

        for (int i = 1; i < dataArr.length; i++) {
            int val = Integer.parseInt(dataArr[i]);
            TreeNode indexRoot = root;
            TreeNode pNode = null;
            while (indexRoot != null) {
                pNode = indexRoot;
                if (indexRoot.val > val) {
                    indexRoot = indexRoot.left;
                } else {
                    indexRoot = indexRoot.right;
                }
            }
            if (pNode.val > val) {
                pNode.left = new TreeNode(val);
            } else {
                pNode.right = new TreeNode(val);
            }
        }
        return root;
    }

    public static void main(String[] args) {
        Codec ser = new Codec();
        TreeNode treeNode = ser.deserialize("[]");
        System.out.println(ser.serialize(treeNode));

    }
}
