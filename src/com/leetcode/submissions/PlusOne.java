package com.leetcode.submissions;

import java.util.Arrays;

/**
 * Create by ranzd on 2018/12/10
 *
 * @author cm.zdran@gmail.com
 */
public class PlusOne {
    public static int[] plusOne(int[] digits) {
        int add = 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] + add == 10) {
                digits[i] = 0;
            } else {
                digits[i] += add;
                return digits;
            }
        }
        int[] ansArr = new int[digits.length + 1];
        ansArr[0] = 1;
        System.arraycopy(digits, 0, ansArr, 1, ansArr.length - 1);
        return ansArr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(plusOne(new int[]{9, 9, 9})));
    }

}
