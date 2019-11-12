package com.leetcode.submissions;

import com.leetcode.extend.ListNode;
import com.leetcode.extend.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Create by ranzhendong on 2019-09-29 19:13
 *
 * @author cm.zdran@foxmail.com
 */
public class ConvertSortedListToBST {
    public TreeNode sortedListToBST(ListNode head) {
        List<Integer> nums = new ArrayList<>();
        //链表转数组
        while (head != null) {
            nums.add(head.val);
            head = head.next;
        }
        return dsf(nums, 0, nums.size() - 1);
    }

    /**
     * 递归 + 分治
     * @param nums
     * @param left
     * @param right
     * @return
     */
    private TreeNode dsf(List<Integer> nums, int left, int right) {
        if (left > right) {
            return null;
        }
        int mid = left + (right - left) / 2;
        TreeNode root = new TreeNode(nums.get(mid));
        root.left = dsf(nums, left, mid - 1);
        root.right = dsf(nums, mid + 1, right);
        return root;
    }
}
