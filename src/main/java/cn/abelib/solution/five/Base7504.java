package cn.abelib.solution.five;

import org.junit.Test;

/**
 * @Author: abel.huang
 * @Date: 2019-12-05 23:30
 */
public class Base7504 {
    public String convertToBase7(int num) {
        if (num >= 0) {
            return Integer.toUnsignedString(num, 7);
        } else {
            return "-" +  Integer.toUnsignedString(-num, 7);
        }
    }

    public String convertToBase72(int num) {
        return Integer.toString(num, 7);
    }

    @Test
    public void convertToBase7Test() {
        System.err.println(convertToBase72(100));
        System.err.println(convertToBase72(-7));
    }
}
