package com.leetcode.submissions;

import com.leetcode.extend.Node;

/**
 * Create by ranzhendong on 2019-10-10 11:34
 *
 * @author ranzhendong@maoyan.com
 */
public class PopulatingNextRightPointersII {
    public Node connect(Node root) {
        if (root == null) {
            return null;
        }
        if (root.left == null && root.right == null) {
            return root;
        }
        if (root.left != null) {
            if (root.right!=null){
                root.left.next = root.right;
            }else {
                Node temp = root.next;
                while (temp != null && root.left.next ==null) {
                    root.left.next = temp.left == null ? temp.right : temp.left;
                    temp = temp.next;
                }
            }
        }

        if (root.right != null) {
            Node temp = root.next;
            while (temp != null && root.right.next ==null) {
                root.right.next = temp.left == null ? temp.right : temp.left;
                temp = temp.next;
            }
        }
        //先构建右子树，不然上面的 while 循环会出错
        connect(root.right);
        connect(root.left);
        return root;
    }
}
