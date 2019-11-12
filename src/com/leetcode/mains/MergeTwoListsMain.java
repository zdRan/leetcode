package com.leetcode.mains;

import com.leetcode.extend.ListNode;
import com.leetcode.submissions.MergeTwoLists;
import com.leetcode.utils.Show;

/**
 * Create by ranzd on 2017/12/7
 *
 * @author cm.zdran@foxmail.com
 */
public class MergeTwoListsMain {
    public static void main(String[] args) {
        MergeTwoLists mergeTwoLists = new MergeTwoLists();
        ListNode l1 = new ListNode(0);
        ListNode curr = l1;
        for (int i = 1; i < 10; i += 2) {
            curr.next = new ListNode(i);

            curr = curr.next;
        }
        ListNode l2 = new ListNode(2);
        curr = l2;
        for (int i = 4; i < 16; i += 2) {
            curr.next = new ListNode(i);

            curr = curr.next;
        }
        ListNode head = mergeTwoLists.mergeTwoLists(l1, l2);
        while (head != null) {
            Show.showString("->" + head.val);
            head = head.next;
        }
    }
}
