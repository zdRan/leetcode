package com.leetcode.submissions;

import java.util.HashMap;
import java.util.Map;

/**
 * Create by ranzd on 2019/2/27
 *
 * @author cm.zdran@gmail.com
 */
public class MinWindow {
    public static String minWindow(String s, String t) {

        Map<Character, Integer> tMap = new HashMap<>();
        if (s.length() == 0 || s.length() < t.length()) {
            return "";
        }
        for (Character c : t.toCharArray()) {
            if (tMap.containsKey(c)) {
                tMap.put(c, tMap.get(c) + 1);
            } else {
                tMap.put(c, 1);
            }
            // s 中不包含 t 中的某个字符
            if (s.indexOf(c) == -1) {
                return "";
            }
        }

        int end = 0;
        int start = 0;
        int count = tMap.size();
        String ans = s+" ";

        for (char c : s.toCharArray()) {
            end++;
            if (tMap.containsKey(c)) {
                tMap.put(c, tMap.get(c) - 1);
                if (tMap.get(c) == 0) {
                    count--;
                }
            }
            if (count != 0) {
                continue;
            }
            //找到一个结果,窗口左侧收缩
            while (true) {
                if (tMap.containsKey(s.charAt(start))) {
                    if (tMap.get(s.charAt(start)) == 0) {
                        System.out.println("ans-t:"+ans);
                        ans = s.substring(start, end).length() < ans.length() ? s.substring(start, end) : ans;
                        tMap.put(s.charAt(start), tMap.get(s.charAt(start)) + 1);
                        start++;
                        count++;
                        break;
                    }
                    tMap.put(s.charAt(start), tMap.get(s.charAt(start)) + 1);
                }
                start++;
            }
        }
        return ans.length() <= s.length() ? ans : "";
    }

    public static void main(String[] args) {
        System.out.println("ans:"+minWindow("a", "a"));
    }
}