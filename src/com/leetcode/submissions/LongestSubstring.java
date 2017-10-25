package com.leetcode.submissions;

import java.util.HashSet;
import java.util.Set;

/**
 * Create by ranzd on 2017/10/23
 *
 * @author ranzd@chinaunicom.cn
 */
public class LongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;

        if (s == null || s.length() == 0){
            return 0;
        }
        if (s.length() == 1){
            return 1;
        }
        int start = 0;
        int end  = 1;
        while (end != s.length()){
            int index = s.lastIndexOf(s.charAt(end),end-1);
            if (index != -1 && start <= index){
                start = index+1;
            }
            max = (end - start + 1) >max ? (end - start +1 ):max;
            end++;
        }
        return max;
    }
    public int other(String s) {
        int i = 0, j = 0, max = 0;
        Set<Character> set = new HashSet<>();

        while (j < s.length()) {
            if (!set.contains(s.charAt(j))) {
                set.add(s.charAt(j++));
                max = Math.max(max, set.size());
            } else {
                set.remove(s.charAt(i++));
            }
        }
        return max;
    }
}
