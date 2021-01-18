package cn.abelib.solution.six;

import org.junit.Test;

/**
 * @Author: abel.huang
 * @Date: 2021-01-11 22:16
 */
public class ValidPalindromeII680 {
    public boolean validPalindrome(String s) {
        int len = s.length();
        if(len < 2) {
            return true;
        }
        for (int i = 0, j = len - 1; i <= j;) {
            if (s.charAt(i) == s.charAt(j)) {
                i ++;
                j --;
            } else {
                return validPalindrome(s, i, j - 1) || validPalindrome(s, i + 1, j);
            }
        }
        return true;
    }

    private boolean validPalindrome(String s, int start, int end) {
        while (start <= end) {
            if (s.charAt(start) == s.charAt(end)) {
                start ++;
                end --;
            } else {
                return false;
            }
        }
        return true;
    }

    @Test
    public void validPalindromeTest() {
        System.err.println(validPalindrome("aba"));
        System.err.println(validPalindrome("aguokepatgbnvfqmgmlcupuufxoohdfpgjdmysgvhmvffcnqxjjxqncffvmhvgsymdjgpfdhooxfuupuculmgmqfvnbgtapekouga"));
       System.err.println(validPalindrome("abca"));

    }
}
