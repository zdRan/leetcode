package com.leetcode.submissions;

/**
 * Create by ranzd on 2018/1/31
 *
 * @author ranzd@chinaunicom.cn
 */
public class ValidSudoku {
    public static boolean isValidSudoku(char[][] board) {
        int[][] row = new int[9][9];
        int[][] col = new int[9][9];
        int[][] square= new int[9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    int num = board[i][j] - '0' - 1;
                    int sIndex = i / 3 * 3 + j / 3;
                    if (row[i][num] !=0 || col[j][num]!=0 || square[sIndex][num]!=0) {
                        return false;
                    }
                    row[i][num] = col[j][num] = square[sIndex][num] = 1;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {

    }
}
