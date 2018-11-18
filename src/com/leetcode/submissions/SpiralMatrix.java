package com.leetcode.submissions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Create by ranzd on 2018/11/16
 *
 * @author cm.zdran@gmail.com
 */
public class SpiralMatrix {
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ansList = new ArrayList<>();

        int maxX = matrix.length;
        if (maxX <= 0) {
            return ansList;
        }
        int maxY = matrix[0].length;

        int step = maxX < maxY ? (maxX / 2 + maxX % 2) : (maxY / 2 + maxY % 2);
        int indexX = 0;
        int indexY = 0;
        int stepX;
        int stepY;
        boolean breakFlag;
        for (int i = 0; i < step; i++) {
            breakFlag = true;
            stepX = 0;
            stepY = 1;
            //System.out.println(">>>>>>>>>>");
            while (indexY < maxY - i) {
                //System.out.println(matrix[indexX][indexY]);
                ansList.add(matrix[indexX][indexY]);
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
                ansList.add(matrix[indexX][indexY]);
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
                ansList.add(matrix[indexX][indexY]);
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
                ansList.add(matrix[indexX][indexY]);
                indexX -= stepX;
                breakFlag = false;
            }
            if (breakFlag) {
                break;
            }
            indexX++;
            indexY++;
        }
        return ansList;
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
                {15, 14, 12, 16},
                {5, 4, 2, 6}
        };
        int[][] arr3 = {
                {5, 1, 9, 11},
                {2, 4, 8, 10},
                {13, 3, 6, 7},
                {15, 14, 12, 16}
        };
        int[][] arr4 = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };
        int[][] arr5 = {
                {1},
                {2}
        };
        System.out.println(Arrays.toString(spiralOrder(arr4).toArray()));

    }
}
