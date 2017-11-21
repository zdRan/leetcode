package com.leetcode.mains;

import com.leetcode.submissions.PalindromeNumber;
import com.leetcode.utils.Show;

/**
 * Create by ranzd on 2017/11/21
 *
 * @author ranzd@chinaunicom.cn
 */
public class PalindromeNumberMain {

    public static void main(String[] args){
        PalindromeNumber palindromeNumber = new PalindromeNumber();
        Show.showString("boolean: "+ palindromeNumber.isPalindrome(121));
    }
}
