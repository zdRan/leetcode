package com.leetcode.submissions;

/**
 * Create by ranzd on 17-11-26
 *
 * @author cm.zdran@gmail.com
 */
public class RomantoInteger {
    public int romanToInt(String s) {
        String[][] r = {
                {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"},
                {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"},
                {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"},
                {"", "M", "MM", "MMM"}
        };

        int num = 0;
        //计算 千位
        for (int i = r[3].length - 1; i > 0; i--) {
            if (s.startsWith(r[3][i])) {
                num = num + i * 1000;
                s = s.substring(r[3][i].length());
                break;
            }
        }
        //计算 百位
        for (int i = r[2].length - 1; i > 0; i--) {
            if (s.startsWith(r[2][i])) {
                num = num + i * 100;
                s = s.substring(r[2][i].length());
                break;
            }
        }
        //计算 十位
        for (int i = r[1].length - 1; i > 0; i--) {
            if (s.startsWith(r[1][i])) {
                num = num + i * 10;
                s = s.substring(r[1][i].length());
                break;
            }
        }

        //计算 个位
        for (int i = r[0].length - 1; i > 0; i--) {
            if (s.startsWith(r[0][i])) {
                num += i;
                s = s.substring(r[0][i].length());
                break;
            }
        }
        return num;
    }
}
