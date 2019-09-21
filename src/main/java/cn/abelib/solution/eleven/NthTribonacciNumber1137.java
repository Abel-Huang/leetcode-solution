package cn.abelib.solution.eleven;

import org.junit.Test;

/**
 * @Author: abel.huang
 * @Date: 2019-09-21 23:22
 */
public class NthTribonacciNumber1137 {
    public int tribonacci(int n) {
        if (n  == 0) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        int first = 0;
        int second = 1;
        int third = 1;
        int temp;
        for (int i = 3; i <= n; i ++) {
            temp = first + second + third;
            first = second;
            second = third;
            third = temp;
        }
        return third;
    }

    @Test
    public void tribonacciTest() {
        System.err.println(tribonacci(1));
        System.err.println(tribonacci(2));
        System.err.println(tribonacci(3));
        System.err.println(tribonacci(4));
        System.err.println(tribonacci(5));
        System.err.println(tribonacci(25));
    }
}
