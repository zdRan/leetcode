package com.leetcode.mains;

import com.leetcode.submissions.PalindromeNumber;
import com.leetcode.utils.Show;

/**
 * Create by ranzd on 2017/11/21
 *
 * @author cm.zdran@gmail.com
 */
public class PalindromeNumberMain {

    public static void main(String[] args) {
        PalindromeNumber palindromeNumber = new PalindromeNumber();
        Show.showString("boolean: " + palindromeNumber.isPalindrome(121));
    }
}
