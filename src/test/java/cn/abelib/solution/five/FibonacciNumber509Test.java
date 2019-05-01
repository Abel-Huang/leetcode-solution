package cn.abelib.solution.five;

import org.junit.Before;
import org.junit.Test;


/**
 * @Author: abel.huang
 * @Date: 2019-04-30 23:21
 */
public class FibonacciNumber509Test {
    private FibonacciNumber509 fibonacciNumber509;

    @Before
    public void init()  {
        fibonacciNumber509 = new FibonacciNumber509();
    }

    @Test
    public void fib() {
        int N = 10;
        System.out.println(fibonacciNumber509.fib(N));
    }
}