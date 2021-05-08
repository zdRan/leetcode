package com.leetcode.submissions;

import com.leetcode.extend.TreeNode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 1110. 删点成林
 * Create by Ranzd on 2021-02-05 20:46
 *
 * @author cm.zdran@foxmail.com
 */
public class DeleteNodesAndReturnForest {
    private List<TreeNode> treeNodes = new ArrayList<>();

    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        Set<Integer> delete = new HashSet<Integer>();
        for (int item : to_delete) {
            delete.add(item);
        }
        dfs(root, null, true, delete);
        //如果需要删除，则在上面的 dfs 时候已经删除了，不需要删除的话则需要加入结果集中
        if (!delete.contains(root.val)) {
            treeNodes.add(root);
        }
        return treeNodes;
    }

    private void dfs(TreeNode root, TreeNode parent, boolean left, Set<Integer> delete) {
        if (root == null || delete.size() == 0) {
            return;
        }
        dfs(root.left, root, true, delete);
        dfs(root.right, root, false, delete);
        if (delete.contains(root.val)) {
            if (root.left != null) {
                treeNodes.add(root.left);
            }
            if (root.right != null) {
                treeNodes.add(root.right);
            }

            if (parent != null) {
                if (left) {
                    parent.left = null;
                } else {
                    parent.right = null;
                }
            }

        }
    }
}
