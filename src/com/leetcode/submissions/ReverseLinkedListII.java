package com.leetcode.submissions;

import com.leetcode.extend.ListNode;

/**
 * 92. Reverse Linked List II
 * Create by ranzd on 2019/4/26
 *
 * @author cm.zdran@foxmail.com
 */
public class ReverseLinkedListII {
    public static ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode root = new ListNode(0);
        root.next = head;
        ListNode index = root;
        ListNode left;
        ListNode right;
        ListNode temp;
        //确定左边的分界点
        while (m > 1) {
            m--;
            n--;
            index = index.next;
        }
        left = index;
        index = index.next;
        right = index;
        //翻转
        while (n > 0) {
            n--;
            temp = index;
            index = index.next;
            temp.next = left.next;
            left.next = temp;
        }
        //连接右半部分
        right.next = index;
        return left == root ? left.next : head;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(0);
        ListNode curr = head;
        for (int i = 1; i < 6; i++) {
            curr.next = new ListNode(i);

            curr = curr.next;
        }
        head = reverseBetween(head.next, 1, 5);
        while (head != null) {
            System.out.print(head.val + "->");
            head = head.next;
        }
    }
}
