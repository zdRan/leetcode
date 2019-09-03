package com.leetcode.submissions;

import com.leetcode.extend.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Create by ranzd on 2019-09-02 11:11
 *
 * @author ranzhendong@maoyan.com
 */
public class ValidateBST {

    public static boolean isValidBST(TreeNode root) {
        List<Long> minVal = new ArrayList<>();

        minVal.add(Long.MIN_VALUE);
        return valid(root, minVal);
    }

    /**
     * 中序遍历二叉树。
     * 通过一个变量保存上一个元素的值，如果当前元素的值小于上一个元素，说明不是BST。
     * 注意：由于使用的事递归，所以变量的值是引用传递。
     *
     * @param root
     * @param minVal
     * @return
     */
    private static boolean valid(TreeNode root, List<Long> minVal) {

        if (root == null) {
            return true;
        }
        boolean result = valid(root.left, minVal);

        if (!result) {
            return false;
        }
        if (root.val <= minVal.get(0)) {
            return false;
        } else {
            minVal.set(0, Long.valueOf(String.valueOf(root.val)));
        }
        result = valid(root.right, minVal);
        return result;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(1);
        System.out.println(isValidBST(root));
    }
}