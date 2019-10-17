package com.leetcode.submissions;

/**
 * Create by ranzhendong on 2019-10-14 19:35
 *
 * @author ranzhendong@maoyan.com
 */
public class ValidPalindrome {
    public static boolean isPalindrome(String s) {
        if (s.length() == 0){
            return true;
        }
        char[] chars = s.toLowerCase().toCharArray();

        int start = 0;
        int end = chars.length - 1;

        while (start <= end) {
            if (!((chars[start] >= 'a' && chars[start] <= 'z') || (chars[start] >= '0' && chars[start] <= '9'))) {
                start++;
                continue;
            }
            if (!((chars[end] >= 'a' && chars[end] <= 'z') || (chars[end] >= '0' && chars[end] <= '9'))) {
                end--;
                continue;
            }
            if (chars[start++] != chars[end--]) {
                return false;
            }
        }
        return true;
    }
}
