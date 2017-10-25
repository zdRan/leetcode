package com.leetcode.mains;

import com.leetcode.submissions.LongestSubstring;
import com.leetcode.utils.Show;

/**
 * Create by ranzd on 2017/10/23
 *
 * @author ranzd@chinaunicom.cn
 */
public class LongestSubstringMain {
    public static void main(String[] args){
        LongestSubstring longestSubstring = new LongestSubstring();
        int num = longestSubstring.lengthOfLongestSubstring("zsabca12345");
        Show.showString("num = "+num);
    }
}
