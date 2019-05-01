package cn.abelib.solution.five;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Author: abel.huang
 * @Date: 2019-05-01 19:00
 */
public class ReverseWordsInAStringIII557Test {
    private ReverseWordsInAStringIII557 reverseWordsInAStringIII557;

    @Before
    public void init() {
        reverseWordsInAStringIII557 = new ReverseWordsInAStringIII557();
    }

    @Test
    public void reverseWords() {
        String s= "Let's take LeetCode contest";
        System.err.println(reverseWordsInAStringIII557.reverseWords(s));
    }
}