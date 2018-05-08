package com.leetcode.submissions;

/**
 * 第 42 题 收集雨水
 * Create by zdRan on 2018/5/8
 *
 * @author cm.zdran@gmail.com
 */
public class TrappingRainWater {

    public int trap(int[] height) {
        if (height == null ||height.length<2){
            return 0;
        }
        int ans = 0;
        int[] leftMax = new int[height.length];
        int[] rightMax = new int[height.length];
        leftMax[0] = height[0];
        for (int i = 1; i < height.length; i++) {
            leftMax[i] = Math.max(height[i],leftMax[i-1]);
        }
        rightMax[height.length-1] = height[height.length-1];
        for (int i = height.length-2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i],rightMax[i+1]);
        }
        for (int i = 1; i < height.length-1; i++) {

            ans += Math.min(leftMax[i],rightMax[i])-height[i];
        }
        return ans;
    }
}
