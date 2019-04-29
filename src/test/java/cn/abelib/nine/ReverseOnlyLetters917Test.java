package cn.abelib.nine;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Author: abel.huang
 * @Date: 2019-04-30 01:19
 */
public class ReverseOnlyLetters917Test {
    ReverseOnlyLetters917 reverseOnlyLetters917;
    @Before
    public void init(){
        reverseOnlyLetters917 = new ReverseOnlyLetters917();
    }

    @Test
    public void reverseOnlyLetters() {
        System.err.println(reverseOnlyLetters917.reverseOnlyLetters("ab-cd"));
        System.err.println(reverseOnlyLetters917.reverseOnlyLetters("a-bC-dEf-ghIj"));
        System.err.println(reverseOnlyLetters917.reverseOnlyLetters("Test1ng-Leet=code-Q!"));
    }
}