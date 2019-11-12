package com.leetcode.submissions;

import com.leetcode.extend.ListNode;

/**
 * 86. 分隔链表
 * Create by ranzd on 2019/4/23
 *
 * @author cm.zdran@foxmail.com
 */
public class PartitionList {
    /**
     * 重新创建两个链表，遍历head链表，根据条件将节点分别挂到不同的两个新链表上
     * 连接两个新链表
     * @param head
     * @param x
     * @return
     */
    public static ListNode partition(ListNode head, int x) {
        ListNode left = new ListNode(-1);
        ListNode right = new ListNode(-1);
        ListNode lIndex = left;
        ListNode rIndex = right;
        while (head != null) {
            if (head.val < x) {
                lIndex.next = head;
                lIndex = lIndex.next;
            }else {
                rIndex.next = head;
                rIndex = rIndex.next;
            }
            head = head.next;
        }
        rIndex.next = null;
        lIndex.next = right.next;
        return left.next;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{ 4, 3, 2, 5, 2};
        ListNode head = new ListNode(1);
        ListNode index = head;
        for (int val : arr) {
            index.next = new ListNode(val);
            index = index.next;
        }

        head = partition(head,3);

        while (head != null) {
            System.out.print(head.val + "->");
            head = head.next;
        }
    }
}
