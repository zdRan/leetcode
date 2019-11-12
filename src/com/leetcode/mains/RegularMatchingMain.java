package com.leetcode.mains;

import com.leetcode.submissions.RegularExpressionMatching;
import com.leetcode.utils.Show;

/**
 * Create by ranzd on 17-11-21
 *
 * @author cm.zdran@foxmail.com
 */
public class RegularMatchingMain {
    public static void main(String[] args) {
        RegularExpressionMatching regularExpressionMatching = new RegularExpressionMatching();
        Show.showString("1 : " + regularExpressionMatching.isMatch("ab", "c*a*b"));
        Show.showString("2 : " + regularExpressionMatching.isMatch("a", "ab*a"));
        Show.showString("3 : " + regularExpressionMatching.isMatch("a", ".*..a*"));
        Show.showString("4 : " + regularExpressionMatching.isMatch("axys", "axy.*s"));
        Show.showString("5 : " + regularExpressionMatching.isMatch("abbb", "bbb*"));
        Show.showString("5 : " + regularExpressionMatching.isMatch("aa", "a"));

        Show.showString("1 : " + regularExpressionMatching.isMatch2("ab", "c*a*b"));
        Show.showString("2 : " + regularExpressionMatching.isMatch2("a", "ab*a"));
        Show.showString("3 : " + regularExpressionMatching.isMatch2("a", ".*..a*"));
        Show.showString("4 : " + regularExpressionMatching.isMatch2("axys", "axy.*s"));
        Show.showString("5 : " + regularExpressionMatching.isMatch2("abbb", "bbb*"));
        Show.showString("5 : " + regularExpressionMatching.isMatch2("aa", "a"));
    }
}
