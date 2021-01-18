package cn.abelib.solution.six;

import org.junit.Test;

/**
 * @Author: abel.huang
 * @Date: 2021-01-11 00:42
 */
public class SumOfSquareNumbers633 {
    public boolean judgeSquareSum(int c) {
        if (c < 3) {
            return true;
        }
        long tmp = c;
        for (int i = 0, j = (int) Math.sqrt(c); i <= j;  ) {
            if (i * i + j * j == tmp) {
                return true;
            } else if (i * i + j * j > tmp) {
                j --;
            } else if (i * i + j * j < tmp) {
                i ++;
            }
        }
        return false;
    }

    @Test
    public void judgeSquareSumTest() {
        System.err.println(judgeSquareSum(100000));
    }
}
