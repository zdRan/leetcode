package com.leetcode.submissions;

/**
 * 48. 旋转图片
 * Create by ranzd on 2018/7/26
 *
 * @author cm.zdran@foxmail.com
 */
public class RotateImage {
    public static void rotate(int[][] matrix) {
        int n = matrix.length;
        int temp;
        for (int i = 0; i < n / 2; i++) {
            for (int y = i; y < n - 1 - i; y++) {
                // m[x1][y1] --> m[y1][n-1-x1]
                temp = matrix[y][n - 1 - i];
                matrix[y][n - 1 - i] = matrix[i][y];
                matrix[i][y] = temp;

                temp = matrix[n - 1 - i][n - 1 - y];
                matrix[n - 1 - i][n - 1 - y] = matrix[i][y];
                matrix[i][y] = temp;

                temp = matrix[n - 1 - y][i];
                matrix[n - 1 - y][i] = matrix[i][y];
                matrix[i][y] = temp;
            }
        }
    }


    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] arr2 = {
                {5, 1, 9, 11},
                {2, 4, 8, 10},
                {13, 3, 6, 7},
                {15, 14, 12, 16}
        };
        rotate(arr2);

        System.out.println(arr2);

    }
}