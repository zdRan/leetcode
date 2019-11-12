package com.leetcode.submissions;

import java.util.Arrays;

/**
 * 双指针法。0往左边排，2 往右边排，1 不做处理，当 0 和 2 有序时 1也有序
 * Create by ranzd on 2019/2/12
 *
 * @author cm.zdran@foxmail.com
 */
public class SortColors {
    public static void sortColors(int[] nums) {
        int left = 0, right = nums.length - 1;
        int index = 0;
        int temp;
        while (left <= right && index <= right) {
            switch (nums[index]) {
                case 0:
                    if (index <= left) {
                        index++;
                    } else {
                        temp = nums[left];
                        nums[left] = 0;
                        nums[index] = temp;
                        left++;
                    }
                break;
                case 1:
                    index++;
                    break;
                case 2:
                    temp = nums[right];
                    nums[right] = 2;
                    nums[index] = temp;
                    right--;
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2,0, 1};
        sortColors(arr);

        System.out.println(Arrays.toString(arr));
    }

}
