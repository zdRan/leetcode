package com.leetcode.submissions;

import com.leetcode.extend.TreeNode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * 95. 不同的二叉搜索树 II
 * Create by ranzd on 2019-08-29 14:58
 *
 * @author cm.zdran@gmail.com
 */
public class UniqueBSTII {
    public static List<TreeNode> generateTrees(int n) {
        if (n == 0) {
            return new LinkedList<>();
        }
        return dfs(1, n);
    }

    /**
     * 递归求解，每一次递归解决一层的问题， 以 i 为 root 的二叉树的所有情况是，
     * 找出所有以 i-1 为 root 的二叉树，作为左节点，
     * 找出所有以 N - i 为 root 的二叉树，作为右节点。
     * 然后将各种组合情况遍历一次，作为 以 i wei root 的二叉树的所有情况的集合
     *
     * @param start
     * @param end
     * @return
     */
    private static List<TreeNode> dfs(int start, int end) {
        List<TreeNode> result = new LinkedList<>();
        // 注意：需要把 null 添加的集合中
        if (start > end) {
            result.add(null);
            return result;
        }

        for (int i = start; i <= end; i++) {
            // dfs 左子树
            List<TreeNode> leftTree = dfs(start, i - 1);
            // dfs 右子树
            List<TreeNode> rightTree = dfs(i + 1, end);
            // 组合所有情况
            for (TreeNode node : leftTree) {
                for (TreeNode treeNode : rightTree) {
                    TreeNode root = new TreeNode(i);
                    root.left = node;
                    root.right = treeNode;
                    result.add(root);
                }
            }

        }
        return result;
    }

    public static void main(String[] args) {
        List<TreeNode> result = generateTrees(3);
        System.out.println(Arrays.deepToString(result.toArray()));
    }

}
