package com.leetcode.submissions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * Create by ranzd on 2017/11/21
 *
 * @author cm.zdran@gmail.com
 */
public class StringToInteger {
    /**
     * 初始状态，如果不是[空格、+、-、0-9]之中的字符，直接转 4
     * 读取到 +/- 转到 2，
     * 读取到 [0-9] 转到3
     */
    private static final int STEP_1 = 1;
    /**
     * 读取到 [0-9] 转到 3，
     * 读取到其他字符转到4
     */
    private static final int STEP_2 = 2;
    /**
     * 读取到 [0-9] 转到 3，
     * 读取到其他字符转到4
     */
    private static final int STEP_3 = 3;
    /**
     * 结束状态
     */
    private static final int STEP_4 = 4;

    public int myAtoi(String str) {
        //当前状态
        int current = STEP_1;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            switch (current) {
                case STEP_1: {
                    sb.delete(0, sb.length());
                    if (c != '+' && c != '-' && c != ' ' && (c < '0' || c > '9')) {
                        current = STEP_4;
                    }
                    if (c == '+' || c == '-') {
                        current = STEP_2;
                        sb.append(c);
                    }
                    if (c >= '0' && c <= '9') {
                        current = STEP_3;
                        sb.append(c);
                    }
                }
                break;
                case STEP_2: {
                    if (c >= '0' && c <= '9') {
                        current = STEP_3;
                        sb.append(c);
                    } else {
                        sb.delete(0, sb.length());
                        current = STEP_4;
                    }

                }
                break;
                case STEP_3: {
                    if (c >= '0' && c <= '9') {
                        current = STEP_3;
                        sb.append(c);
                    } else {
                        current = STEP_4;
                    }
                }
                break;
                case STEP_4: {
                    break;
                }
                default: {

                }
            }
        }
        int num;
        try {
            if (sb.length() == 0 || current == STEP_2) {
                return 0;
            }
            num = Integer.parseInt(sb.toString());
        } catch (NumberFormatException e) {
            if (sb.indexOf("-") == 0) {
                return Integer.MIN_VALUE;
            } else {
                return Integer.MAX_VALUE;
            }
        }
        return num;
    }

    /**
     * 正则表达式，未完成。
     *
     * @param str 输入
     * @return 整数
     */
    public int myAtoi2(String str) {
        Pattern p = Pattern.compile("(\\+|-)?([0-9])+");
        Matcher m = p.matcher(str);
        return m.find() ? Integer.parseInt(m.group()) : 0;
    }

}
