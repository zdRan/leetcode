package com.leetcode.mains;

import com.leetcode.submissions.LongestCommonPrefix;
import com.leetcode.utils.Show;

/**
 * Create by ranzd on 2017/11/27
 *
 * @author cm.zdran@foxmail.com
 */
public class LongestCommonPrefixMain {
    public static void main(String[] args) {
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        String[] strs = new String[]{"aabbc", "aabc", "aab"};
        Show.showString("maxPrefix = " + longestCommonPrefix.longestCommonPrefix(strs));
    }
}
