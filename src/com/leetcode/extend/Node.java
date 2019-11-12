package com.leetcode.extend;

/**
 * Create by ranzhendong on 2019-10-10 11:13
 *
 * @author cm.zdran@foxmail.com
 */
public class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
}
