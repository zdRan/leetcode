package com.leetcode.submissions;
/**
 * 91. 解码方法
 * Create by ranzd on 2018/2/1
 *
 * @author cm.zdran@foxmail.com
 */
public class DecodeWays {
    /**
     * 动态规划：
     * dp[i] = n 表示 在[0,i+1] 个字符的时候有 n 种可能，
     *
     * 比如： dp[3] = 2, 使用前 3 个字符，有 2 种可能
     *
     * 动态方程：
     * 如果 当前位置不为 '0',说明可以独立存在，dp[i] = dp[i-1]
     * 如果 当前位置与前一个字符组成的数字 在 [10,26]之间，说明可以组合存在，dp[i] = dp[i] + dp[i-2]
     *
     * @param s
     * @return
     */
    public static int numDecodings(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        if (s.charAt(0) == '0') {
            return 0;
        }
        int[] dp = new int[s.length() + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= s.length(); i++) {
            if (s.charAt(i - 1) != '0' ) {
                dp[i] = dp[i - 1];
            }
            int temp = Integer.valueOf(s.substring(i - 2, i));
            if (temp > 9 && temp < 27) {
                dp[i] += dp[i - 2];
            }
        }
        return dp[s.length()];
    }
    public static void main(String[] args) {
        System.out.println(numDecodings("1100"));
    }
}
