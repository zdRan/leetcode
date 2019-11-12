package com.leetcode.submissions;

/**
 * Created by zdRan on 2018/12/6
 *
 * @author cm.zdran@foxmail.com
 */
public class UniquePathsII {
    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        boolean flag = obstacleGrid[0][0] == 1;

        for (int i = 1; i < m; i++) {
            if (obstacleGrid[i][0] == 1) {
                flag = true;
            }
            if (flag){
                obstacleGrid[i][0] = 0;
            }else {
                obstacleGrid[i][0] = 1;
            }
        }
        flag = obstacleGrid[0][0] == 1;
        for (int i = 1; i < n; i++) {
            if (obstacleGrid[0][i] == 1) {
                flag = true;
            }
            if (flag){
                obstacleGrid[0][i] = 0;
            }else {
                obstacleGrid[0][i] = 1;
            }
        }
        if (obstacleGrid[0][0] == 1) {
            obstacleGrid[0][0] = 0;
        }else {
            obstacleGrid[0][0] = 1;
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (obstacleGrid[i][j] == 1) {
                    obstacleGrid[i][j] = 0;
                }else {
                    obstacleGrid[i][j] = obstacleGrid[i - 1][j] + obstacleGrid[i][j - 1];
                }

            }
        }
        return obstacleGrid[m - 1][n - 1];
    }

    public static void main(String[] args) {
        System.out.println(uniquePathsWithObstacles(new int[][]{{0, 0, 0}, {0, 1, 0}, {0, 0, 0}}));
    }
}


