package com.leetcode.submissions;

/**
 * 130. 被围绕的区域
 * Create by Ranzd on 2019-11-14 16:35
 *
 * @author ranzhendong@maoyan.com
 */
public class SurroundedRegions {
    public void solve(char[][] board) {
        if (board.length == 0 || board[0].length == 0) {
            return;
        }

        for (int i = 0; i < board[0].length; i++) {
            dfs(board, 0, i);
            dfs(board, board.length-1, i);
        }
        for (int i = 0; i < board.length; i++) {
            dfs(board, i, 0);
            dfs(board, i, board[i].length - 1);
        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = board[i][j] == '#' ? 'O' : 'X';
            }
        }
    }

    private void dfs(char[][] board, int x, int y) {
        if (x < 0 || y < 0) {
            return;
        }
        if (x >= board.length || y >= board[0].length) {
            return;
        }
        if ('X' == board[x][y]) {
            return;
        }
        if ('#' == board[x][y]) {
            return;
        }
        board[x][y] = '#';
        dfs(board, x + 1, y);
        dfs(board, x - 1, y);
        dfs(board, x, y + 1);
        dfs(board, x, y - 1);
    }
}
