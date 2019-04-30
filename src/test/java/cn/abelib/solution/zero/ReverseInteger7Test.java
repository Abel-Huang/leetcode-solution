package cn.abelib.solution.zero;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author abel.huang
 * @date 2019/4/30 11:19
 */
public class ReverseInteger7Test {
    ReverseInteger7 reverseInteger7;

    @Before
    public void init() {
        reverseInteger7 = new ReverseInteger7();
    }

    @Test
    public void reverse() {
        int a = -2147483648;
        System.out.println(reverseInteger7.reverse(a));
        int a1 = 123;
        System.out.println(reverseInteger7.reverse(a1));
        int a2 = -123;
        System.out.println(reverseInteger7.reverse(a2));
        int a3 = 120;
        System.out.println(reverseInteger7.reverse(a3));
    }
}