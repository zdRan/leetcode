package com.aliyun.submissions;

/**
 * 37.最强的团队
 * Create by Ranzd on 2020-07-16 11:29
 *
 * @author ranzhendong@maoyan.com
 */
public class solution37 {
    public static int solution(int n, int[] a) {
        int max = 0;
        int count = 0;
        int ans = 0;
        for (int num : a) {
            max = Math.max(num, max);
        }
        for (int num : a) {
            if (num == max) {
                count++;
            } else {
                ans = Math.max(count, ans);
                count = 0;
            }
        }
        return Math.max(count, ans);
    }

    public static void main(String[] args) {
        System.out.println(solution(6, new int[]{2, 2, 2, 2, 1, 5}));
    }
}
