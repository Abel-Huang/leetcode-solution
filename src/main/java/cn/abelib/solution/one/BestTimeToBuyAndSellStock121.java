package cn.abelib.solution.one;


import org.junit.Test;

/**
 * @Author: abel.huang
 * @Date: 2019-01-13 16:53
 */
public class BestTimeToBuyAndSellStock121 {
    public int maxProfit(int[] prices) {
        if (prices.length < 1) {
            return 0;
        }
        int min = prices[0];
        int result = 0;
        for (int i = 0; i < prices.length; i ++) {
            min = Math.min(min, prices[i]);
            result = Math.max(result, prices[i] - min) ;
        }
        return result;
    }

    /**
     * 使用dp[i] 存储第i天前最低价格，
     * 然后使用当天价格 prices[i] - dp[i]，
     * 最大值即为结果
     * @param prices
     * @return
     */
    public int maxProfit2(int[] prices) {
        int len = prices.length;
        if  (len < 2) {
            return 0;
        }
        int[] dp = new int[len];
        dp[0] = prices[0];
        int ans = 0;
        for (int i = 1; i < len; i ++) {
            if(dp[i - 1] > prices[i]) {
                dp[i] = prices[i];
            } else {
                dp[i] = dp[i - 1];
                ans = Math.max(prices[i] - dp[i], ans);
            }
        }

        return ans;
    }

    @Test
    public void maxProfit2Test() {
        int[] prices = {7,1,5,3,6,4};
        System.err.println(maxProfit2(prices));
    }

    @Test
    public void maxProfit1Test() {
        int[] prices = {7,6,4,3,1};
        System.err.println(maxProfit2(prices));
    }
}
