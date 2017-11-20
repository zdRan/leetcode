package com.leetcode.submissions;

/**
 * Create by ranzd on 2017/11/20
 *
 * @author ranzd@chinaunicom.cn
 */
public class ZigZagConversion {

    public String convert(String s, int numRows) {
        if (numRows == 1){
            return s;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 1, j = 2 * numRows - i; i <= numRows; i++, j = 2 * numRows - i) {
            int tempI = i, tempJ = j;

            while (tempI <= s.length()) {
                sb.append(s.charAt(tempI-1));
                if (tempJ > tempI && tempJ < 2 * numRows - 2 + tempI && tempJ <= s.length()) {
                    sb.append(s.charAt(tempJ-1));
                }
                tempI = tempI + 2 * numRows - 2;
                tempJ = tempJ + 2 * numRows - 2;
            }
        }
        return sb.toString();
    }

}
