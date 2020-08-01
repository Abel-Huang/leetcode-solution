package cn.abelib.solution.four;

import org.junit.Test;

/**
 * @Author: abel.huang
 * @Date: 2020-07-27 21:44
 */
public class ArrangingCoins441 {
    public int arrangeCoins(int n) {
        if (n < 1) {
            return 0;
        }
        if (n < 3) {
            return 1;
        }
        int i = 1;
        while (n > 0) {
            n = n - i;
            i++ ;
            if (n < i) {
                return i - 1;
            }
        }
        return i - 1;
    }

    @Test
    public void arrangeCoinsTest() {


        System.err.println(arrangeCoins(1804289383));

    }
}
