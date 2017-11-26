package com.leetcode.mains;

import com.leetcode.submissions.IntegertoRoman;
import com.leetcode.utils.Show;

/**
 * Create by ranzd on 17-11-26
 *
 * @author ranzd@chinaunicom.cn
 */
public class IntegertoRomanMain {
    public static void main(String[] args){
        IntegertoRoman integertoRoman = new IntegertoRoman();

        Show.showString("num = "+ integertoRoman.intToRoman(1024));
    }
}
