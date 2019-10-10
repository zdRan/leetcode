package com.leetcode.submissions;

import com.leetcode.extend.Node;

/**
 * Create by ranzhendong on 2019-10-10 11:13
 *
 * @author ranzhendong@maoyan.com
 */
public class PopulatingNextRightPointers {
    public Node connect(Node root) {
        if (root == null || root.left == null) {
            return root;
        }
        root.left.next = root.right;
        root.right.next = root.next == null ? null : root.next.left;
        connect(root.left);
        connect(root.right);
        return root;
    }
}
