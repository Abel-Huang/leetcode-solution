package cn.abelib.solution.zero;

import org.junit.Before;
import org.junit.Test;


/**
 * @author abel.huang
 * @date 2019/4/30 14:00
 */
public class ValidParentheses20Test {
    private ValidParentheses20 validParentheses20;

    @Before
    public void init() {
        validParentheses20 = new ValidParentheses20();
    }

    @Test
    public void isValid() {
        String s = "()";
        System.out.println(validParentheses20.isValid(s));
        String s1 = "()[]{}";
        System.out.println(validParentheses20.isValid(s1));
        String s2 = "(]";
        System.out.println(validParentheses20.isValid(s2));
        String s3 = "([)]";
        System.out.println(validParentheses20.isValid(s3));
        String s4 = "([])";
        System.out.println(validParentheses20.isValid(s4));
    }
}