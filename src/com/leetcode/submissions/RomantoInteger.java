package com.leetcode.submissions;

/**
 * Create by ranzd on 17-11-26
 *
 * @author ranzd@chinaunicom.cn
 */
public class RomantoInteger {
    public int romanToInt(String s) {
        String[][]r = {
                {"","I","II","III","IV","V","VI","VII","VIII","IX"},
                {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"},
                {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"},
                {"","M","MM","MMM"}
        };
        for (int i = r.length-1;i>=0;i--){
            for (int j = r[i].length-1;j>0;j--){
                if (s.contains(r[i][j])){

                }
            }
        }


    }
}
