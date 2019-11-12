package com.leetcode.mains;

import com.leetcode.submissions.RemoveElement;
import com.leetcode.utils.Show;

/**
 * Create by ranzd on 17-12-19
 *
 * @author cm.zdran@foxmail.com
 */
public class RemoveElementMain {
    public static void main(String[] args) {
        RemoveElement removeElement = new RemoveElement();
        int[] nums = new int[]{3, 3, 3, 3};
        int count = removeElement.removeElement(nums, 3);

        for (int i = 0; i < count; i++) {
            Show.showString(nums[i] + "");
        }
    }
}
