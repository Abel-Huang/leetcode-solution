package cn.abelib.solution.ten;

import org.junit.Before;
import org.junit.Test;

/**
 * @Author: abel.huang
 * @Date: 2019-04-29 23:52
 */
public class ComplementOfBase10Integer1009Test {
    ComplementOfBase10Integer1009 complementOfBase10Integer1009;

    @Before
    public void init() {
        complementOfBase10Integer1009 = new ComplementOfBase10Integer1009();
    }

    @Test
    public void bitwiseComplement() {
        System.err.println(complementOfBase10Integer1009.bitwiseComplement(1));
        System.err.println(complementOfBase10Integer1009.bitwiseComplement(7));
        System.err.println(complementOfBase10Integer1009.bitwiseComplement(10));
        System.err.println(complementOfBase10Integer1009.bitwiseComplement(8));
    }
}