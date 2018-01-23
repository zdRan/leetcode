package com.leetcode.mains;

import com.leetcode.utils.Show;

import java.util.List;

/**
 * Create by ranzd on 2017/12/28
 *
 * @author ranzd@chinaunicom.cn
 */
public class ConcatenationWordsMain {
    public static void main(String[] args){
        ConcatenationWords concatenationWords = new ConcatenationWords();
        List<Integer> result = concatenationWords.findSubstring("barfoothefoobarman",new String[]{"foo", "bar"});
        Show.showString("1:"+result.toString());
        result = concatenationWords.findSubstring("ofoo",new String[]{"foo"});
        Show.showString("2:"+result.toString());
        result = concatenationWords.findSubstring("wordgoodgoodgoodbestword",new String[]{"word","good","best",
                "good"});
        Show.showString("2:"+result.toString());

    }
}
