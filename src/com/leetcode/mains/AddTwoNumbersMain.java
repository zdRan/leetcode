package com.leetcode.mains;

import com.leetcode.extend.ListNode;
import com.leetcode.submissions.AddTwoNumbers;

/**
 * Create by ranzd on 2017/10/20
 *
 * @author ranzd@chinaunicom.cn
 */
public class AddTwoNumbersMain {
    public static void main(String[] args){
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);


//        ListNode l1 = new ListNode(9);
//        l1.next = new ListNode(8);
//        ListNode l2 = new ListNode(1);

//        ListNode l1 = new ListNode(3);
//        l1.next = new ListNode(7);
//        ListNode l2 = new ListNode(9);
//        l2.next = new ListNode(2);

        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        ListNode result = addTwoNumbers.addTwoNumbers(l1,l2);
        showList(result);
    }
    private static void showList(ListNode listNode){
        while (listNode!=null){
            System.out.print(listNode.val+"->");
            listNode = listNode.next;
        }
    }
}
