package com.leetcode.submissions;

import java.util.*;

/**
 * Create by ranzd on 2017/12/27
 *
 * @author ranzd@chinaunicom.cn
 */
public class ConcatenationWords {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> result = new ArrayList<>();
        byte[] flag = new byte[s.length()];
        int wordLength = words[0].length();

        List<String> wordList = Arrays.asList(words);
        for (int i = 0; i <= s.length()-wordLength; i++) {
            if (wordList.contains(s.substring(i,i+wordLength))){
                flag[i] = 1;
            }
        }

        for (int i = 0; i < flag.length; i++) {
            if (flag[i] == 0){
                continue;
            }
            int k = i;
            while (wordList.size()!=0 && k<s.length()-wordLength){
                if (wordList.contains(s.substring(k,k+wordLength))){
                    wordList.remove(s.substring(k,k+wordLength));
                    k += wordLength;
                }else {
                    break;
                }
            }
            if (wordList.size() == 0){
                result.add(i);
            }
            wordList = Arrays.asList(words);
        }
        return result;
    }
}
