package cn.abelib.four;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Author: abel.huang
 * @Date: 2019-04-28 00:30
 */
public class AddStrings415Test {
    AddStrings415 addStrings415;
    @Before
    public void init() {
        addStrings415 = new AddStrings415();
    }


    @Test
    public void addStrings1() {
        String num1 = "124";
        String num2 = "978";
        System.out.println(addStrings415.addStrings(num1, num2));
    }

    @Test
    public void addStrings2() {
        String num1 = "999";
        String num2 = "9999";
        System.out.println(addStrings415.addStrings(num1, num2));
    }
}