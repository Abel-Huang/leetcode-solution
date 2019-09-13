package cn.abelib.solution.four;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Author: abel.huang
 * @Date: 2019-05-02 19:48
 */
public class NumberComplement476Test {
    private NumberComplement476 numberComplement476;

    @Before
    public void init() {
        numberComplement476 = new NumberComplement476();
    }

    @Test
    public void findComplement() {
        System.err.println(numberComplement476.findComplement(5));
    }
}