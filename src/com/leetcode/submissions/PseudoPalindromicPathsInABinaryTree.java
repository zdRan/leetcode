package com.leetcode.submissions;

import com.leetcode.extend.TreeNode;

import java.util.HashMap;
import java.util.Map;

/**
 * 1457. 二叉树中的伪回文路径
 *
 * 改成数组应该会快一点
 * Create by Ranzd on 2021-03-08 19:11
 *
 * @author cm.zdran@foxmail.com
 */
public class PseudoPalindromicPathsInABinaryTree {
    int total = 0;
    //key: val,value:val出现的次数
    Map<Integer, Integer> count = new HashMap<>();


    public int pseudoPalindromicPaths(TreeNode root) {
        dfs(root);
        return total;
    }

    public void dfs(TreeNode root) {
        if (root == null) {
            return;
        }
        if (count.containsKey(root.val)) {
            count.put(root.val, count.get(root.val) + 1);
        } else {
            count.put(root.val, 1);
        }

        if (root.left == null && root.right == null) {
            int sum = 0;
            for (int value : count.values()) {
                if (value % 2 != 0) {
                    sum++;
                }

            }
            if (sum <= 1) {
                total++;
            }
            count.put(root.val, count.get(root.val) - 1);
            return;
        }

        dfs(root.left);
        dfs(root.right);

        count.put(root.val, count.get(root.val) - 1);

    }

    public static void main(String[] args) {
        PseudoPalindromicPathsInABinaryTree tree = new PseudoPalindromicPathsInABinaryTree();
        SerializeAndDeserializeBinaryTree stree = new SerializeAndDeserializeBinaryTree();
        System.out.println(tree.pseudoPalindromicPaths(stree.deserialize("[1,9,1,null,1,null,1,null,null,7,null,null,4]")));
    }
}
