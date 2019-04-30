package cn.abelib.solution.zero;

import org.junit.Before;
import org.junit.Test;


/**
 * @author abel.huang
 * @date 2019/4/30 16:05
 */
public class LengthOfLastWord58Test {
    private LengthOfLastWord58 lengthOfLastWord58;

    @Before
    public void init() {
        lengthOfLastWord58 = new LengthOfLastWord58();
    }

    @Test
    public void lengthOfLastWord() {
        String s = " a  ";
        System.err.println(lengthOfLastWord58.lengthOfLastWord(s));
        String s1 = "Hello World";
        System.err.println(lengthOfLastWord58.lengthOfLastWord(s1));
    }
}