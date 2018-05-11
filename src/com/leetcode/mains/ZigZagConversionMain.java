package com.leetcode.mains;

import com.leetcode.submissions.ZigZagConversion;
import com.leetcode.utils.Show;

/**
 * Create by ranzd on 2017/11/20
 *
 * @author cm.zdran@gmail.com
 */
public class ZigZagConversionMain {
    public static void main(String[] args) {
        ZigZagConversion zigZagConversion = new ZigZagConversion();

        Show.showString(zigZagConversion.convert("qwe", 2));
    }
}
