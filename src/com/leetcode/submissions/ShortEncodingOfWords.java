package com.leetcode.submissions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeSet;

/**
 * 820. 单词的压缩编码
 * <p>
 * Create by Ranzd on 2020-03-28 21:45
 *
 * @author ranzhendong@maoyan.com
 */
public class ShortEncodingOfWords {
    public static int minimumLengthEncoding(String[] words) {
        Arrays.sort(words, (o1, o2) -> o2.length() - o1.length());
        int ans = 0;
        int index = 0;
        StringBuilder sb = new StringBuilder();
        for (String str : words) {
            boolean flag =false;
            for (int i = 0; i < index; i++) {
                if (words[i].endsWith(str)) {
                    flag = true;
                    break;
                }
            }
            if (!flag){
                sb.append(str).append("#");
                words[index] = str;
                index++;
                ans = ans + str.length() + 1;
            }
        }
        System.out.println(sb.toString());
        return ans;
    }

    public static void main(String[] args) {
        minimumLengthEncoding(new String[]{"time", "me", "b", "cccc"});
    }
}
