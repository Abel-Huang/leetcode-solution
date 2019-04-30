package cn.abelib.solution.zero;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author abel.huang
 * @date 2019/4/30 11:05
 */
public class LongestSubstringWithoutRepeatingCharacters3Test {
    LongestSubstringWithoutRepeatingCharacters3 lengthOfLongestSubstring;

    @Before
    public void init() {
        lengthOfLongestSubstring = new LongestSubstringWithoutRepeatingCharacters3();
    }

    @Test
    public void lengthOfLongestSubstringTest() {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring.lengthOfLongestSubstring(s));
        Assert.assertEquals(lengthOfLongestSubstring.lengthOfLongestSubstring(s), 3);
        String s1 = "bbbbb";
        System.out.println(lengthOfLongestSubstring.lengthOfLongestSubstring(s1));
        String s2 = "pwwkew";
        System.out.println(lengthOfLongestSubstring.lengthOfLongestSubstring(s2));
    }
}