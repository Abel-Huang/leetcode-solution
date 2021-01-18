package cn.abelib.solution.one;

import org.junit.Test;

/**
 * @Author: abel.huang
 * @Date: 2021-01-07 23:49
 */
public class BestTimeToBuyAndSellStock122 {

    public int maxProfit(int[] prices) {
        int len = prices.length;

        if (len < 2) {
            return 0;
        }

        int ans = 0;
        for (int i = 0; i < len; i ++) {
            int max = prices[i];
            int index = i;
            for (int j = i + 1; j < len; j ++) {
                if (prices[j] > max) {
                    index = j;
                    max = prices[j];
                } else {
                    break;
                }

            }
            if (index > i) {
                ans += max - prices[i];
                i = index;
            }
        }

        return ans;
    }

    @Test
    public void test() {
        int[] prices = {7,1,5,3,6,4};
        maxProfit(prices);
    }
}
