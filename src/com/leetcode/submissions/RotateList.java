package com.leetcode.submissions;

import com.leetcode.extend.ListNode;

/**
 * Create by ranzd on 2018/11/24
 *
 * @author cm.zdran@gmail.com
 */
public class RotateList {

    public static ListNode rotateRight(ListNode head, int k) {
        if (head == null) {
            return null;
        }
        int total = 1;
        ListNode temp = head;
        while (temp.next != null) {
            total++;
            temp = temp.next;
        }
        //首尾相连
        temp.next = head;
        //计算最后一个节点的位置
        k %= total;
        while (total != k) {
            total--;
            temp = temp.next;
        }
        //在指定位置截断环形链表
        head = temp.next;
        temp.next = null;
        return head;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(0);
        ListNode curr = head;
        for (int i = 1; i < 1; i++) {
            curr.next = new ListNode(i);

            curr = curr.next;
        }
        rotateRight(head, 1);
    }
}