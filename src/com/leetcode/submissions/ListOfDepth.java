package com.leetcode.submissions;

import com.leetcode.extend.ListNode;
import com.leetcode.extend.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 剑指 Offer 32 - II. 从上到下打印二叉树 II
 * Create by Ranzd on 2021-01-06 23:50
 *
 * @author ranzhendong@maoyan.com
 */
public class ListOfDepth {
    public List<List<Integer>> listOfDepth(TreeNode tree) {
        List<List<Integer>> ans = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();

        if (tree == null) {
            return ans;
        }
        queue.add(tree);
        queue.add(null);
        List<Integer> item = new ArrayList<>();

        while (queue.size() > 1) {
            TreeNode node = queue.remove();
            if (node == null) {
                ans.add(item);
                item = new ArrayList<>();
                queue.add(null);
                continue;
            }
            item.add(node.val);

            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }
        }

        if (item.size() != 0) {

            ans.add(item);
        }
        return ans;
    }
}
