package com.leetcode.submissions;

/**
 * 81. 搜索旋转排序数组 II
 * Create by ranzd on 2019/4/10
 *
 * @author cm.zdran@gmail.com
 */
public class SearchArrayII {
    /**
     * 如果比 nums[0] 小，就从后往前搜索，否则就从前往后搜索，二分一次
     * @param nums
     * @param target
     * @return
     */
    public static boolean search(int[] nums, int target) {
        if (nums.length == 0) {
            return false;
        }
        if(target == nums[0]){
            return true;
        }
        if (target < nums[0]) {
            for (int i = nums.length - 1; i > 0; i--) {
                if (target == nums[i]) {
                    return true;
                }
                if (nums[i - 1] > nums[i]) {
                    return false;
                }
            }
        }else {
            for (int i = 1; i <nums.length ; i++) {
                if (target == nums[i]) {
                    return true;
                }
                if (nums[i] < nums[i - 1]) {
                    return false;
                }

            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(search(new int[]{1,3,5}, 5));
    }
}
