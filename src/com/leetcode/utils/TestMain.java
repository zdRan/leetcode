package com.leetcode.utils;

/**
 * 用于实验一些API
 *
 * Create by ranzd on 2017/10/23
 *
 * @author ranzd@chinaunicom.cn
 */
public class TestMain {
    public static void main(String[] args){
        String str = "12a4567a89";
        String s = str.substring(0,0);
        Show.showString("index = "+str.lastIndexOf("a",9));
    }
}
