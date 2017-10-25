package com.leetcode.submissions;

import com.leetcode.extend.ListNode;

/**
 * Create by ranzd on 2017/10/22
 *
 * @author ranzd@chinaunicom.cn
 */
public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // head node
        ListNode result = new ListNode(0);
        // index node
        ListNode last = result;
        int number = 0;

        ListNode index = new ListNode(number);
        while (l1 != null && l2 != null) {
            last.next = index;
            last = last.next;

            number = (last.val + l1.val + l2.val) / 10;
            last.val = (last.val + l1.val + l2.val) % 10;

            index = new ListNode(number);

            l1 = l1.next;
            l2 = l2.next;
        }
        while (l1 != null || l2 != null) {
            last.next = index;
            last = last.next;

            if (l1 != null) {
                number = (last.val + l1.val) / 10;
                last.val = (last.val + l1.val) % 10;

                l1 = l1.next;
            }
            if (l2 != null) {
                number = (last.val + l2.val) / 10;
                last.val = (last.val + l2.val) % 10;

                l2 = l2.next;
            }
            index = new ListNode(number);
        }
        if (index.val != 0){
            last.next = index;
        }

        result = result.next;
        return result;
    }
}


