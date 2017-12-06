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
        //System.out.println(ch);

        Show.showString("monotoneIncreasingDigits = "+monotoneIncreasingDigits(1122333221));
    }

    public static int monotoneIncreasingDigits(int N) {
        String str = N+"";
        int[] num = new int[str.length()];
        int lastIndex = 0;
        boolean flag = true;
        for (int i = 0;i<str.length();i++){
            num[i] = str.charAt(i)-'0';
            if (flag&&num[i] > num[lastIndex]){
                 lastIndex = i;
            }
            if (num[i] < num[lastIndex]){
                flag = false;
            }
        }
        if (!flag){
            num[lastIndex] = num[lastIndex]-1;
            for (int i = lastIndex+1;i<num.length;i++){
                num[i] = 9;
            }
        }else {
            return N;
        }
        int M = 0;
        for (int i = 0;i<num.length;i++){
            M = M*10 + num[i];
        }
        return M;
    }

}
