package cn.abelib.one;

import org.junit.Before;
import org.junit.Test;


/**
 * @author abel.huang
 * @date 2019/4/28 15:39
 */
public class ReverseBits190Test {
    ReverseBits190 reverseBits190;

    @Before
    public void init() {
        reverseBits190 = new ReverseBits190();
    }

    @Test
    public void reverseBits() {
//        43261596
        System.err.println(reverseBits190.reverseBits(43261596));
    }
}