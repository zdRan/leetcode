package com.leetcode.submissions;


/**
 * Create by ranzd on 2017/11/15
 *
 * @author ranzd@chinaunicom.cn
 */
public class LongestPalindromicSubstring {

    public String longestPalindrome(String s) {

        StringBuilder sb =  new StringBuilder();
        sb.append("#");
        for (int i = 0; i < s.length(); i++) {
            sb.append(s.charAt(i));
            sb.append("#");
        }

        int[] RL = new int[sb.length()];

        for (int pos = 1, rad = 0, k ; pos < sb.length() - 1; pos += k) {
            //向外扩展，计算 rad[pos]
            while (pos - rad >0 && pos + rad<sb.length()-1 && sb.charAt(pos - rad - 1) == sb.charAt(pos + rad + 1)) {
                rad++;
            }
            RL[pos] = rad;

            //利用回文串的镜像求 pos 右边的 RL[pos +k]的值
            for (k = 1; k < RL[pos] && RL[pos - k] != RL[pos] - k; k++) {
                RL[pos + k] = java.lang.Math.min(RL[pos - k], RL[pos] - k);
            }
            //这里计算的是 RL[pos + k] 的值，当进入下次循环是 pos = pos +k
            rad = java.lang.Math.max(RL[pos] - k,0);
        }
        int max = 0;
        int center = 0;
        for (int i = 0; i < RL.length; i++) {
            if (RL[i]>max){
                max = RL[i];
                center = i;
            }
        }
        s = sb.substring(center - max ,center + max + 1).replace("#","");
        return s;
    }
}
