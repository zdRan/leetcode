package com.leetcode.submissions;

/**
 * Create by ranzd on 2018/1/31
 *
 * @author cm.zdran@gmail.com
 */
public class SudokuSolver {

    public static boolean filling(char[][] board, int[][] row, int[][] col, int[][] square) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.') {
                    for (int k = 0; k < 9; k++) {
                        int sIndex = i / 3 * 3 + j / 3;
                        if (row[i][k] == 0 && col[j][k] == 0 && square[sIndex][k] == 0) {
                            board[i][j] = ((k + 1) + "").charAt(0);
                            row[i][k] = col[j][k] = square[sIndex][k] = 1;
                            if (filling(board, row, col, square)) {
                                return true;
                            } else {
                                board[i][j] = '.';
                                row[i][k] = col[j][k] = square[sIndex][k] = 0;
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    public static void solveSudoku(char[][] board) {
        int[][] row = new int[9][9];
        int[][] col = new int[9][9];
        int[][] square = new int[9][9];
        //init array
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    int num = board[i][j] - '0' - 1;
                    //根据 i、j 计算属于第几个九宫格
                    int sIndex = i / 3 * 3 + j / 3;
                    row[i][num] = col[j][num] = square[sIndex][num] = 1;
                }
            }
        }
        filling(board, row, col, square);
    }

    public static void main(String[] args) {
        char[][] board = new char[][]{
                new char[]{'.', '.', '9', '7', '4', '8', '.', '.', '.'},
                new char[]{'7', '.', '.', '.', '.', '.', '.', '.', '.'},
                new char[]{'.', '2', '.', '1', '.', '9', '.', '.', '.'},
                new char[]{'.', '.', '7', '.', '.', '.', '2', '4', '.'},
                new char[]{'.', '6', '4', '.', '1', '.', '5', '9', '.'},
                new char[]{'.', '9', '8', '.', '.', '.', '3', '.', '.'},
                new char[]{'.', '.', '.', '8', '.', '3', '.', '2', '.'},
                new char[]{'.', '.', '.', '.', '.', '.', '.', '.', '6'},
                new char[]{'.', '.', '.', '2', '7', '5', '9', '.', '.'}
        };
        solveSudoku(board);
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.printf(board[i][j] + ",");
            }
            System.out.println();
        }
    }
}
