package com.leetcode.test;

import com.leetcode.utils.Show;

/**
 * 用于测试一些API
 * <p>
 * Create by ranzd on 2017/10/23
 *
 * @author ranzd@chinaunicom.cn
 */
public class TestMain {
    public static void main(String[] args) {

        //Show.showString("monotoneIncreasingDigits = "+monotoneIncreasingDigits(1122333221));
        //Show.showString("total = "+minCostClimbingStairs(new int[]{0,1,2,2}));
        //Show.showString("total = "+minCostClimbingStairs(new int[]{1, 100, 1, 1, 1, 100, 1, 1, 100, 1}));
        Show.showString("total = " + divide(-2147483648, 1));
    }

    public static int monotoneIncreasingDigits(int N) {
        String str = N + "";
        int[] num = new int[str.length()];
        int lastIndex = 0;
        boolean flag = true;
        for (int i = 0; i < str.length(); i++) {
            num[i] = str.charAt(i) - '0';
            if (flag && num[i] > num[lastIndex]) {
                lastIndex = i;
            }
            if (num[i] < num[lastIndex]) {
                flag = false;
            }
        }
        if (!flag) {
            num[lastIndex] = num[lastIndex] - 1;
            for (int i = lastIndex + 1; i < num.length; i++) {
                num[i] = 9;
            }
        } else {
            return N;
        }
        int M = 0;
        for (int i = 0; i < num.length; i++) {
            M = M * 10 + num[i];
        }
        return M;
    }

    public static int minCostClimbingStairs(int[] cost) {
        int total = 0;
        for (int i = cost.length - 1; i >= 1; ) {
            if (cost[i] >= cost[i - 1]) {
                total += cost[i - 1];
                i -= 2;
            } else {
                total += cost[i];
                i--;
            }
        }

        return total;
    }

    public static void DSF(int[] cost, int index, int total) {

        if (index - 12 > cost.length) {
            System.out.println(total);
        }
        if (cost[index + 1] < cost[index]) {
            DSF(cost, index + 2, total + cost[index + 1]);
        } else {
            DSF(cost, index + 1, total + cost[index]);
        }
    }

    static int add(int num1, int num2) {
        int sum = num1 ^ num2;
        int carry = (num1 & num2) << 1;
        while (carry != 0) {
            int a = sum;
            int b = carry;
            sum = a ^ b;
            carry = (a & b) << 1;
        }
        return sum;
    }

    static int subtract(int a, int b) {
        int subtrahend = add(~b, 1);

        int sub = add(a, subtrahend);

        return sub;
    }

    public static int divide(int a, int b) {
        if (b == 0 || (a == Integer.MIN_VALUE && b == -1))
            return Integer.MAX_VALUE;
        //对被除数和除数取绝对值
        int dividend = a < 0 ? add(~a, 1) : a;
        int divisor = b < 0 ? add(~b, 1) : b;

        //获得被除数的反序 比如dividend=101011 invert=1110101,invert最高位会多一个1,
        //这是为了防止dividend=1010,则直接反转为0101,这个时候原来的最低位的0就会丢失
        int invert = 2;
        while (dividend>0) {
            invert |= dividend & 0x1;
            invert = invert << 1;
            dividend = dividend >> 1;
        }

        int quotient = 0;
        int remainder = 0;
        while (invert > 1)//排除最高位的1
        {
            remainder = remainder << 1;
            remainder |= invert & 0x1;
            invert = invert >> 1;
            quotient = quotient << 1;

            if (remainder >= divisor) {
                quotient |= 0x1;
                remainder = subtract(remainder, divisor);
            }
        }
        //求商的符号
        if ((a ^ b) < 0) {
            quotient = add(~quotient, 1);
        }
        return quotient;
    }

}
