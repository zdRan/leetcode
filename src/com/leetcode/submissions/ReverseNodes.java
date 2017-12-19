package com.leetcode.submissions;

import com.leetcode.extend.ListNode;
import com.leetcode.utils.Show;

import java.util.Stack;

/**
 * Create by ranzd on 2017/12/12
 *
 * @author ranzd@chinaunicom.cn
 */
public class ReverseNodes {
    public ListNode reverseKGroup(ListNode head, int k) {
        Stack<ListNode> stack = new Stack<>();
        int index = 0;
        ListNode result = null;
        ListNode left = null;
        ListNode right;
        boolean isFirst = true;
        while (head!=null){
            right = head;
            head = head.next;
            right.next = null;
            stack.push(right);
            index++;
            if (k == index){
                index = 0;
                if (isFirst){
                    result = revers(stack);
                    left = result;
                    isFirst = false;
                }else {
                    left.next = revers(stack);
                }
                while (left.next!=null){
                    left = left.next;
                }
            }
        }
        while (!stack.empty()){
            if (left == null){
                result = stack.remove(0);
                left = result;
            }else {
                left.next = stack.remove(0);
                left = left.next;
            }
        }
        return result;
    }
    private ListNode revers(Stack<ListNode> stack){
        ListNode head ;
        ListNode temp = stack.pop();
        head = temp;
        while (!stack.empty()){
            temp.next = stack.pop();
            temp = temp.next;
        }
        return head;
    }
}
