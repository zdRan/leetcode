package com.leetcode.submissions;

import com.leetcode.extend.ListNode;
import com.leetcode.extend.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 面试题 04.03. 特定深度节点链表
 * Create by Ranzd on 2021-01-06 21:17
 *
 * @author cm.zdran@foxmail.com
 */
public class ListOfDepthLCCI {
    public ListNode[] listOfDepth(TreeNode tree) {
        List<ListNode> ans = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();

        if (tree == null) {
            return new ListNode[]{};
        }
        queue.add(tree);
        queue.add(null);
        ListNode head = null, index = null;
        while (queue.size() > 1) {
            TreeNode node = queue.remove();
            if (node == null) {
                ans.add(head);
                head = null;
                index = null;
                queue.add(null);
                continue;
            }
            if (head == null) {
                head = new ListNode(node.val);
                index = head;
            }else {
                index.next = new ListNode(node.val);
                index = index.next;
            }
            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }
        }

        if (head!=null){
            ans.add(head);
        }
        ListNode[] array = new ListNode[ans.size()];
        return ans.toArray(array);
    }
}
