package cn.abelib.solution.two;

import org.junit.Test;

/**
 *
 * @author abel-huang
 * @date 2016/7/11
 */
public class PowerOfTwo231 {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        } else {
            return (n & (n - 1)) == 0;
        }
    }

    @Test
    public void isPowerOfTwoTest() {
        int n = 144;
        System.out.println(isPowerOfTwo(n));
    }
}
