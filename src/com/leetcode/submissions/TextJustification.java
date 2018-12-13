package com.leetcode.submissions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Create by ranzd on 2018/12/13
 *
 * @author cm.zdran@gmail.com
 */
public class TextJustification {
    public static List<String> fullJustify(String[] words, int maxWidth) {
        int wordIndex = 0;
        List<String> result = new ArrayList<>();
        while (wordIndex < words.length) {

            StringBuilder sb = new StringBuilder();
            int tempLen = 0;
            int lineWord = 0;
            while (wordIndex<words.length && tempLen + words[wordIndex].length() <= maxWidth) {
                sb.append(words[wordIndex]);
                tempLen += words[wordIndex].length();
                wordIndex++;
                lineWord++;
                sb.append(" ");
                tempLen++;
            }
            sb.deleteCharAt(sb.length() - 1);
            tempLen--;
            int spaceNumber = maxWidth - tempLen;
            if (wordIndex == words.length) {
                while (spaceNumber != 0) {
                    sb.insert(sb.length(), " ");
                    spaceNumber--;
                }
                result.add(sb.toString());
                return result;
            }
            if (lineWord == 1) {
                while (spaceNumber != 0) {
                    sb.insert(sb.length(), " ");
                    spaceNumber--;
                }
                result.add(sb.toString());
                continue;
            }
            StringBuilder space = new StringBuilder();
            for (int i = 0; i < spaceNumber/(lineWord-1); i++) {
                space.append(" ");
            }
            int mod = spaceNumber % (lineWord-1);
            int p = 0;
            while (spaceNumber != 0) {
                p = sb.indexOf(" ", p);
                sb.insert(p, space.toString());
                p += space.length();
                if (mod != 0) {
                    sb.insert(p, " ");
                    p++;
                    mod--;
                    spaceNumber--;
                }
                p++;
                spaceNumber -= space.length();
            }
            result.add(sb.toString());
            System.out.println(sb.toString());
            sb.setLength(0);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(fullJustify(new String[]{"What","must","be","acknowledgment","shall","be"}, 16));
        System.out.println("---------------------------------------------------------");
        System.out.println(fullJustify(new String[]{"Science","is","what","we","understand","well","enough","to","explain","to","a","computer.","Art","is","everything","else","we","do"}, 20));
    }

}
