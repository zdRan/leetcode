package com.leetcode.submissions;

import com.leetcode.extend.ListNode;

/**
 * Create by ranzd on 2019/4/23
 *
 * @author cm.zdran@gmail.com
 */
public class PartitionList {
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
