package com.leetcode.submissions;

import com.leetcode.extend.ListNode;

/**
 * Create by ranzd on 2017/12/11
 *
 * @author ranzd@chinaunicom.cn
 */
public class SwapNodes {
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode temp = head.next;
        head.next = swapPairs(head.next.next);
        temp.next = head;
        return temp;
    }
}
