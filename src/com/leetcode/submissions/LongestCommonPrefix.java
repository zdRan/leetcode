package com.leetcode.submissions;

/**
 * Create by ranzd on 2017/11/27
 *
 * @author ranzd@chinaunicom.cn
 */
public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0){
            return "";
        }
        String maxPrefix = strs[0];
        for (String str:strs) {
            if ("".equals(str)){
                return "";
            }
            if (!str.startsWith(maxPrefix)){
                int index = 0;
                while(str.charAt(index) == maxPrefix.charAt(index)){
                    index++;
                    if (index == str.length() || index == maxPrefix.length()){
                        break;
                    }
                }
                maxPrefix = str.substring(0,index);
            }
        }
        return maxPrefix;
    }
}
