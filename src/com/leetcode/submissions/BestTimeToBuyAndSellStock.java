package com.leetcode.submissions;

/**
 * Create by ranzhendong on 2019-10-12 11:06
 *
 * @author ranzhendong@maoyan.com
 */
public class BestTimeToBuyAndSellStock {
    /**
     * 使用 min 记录前 i 天的最小值，然后计算 第 i 天出售股票的收益，并保存收益的最大值。
     * @param prices
     * @return
     */
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }
        int min = prices[0];
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            profit = Math.max(prices[i] - min, profit);
            min = Math.min(min, prices[i]);
        }
        return profit;
    }
}
