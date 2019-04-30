package cn.abelib.solution.zero;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author abel.huang
 * @date 2019/4/30 11:11
 */
public class ZigzagConversion6Test {
    ZigzagConversion6 zigzagConversion6;

    @Before
    public void init() {
        zigzagConversion6 = new ZigzagConversion6();
    }

    @Test
    public void convert() {
        String s = "LEETCODEISHIRING";
        System.out.println(zigzagConversion6.convert(s, 3));
        String s1 = "LEETCODEISHIRING";
        System.out.println(zigzagConversion6.convert(s1, 4));
    }
}