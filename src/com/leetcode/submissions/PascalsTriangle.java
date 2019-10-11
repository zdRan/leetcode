package com.leetcode.submissions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Create by ranzhendong on 2019-10-10 16:57
 *
 * @author ranzhendong@maoyan.com
 */
public class PascalsTriangle {
    public static List<List<Integer>> generate(int numRows) {
        if (numRows == 0) {
            return new ArrayList<>();
        }
        if (numRows == 1) {
            return Arrays.asList(Arrays.asList(1));
        }
        if (numRows == 2) {
            return Arrays.asList(Arrays.asList(1), Arrays.asList(1, 1));
        }
        List<List<Integer>> result = new ArrayList<>(numRows);
        result.add(Arrays.asList(1));
        result.add(Arrays.asList(1, 1));
        for (int i = 2; i < numRows; i++) {
            List<Integer> row = new LinkedList<>();
            row.add(1);
            for (int j = 1; j < i ; j++) {
                row.add(result.get(i - 1).get(j) + result.get(i - 1).get(j - 1));
            }
            row.add(1);
            result.add(row);
        }
        return result;
    }

    public static void main(String[] args) {
        generate(5);
    }
}
