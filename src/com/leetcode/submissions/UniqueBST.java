package com.leetcode.submissions;

/**
 * 96. 不同的二叉搜索树
 * Create by ranzd on 2019/8/27
 *
 * @author cm.zdran@gmail.com
 */
public class UniqueBST {
    /**
     * 动态规划。我们可以定义两个函数：
     *
     * G(n): 长度为n的序列的不同二叉搜索树个数。
     *
     * F(i, n): 以i为根的不同二叉搜索树个数( 1 <= i <= n)。
     *
     * 以 [0,M] 为区间时，G(M) 的结果是以每个 i 为根节点能够组成的二叉树的和，
     * 所以可以得出：
     *
     * G(M) = sum（ F(i,M) ） i<=1 <= M
     *
     * 在区间 [0,M] 中 以 k 为根节点时，能够组成的所有二叉树为，
     * 左子树的结果集与右子树的结果集的组合数，或者是笛卡尔积。
     * 所以可以得出：
     *
     * F(k,M) = sum ( G(k-1) * G(M-k) )
     *
     *
     * @param n
     * @return
     */
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
            for (int j = 1; j < i; j++) {
                G[i] += G[j - 1] * G[i - j];
            }
        }
        return G[n];

    }

    public int numTrees2(int n) {
        long C = 1;
        for (int i = 0; i < n; ++i) {
            C = C * 2 * (2 * i + 1) / (i + 2);
        }
        return (int) C;
    }
}
