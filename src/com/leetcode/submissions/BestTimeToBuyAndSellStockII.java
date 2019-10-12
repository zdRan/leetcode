package com.leetcode.submissions;

/**
 * Create by ranzhendong on 2019-10-12 11:14
 *
 * @author ranzhendong@maoyan.com
 */
public class BestTimeToBuyAndSellStockII {
    /**
     * 只要有盈利（当天的价格超过之前的价格）就抛，
     * @param prices
     * @return
     */
    public int maxProfit(int[] prices) {
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            profit += prices[i] > prices[i - 1] ? (prices[i] - prices[i - 1]) : 0;
        }
        return profit;
    }
}
