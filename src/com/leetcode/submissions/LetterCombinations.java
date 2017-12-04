package com.leetcode.submissions;

import java.util.ArrayList;
import java.util.List;

/**
 * Create by ranzd on 2017/12/4
 *
 * @author ranzd@chinaunicom.cn
 */
public class LetterCombinations {
    private List<String> result = new ArrayList<>();
    char[][] phoneNumber = new char[][]{new char[]{'0'},
                                        new char[]{'1'},
                                        new char[]{'a','b','c'},
                                        new char[]{'d','e','f'},
                                        new char[]{'g','h','i'},
                                        new char[]{'j','k','l'},
                                        new char[]{'m','n','o'},
                                        new char[]{'p','q','r','s'},
                                        new char[]{'t','u','v'},
                                        new char[]{'w','x','y','z'},

    };
    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.length() == 0){
            return result;
        }
        char[] chars = new char[digits.length()];
        recursive(digits,chars,0);
        return result;
    }
    private void recursive(String digits,char[] resultSuper,int index){
        if (digits.length() == index){
            result.add(new String(resultSuper));
            return;
        }
        byte phone = Byte.parseByte(digits.charAt(index)+"");
        for (int i = 0; i < phoneNumber[phone].length; i++) {
            resultSuper[index] = phoneNumber[phone][i];
            recursive(digits,resultSuper,index+1);
        }
    }
}
