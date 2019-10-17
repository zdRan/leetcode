package com.leetcode.submissions;

import java.util.*;

/**
 * Create by ranzhendong on 2019-10-15 17:23
 *
 * @author ranzhendong@maoyan.com
 */
public class WordLadderII {
    public static List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
        wordList.add(beginWord);
        byte[][] map = new byte[wordList.size()][wordList.size()];

        for (int i = 0; i < wordList.size(); i++) {
            for (int j = 0; j < wordList.size(); j++) {
                map[i][j] = getUnion(wordList.get(i), wordList.get(j));
            }
        }
        return find(beginWord, endWord, wordList, map);

    }

    private static List<List<String>> find(String beginWord, String endWord, List<String> wordList, byte[][] map) {
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(map.length - 1);
        List<String> item = new LinkedList<>();
        List<List<String>> result = new LinkedList<>();
        while (!queue.isEmpty()){
            int index = queue.poll();
            item.add(wordList.get(index));

            if (wordList.get(index).equals(endWord)) {
                if (result.size() == 0) {
                    result.add(new ArrayList<>(item));
                }else {
                    if (result.get(0).size() > item.size()) {
                        result.clear();
                        result.add(new ArrayList<>(item));
                    }
                }
                item.remove(item.size() - 1);
                continue;
            }
            for (int i = 0; i < map[index].length; i++) {
                if (map[index][i] == 1 &&!queue.contains(i)){
                    queue.add(i);
                }
            }
        }

    }


    private static byte getUnion(String src, String tar) {

        int max = 0;
        char[] srcArr = src.toCharArray();
        char[] tarArr = tar.toCharArray();
        int index = 0;

        while (max < 2 && index < srcArr.length) {
            if (srcArr[index] != tarArr[index]) {
                max++;
            }
            index++;
        }

        return max >= 2 ? Byte.parseByte("0") : Byte.parseByte("1");
    }

    public static void main(String[] args) {
        findLadders("hit", "cog", Arrays.asList("hot", "dot", "dog", "lot", "log", "cog"));
    }
}
