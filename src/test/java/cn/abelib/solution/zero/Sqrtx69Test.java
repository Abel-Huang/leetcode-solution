package cn.abelib.solution.zero;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author abel.huang
 * @date 2019/4/30 16:44
 */
public class Sqrtx69Test {
    private Sqrtx69 sqrtx69;

    @Before
    public void init() {
        sqrtx69 = new Sqrtx69();
    }

    @Test
    public void mySqrt() {
        System.err.println(sqrtx69.mySqrt(4));
        System.err.println(sqrtx69.mySqrt(8));
    }
}