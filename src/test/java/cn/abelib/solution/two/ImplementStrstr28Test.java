package cn.abelib.solution.two;

import cn.abelib.solution.zero.ImplementStrstr28;
import org.junit.Before;
import org.junit.Test;

/**
 * @author abel.huang
 * @date 2019/4/28 15:30
 */
public class ImplementStrstr28Test {
    ImplementStrstr28 implementStrstr28;

    @Before
    public void init() {
        implementStrstr28 = new ImplementStrstr28();
    }

    @Test
    public void strStr() {
        System.err.println(implementStrstr28.strStr("aaaaa",  "bba"));
        System.err.println(implementStrstr28.strStr("hello",  "ll"));
    }
}