package com.leetcode.submissions;

import com.leetcode.extend.TreeNode;

/**
 * 1145. 二叉树着色游戏
 * Create by Ranzd on 2021-03-05 19:13
 *
 * @author ranzhendong@maoyan.com
 */
public class BinaryTreeColoringGame {
    int left = 0;
    int right = 0;
    int total = 0;
    public boolean btreeGameWinningMove(TreeNode root, int n, int x) {
        total = dfs(root, x);
        return left > n / 2 || right > n / 2 || total > n / 2;
    }

    public int dfs(TreeNode root, int x) {

        if (root == null) {
            return 0;
        }
        int l = dfs(root.left, x);
        int r = dfs(root.right, x);
        if (root.val == x) {
            left = l;
            right = r;
            return 0;
        }
        return l + r + 1;
    }


}
