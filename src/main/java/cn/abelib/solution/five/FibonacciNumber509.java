package cn.abelib.solution.five;


/**
 * @Author: abel.huang
 * @Date: 2019-01-08 14:17
 * Fibonacci
 */
public class FibonacciNumber509 {
    public int fib(int N) {
        if(N == 0) {
            return 0;
        }
        if(N == 1) {
            return 1;
        }
        return fib(N-2)+ fib(N-1);
    }
}
