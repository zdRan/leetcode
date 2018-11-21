package com.leetcode.submissions;

import java.util.Arrays;

/**
 * Create by ranzd on 2018/11/20
 *
 * @author cm.zdran@gmail.com
 */
public class SpiralMatrixII {
    public static int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];

        int maxX = matrix.length;
        int maxY = matrix[0].length;

        int step = maxX < maxY ? (maxX / 2 + maxX % 2) : (maxY / 2 + maxY % 2);
        int indexX = 0;
        int indexY = 0;
        int stepX;
        int stepY;
        boolean breakFlag;
        int number = 1;
        int endNum = n * n;
        while (number <= endNum) {
            for (int i = 0; i < step; i++) {
                breakFlag = true;
                stepX = 0;
                stepY = 1;
                //System.out.println(">>>>>>>>>>");
                while (indexY < maxY - i) {
                    //System.out.println(matrix[indexX][indexY]);
                    matrix[indexX][indexY] = number++;
                    indexY += stepY;
                    breakFlag = false;
                }
                if (breakFlag) {
                    break;
                }
                breakFlag = true;
                stepX = 1;
                stepY = 0;
                indexY -= 1;
                indexX += 1;
                //System.out.println("|||||||||||||||||||||");
                while (indexX < maxX - i) {
                    //System.out.println(matrix[indexX][indexY]);
                    matrix[indexX][indexY] = number++;
                    indexX += stepX;
                    breakFlag = false;
                }
                if (breakFlag) {
                    break;
                }
                breakFlag = true;
                stepY = 1;
                stepX = 0;
                indexX -= 1;
                indexY -= 1;
                //System.out.println("<<<<<<<<<<<<<<<<<<<<<<");
                while (indexY >= i) {
                    //System.out.println(matrix[indexX][indexY]);
                    matrix[indexX][indexY] = number++;
                    indexY -= stepY;
                    breakFlag = false;
                }
                if (breakFlag) {
                    break;
                }
                breakFlag = true;
                stepX = 1;
                stepY = 0;
                indexY += 1;
                indexX -= 1;
                //System.out.println("^^^^^^^^^^^^^^^^^^^^^^");
                while (indexX > i) {
                    //System.out.println(matrix[indexX][indexY]);
                    matrix[indexX][indexY] = number++;
                    indexX -= stepX;
                    breakFlag = false;
                }
                if (breakFlag) {
                    break;
                }
                indexX++;
                indexY++;
            }
        }
        return matrix;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(generateMatrix(3)));
    }
}
