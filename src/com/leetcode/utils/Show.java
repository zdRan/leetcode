package com.leetcode.utils;

/**
 * 用于打印结果
 * Create by ranzd on 2017/10/22
 *
 * @author cm.zdran@gmail.com
 */
public class Show {
    public static void showString(String str) {
        System.out.println(str);
    }

    public static void showInt(int num) {
        showString("num = " + num);
    }

    public static void showArray(int[] arr) {
        showString("show arr start:");
        for (int i = 0; i < arr.length; i++) {
            showString(i + ":" + arr[i]);
        }
        showString("show arr end");
    }

    public static void showDouble(double num) {
        showString("double = " + num);
    }


}
