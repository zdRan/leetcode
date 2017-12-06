package com.leetcode.mains;

import com.leetcode.extend.ListNode;
import com.leetcode.submissions.RemoveNodeFromList;
import com.leetcode.utils.Show;

/**
 * Create by ranzd on 2017/12/6
 *
 * @author ranzd@chinaunicom.cn
 */
public class RemoveNodeFromListMain {
    public static void main(String[] args){
        RemoveNodeFromList removeNodeFromList = new RemoveNodeFromList();
        ListNode head = new ListNode(0);
        ListNode curr = head;
        for (int i = 1;i<5;i++){
            curr.next = new ListNode(i);

            curr = curr.next;
        }
        head = removeNodeFromList.removeNthFromEnd(head,3);
        while (head!=null){
            Show.showString("->"+head.val);
            head = head.next;
        }
    }
}
