package com.leetcode.extend;

import java.util.ArrayList;
import java.util.List;

/**
 * Create by Ranzd on 2022/2/8 下午8:42
 *
 * @author ranzhendong@maoyan.com
 */
public class NestedInteger {
    private Integer value;
    private List<NestedInteger> nestedIntegerList = new ArrayList<>();

    private boolean isInteger;

    public boolean isInteger() {
        return isInteger;
    }

    public Integer getInteger() {
        return value;
    }

    public List<NestedInteger> getList() {
        return nestedIntegerList;
    }
}
