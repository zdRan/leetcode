package com.leetcode.submissions;

import com.leetcode.extend.TreeNode;

/**
 * 剑指 Offer 68 - I. 二叉搜索树的最近公共祖先
 * Create by Ranzd on 2021-03-03 20:07
 *
 * @author ranzhendong@maoyan.com
 */
public class LowestCommonAncestor {
    TreeNode result = null;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        dfs(root, p.val, q.val);
        return result;
    }

    public boolean dfs(TreeNode root, int a, int b) {
        if (root == null) {
            return false;
        }

        boolean left = dfs(root.left, a, b);
        boolean right = dfs(root.right, a, b);
        if (left && right && result == null) {
            result = root;
        }
        if ((left || right) && (root.val == a || root.val == b) && result == null) {
            result = root;
        }
        if (root.val == a || root.val == b) {
            return true;
        }
        return left || right;

    }
    public static void main(String[] args) {
        SerializeAndDeserializeBinaryTree tree = new SerializeAndDeserializeBinaryTree();
        LowestCommonAncestor lowestCommonAncestor = new LowestCommonAncestor();

        System.out.println(lowestCommonAncestor.lowestCommonAncestor(tree.deserialize("[6,2,8,0,4,7,9,null,null,3,5]"), new TreeNode(2), new TreeNode(4)).val);
    }
}
