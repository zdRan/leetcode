package com.leetcode.mains;

import com.leetcode.submissions.ThreeSumClosest;
import com.leetcode.utils.Show;

/**
 * Create by ranzd on 2017/12/2
 *
 * @author cm.zdran@gmail.com
 */
public class ThreeSumClosestMain {
    public static void main(String[] args) {
        ThreeSumClosest threeSumClosest = new ThreeSumClosest();
        int result = threeSumClosest.threeSumClosest(new int[]{-1, 0, 1, 2, -1, -4}, 5);
        Show.showString("result = " + result);
    }
}
