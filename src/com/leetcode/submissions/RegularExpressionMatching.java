package com.leetcode.submissions;

/**
 * Create by ranzd on 17-11-21
 *
 * @author cm.zdran@gmail.com
 */
public class RegularExpressionMatching {
    public boolean isMatch(String s, String p) {
        return recursion(s, p, 0, 0);
    }

    private boolean recursion(String s, String p, int sIndex, int pIndex) {
        if (pIndex >= p.length()) {
            return sIndex >= s.length();
        }
        //解决 s = ab ，p = a*b*c*d
        if (sIndex >= s.length()) {
            if (pIndex + 1 < p.length() && p.charAt(pIndex + 1) == '*') {
                return recursion(s, p, sIndex, pIndex + 2);
            } else {
                return false;
            }
        }
        //解决 s = aa,p =  a
        if (pIndex + 1 >= p.length()) {
            if (p.charAt(pIndex) == s.charAt(sIndex) || p.charAt(pIndex) == '.') {
                return sIndex + 1 == s.length();
            } else {
                return false;
            }
        }
        if ((pIndex + 1 < p.length()) && p.charAt(pIndex + 1) != '*') {
            if (s.charAt(sIndex) == p.charAt(pIndex) || (sIndex < s.length() && p.charAt(pIndex) == '.')) {
                return recursion(s, p, sIndex + 1, pIndex + 1);
            } else {
                return false;
            }
        } else {
            while ((sIndex < s.length() && s.charAt(sIndex) == p.charAt(pIndex)) || (sIndex < s.length() && p.charAt(pIndex) == '.')) {
                if (recursion(s, p, sIndex, pIndex + 2)) {
                    return true;
                }
                sIndex++;
            }
            return recursion(s, p, sIndex, pIndex + 2);

        }
    }

    public boolean isMatch2(String s, String p) {
        boolean[] match = new boolean[s.length() + 1];
        match[s.length()] = true;
        for (int i = p.length() - 1; i >= 0; i--) {
            if (p.charAt(i) == '*') {
                // 如果是星号，从后往前匹配
                for (int j = s.length() - 1; j >= 0; j--) {
                    match[j] = match[j] || (match[j + 1] && (p.charAt(i - 1) == '.' || (p.charAt(i - 1) == s.charAt(j))));
                }
                // 记得把i多减一，因为星号是和其前面的字符配合使用的
                i--;
            } else {
                // 如果不是星号，从前往后匹配
                for (int j = 0; j < s.length(); j++) {
                    match[j] = match[j + 1] && (p.charAt(i) == '.' || (p.charAt(i) == s.charAt(j)));
                }
                // 只要试过了pattern中最后一个字符，就要把match[s.length()]置为false
                match[s.length()] = false;
            }
        }
        return match[0];
    }
}
