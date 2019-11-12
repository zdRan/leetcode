package com.leetcode.submissions;

/**
 * Create by ranzd on 2017/11/21
 *
 * @author cm.zdran@foxmail.com
 */
public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int rev = 0;
        int temp = x;
        while (temp != 0) {
            rev = rev * 10 + temp % 10;
            temp /= 10;
        }
        return x == rev;
    }

    /**
     * 进阶版，其实不必翻转完所有的，翻转一半就可以判断了
     *
     * @param x 输入
     * @return 是否是回文
     */
    public boolean isPalindrome2(int x) {
        if (x < 0 || (x != 0 && x % 10 == 0)) {
            return false;
        }
        int rev = 0;
        while (x > rev) {
            rev = rev * 10 + x % 10;
            x = x / 10;
        }
        return (x == rev || x == rev / 10);
    }

}
