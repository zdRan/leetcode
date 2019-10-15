package com.leetcode.submissions;

/**
 * 87. 扰乱字符串
 * Create by ranzd on 2019/4/23
 *
 * @author cm.zdran@gmail.com
 */
public class ScrambleString {
    public static boolean isScramble(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        return dfs(s1.toCharArray(), 0, s1.length(),
                s2.toCharArray(), 0, s2.length());
    }

    public static boolean dfs(char[] s1, int s1Start, int s1End,
                              char[] s2, int s2Start, int s2End) {
        if (s1End - s1Start <= 0 && s2End - s2Start <= 0) {
            return true;
        }
        if ((s1Start + 1 == s1End) && (s2Start + 1 == s2End)) {
            return s1[s1Start] == s2[s2Start];
        }
        if (s1End - s1Start != s2End - s2Start) {
            return false;
        }
        if (!equalsArr(s1, s1Start, s1End - 1, s2, s2Start, s2End - 1)) {
            return false;
        }
        for (int i = 1; i < s1End-s1Start; i++) {

            if (dfs(s1, s1Start, s1Start + i, s2, s2Start, s2Start + i)
                    && dfs(s1, s1Start + i, s1End, s2, s2Start + i, s2End)) {
                return true;
            }
            if (dfs(s1, s1Start, s1Start + i, s2, s2End - i, s2End)
                    && dfs(s1, s1Start + i, s1End, s2, s2Start, s2End - i)) {

                return true;
            }
        }
        return false;

    }

    public static boolean equalsArr(char[] s1, int s1Start, int s1End,
                                    char[] s2, int s2Start, int s2End) {
        int[] charArr = new int[26];
        for (; s1Start <= s1End && s2Start <= s2End; s1Start++, s2Start++) {
            charArr[s1[s1Start] - 'a']++;
            charArr[s2[s2Start] - 'a']--;
        }
        for (int item : charArr) {
            if (item != 0) {
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        System.out.println(isScramble("abcd", "acdb"));

    }
}
/*
dc ba

d c b a


 cd ab

 c d a b

 */