package com.leetcode.submissions;

import com.leetcode.extend.TreeNode;

/**
 * 1022. 从根到叶的二进制数之和
 * Create by Ranzd on 2021-02-05 19:53
 *
 * @author ranzhendong@maoyan.com
 */
public class SumOfRootToLeafBinaryNumbers {
    private StringBuilder sb = new StringBuilder();
    private int ans =0;

    public int sumRootToLeaf(TreeNode root) {
        dfs(root);
        return ans;
    }

    private void dfs(TreeNode root) {
        if (root.left == null && root.right == null) {
            sb.append(root.val);
            ans += Integer.parseUnsignedInt(sb.toString(), 2);
            sb.deleteCharAt(sb.length() - 1);
            return;
        }
        sb.append(root.val);
        if (root.left != null) {
            dfs(root.left);
        }
        if (root.right != null) {
            dfs(root.right);
        }
        sb.deleteCharAt(sb.length() - 1);
    }

    public static void main(String[] args) {
        System.out.println(Integer.parseUnsignedInt("11",2));
    }
}
