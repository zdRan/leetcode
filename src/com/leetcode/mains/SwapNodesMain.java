package com.leetcode.mains;

import com.leetcode.extend.ListNode;
import com.leetcode.submissions.SwapNodes;
import com.leetcode.utils.Show;

/**
 * Create by ranzd on 2017/12/11
 *
 * @author cm.zdran@foxmail.com
 */
public class SwapNodesMain {
    public static void main(String[] args) {
        SwapNodes swapNodes = new SwapNodes();
        ListNode l1 = new ListNode(0);
        ListNode curr = l1;
        for (int i = 1; i < 9; i++) {
            curr.next = new ListNode(i);
            curr = curr.next;
        }

        ListNode head = swapNodes.swapPairs(l1);
        while (head != null) {
            Show.showString("->" + head.val);
            head = head.next;
        }
    }
}
