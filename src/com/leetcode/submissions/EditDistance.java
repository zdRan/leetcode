package com.leetcode.submissions;

/**
 * Create by ranzd on 2018/12/15
 *
 * @author cm.zdran@gmail.com
 */
public class EditDistance {
    public static int minDistance(String word1, String word2) {
        //dp[0][0] 表示空串对空串
        int[][] dp = new int[word1.length()+1][word2.length()+1];
        for (int i = 0; i < word1.length()+1; i++) {
            dp[i][0] = i;
        }
        for (int i = 0; i < word2.length()+1; i++) {
            dp[0][i] = i;
        }

        for (int i = 0; i < word1.length(); i++) {
            for (int j = 0; j < word2.length(); j++) {
                if (word1.charAt(i) == word2.charAt(j)) {
                    dp[i + 1][j + 1] = Math.min(dp[i][j], Math.min(dp[i][j + 1]+1, dp[i + 1][j]+1));
                }else {
                    dp[i + 1][j + 1] = Math.min(dp[i][j] + 1, Math.min(dp[i][j + 1] + 1, dp[i + 1][j] + 1));
                }
            }
        }
        return dp[word1.length()][word2.length()];
    }

    public static void main(String[] args) {
        System.out.println(minDistance("horse","ros"));
        System.out.println(minDistance("intention","execution"));
        System.out.println(minDistance("","a"));
    }
}
