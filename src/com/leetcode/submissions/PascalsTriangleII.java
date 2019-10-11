package com.leetcode.submissions;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Create by ranzhendong on 2019-10-11 15:54
 *
 * @author ranzhendong@maoyan.com
 */
public class PascalsTriangleII {
    /**
     * 杨辉三角，是二项式系数在三角形中的一种几何排列 C(k,n), n 中选 k 个
     * C(0,0)
     * C(0,1),C(1,1)
     * C(0,2),C(1,2),C(2,2)
     *
     * @param rowIndex
     * @return
     */
    public static List<Integer> getRow(int rowIndex) {
        List<Integer> result = new ArrayList<>(rowIndex);
        Long pre = Long.valueOf(1L);
        for (int i = 1; i <= rowIndex; i++) {
            result.add(pre.intValue());
            pre = pre * (rowIndex - i + 1) / i;;
        }
        result.add(1);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(getRow(6));
    }
}
