package cn.abelib.solution.five;

import org.junit.Test;

/**
 * @Author: abel.huang
 * @Date: 2019-03-11 23:31
 */
public class DetectCapital520 {
    public boolean detectCapitalUse(String word) {
        int len = word.length();
        if (len < 2) {
            return true;
        }
        boolean start = word.charAt(0) >= 'A' && word.charAt(0) <= 'Z';
        boolean second = word.charAt(1) >= 'A' && word.charAt(1) <= 'Z';
        if (!start && second) {
            return false;
        }
        if (len == 2) {
            return true;
        }
        for (int i = 2; i < len; i ++) {
            if (!second && word.charAt(i) >= 'A' && word.charAt(i) <= 'Z') {
                return false;
            }
            if (start && second && word.charAt(i) >= 'a' && word.charAt(i) <= 'z') {
                return false;
            }
        }
        return true;
    }

    @Test
    public void detectCapitalUseTest() {
        String word1 = "USA";
        System.err.println(detectCapitalUse(word1));
        String word2 = "leetcode";
        System.err.println(detectCapitalUse(word2));
        String word3 = "FlaG";
        System.err.println(detectCapitalUse(word3));
        String word4 = "ABl";
        System.err.println(detectCapitalUse(word4));
        String word5 = "aaaaB";
        System.err.println(detectCapitalUse(word5));
    }
}
