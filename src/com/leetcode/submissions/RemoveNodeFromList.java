package com.leetcode.submissions;

import com.leetcode.extend.ListNode;

/**
 * Create by ranzd on 2017/12/6
 *
 * @author ranzd@chinaunicom.cn
 */
public class RemoveNodeFromList {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        if (n == 0){
            return head;
        }

        head = reverse(head);
        if (n == 1){
            return reverse(head.next);
        }
        ListNode current = head;
        ListNode left = head;
        while (current!=null){
            n--;
            if (n == 0){
                left.next = current.next;
                break;
            }
            left = current;
            current = current.next;
        }
        return reverse(head);
    }
    private ListNode reverse(ListNode head){
        ListNode last = null;
        ListNode reHead = null;
        while (head!=null){
            reHead = new ListNode(head.val);
            reHead.next = last;
            head = head.next;
            last = reHead;
        }
        return reHead;
    }

    public ListNode removeNthFromEnd2(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode first = dummy;
        ListNode second = dummy;
        for (int i = 1; i <= n + 1; i++) {
            first = first.next;
        }
        while (first != null) {
            first = first.next;
            second = second.next;
        }
        second.next = second.next.next;
        return dummy.next;
    }
}
