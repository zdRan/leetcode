package com.leetcode.test;

import com.leetcode.utils.Show;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 用于测试一些API
 * <p>
 * Create by ranzd on 2017/10/23
 *
 * @author ranzd@chinaunicom.cn
 */
public class TestMain {
    public static void main(String[] args) {
        Show.showString("// "+ (1/10));

        Show.showString("index = "+"qqqddd".startsWith("qqq"));

        Show.showString("index = "+"qqqddde".substring("qqq".length()));
        char ch = '3';
        ch = (char) (ch -'1');
        System.out.println(ch);

        Show.showString("monotoneIncreasingDigits = "+monotoneIncreasingDigits(332));
    }

    public static int monotoneIncreasingDigits(int N) {

        String strNum = String.valueOf(N);
        StringBuilder sb = new StringBuilder();
        if (strNum.length() == 1){
            return N;
        }
        int index = 1;
        sb.append(strNum.charAt(0));
        for (; index < strNum.length(); index++) {
            if (strNum.charAt(index)>=strNum.charAt(index-1)){
                sb.append(strNum.charAt(index-1));
            }else {
                sb.append("9");
                int temp = index;
                temp--;
                char c = sb.charAt(temp);
                int num = Integer.parseInt(String.valueOf(c));
                sb.setCharAt(temp,((num-1)+"").charAt(0));
                while (temp>0){

                    if (sb.charAt(temp)<sb.charAt(temp-1)){
                        sb.setCharAt(temp, '9');
                        char c1 = sb.charAt(temp);
                        int num1 = Integer.parseInt(String.valueOf(c1));
                        sb.setCharAt(temp,((num1-1)+"").charAt(0));
                    }
                    temp--;
                }
                break;
            }
        }
        for (; index < strNum.length()-1; index++) {
            sb.append("9");
        }
        return Integer.parseInt(sb.toString());
    }

}
