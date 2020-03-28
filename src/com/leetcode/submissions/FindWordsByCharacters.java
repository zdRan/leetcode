package com.leetcode.submissions;

import java.util.HashMap;
import java.util.Map;

/**
 * 1160. 拼写单词
 * Create by Ranzd on 2020-03-17 14:21
 *
 * @author ranzhendong@maoyan.com
 */
public class FindWordsByCharacters {
    public static void main(String[] args) {
        String[] words = new String[]{"cat","bt","hat","tree"};
        String chars = "atach";
        System.out.println(countCharacters(words, chars));
    }
    public static int countCharacters(String[] words, String chars) {
        Map<Character, Integer> charsCount = new HashMap<>();
        for (char c : chars.toCharArray()) {
            if (charsCount.containsKey(c)) {
                charsCount.put(c, charsCount.get(c) + 1);
            } else {
                charsCount.put(c, 1);
            }
        }

        int result = 0;

        for (String word : words) {
            Map<Character, Integer> wordCount = new HashMap<>();
            boolean isSuccess = true;
            for (char c : word.toCharArray()) {
                if (!charsCount.containsKey(c)) {
                    isSuccess = false;
                    break;
                }
                int value;
                if (wordCount.containsKey(c)) {
                    value = wordCount.get(c) + 1;
                } else {
                    value = 1;
                }
                if (charsCount.get(c) < value) {
                    isSuccess = false;
                    break;
                }
                wordCount.put(c, value);
            }
            if(isSuccess){
                result += word.length();
            }

        }
        return result;
    }
}
