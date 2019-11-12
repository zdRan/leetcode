package com.leetcode.submissions;

/**
 * Create by ranzd on 2017/12/20
 *
 * @author cm.zdran@foxmail.com
 */
public class ImplementStr {
    public int strStr(String haystack, String needle) {
        int result = -1;
        int index = 0;
        int curr = 0;
        for (; curr < haystack.length(); curr++) {
            if (index == needle.length()) {
                break;
            }
            if (haystack.charAt(curr) == needle.charAt(index)) {
                index++;
            } else {
                curr -= index;
                index = 0;
            }
        }
        if (index == needle.length()) {
            result = curr - index;
        }
        return result;
    }
}
