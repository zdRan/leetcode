package com.leetcode.mains;

import com.leetcode.submissions.LongestPalindromicSubstring;
import com.leetcode.utils.Show;

/**
 * Create by ranzd on 2017/11/15
 *
 * @author cm.zdran@gmail.com
 */
public class LongestPalindromicSubstringMain {
    public static void main(String[] args) {

        LongestPalindromicSubstring palindromicSubstring = new LongestPalindromicSubstring();
        String s = palindromicSubstring.longestPalindrome("caaaaba");
        Show.showString(s);

    }
}
