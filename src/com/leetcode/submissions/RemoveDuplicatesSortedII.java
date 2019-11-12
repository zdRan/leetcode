package com.leetcode.submissions;

import com.leetcode.extend.ListNode;

/**
 * 82. 删除排序链表中的重复元素 II
 * Create by ranzd on 2019/4/20
 *
 * @author cm.zdran@foxmail.com
 */
public class RemoveDuplicatesSortedII {
    /**
     * 先找到头结点，然后再删除其余的重复元素
     *
     * @param head
     * @return
     */
    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return head;
        }
        boolean isDel = false;
        while (head.next != null) {
            if (head.val == head.next.val) {
                head.next = head.next.next;
                isDel = true;
            } else {
                if (isDel) {
                    head = head.next;
                    isDel = false;
                } else {
                    break;
                }
            }
        }
        if (isDel) {
            return null;
        }

        ListNode lastNode = head;
        ListNode curr = head.next;

        while (curr != null && curr.next != null) {
            if (curr.val == curr.next.val) {
                curr.next = curr.next.next;
                isDel = true;
            } else {
                curr = curr.next;
                if (isDel) {
                    lastNode.next = curr;
                    isDel = false;
                } else {
                    lastNode = lastNode.next;
                }
            }
        }
        if (isDel) {
            lastNode.next = null;
        }
        return head;
    }

    /**
     * 双指针，currNode 负责遍历，如果当前 lastNode 的下一个节点与当前的遍历节点不是一个节点，
     * 说明 出现重复节点， lastNode 的下一个节点需要删除。
     * @param head
     * @return
     */
    public static ListNode deleteDuplicates2(ListNode head) {
        ListNode root = new ListNode(Integer.MAX_VALUE);
        root.next = head;
        ListNode lastNode = root;
        ListNode currNode = head;
        while (currNode != null) {
            while (currNode.next != null) {
                if (currNode.val == currNode.next.val) {
                    currNode = currNode.next;
                } else {
                    break;
                }
            }
            if (lastNode.next == currNode) {
                lastNode = lastNode.next;
            } else {
                lastNode.next = currNode.next;
            }

            currNode = currNode.next;
        }
        return root.next;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(2);

        ListNode curr = head;
        int[] arr = new int[]{2, 2, 3, 3, 3, 3, 3, 4, 5};
        for (int val : arr) {
            curr.next = new ListNode(val);
            curr = curr.next;
        }
        head = deleteDuplicates2(head);

        while (head != null) {
            System.out.print(head.val + "->");
            head = head.next;
        }
    }
}
