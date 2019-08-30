package com.leetcode.submissions;

/**
 * Create by ranzd on 2019-08-30 14:53
 *
 * @author ranzhendong@maoyan.com
 */
public class InterleavingString {
    public static boolean isInterleave(String s1, String s2, String s3) {
        if (s3.length() != s1.length() + s2.length()) {
            return false;
        }
        return dsf(s1, 0, s2, 0, s3, 0);
    }

    private static boolean dsf(String s1, int i1, String s2, int i2, String s3, int i3) {
        if (i3 == s3.length()) {
            return true;
        }
        boolean result = false;
        if (s1.charAt(i1) == s3.charAt(i3)) {
            result = dsf(s1, i1 + 1, s2, i2, s3, i3 + 1);
        }
        if (result) {
            return true;
        }
        if (s2.charAt(i2) == s3.charAt(i3)) {
            result = dsf(s1, i1, s2, i2 + 1, s3, i3 + 1);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(isInterleave("aabcc", "dbbca", "aadbbcbcac"));
    }
}
