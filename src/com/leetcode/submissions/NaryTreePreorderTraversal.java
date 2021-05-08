package com.leetcode.submissions;

import java.util.ArrayList;
import java.util.List;

/**
 * 589. N叉树的前序遍历
 * Create by Ranzd on 2021-01-06 23:46
 *
 * @author cm.zdran@foxmail.com
 */
public class NaryTreePreorderTraversal {

    public List<Integer> preorder(NNode root) {
        List<Integer> result = new ArrayList<>();
        visit(root, result);
        return result;
    }

    private void visit(NNode root, List<Integer> result) {
        if (root == null) {
            return;
        }

        result.add(root.val);

        for (NNode node : root.children) {
            visit(node, result);
        }
    }
}

class NNode {
    public int val;
    public List<NNode> children;

    public NNode() {
    }

    public NNode(int _val) {
        val = _val;
    }

    public NNode(int _val, List<NNode> _children) {
        val = _val;
        children = _children;
    }
};