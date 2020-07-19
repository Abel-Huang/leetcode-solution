package cn.abelib.point;

import org.junit.Test;

/**
 * @Author: abel.huang
 * @Date: 2020-07-19 16:13
 */
public class HammingWeight15 {
    // you need to treat n as an unsigned value
    public int hammingWeightWithBitCount(int n) {
        return Integer.bitCount(n);
    }

    public int hammingWeight(int n) {
        int ans = 0;
        while (n != 0) {
            ans += n & 1;
            n = n >>> 1;

        }
        return ans;
    }


    @Test
    public void hammingWeightTest() {
        System.err.println(hammingWeight(100));
    }
}
