package cn.abelib.solution.zero;

import org.junit.Before;
import org.junit.Test;

/**
 * @author abel.huang
 * @date 2019/4/28 15:27
 */
public class RomanToInteger13Test {
    RomanToInteger13 roman;

    @Before
    public void init() {
        roman = new RomanToInteger13();
    }

    @Test
    public void testRomanToInt() {
        System.err.println(roman.romanToInt("III"));
        System.err.println(roman.romanToInt("IX"));
        System.err.println(roman.romanToInt("LVIII"));
        System.err.println(roman.romanToInt("MCMXCIV"));
    }
}