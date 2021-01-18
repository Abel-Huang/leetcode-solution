package cn.abelib.solution.one;

import org.junit.Test;

/**
 * @Author: abel.huang
 * @Date: 2020-08-22 21:27
 */
public class FactorialTrailingZeroes172 {
    public int trailingZeroes(int n) {
        int count = 0;
        while(n > 0) {
            count += n / 5;
            n /= 5;
        }
        return count;
    }

    @Test
    public void trailingZeroesTest() {
        System.out.println(trailingZeroes(120));
    }
}
