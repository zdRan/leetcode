package com.leetcode.submissions;

import com.leetcode.extend.TreeNode;

/**
 * Create by Ranzd on 2021-01-11 20:00
 *
 * @author ranzhendong@maoyan.com
 */
public class MaximumBinaryTreeII {
    public TreeNode insertIntoMaxTree(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val);
        }

        if (root.val < val) {
            TreeNode addRoot = new TreeNode(val);
            addRoot.left = root;
            return addRoot;
        }

        dfs(root.right, root, val);
        return root;
    }

    private void dfs(TreeNode root, TreeNode pRoot, int val) {

        if (root == null) {
            pRoot.right = new TreeNode(val);
        }else {
            if (root.val > val) {
                dfs(root.right, root, val);
            }else {
                TreeNode addNode = new TreeNode(val);
                pRoot.right = addNode;
                addNode.left = root;
            }
        }
    }
}
