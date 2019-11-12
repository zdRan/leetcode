package com.leetcode.submissions;

import java.util.regex.Pattern;

/**
 * Create by ranzd on 2018/12/7
 *
 * @author cm.zdran@foxmail.com
 */
public class ValidNumber {
    public static boolean isNumber(String s) {
        //匹配空串
        if (s == null || s.length() == 0) {
            return false;
        }
        s = s.trim();
        //出现除 [0-9]、+、-、.、e 之外的字符，说明不是数字
        String pattern1 = "^.*[^0-9^\\+^\\-^e^\\.].*$";
        if (Pattern.matches(pattern1, s)) {
            return false;
        }
        // 没有出现 [0-9] 也不是数字
        String pattern2 = "^.*[0-9]+.*$";
        if (!Pattern.matches(pattern2, s)) {
            return false;
        }
        if (s.contains("e")){
            // e的前后必须包含数字,x小数点前后必须包含数字
            String pattern3 = "^(([\\+|\\-]?[0-9]+(\\.[0-9]*)?)|[\\+|\\-]?[0-9]*(\\.[0-9]+))e[\\+|\\-]?[0-9]+$";
            if (!Pattern.matches(pattern3, s)) {
                return false;
            }
            // 匹配数字
            String pattern4 = "^[\\+|\\-]?[0-9]+(\\.[0-9]*)?|[\\+|\\-]?[0-9]*(\\.[0-9]+)$";
            String[] num = s.split("e");

            for (String str : num) {
                if (!Pattern.matches(pattern4, str)) {
                    return false;
                }
            }
        }else {
            String pattern5 = "^[\\+|\\-]?[0-9]*\\.?[0-9]*?$";
            if (!Pattern.matches(pattern5, s)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String number = "^[\\+|\\-]?[0-9]*\\.?[0-9]*?(e[\\+|\\-]?[0-9]+)?$";
        System.out.println(isNumber("2.e1"));
        System.out.println(isNumber("e1"));
    }
}
