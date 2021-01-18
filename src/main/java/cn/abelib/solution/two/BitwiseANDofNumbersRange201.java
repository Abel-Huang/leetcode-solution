package cn.abelib.solution.two;

import org.junit.Test;

/**
 * @Author: abel.huang
 * @Date: 2020-08-23 15:35
 * 只有对应为上全部是1才能返回1
 */
public class BitwiseANDofNumbersRange201 {
    public int rangeBitwiseAnd(int m, int n) {
        int offset;
        for (offset = 0; m != n; offset ++) {
            m >>= 1;
            n >>= 1;
        }
        return n << offset;
    }

    @Test
    public void rangeBitwiseAndTest() {
        System.out.println(rangeBitwiseAnd(1, 10));
    }
}
