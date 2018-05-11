package com.leetcode.mains;

import com.leetcode.submissions.FirstMissingPositive;

/**
 * Create by zdRan on 2018/5/11
 *
 * @author cm.zdran@gmail.com
 */
public class FirstMissingPositiveMain {

    public static void main(String[] args) {
        FirstMissingPositive firstMissingPositive = new FirstMissingPositive();

        int num = firstMissingPositive.firstMissingPositive(new int[]{3,4,-1,1});
        System.out.println(num);
        num = firstMissingPositive.firstMissingPositive(new int[]{1,1});
        System.out.println(num);
    }
}
