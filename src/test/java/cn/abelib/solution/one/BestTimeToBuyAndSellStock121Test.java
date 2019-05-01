package cn.abelib.solution.one;

import org.junit.Before;
import org.junit.Test;


/**
 * @Author: abel.huang
 * @Date: 2019-04-30 23:04
 */
public class BestTimeToBuyAndSellStock121Test {
    private BestTimeToBuyAndSellStock121 bestTimeToBuyAndSellStock121;

    @Before
    public void setUp() {
        bestTimeToBuyAndSellStock121 = new BestTimeToBuyAndSellStock121();
    }

    @Test
    public void maxProfit() {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(bestTimeToBuyAndSellStock121.maxProfit(prices));
        int[] prices1 = {7, 6, 4, 3, 1};
        System.out.println(bestTimeToBuyAndSellStock121.maxProfit(prices1));
    }
}