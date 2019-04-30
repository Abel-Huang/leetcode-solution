package cn.abelib.solution.zero;

import org.junit.Before;
import org.junit.Test;

/**
 * @author abel.huang
 * @date 2019/4/30 16:00
 */
public class PowxN50Test {
    private PowxN50 powxN50;

    @Before
    public void init() {
        powxN50 = new PowxN50();
    }

    @Test
    public void myPow() {
        System.out.println( powxN50.myPow(2.0, 10));
        System.out.println( powxN50.myPow(2.1, 3));
        System.out.println( powxN50.myPow(2.0, -2));
    }
}