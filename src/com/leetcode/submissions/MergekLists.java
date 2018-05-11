package com.leetcode.submissions;

import com.leetcode.extend.ListNode;

/**
 * Create by ranzd on 17-12-8
 *
 * @author cm.zdran@gmail.com
 */
public class MergekLists {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) {
            return null;
        }
//        ListNode result = lists[0];
//        for (int i = 1;i<lists.length;i++){
//            result = mergeTwoLists2(result,lists[i]);
//        }
//        return result;

        return divide(0, lists.length - 1, lists);
    }

    private ListNode divide(int start, int end, ListNode[] listNodes) {
        if (start == end) {
            return listNodes[start];
        }
        ListNode left = divide(start, (start + end) / 2, listNodes);
        ListNode right = divide((start + end) / 2 + 1, end, listNodes);
        return mergeTwoLists2(left, right);
    }

    public ListNode mergeTwoLists2(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;

        if (l1.val < l2.val) {
            l1.next = mergeTwoLists2(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists2(l1, l2.next);
            return l2;
        }
    }
}
