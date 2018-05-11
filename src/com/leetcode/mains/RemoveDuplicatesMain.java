package com.leetcode.mains;

import com.leetcode.submissions.RemoveDuplicates;
import com.leetcode.utils.Show;

/**
 * Create by ranzd on 17-12-19
 *
 * @author cm.zdran@gmail.com
 */
public class RemoveDuplicatesMain {
    public static void main(String[] args) {
        RemoveDuplicates removeDuplicates = new RemoveDuplicates();

        int[] arr = new int[]{1, 1, 1, 2, 2, 3, 4, 5};

        int count = removeDuplicates.removeDuplicates(arr);

        for (int i = 0; i < count; i++) {
            Show.showString(arr[i] + ",");
        }
    }
}
