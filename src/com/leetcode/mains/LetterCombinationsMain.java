package com.leetcode.mains;

import com.leetcode.submissions.LetterCombinations;
import com.leetcode.utils.Show;

import java.util.List;

/**
 * Create by ranzd on 2017/12/4
 *
 * @author cm.zdran@gmail.com
 */
public class LetterCombinationsMain {
    public static void main(String[] args) {
        LetterCombinations letterCombinations = new LetterCombinations();
        List<String> result = letterCombinations.letterCombinations("23");

        for (int i = 0; i < result.size(); i++) {
            Show.showString(i + ":" + result.get(i));
        }
    }
}
