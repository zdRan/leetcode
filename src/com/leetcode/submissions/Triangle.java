package com.leetcode.submissions;

import java.util.List;

/**
 * Create by ranzhendong on 2019-10-11 17:28
 *
 * @author cm.zdran@foxmail.com
 */
public class Triangle {

    public static int minimumTotal(List<List<Integer>> triangle) {
        Integer[] result = triangle.get(triangle.size() - 1).toArray(new Integer[]{});
        for (int i = triangle.size() - 2; i >= 0; i--) {
            for (int j = 0; j < triangle.get(i).size(); j++) {
                result[j] = Math.min(result[j], result[j + 1]) + triangle.get(i).get(j);

            }
        }
        return result[0];
    }

    public static void main(String[] args) {

    }
}
