package cn.abelib.solution.zero;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author abel.huang
 * @date 2019/4/30 11:23
 */
public class PalindromeNumber9Test {
    PalindromeNumber9 palindromeNumber9;

    @Before
    public void init() {
        palindromeNumber9 = new PalindromeNumber9();
    }

    @Test
    public void isPalindromeTest() {
        int x = 121;
        System.out.println(palindromeNumber9.isPalindrome(x));
        int x1 = -121;
        System.out.println(palindromeNumber9.isPalindrome(x1));
        int x2 = 10;
        System.out.println(palindromeNumber9.isPalindrome(x2));
        int x3 = -2147447412;
        System.out.println(palindromeNumber9.isPalindrome(x3));
    }
}