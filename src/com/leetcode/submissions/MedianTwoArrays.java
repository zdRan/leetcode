package com.leetcode.submissions;

import java.util.ArrayList;
import java.util.List;

/**
 * Create by ranzd on 2017/10/26
 *
 * @author ranzd@chinaunicom.cn
 */
public class MedianTwoArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int T = nums1.length + nums2.length;
        double result;
        List<Integer> nums3 = new ArrayList<>(T);
        int i1 = 0;
        int i2 = 0;
        int i3 = 0;

        int num1;
        int num2;
        while (i3 <= T/2){
            num1 = (i1 == nums1.length) ? Integer.MAX_VALUE:nums1[i1];
            num2 = (i2 == nums2.length) ? Integer.MAX_VALUE:nums2[i2];
            if (num1<num2){
                nums3.add(num1);
                i1++;
            }else {
                nums3.add(num2);
                i2++;
            }
            i3++;
        }

        int temp;
        if (T%2 != 0){
            temp = nums3.get(i3-1);
            result = (temp + temp)/2.0;
        }else {
            temp = nums3.get(i3-2)+nums3.get(i3-1);
            result = temp/2.0;
        }
        return result;
    }
}
