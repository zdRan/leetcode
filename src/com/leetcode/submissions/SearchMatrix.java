package com.leetcode.submissions;

/**
 * Create by ranzd on 2019/1/17
 *
 * @author cm.zdran@foxmail.com
 */
public class SearchMatrix {

    public static boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0) {
            return false;
        }
        if (matrix[0].length == 0) {
            return false;
        }
        if (target < matrix[0][0] || target > matrix[matrix.length - 1][matrix[matrix.length - 1].length - 1]) {
            return false;
        }
        int left = 0, right = matrix.length - 1;
        int mid;
        while (left <= right) {
            mid = (right - left) / 2 + left;
            if (matrix[mid][0] == target) {
                return true;
            }
            if (matrix[mid][0] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        left = 0;

        int lineRight = matrix[right].length - 1;

        while (left <= lineRight) {
            mid = (lineRight - left) / 2 + left;
            if (matrix[right][mid] == target) {
                return true;
            }
            if (matrix[right][mid] < target) {
                left = mid + 1;
            } else {
                lineRight = mid - 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] arr = new int[][]{
                {2, 3, 5, 7},
                {10, 11, 16, 20},
                {33, 34, 35, 39},
                {43, 45, 47, 49},
                {53, 54, 55, 59},
                {63, 64, 66, 70}};

        int[][] arr2 = new int[][]{{}};
        System.out.println(searchMatrix(arr2, 1));

    }
}








