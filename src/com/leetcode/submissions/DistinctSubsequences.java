package com.leetcode.submissions;

import java.util.Arrays;

/**
 * Create by ranzhendong on 2019-10-09 15:13
 *
 * @author ranzhendong@maoyan.com
 */
public class DistinctSubsequences {
    /**
     * 动态规划：dp[i][j] 表示 S[i] 中含有 T[j] 子串的个数。
     * 动态方程：
     * S[i] == T[j]
     *      dp[i][j] = dp[i-1][j-1] + dp[i-1][j]
     * S[i] != T[j]
     *      dp[i][j] = dp[i-1][j]
     * @param s
     * @param t
     * @return
     */
    public int numDistinct(String s, String t) {
        int[][] dp = new int[s.length() + 1][t.length() + 1];
        //初始化
        Arrays.fill(dp[0], 0);
        for (int i = 0; i < dp.length; i++) {
            dp[i][0] = 1;
        }

        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < t.length(); j++) {
                if (s.charAt(i) == t.charAt(j)) {
                    dp[i + 1][j + 1] = dp[i][j] + dp[i][j + 1];
                }else {
                    dp[i + 1][j + 1] = dp[i][j + 1];
                }
            }
        }
        return dp[s.length()][t.length()];
    }
}
