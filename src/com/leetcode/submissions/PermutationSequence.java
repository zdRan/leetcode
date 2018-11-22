package com.leetcode.submissions;

/**
 * Create by ranzd on 2018/11/21
 *
 * @author cm.zdran@gmail.com
 */
public class PermutationSequence {
    public static String getPermutation(int n, int k) {
        int[] fact = new int[10];
        int[] number = new int[10];
        fact[0] = 1;
        for (int i = 1; i < 10; i++) {
            fact[i] = fact[i - 1] * i;
            number[i] = i;
        }
        StringBuilder sb = new StringBuilder();
        dsf(n, k, fact, number, sb);
        return sb.toString();
    }

    private static void dsf(int n, int k, int[] fact, int[] number, StringBuilder ans) {
        if (n == 1) {
            for (int i = 0; i <= 9; i++) {
                if (number[i] != 0) {
                    ans.append(number[i]);
                    break;
                }
            }
            return;
        }
        int index = 1;
        while (k > fact[n - 1] * index) {
            index++;
        }
        k -= fact[n - 1] * (index - 1);
        int i = 1;
        for (; index > 0; i++) {
            if (number[i] == 0) {
                continue;
            }
            index--;
        }
        ans.append(number[i - 1]);
        number[i - 1] = 0;
        dsf(n - 1, k, fact, number, ans);
    }

    public static void main(String[] args) {
        System.out.println(getPermutation(4, 5));
    }

}
