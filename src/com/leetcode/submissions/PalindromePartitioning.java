package com.leetcode.submissions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 131. 分割回文串
 * Create by Ranzd on 2020-07-20 20:27
 *
 * @author cm.zdran@foxmail.com
 */
public class PalindromePartitioning {

    public static List<List<String>> partitionV1(String s) {
        boolean[][] dp = new boolean[s.length()][s.length()];
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                dp[j][i] = true;
            }
        }
        //构造DP
        for (int i = 1; i < s.length(); i++) {
            for (int j = 0; j + i < s.length(); j++) {
                if (s.charAt(j) == s.charAt(j + i) && dp[j + 1][j + i - 1]) {
                    dp[j][j + i] = true;
                }
            }
        }
        //DFS
        List<List<String>> ans = new ArrayList<>();
        dfs2(s, 0, new ArrayList<>(), dp, ans);
        return ans;
    }

    private static void dfs(String str, int start, List<String> item, boolean[][] dp, List<List<String>> ans) {

        if (start == str.length()) {
            ans.add(new ArrayList<>(item));
            return;
        }
        for (int i = start + 1; i <= str.length(); i++) {
            if (dp[start][i - 1]) {
                item.add(str.substring(start, i));
                dfs(str, i, item, dp, ans);
                item.remove(item.size() - 1);
            }
        }
    }
    private static void dfs2(String str, int start, List<String> item, boolean[][] dp, List<List<String>> ans) {
        if (start == str.length()) {
            System.out.println(Arrays.deepToString(item.toArray()));
            return;
        }
        for (int i = start + 1; i <= str.length(); i++) {
            item.add(str.substring(start, i));
            dfs2(str, i, item, dp, ans);
            item.remove(item.size() - 1);
        }
    }
    public static void main(String[] args) {
        partitionV1("abccba");

    }
}
