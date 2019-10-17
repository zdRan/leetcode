package com.leetcode.submissions;

import sun.applet.AppletResourceLoader;

import java.util.Arrays;

/**
 * Create by ranzhendong on 2019-10-14 15:48
 *
 * @author ranzhendong@maoyan.com
 */
public class BestTimeToBuyAndSellStockIII {

    public static int maxProfit(int[] prices) {
        int max = 0;
        for (int i = 0; i < prices.length; i++) {
            max = Math.max(max, func(prices, 0, i) + func(prices, i, prices.length));
        }
        return max;
    }

    private static int func(int[] prices, int start, int end) {
        int min = prices[start];
        int profit = 0;
        for (int i = start; i < end; i++) {
            profit = Math.max(prices[i] - min, profit);
            min = Math.min(min, prices[i]);
        }
        return profit;
    }

    public static void main(String[] args) {
        maxProfit(new int[]{1, 2, 3, 4, 5});
    }
}
