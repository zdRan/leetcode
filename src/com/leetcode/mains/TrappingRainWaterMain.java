package com.leetcode.mains;

import com.leetcode.submissions.TrappingRainWater;
import com.leetcode.utils.Show;

/**
 * Create by zdRan on 2018/5/8
 *
 * @author cm.zdran@foxmail.com
 */
public class TrappingRainWaterMain {
    public static void main(String[] args) {
        TrappingRainWater trappingRainWater = new TrappingRainWater();
        int ans = trappingRainWater.trap(new int[]{2, 0, 2});
        Show.showString(ans + "");
    }
}
