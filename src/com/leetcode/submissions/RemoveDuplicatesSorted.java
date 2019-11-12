package com.leetcode.submissions;

import com.leetcode.extend.ListNode;

/**
 * 83. 删除排序链表中的重复元素
 * Create by ranzd on 2019/4/21
 *
 * @author cm.zdran@foxmail.com
 */
public class RemoveDuplicatesSorted {
    /**
     * 如果当前节点的值与下一个节点的值，就删除该节点
     * @param head
     * @return
     */
    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode index = head;
        while (index.next != null) {
            if (index.val == index.next.val) {
                index.next = index.next.next;
            }else {
                index = index.next;
            }
        }
        return head;
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(2);

        ListNode curr = head;
        int[] arr = new int[]{2, 2, 3, 3, 3, 3, 3, 4, 5};
        for (int val : arr) {
            curr.next = new ListNode(val);
            curr = curr.next;
        }
        head = deleteDuplicates(head);

        while (head != null) {
            System.out.print(head.val + "->");
            head = head.next;
        }
    }
}
