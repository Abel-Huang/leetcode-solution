package cn.abelib.solution.eleven;

import org.junit.Test;

import java.util.Arrays;

/**
 * @Author: abel.huang
 * @Date: 2019-09-21 22:54
 */
public class CompareStringsByFrequencyOfTheSmallestCharacter1170 {
    public int[] numSmallerByFrequency(String[] queries, String[] words) {
        int lenQ = queries.length;
        int lenW = words.length;

        int[] answer = new int[lenQ];
        int[] wordsCount = new int[lenW];

        for (int i = 0; i < lenW; i ++) {
            wordsCount[i] = frequencyOfTheSmallestCharacter(words[i]);
        }

        int sum;
        int f;
        for (int i = 0; i < lenQ; i ++) {
            f = frequencyOfTheSmallestCharacter(queries[i]);
            sum = 0;
            for (int j : wordsCount) {
                if (f < j) {
                    sum ++;
                }
            }
            answer[i] = sum;
        }
        return answer;
    }

    private int frequencyOfTheSmallestCharacter(String word) {
        if (word.length() == 1) {
            return 1;
        }
        int cnt = 1;
        char min = word.charAt(0);
        for (int i = 1; i < word.length(); i ++) {
            if (min == word.charAt(i)) {
                cnt ++;
                continue;
            }
            if (min < word.charAt(i)) {
                continue;
            }
            if (min > word.charAt(i)) {
                cnt = 1;
                min = word.charAt(i);
            }
        }
        return cnt;
    }

    @Test
    public void numSmallerByFrequencyTest() {
        String[] queries = {"cbd"}, words = {"zaaaz"};
        System.err.println(Arrays.toString(numSmallerByFrequency(queries, words)));

        String[] queries1 = {"bbb", "cc"}, words1 = {"a", "aa", "aaa", "aaaa"};
        System.err.println(Arrays.toString(numSmallerByFrequency(queries1, words1)));
    }
}
