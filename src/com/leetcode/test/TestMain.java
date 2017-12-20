package com.leetcode.test;

import com.leetcode.utils.Show;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 用于测试一些API
 * <p>
 * Create by ranzd on 2017/10/23
 *
 * @author ranzd@chinaunicom.cn
 */
public class TestMain {
    public static void main(String[] args) {

        //Show.showString("monotoneIncreasingDigits = "+monotoneIncreasingDigits(1122333221));
        //Show.showString("total = "+minCostClimbingStairs(new int[]{0,1,2,2}));
        //Show.showString("total = "+minCostClimbingStairs(new int[]{1, 100, 1, 1, 1, 100, 1, 1, 100, 1}));
        Show.showString("total = "+divide(-5,-2));
    }

    public static int monotoneIncreasingDigits(int N) {
        String str = N+"";
        int[] num = new int[str.length()];
        int lastIndex = 0;
        boolean flag = true;
        for (int i = 0;i<str.length();i++){
            num[i] = str.charAt(i)-'0';
            if (flag&&num[i] > num[lastIndex]){
                 lastIndex = i;
            }
            if (num[i] < num[lastIndex]){
                flag = false;
            }
        }
        if (!flag){
            num[lastIndex] = num[lastIndex]-1;
            for (int i = lastIndex+1;i<num.length;i++){
                num[i] = 9;
            }
        }else {
            return N;
        }
        int M = 0;
        for (int i = 0;i<num.length;i++){
            M = M*10 + num[i];
        }
        return M;
    }
    public static int minCostClimbingStairs(int[] cost) {
        int total = 0;
        for (int i = cost.length-1;i>=1;){
            if (cost[i]>=cost[i-1]){
                total+=cost[i-1];
                i-=2;
            }else {
                total+=cost[i];
                i--;
            }
        }

        return total;
    }

    public static void DSF(int[] cost,int index,int total) {

        if (index-12 > cost.length){
            System.out.println(total);
        }
        if (cost[index+1]<cost[index]){
            DSF(cost,index+2,total+cost[index+1]);
        }else {
            DSF(cost,index+1,total+cost[index]);
        }
    }
    public static int divide(int dividend, int divisor) {
        int count = 0;
        int abs = Math.abs(dividend);
        while (abs>=divisor){
            abs -=divisor;
            count++;
        }
        count *= (dividend*divisor) > 0 ? 1:-1;
        return count;
    }

}
