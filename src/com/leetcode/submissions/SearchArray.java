package com.leetcode.submissions;

/**
 * Create by ranzd on 2018/1/26
 *
 * @author ranzd@chinaunicom.cn
 */
public class SearchArray {
    public static int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        int mid;
        //排除target值在边界导致死循环
        if (target == nums[0]){
            return 0;
        }
        if (target == nums[nums.length-1]){
            return nums.length-1;
        }
        while (l + 1 < r) {
            mid = (l+r)/2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] > nums[0]) {
                //中点在左半部分
                if (target < nums[0] || target > nums[mid]) {
                    l = mid;
                } else {
                    r = mid;
                }
            } else {
                //中点在右半部分
                if (target > nums[0] || target < nums[mid]) {
                    r = mid;
                } else {
                    l = mid;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int num = search(new int[]{1, 2, 3}, 0);
        System.out.println(num);
    }
}
