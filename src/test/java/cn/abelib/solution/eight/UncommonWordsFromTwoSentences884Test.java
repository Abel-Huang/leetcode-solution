package cn.abelib.solution.eight;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * @Author: abel.huang
 * @Date: 2019-04-30 03:47
 */
public class UncommonWordsFromTwoSentences884Test {
    UncommonWordsFromTwoSentences884 uncommonWordsFromTwoSentences884;

    @Before
    public void init() {
        uncommonWordsFromTwoSentences884 = new UncommonWordsFromTwoSentences884();
    }

    @Test
    public void uncommonFromSentences() {
        String A = "this apple is sweet";
        String B = "this apple is sour";
        System.err.println(Arrays.toString(uncommonWordsFromTwoSentences884.uncommonFromSentences(A, B)));
    }
}