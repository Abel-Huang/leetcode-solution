package cn.abelib.solution.six;

import org.junit.Before;
import org.junit.Test;

/**
 * @Author: abel.huang
 * @Date: 2019-04-30 00:47
 */
public class BinaryNumberWithAlternatingBits693Test {
    BinaryNumberWithAlternatingBits693 binaryNumberWithAlternatingBits693;
    @Before
    public void init() {
        binaryNumberWithAlternatingBits693 = new BinaryNumberWithAlternatingBits693();
    }

    @Test
    public void hasAlternatingBits() {
        System.err.println(binaryNumberWithAlternatingBits693.hasAlternatingBits(5));
        System.err.println(binaryNumberWithAlternatingBits693.hasAlternatingBits(7));
        System.err.println(binaryNumberWithAlternatingBits693.hasAlternatingBits(11));
        System.err.println(binaryNumberWithAlternatingBits693.hasAlternatingBits(10));
    }
}