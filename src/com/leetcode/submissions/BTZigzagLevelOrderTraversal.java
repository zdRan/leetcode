package com.leetcode.submissions;

import com.leetcode.extend.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Create by ranzhendong on 2019-09-13 16:08
 *
 * @author ranzhendong@maoyan.com
 */
public class BTZigzagLevelOrderTraversal {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<LinkedList<Integer>> result = new ArrayList<>();
        dfs(result, root, 0);
        List<List<Integer>> ans = new ArrayList<>();
        for (LinkedList l : result) {
            ans.add(new ArrayList<>(l));
        }
        return ans;
    }
    /**
     * 使用 level 记录树的层数，把相同层的节点添加到 result 中
     * @param result
     * @param root
     * @param level
     */
    private void dfs(List<LinkedList<Integer>> result, TreeNode root, int level){
        if (root == null) {
            return;
        }
        if (level >= result.size()) {
            LinkedList<Integer> item = new LinkedList<>();
            item.add(root.val);
            result.add(item);
        }else {
            // 根据层数的奇偶性来判断是否逆序
            if (level % 2 == 0) {
                result.get(level).addLast(root.val);
            }else {
                result.get(level).addFirst(root.val);
            }
        }
        dfs(result, root.left, level+1);
        dfs(result, root.right, level + 1);
    }
}
