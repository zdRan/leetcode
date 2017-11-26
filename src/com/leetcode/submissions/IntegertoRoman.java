package com.leetcode.submissions;

/**
 * Create by ranzd on 17-11-26
 *
 * @author ranzd@chinaunicom.cn
 */
public class IntegertoRoman {
    public String intToRoman(int num) {
        StringBuilder sb = new StringBuilder();
        String[][]r = {
                {"","I","II","III","IV","V","VI","VII","VIII","IX"},
                {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"},
                {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"},
                {"","M","MM","MMM"}
        };

        sb.append(r[3][num/1000%10]);
        sb.append(r[2][num/100%10]);
        sb.append(r[1][num/10%10]);
        sb.append(r[0][num%10]);

        return sb.toString();
    }
}
