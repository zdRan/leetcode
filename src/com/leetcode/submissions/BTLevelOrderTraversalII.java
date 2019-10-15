package com.leetcode.submissions;

import com.leetcode.extend.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Create by ranzhendong on 2019-09-26 18:01
 *
 * @author ranzhendong@maoyan.com
 */
public class BTLevelOrderTraversalII {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new LinkedList<>();
        dfs(root, 0, result);

        for (int left = 0, right = result.size() - 1; left < right; left++, right--) {
            List<Integer> temp = result.get(left);
            result.set(left, result.get(right));
            result.set(right, temp);
        }
        return result;
    }

    private void dfs(TreeNode root, int level, List<List<Integer>> result) {
        if (root == null) {
            return;
        }
        if (level >= result.size()) {
            result.add(new LinkedList<>());
        }
        result.get(level).add(root.val);
        dfs(root.left, level + 1, result);
        dfs(root.right, level + 1, result);
    }
}
