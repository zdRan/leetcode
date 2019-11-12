package com.leetcode.mains;

import com.leetcode.submissions.ContainerWithMostWater;
import com.leetcode.utils.Show;

/**
 * Create by ranzd on 17-11-25
 *
 * @author cm.zdran@foxmail.com
 */
public class ContainerWithMostWaterMain {
    public static void main(String[] args) {
        ContainerWithMostWater containerWithMostWater = new ContainerWithMostWater();
        int maxArea = containerWithMostWater.maxArea(new int[]{1, 2});

        Show.showString("maxArea = " + maxArea);
    }
}
