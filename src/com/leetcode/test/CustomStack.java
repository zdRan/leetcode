package com.leetcode.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Create by Ranzd on 2020-03-15 11:39
 *
 * @author cm.zdran@foxmail.com
 */
public class CustomStack {
    private List<Integer> stack;
    private int maxSize;
    public CustomStack(int maxSize) {
        stack = new ArrayList<>(maxSize);
        this.maxSize = maxSize;
    }

    public void push(int x) {
        if (maxSize > 0) {
            stack.add(x);
            maxSize--;
        }
    }

    public int pop() {
        int res = stack.remove(stack.size() - 1);
        if (res != -1) {
            maxSize++;
        }

        return maxSize;
    }

    public void increment(int k, int val) {
        for (int i = 0; i < k && i < stack.size(); i++) {
            stack.set(i, stack.get(i) + val);
        }
    }
}
