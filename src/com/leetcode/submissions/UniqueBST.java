package com.leetcode.submissions;

/**
 * Create by ranzd on 2019/8/27
 *
 * @author cm.zdran@gmail.com
 */
public class UniqueBST {
    public int numTrees(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        int[] G = new int[n + 1];

        G[0] = 1;
        G[1] = 1;

        for (int i = 2; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                G[i] += G[j - 1] * G[i - j];
            }
        }
        return G[n];

    }

    public int numTrees2(int n){
        long C = 1;
        for (int i = 0; i < n; ++i) {
            C = C * 2 * (2 * i + 1) / (i + 2);
        }
        return (int) C;
    }
}
