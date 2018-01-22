package com.leetcode.submissions;

import java.util.*;

/**
 * Create by ranzd on 2017/12/27
 *
 * @author ranzd@chinaunicom.cn
 */
public class ConcatenationWords {
    public static List<Integer> findSubstring(String s, String[] words) {
        Map<String,Integer> wordMap = new HashMap<>();
        for (String word:words) {
            if (wordMap.containsKey(word)){
                wordMap.put(word,wordMap.get(word)+1);
            }else {
                wordMap.put(word,1);
            }
        }

        Map<String,Integer> temp = new HashMap<>();
        List<Integer> ans = new ArrayList<>();
        int start = 0;
        int end = 0;
        int wordLength = words[0].length();
        int arrLength = words.length;
        int tempArrLength = 0;
        while (end+wordLength<s.length()+1){
            String tempWord = s.substring(end,end+wordLength);

            Integer value = wordMap.get(tempWord);
            Integer tempValue = temp.get(tempWord);

            if (value!=null&&(tempValue == null || tempValue<value)){
                if (tempValue == null){
                    tempValue = 0;
                }
                temp.put(tempWord,tempValue+1);
                end+=wordLength;
                tempArrLength++;
            }else {
                start++;
                end = start;
                tempArrLength = 0;
                temp.clear();
            }
            if (tempArrLength == arrLength){
                ans.add(start);
                start++;
                end = start;
                tempArrLength = 0;
                temp.clear();
            }
        }
        return ans;
    }
    public static void main(String[] args){
        List<Integer> ans = findSubstring("123345345123",new String[]{"123","345"});

        for (Integer i:ans) {
            System.out.println(i);
        }
    }
}
