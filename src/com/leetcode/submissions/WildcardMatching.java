package com.leetcode.submissions;

/**
 * 44. Wildcard Matching
 * Create by ranzd on 2018/6/11
 *
 * @author cm.zdran@foxmail.com
 */
public class WildcardMatching {
    public static boolean isMatch(String s, String p) {
        if ("".equals(p)) {
            return "".equals(s);
        }
        if ("".equals(s)) {
            for (int i = 0; i < p.length(); i++) {
                if ('*' != p.charAt(i)) {
                    return false;
                }
            }
            return true;
        }
        return dfs(s, p, 0, 0);
    }

    private static boolean dfs(String s, String p, int sIndex, int pIndex) {
        if (pIndex == p.length()) {
            //正则以 * 号结尾
            if ('*' == p.charAt(pIndex - 1)) {
                return true;
            }
            //正则结束
            return sIndex == s.length();
        }
        //解决s结束，而正则没有结束 ，s = abcd p = a*
        if (sIndex == s.length()) {
            for (int i = pIndex; i < p.length(); i++) {
                if ('*' != p.charAt(i)) {
                    return false;
                }
            }
            return true;
        }
        if ('*' == p.charAt(pIndex)) {
            boolean flag = false;
            for (int i = sIndex; i < s.length(); i++) {
                flag = dfs(s, p, i, pIndex + 1);
                if (flag) {
                    break;
                }
            }
            return flag;
        }
        if ('?' == p.charAt(pIndex)) {
            return dfs(s, p, sIndex + 1, pIndex + 1);
        }
        if (s.charAt(sIndex) == p.charAt(pIndex)) {
            return dfs(s, p, sIndex + 1, pIndex + 1);
        } else {
            return false;
        }
    }

    private static boolean dp(String s, String p) {
        boolean[][] dpArray = new boolean[s.length() + 1][p.length() + 1];
        dpArray[0][0] = true;
        //解决以 * 号开头的问题 例如 s = abc，p = *****c
        for (int i = 0; i < p.length(); i++) {
            if ('*' == p.charAt(i)) {
                dpArray[0][i + 1] = true;
            } else {
                break;
            }
        }
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < p.length(); j++) {
                if ('*' == p.charAt(j)) {
                    dpArray[i + 1][j + 1] = dpArray[i][j] || dpArray[i][j + 1] || dpArray[i + 1][j];
                } else if ('?' == p.charAt(j)) {
                    dpArray[i + 1][j + 1] = dpArray[i][j];
                } else {
                    dpArray[i + 1][j + 1] = (s.charAt(i) == p.charAt(j)) && dpArray[i][j];
                }
            }
        }
        return dpArray[s.length()][p.length()];
    }

    public static void main(String[] args) {
        boolean flag;
        flag = dp("abcd", "ab?d");
        System.out.println("1:" + flag);

        flag = dp("abcd", "a*d");
        System.out.println("2:" + flag);

        flag = dp("abcd", "a*");
        System.out.println("1:" + flag);

        flag = dp("abcd", "a*b*c*d");
        System.out.println("3:" + flag);

        flag = dp("abcd", "a*b*c*d");
        System.out.println("4:" + flag);

        flag = dp("abcd", "a*b*c*d*");
        System.out.println("5:" + flag);

        flag = dp("abcd", "**a*b*c*d*");
        System.out.println("6:" + flag);

        flag = dp("aab", "c*a*b");
        System.out.println("false:" + flag);

        flag = dp("zacabz", "*a?b*");
        System.out.println("false:" + flag);

        flag = dp("adceb", "*a*b");
        System.out.println("true:" + flag);
    }
}
