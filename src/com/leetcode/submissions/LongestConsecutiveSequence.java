package com.leetcode.submissions;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Create by Ranzd on 2019-11-12 19:12
 *
 * @author cm.zdran@foxmail.com
 */
public class LongestConsecutiveSequence {
    public static int longestConsecutive(int[] nums) {
        int min = 0;
        int max = 0;
        int length = 1;
        if (nums.length == 0) {
            return 0;
        }
        Set<Integer> numSet = new HashSet<>(nums.length);
        for (int n : nums) {
            numSet.add(n);
        }
        Iterator<Integer> iterator = numSet.iterator();
        while (iterator.hasNext()) {
            int curr = iterator.next();
            if (min <= curr && curr <= max) {
                continue;
            }
            max = curr;
            while (numSet.contains(max + 1)) {
                max++;
            }
            min = curr;
            while (numSet.contains(min - 1)) {
                min--;
            }
            length = Math.max(length, (max - min + 1));
        }
        return length;
    }
}