package cn.abelib.solution.one;


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
}
