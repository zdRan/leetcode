package com.leetcode.submissions;

/**
 * Create by ranzd on 2017/12/26
 *
 * @author cm.zdran@foxmail.com
 */
public class DivideIntegers {
    public int divide(int dividend, int divisor) {
        if (divisor == 0 || (dividend == Integer.MIN_VALUE && (divisor == -1))) {
            return Integer.MAX_VALUE;
        }
        //对被除数和除数取绝对值,转换成成 long，防止溢出
        long dividendAbs = Math.abs((long) dividend);
        long divisorAbs = Math.abs((long) divisor);

        int quo = 0;

        for (int i = 31; i >= 0; i--) {
            //将被除数右移，防止除数左移发生溢出
            if ((dividendAbs >> i) >= divisorAbs) {
                dividendAbs -= (divisorAbs << i);
                quo += (1 << i);
            }
        }
        //确定符号
        if ((dividend ^ divisor) < 0) {
            quo = -quo;
        }
        return quo;
    }
}
