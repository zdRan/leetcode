package com.leetcode.submissions;

import com.leetcode.extend.ListNode;

/**
 * Create by ranzd on 17-12-8
 *
 * @author cm.zdran@foxmail.com
 */
public class MergekLists {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) {
            return null;
        }
        return divide(0, lists.length - 1, lists);
    }

    private ListNode divide(int start, int end, ListNode[] listNodes) {
        if (start == end) {
            return listNodes[start];
        }
        ListNode left = divide(start, (start + end) / 2, listNodes);
        ListNode right = divide((start + end) / 2 + 1, end, listNodes);
        return mergeTwoLists(left, right);
    }

    public ListNode mergeTwoLists(ListNode leftList, ListNode rightList) {
        if (leftList == null) return rightList;
        if (rightList == null) return leftList;

        if (leftList.val < rightList.val) {
            leftList.next = mergeTwoLists(leftList.next, rightList);
            return leftList;
        } else {
            rightList.next = mergeTwoLists(leftList, rightList.next);
            return rightList;
        }
    }
}
