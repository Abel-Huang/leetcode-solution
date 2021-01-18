package cn.abelib.solution.zero;

import org.junit.Assert;
import org.junit.Test;

/**
 * @Author: abel.huang
 * @Date: 2020-08-22 14:11
 */
public class IntegertoRoman12 {
    private String[] thousand = {"", "M", "MM", "MMM", "", "", "", "", "", ""};
    private String[] hundred = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
    private String[] tens = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
    private String[] bits = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};

    public String intToRoman(int num) {
        if (num < 1) {
            return "";
        }
        if (num > 3999) {
            return "M";
        }
        int[] n = new int[4];
        for (int i = 0; i < 4; i ++) {
            n[i] = num % 10;
            num /= 10;
        }
        return thousand[n[3]] +
                hundred[n[2]] +
                tens[n[1]] +
                bits[n[0]];
    }

    @Test
    public void intToRomanTest() {
        Assert.assertEquals("MCDXXXVII", intToRoman(1437));
        Assert.assertEquals("XVI", intToRoman(16));
        Assert.assertEquals("CXCIX", intToRoman(199));
        Assert.assertEquals("MMMCMXCIX", intToRoman(3999));
        Assert.assertEquals("MMMCCCXXXIII", intToRoman(3333));
    }
}
