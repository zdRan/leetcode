package com.leetcode.submissions;

import com.leetcode.extend.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Create by ranzhendong on 2019-09-11
 *
 * @author cm.zdran@foxmail.com
 */
public class BTLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        dfs(result, root, 0);
        return result;
    }

    /**
     * 使用 level 记录树的层数，把相同层的节点添加到 result 中
     * @param result
     * @param root
     * @param level
     */
    private void dfs(List<List<Integer>> result,TreeNode root,int level){
        if (root == null) {
            return;
        }
        if (level >= result.size()) {
            List<Integer> item = new ArrayList<>();
            item.add(root.val);
            result.add(item);
        }else {
            result.get(level).add(root.val);
        }
        dfs(result, root.left, level+1);
        dfs(result, root.right, level + 1);
    }

    public static void main(String[] args) {

    }
}
