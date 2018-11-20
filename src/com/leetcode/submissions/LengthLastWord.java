package com.leetcode.submissions;

/**
 * Create by ranzd on 2018/11/19
 *
 * @author ranzd@chinaunicom.cn
 */
public class LengthLastWord {
    public static int lengthOfLastWord(String s) {
        if (s.length() == 0){
            return 0;
        }
        s = s.trim();
        if (!s.trim().contains(" ")) {
            return s.length();
        }
        return s.substring(s.lastIndexOf(' ')+1).length();
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("a "));
    }
}
