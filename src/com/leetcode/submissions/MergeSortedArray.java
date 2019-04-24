package com.leetcode.submissions;

/**
 * 88. 合并两个有序数组
 * Create by ranzd on 2019/4/23
 *
 * @author cm.zdran@gmail.com
 */
public class MergeSortedArray {
    /**
     * 从后向前合并
     * @param nums1
     * @param m
     * @param nums2
     * @param n
     */
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int length = m-- + n--;
        while (m >= 0 && n >= 0) {
            nums1[length - 1] = (nums1[m] > nums2[n]) ?
                    nums1[m--] : nums2[n--];
            length--;
        }
        while (n >= 0) {
            nums1[length - 1] = nums2[n--];
            length--;
        }
    }

    public static void main(String[] args) {

    }
}
