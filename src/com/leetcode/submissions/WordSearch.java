package com.leetcode.submissions;

/**
 * Create by ranzd on 2019/4/9
 *
 * @author cm.zdran@gmail.com
 */
public class WordSearch {
    public static void main(String[] args) {
        char[][] board = new char[][]{
                {'a'},
        };

        System.out.println(exist(board, "a"));
    }

    private static boolean exist(char[][] board, String word) {
        boolean result;

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == word.charAt(0)) {
                    result = dsf(board, word, i, j, 0);
                    if (result) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private static boolean dsf(char[][] board, String word, int i, int j, int index) {
        if (index == word.length()) {
            return true;
        }
        if (i < 0 || i >= board.length || j < 0 || j >= board[i].length) {
            return false;
        }
        if (board[i][j] != word.charAt(index)){
            return false;
        }

        boolean result;
        board[i][j] += 60;
        result = dsf(board, word, i - 1, j, index + 1)
                || dsf(board, word, i + 1, j, index + 1)
                || dsf(board, word, i, j - 1, index + 1)
                || dsf(board, word, i, j + 1, index + 1);
        board[i][j] -= 60;
        return result;
    }
}
