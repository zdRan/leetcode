package com.leetcode.submissions;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * 409. 最长回文串
 * Create by Ranzd on 2020-03-19 11:12
 *
 * @author ranzhendong@maoyan.com
 */
public class LongestPalindrome {
    public int longestPalindrome(String s) {
        Map<Character,Integer> charCount = new HashMap<>();

        for(char c:s.toCharArray()){
            if(charCount.containsKey(c)){
                charCount.put(c,charCount.get(c)+1);
            }else{
                charCount.put(c,1);
            }
        }

        int result = 0;
        Iterator<Map.Entry<Character, Integer>> iterator = charCount.entrySet().iterator();
        while (iterator.hasNext()) {
            int value = iterator.next().getValue();
            if(value==1){
                continue;
            }
            if(value %2 ==0){
                result += value;
                iterator.remove();
            }else{
                result += (value -1);
            }
        }
        if(charCount.size()>0){
            result +=1;
        }
        return result;
    }

}
