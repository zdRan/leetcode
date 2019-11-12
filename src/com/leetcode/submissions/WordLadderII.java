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
                if(i == j){
                    map[i][j] = -1;
                    continue;
                }
                map[i][j] = getUnion(wordList.get(i), wordList.get(j));
            }
        }
        System.out.println(find(beginWord, endWord, wordList, map));
        return null;
    }

    private static int find(String beginWord, String endWord, List<String> wordList, byte[][] map) {
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(map.length - 1);

        queue.add(-1);
        int count = 1;
        boolean[] flag = new boolean[wordList.size()];
        Arrays.fill(flag, false);
        flag[map.length - 1] = true;
        while (!queue.isEmpty()){
            int index = queue.poll();
            if (index == -1 && queue.isEmpty()) {
                return 0;
            }
            if (index == -1) {
                //层分割符
                queue.add(-1);
                count++;
                continue;
            }
            flag[index] = true;

            for (int i = 0; i < map[index].length; i++) {
                if (map[index][i] == -1) {
                    continue;
                }
                if (map[index][i] == 1 &&!queue.contains(i) && !flag[i]){
                    queue.add(i);
                }
                if (map[index][i] == 1 && wordList.get(i).equals(endWord)) {
                    return count + 1;
                }
            }
        }
        return count;

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
        //findLadders("hit", "hog", new ArrayList<>(Arrays.asList("hot", "hog")));
        System.out.println("自动上单-1422-万达影城（金融街万达广场店）-可乐套餐".length());
    }
}
