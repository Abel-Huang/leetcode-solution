package cn.abelib.solution.three;

import org.junit.Test;

/**
 * @Author: abel.huang
 * @Date: 2020-07-30 20:52
 */
public class IntegerBreak343 {
    public int integerBreak(int n) {
        if (n < 4) {
            return n - 1;
        }

        int i = n / 3;
        int j = n % 3;

        int ans = 1;

        if (j  == 1) {
            j = 4;
            i --;
        }else if (j == 0) {
           j = 1;
        }
        while (i > 0) {
            ans *= 3;
            i --;
        }
        ans *= j;

        return ans;
    }

    @Test
    public void integerBreakTest() {
        for (int i = 3; i <= 58; i ++) {
            System.err.println(integerBreak(i));
        }
    }

}
