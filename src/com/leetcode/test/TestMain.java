package com.leetcode.test;

import java.util.Arrays;

/**
 * 用于测试一些API
 * <p>
 * Create by ranzd on 2017/10/23
 *
 * @author cm.zdran@gmail.com
 */
public class TestMain {
    private static int count = 0;

    public static void main(String[] args) {
//        char[][] bord = new char[][]{
////                new char[]{'.', '.', '9', '7', '4', '8', '.', '.', '.'},
////                new char[]{'7', '.', '.', '.', '.', '.', '.', '.', '.'},
////                new char[]{'.', '2', '.', '1', '.', '9', '.', '.', '.'},
////                new char[]{'.', '.', '7', '.', '.', '.', '2', '4', '.'},
////                new char[]{'.', '6', '4', '.', '1', '.', '5', '9', '.'},
////                new char[]{'.', '9', '8', '.', '.', '.', '3', '.', '.'},
////                new char[]{'.', '.', '.', '8', '.', '3', '.', '2', '.'},
////                new char[]{'.', '.', '.', '.', '.', '.', '.', '.', '6'},
////                new char[]{'.', '.', '.', '2', '7', '5', '9', '.', '.'}
////        };
////        long time = System.currentTimeMillis();
////        solveSudoku(bord);
////        time = System.currentTimeMillis() - time;
////        System.out.println(time);

//        System.out.println(maxNumberOfBalloons("balloon"));
        System.out.println(reverseParentheses("(abcd)"));
        System.out.println(reverseParentheses("(u(love)i)"));
    }

    public static void solveSudoku(char[][] board) {
        if (board == null || board.length == 0)
            return;
        solve(board);
    }

    public static boolean solve(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == '.') {
                    for (char c = '1'; c <= '9'; c++) {//trial. Try 1 through 9
                        if (isValid(board, i, j, c)) {
                            board[i][j] = c; //Put c for this cell

                            if (solve(board))
                                return true; //If it's the solution return true
                            else
                                board[i][j] = '.'; //Otherwise go back
                        }
                    }

                    return false;
                }
            }
        }
        return true;
    }

    private static boolean isValid(char[][] board, int row, int col, char c) {
        for (int i = 0; i < 9; i++) {
            if (board[i][col] != '.' && board[i][col] == c) return false; //check row
            if (board[row][i] != '.' && board[row][i] == c) return false; //check column
            if (board[3 * (row / 3) + i / 3][3 * (col / 3) + i % 3] != '.' &&
                    board[3 * (row / 3) + i / 3][3 * (col / 3) + i % 3] == c) return false; //check 3*3 block
        }
        return true;
    }
    public static int maxNumberOfBalloons(String text) {
        int[] count = new int[5];
        Arrays.fill(count, 0);

        for (char c : text.toCharArray()) {
            if (c == 'b') {
                count[0] += 1;
            }
            if (c == 'a'){
                count[1] += 1;
            }
            if (c == 'l') {
                count[2] += 1;
            }
            if (c == 'n') {
                count[3] += 1;
            }
            if (c == 'o') {
                count[4] += 1;
            }
        }
        int result = count[0];
        for (int i = 1; i < 5; i++) {
            if (i % 2 == 0) {
                result = Math.min(result, count[i] / 2);
            }else {
                result = Math.min(result, count[i]);
            }
        }
        return result;
    }

    public static String reverseParentheses(String s) {
        int ls = s.indexOf('(');
        int re = s.lastIndexOf(')');
        return s.substring(0, ls) + dfs(ls, re, s.substring(ls, re)) + s.substring(re);
    }

    private static String dfs(int ls,int re,String s) {
        int le = s.indexOf('(');
        int rs = s.lastIndexOf(')');

        if (le == -1 || rs == -1) {
            count--;
            if (count % 2 == 0) {
                return s;
            } else {
                return reverse(s);
            }
        }
        count++;
        if (count % 2 == 0) {
            return s.substring(ls, le) + dfs(le, rs, s.substring(le, rs)) + s.substring(rs, re);
        }else {
            return reverse(s.substring(rs, re)) + dfs(le, rs, s.substring(le, rs)) + reverse(s.substring(ls, le));
        }
    }

    private static String reverse(String s){
        StringBuilder sb = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}
