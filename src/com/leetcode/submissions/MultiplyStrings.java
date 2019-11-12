package com.leetcode.submissions;

import com.leetcode.utils.Show;

/**
 * 43. Multiply Strings
 * Create by zdRan on 2018/5/11
 *
 * @author cm.zdran@foxmail.com
 */
public class MultiplyStrings {
    public static String multiply(String num1, String num2) {
        int[] ans = new int[num1.length()+num2.length()];
        for (int i = num1.length()-1; i >=0; i--) {
            for (int j = num2.length()-1; j >=0; j--) {
                int sum = (num1.charAt(i)-'0' ) *(num2.charAt(j)-'0')+ans[i+j+1];
                ans[i+j] += sum / 10;
                ans[i+j+1] = sum % 10;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <ans.length; i++) {
            if (!(sb.length()==0 && ans[i]==0)){
                sb.append(ans[i]);
            }
        }
        return sb.length() == 0?"0":sb.toString();
    }

    public static void main(String[] args) {
        Show.showString(multiply("123","456"));
    }
}
