package com.leetcode.submissions;

import java.util.*;

/**
 * Create by ranzd on 2018/11/13
 *
 * @author cm.zdran@gmail.com
 */
public class GroupAnagrams {
    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> ans = new HashMap<>(strs.length);

        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String orderStr = String.valueOf(chars);
            if (!ans.containsKey(orderStr)) {
                ans.put(orderStr, new ArrayList<>());
            }
            ans.get(orderStr).add(str);
        }
        return new ArrayList<>(ans.values());
    }

    public static void main(String[] args) {
        System.out.println(groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));
    }
}
