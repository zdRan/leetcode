package com.leetcode.submissions;

/**
 * 867. 转置矩阵
 * Create by Ranzd on 2021-02-25 15:38
 *
 * @author ranzhendong@maoyan.com
 */
public class TransposeMatrix {
    public int[][] transpose(int[][] matrix) {
        int[][] result = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j <matrix[i].length ; j++) {
                result[j][i] = matrix[i][j];
            }
        }
        return result;
    }
}
