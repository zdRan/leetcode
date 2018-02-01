package com.leetcode.submissions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Create by ranzd on 2018/2/1
 *
 * @author ranzd@chinaunicom.cn
 */
public class CountAndSay {

    public static String countAndSay(int n) {
        Pattern pattern = Pattern.compile("([\\d])\\1*");
        StringBuilder sb = new StringBuilder("1");
        while (n>1){
            Matcher matcher = pattern.matcher(sb.toString());
            sb.delete(0,sb.length());
            n--;
            while (matcher.find()){
                sb.append(matcher.group().length());
                sb.append(matcher.group().charAt(0));
            }
        }
        System.out.println("sb = "+sb.toString());
        return sb.toString();
    }

    public static void main(String[] args) {
        countAndSay(5);

    }
}
