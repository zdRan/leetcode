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
        return dfs(s1, 0, s2, 0, s3, 0);
    }

    /**
     * 类似于 归并排序的拟操作。如果 s3 的某个字符，既不能属于 s1,也不能属于 s2,则返回 false。
     * <p>
     * 递归遍历 s3 ，如果当前字符属于 s1,或者 s2，递归下一个字符。
     *
     * @param s1
     * @param i1
     * @param s2
     * @param i2
     * @param s3
     * @param i3
     * @return
     */
    private static boolean dfs(String s1, int i1, String s2, int i2, String s3, int i3) {
        if (i3 == s3.length()) {
            return true;
        }
        boolean result = false;
        if (s1.charAt(i1) == s3.charAt(i3)) {
            result = dfs(s1, i1 + 1, s2, i2, s3, i3 + 1);
        }
        if (result) {
            return true;
        }
        if (s2.charAt(i2) == s3.charAt(i3)) {
            result = dfs(s1, i1, s2, i2 + 1, s3, i3 + 1);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(isInterleave("aabcc", "dbbca", "aadbbcbcac"));
    }
}
