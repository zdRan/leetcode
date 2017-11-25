package com.leetcode.submissions;

/**
 * Create by ranzd on 17-11-25
 *
 * @author ranzd@chinaunicom.cn
 */
public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int leftIndex = 0;
        int rightIndex = height.length-1;
        int maxArea = 0;

        while (leftIndex!=rightIndex){
            maxArea = Math.max((rightIndex-leftIndex)*Math.min(height[leftIndex],height[rightIndex]),maxArea);
            if (height[leftIndex]>height[rightIndex]){
                rightIndex--;
            }else {
                leftIndex++;
            }
        }
        return maxArea;
    }
}
