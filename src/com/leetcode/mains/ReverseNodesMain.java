package com.leetcode.mains;

import com.leetcode.extend.ListNode;
import com.leetcode.submissions.ReverseNodes;
import com.leetcode.utils.Show;

/**
 * Create by ranzd on 2017/12/19
 *
 * @author ranzd@chinaunicom.cn
 */
public class ReverseNodesMain {
    public static void main(String[] args){
        ReverseNodes reverseNodes = new ReverseNodes();
        ListNode l1 = new ListNode(0);
        ListNode curr = l1;
        for (int i = 1;i<10;i++){
            curr.next = new ListNode(i);
            curr = curr.next;
        }
        ListNode head = reverseNodes.reverseKGroup(curr,3);
        while (head!=null){
           Show.showString(head.val+"->");
            head = head.next;
        }
    }
}
