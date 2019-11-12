package com.leetcode.mains;

import com.leetcode.extend.ListNode;
import com.leetcode.submissions.MergekLists;
import com.leetcode.utils.Show;

/**
 * Create by ranzd on 2017/12/7
 *
 * @author cm.zdran@foxmail.com
 */
public class MergekListsMain {
    public static void main(String[] args) {
        MergekLists mergekLists = new MergekLists();
        ListNode[] lists = new ListNode[3];
        ListNode l1 = new ListNode(0);
        ListNode curr = l1;
        for (int i = 1; i < 10; i += 2) {
            curr.next = new ListNode(i);

            curr = curr.next;
        }
        lists[0] = l1;
        ListNode l2 = new ListNode(2);
        curr = l2;
        for (int i = 4; i < 16; i += 2) {
            curr.next = new ListNode(i);

            curr = curr.next;
        }
        lists[1] = l2;
        ListNode l3 = new ListNode(2);
        curr = l3;
        for (int i = 20; i < 36; i += 2) {
            curr.next = new ListNode(i);

            curr = curr.next;
        }
        lists[2] = l3;

        ListNode head = mergekLists.mergeKLists(lists);
        while (head != null) {
            Show.showString("->" + head.val);
            head = head.next;
        }
    }
}
