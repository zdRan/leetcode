package com.leetcode.submissions;

public class DecodeWays {
    public static int numDecodings(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        if (s.length() == 1) {
            return s.charAt(0) == '0' ? 0 : 1;
        }
        int start = 0;
        while (start < s.length() && s.charAt(start) == '0') {
            start++;
        }
        if (start == s.length() - 1) {
            return s.charAt(start) == '0' ? 0 : 1;
        }

        int[] dp = new int[s.length() + 1];
        dp[start] = 1;
        dp[start + 1] = 1;

        for (int i = start + 2; i <= s.length(); i++) {
            if (s.charAt(i - 1) != '0') {
                dp[i] = dp[i - 1];
            }
            int temp = Integer.valueOf(s.substring(i - 2, i));
            if (temp > 9 && temp < 27) {
                dp[i] += dp[i - 2];
            }
        }
        return dp[s.length()];
    }
    public static int numDecodings2(String s) {
        int n = s.length();
        if (n <= 0) return 0;
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = (s.charAt(0) == '0') ? 0 : 1;

        for (int i = 2; i <= n; i++) {
            int first = Integer.valueOf(s.substring(i-1,i));
            int second = Integer.valueOf(s.substring(i-2,i));

            if (first >= 1 && first <= 9)
                dp[i] += dp[i-1];
            if (second >= 10 && second <= 26)
                dp[i] += dp[i-2];
        }

        return dp[n];
    }

    public static void main(String[] args) {
        System.out.println(numDecodings2("110"));
    }
}
