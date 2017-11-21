package com.leetcode.mains;

import com.leetcode.submissions.RegularExpressionMatching;
import com.leetcode.utils.Show;

/**
 * Create by ranzd on 17-11-21
 *
 * @author ranzd@chinaunicom.cn
 */
public class RegularMatchingMain {
    public static void main(String[] args){
        RegularExpressionMatching regularExpressionMatching = new RegularExpressionMatching();
        Show.showString("boolean = "+ regularExpressionMatching.isMatch("ab",".*c"));
    }
}
