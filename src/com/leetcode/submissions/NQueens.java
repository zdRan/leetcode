package com.leetcode.submissions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Create by ranzd on 2018/11/13
 *
 * @author cm.zdran@gmail.com
 */
public class NQueens {
    public static List<List<String>> solveNQueens(int n) {
        //行
        boolean[] xFlag = new boolean[n];
        //列
        boolean[] yFlag = new boolean[n];
        //主对角线，左上至右下
        boolean[] mdFlag = new boolean[2 * n - 1];
        //次对角线，右上至左下
        boolean[] sdFlag = new boolean[2 * n - 1];

        char[][] checkerboard = new char[n][n];
        List<List<String>> ansList = new ArrayList<>();

        Arrays.fill(xFlag, false);
        Arrays.fill(yFlag, false);
        Arrays.fill(mdFlag, false);
        Arrays.fill(sdFlag, false);

        //初始化棋盘
        for (char[] item : checkerboard) {
            Arrays.fill(item, '.');
        }

        setQueens(checkerboard, xFlag, yFlag, mdFlag, sdFlag, 0, n, ansList);
        return ansList;
    }

    private static void setQueens(char[][] checkerboard, boolean[] xFlag, boolean[] yFlag, boolean[] mdFlag, boolean[]
            sdFlag, int x, int n, List<List<String>> ansList) {

        if (x == n) {
            List<String> ansItem = new ArrayList<>();
            for (char[] item : checkerboard) {
                ansItem.add(new String(item));
            }
            ansList.add(ansItem);
            return;
        }
        for (int i = 0; i < n; i++) {
            if (xFlag[x]) {
                return;
            }
            if (yFlag[i]) {
                continue;
            }
            if (mdFlag[x + i]) {
                continue;
            }
            if (sdFlag[x + n - i - 1]) {
                continue;
            }
            checkerboard[x][i] = 'Q';
            xFlag[x] = true;
            yFlag[i] = true;
            mdFlag[x + i] = true;
            sdFlag[x + n - i - 1] = true;
            setQueens(checkerboard, xFlag, yFlag, mdFlag, sdFlag, x + 1, n, ansList);
            xFlag[x] = false;
            yFlag[i] = false;
            mdFlag[x + i] = false;
            sdFlag[x + n - i - 1] = false;
            checkerboard[x][i] = '.';
        }
    }

    public static void main(String[] args) {
        List<List<String>> ans = solveNQueens(4);
        for (List<String> item : ans) {
            for (String str : item) {
                System.out.println(str);
            }
            System.out.println("------------------------------");
        }
    }

}
