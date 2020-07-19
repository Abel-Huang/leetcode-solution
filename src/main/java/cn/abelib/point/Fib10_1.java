package cn.abelib.point;

/**
 * @Author: abel.huang
 * @Date: 2020-07-19 16:05
 */
public class Fib10_1 {
    public int fibRecursion(int n) {
        if (n < 2) {
            return n;
        }
        return fibRecursion(n -1) + fibRecursion(n -2);
    }

    public int fib(int n) {
        if (n < 2) {
            return n;
        }
        int first = 0;
        int second = 1;
        int ans = first + second;
        for (int i = 2; i <= n; i++) {
            ans = (first + second) % 1000000007;

            first = second;
            second = ans;
        }
        return ans;
    }
}
