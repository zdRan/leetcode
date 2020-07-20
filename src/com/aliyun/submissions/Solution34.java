package com.aliyun.submissions;

/**
 * 34.矩阵最小路径和
 * Create by Ranzd on 2020-07-11 21:26
 *
 * @author ranzhendong@maoyan.com
 */
public class Solution34 {
    public static int ans = Integer.MAX_VALUE;

    public static int solution(int[][] m) {
        dfs(m, 0, 0, 0);
        return ans;
    }

    public static void dfs(int[][] m, int currCount, int i, int j) {
        if (i >= m.length || j >= m[i].length) {
            return;
        }
        if (i == m.length - 1 && j == m[i].length - 1) {
            ans = Math.min(currCount + m[i][j], ans);
            return;
        }
        if (j < m[i].length) {
            dfs(m, currCount + m[i][j], i, j + 1);
        }
        if (i < m.length) {
            dfs(m, currCount + m[i][j], i + 1, j);
        }
    }

    public static int dp(int[][] m) {
        int[][] dp = new int[m.length + 1][m[0].length + 1];
        int sum = m.length + m[0].length - 2;
        for (int i = sum, s = dp.length - 2; i >= 0; i--, s--) {
            int x = Math.max(s, 0);
            int y = i - x;
            while (x <= dp.length - 2 && y >= 0) {
                System.out.println(x + ":" + y);
                dp[x][y] = Math.min(m[x + 1][y], m[x][y + 1]) + m[x][y];
                x++;
                y--;
            }
        }
        return dp[0][0];
    }

    public static int dp2(int[][] m) {
        int sum = m.length + m[0].length - 2;
        for (int i = sum, s = m.length - 1; i >= 0; i--, s--) {
            int x = Math.max(s, 0);
            int y = i - x;
            //跳过右下角
            if (x == m.length-1 && y == m[x].length-1){
                continue;
            }
            while (x <= m.length - 1 && y >= 0) {
                System.out.println(x + ":" + y);
                int min = Integer.MAX_VALUE;
                if (x < m.length - 1) {
                    min = Math.min(m[x + 1][y], min);
                }
                if (y < m[x].length - 1) {
                    min = Math.min(m[x][y + 1], min);
                }
                m[x][y] += min;
                x++;
                y--;
            }
        }
        return m[0][0];
    }

    public static void main(String[] args) {
        int[][] arr = new int[][]{
                {4, 1, 5, 3}, {3, 2, 7, 7}, {6, 5, 2, 8}, {8, 9, 4, 5}};
        System.out.println(dp2(arr));
    }

}
