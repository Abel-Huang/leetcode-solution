package cn.abelib.point;

import org.junit.Test;

/**
 * @Author: abel.huang
 * @Date: 2020-08-03 14:29
 */
public class SumNums64 {
    public int sumNums(int n) {
        int sum = n;
        boolean flag = n > 0 && (sum += sumNums(n -1)) > 0;
        return sum;
    }

    public int sumNums2(int n) {
        return (int) (n + Math.pow(n, 2)) >> 1;
    }

    @Test
    public void sumNumsTest() {
        System.err.println(sumNums2(1000));
    }
}
