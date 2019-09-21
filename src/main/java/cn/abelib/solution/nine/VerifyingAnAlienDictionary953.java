package cn.abelib.solution.nine;

import org.junit.Test;

import java.util.Arrays;

/**
 * @Author: abel.huang
 * @Date: 2019-09-21 23:40
 */
public class VerifyingAnAlienDictionary953 {
    public boolean isAlienSorted(String[] words, String order) {
        int len = words.length;
        if (len == 1) {
            return true;
        }
        String[] earthWords = new String[len];
        for (int i = 0; i < len; i++) {
            earthWords[i] = earthWord(words[i], order);
        }
        String[] temp = Arrays.copyOf(earthWords, len);

        Arrays.sort(earthWords);
        for (int i = 0; i < len; i ++) {
            if (!temp[i].equals(earthWords[i])) {
                return false;
            }
        }
        return true;
    }

    private String earthWord(String word, String order) {
        if ("abcdefghijklmnopqrstuvwxyz".equals(order)) {
            return word;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            sb.append((char) ('a' + order.indexOf(word.charAt(i))));
        }
        return sb.toString();
    }

    @Test
    public void isAlienSortedTest() {
       String[] words = {"apple","app"};
       String order = "abcdefghijklmnopqrstuvwxyz";
       System.err.println(isAlienSorted(words, order));

        String[] words1 = {"word","world","row"};
        String order1 = "worldabcefghijkmnpqstuvxyz";
        System.err.println(isAlienSorted(words1, order1));
    }
}
