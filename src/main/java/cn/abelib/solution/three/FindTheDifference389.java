package cn.abelib.solution.three;

import org.junit.Test;

/**
 * @Author: abel.huang
 * @Date: 2019-02-01 02:31
 */
public class FindTheDifference389 {
    public char findTheDifference(String s, String t) {
        int[] chars = new int[26];
        for (int i = 0; i < s.length(); i++) {
            int index = s.charAt(i) - 'a';
            chars[index] ++;
        }
        for (int i = 0; i < t.length(); i++) {
            int index = t.charAt(i) - 'a';
            chars[index] --;
        }
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == -1) {
                return (char) ('a' + i);
            }
        }
        return '0';
    }

    @Test
    public void findTheDifferenceTest() {
        System.out.println(findTheDifference("abcd", "abcde"));
    }
}
