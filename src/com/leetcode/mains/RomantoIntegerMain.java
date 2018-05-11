package com.leetcode.mains;

import com.leetcode.submissions.IntegertoRoman;
import com.leetcode.submissions.RomantoInteger;
import com.leetcode.utils.Show;

/**
 * Create by ranzd on 2017/11/27
 *
 * @author cm.zdran@gmail.com
 */
public class RomantoIntegerMain {
    public static void main(String[] args) {
        RomantoInteger romantoInteger = new RomantoInteger();
        IntegertoRoman integertoRoman = new IntegertoRoman();
        Show.showString("num = " + romantoInteger.romanToInt(integertoRoman.intToRoman(1024)));
    }
}
