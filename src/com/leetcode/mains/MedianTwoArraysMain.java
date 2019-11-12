package com.leetcode.mains;

import com.leetcode.submissions.MedianTwoArrays;
import com.leetcode.utils.Show;

/**
 * Create by ranzd on 17-10-26
 *
 * @author cm.zdran@foxmail.com
 */
public class MedianTwoArraysMain {
    public static void main(String[] args) {
        int[] nums1 = new int[]{};
        int[] nums2 = new int[]{2, 4};
        MedianTwoArrays medianTwoArrays = new MedianTwoArrays();
        Show.showDouble(medianTwoArrays.findMedianSortedArrays(nums1, nums2));
    }
}
