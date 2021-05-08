package com.aliyun.submissions;

/**
 * 39.复杂的字符串
 * Create by Ranzd on 2020-07-16 14:35
 *
 * @author cm.zdran@foxmail.com
 */
public class solution39 {
    public static int solution(String s1, String s2) {
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        int i = c1.length;
        int j = c2.length;
        for (; i > 0 && j > 0; i--, j--) {
            if (c1[i - 1] != c2[j - 1]) {
                break;
            }
        }
        return i + j;
    }

    public static void main(String[] args) {
        System.out.println(solution("dabc", "cdabc"));
    }
}
