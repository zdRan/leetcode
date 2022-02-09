package com.leetcode.submissions;

import com.leetcode.extend.NestedInteger;

import java.util.*;

/**
 * 341. 扁平化嵌套列表迭代器
 * Create by Ranzd on 2022/2/8 下午8:46
 *
 * @author ranzhendong@maoyan.com
 */
public class NestedIterator implements Iterator<Integer> {
    private Stack<Iterator<NestedInteger>> stack = new Stack<>();
    public NestedIterator(List<NestedInteger> nestedList) {
        if (nestedList != null && nestedList.size() > 0) {
            stack.push(nestedList.iterator());
        }
    }

    @Override
    public Integer next() {
       return stack.peek().next().getInteger();
    }

    @Override
    public boolean hasNext() {
        while (!stack.empty()) {
            Iterator<NestedInteger> iterator = stack.peek();
            if (!iterator.hasNext()) {
                stack.pop();
                continue;
            }
            NestedInteger nestedInteger = iterator.next();
            if (nestedInteger.isInteger()) {
                List<NestedInteger> list = new ArrayList<>();
                list.add(nestedInteger);
                stack.push(list.iterator());
                return true;
            }
            stack.push(nestedInteger.getList().iterator());
        }
        return false;
    }
}
