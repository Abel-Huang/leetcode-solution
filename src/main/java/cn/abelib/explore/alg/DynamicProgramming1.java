package cn.abelib.explore.alg;

import org.junit.Test;

/**
 * @Author: abel.huang
 * @Date: 2019-01-12 22:19
 */
public class DynamicProgramming1 {
    public int climbStairs(int n) {
        if (n <= 3) {
            return n;
        }
        return climbStairs(n - 1) + climbStairs(n - 2);
    }

    @Test
    public void climbStairsTest() {
        System.out.println(climbStairs(4));
    }
}
