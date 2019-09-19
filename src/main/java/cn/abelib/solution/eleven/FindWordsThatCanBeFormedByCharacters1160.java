package cn.abelib.solution.eleven;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: abel.huang
 * @Date: 2019-09-18 21:08
 */
public class FindWordsThatCanBeFormedByCharacters1160 {
    public int countCharacters(String[] words, String chars) {
        int len = chars.length();
        if (len < 1) {
            return 0;
        }
        Map<Character, Integer> map = new HashMap<>(len);
        for (int i = 0; i < len; i ++) {
            if (map.containsKey(chars.charAt(i))) {
                map.put(chars.charAt(i), map.get(chars.charAt(i)) + 1);
            } else {
                map.put(chars.charAt(i), 1);
            }
        }
        Map<Character, Integer> wordMap = new HashMap<>(len);
        int cnt = 0;
        for (String word : words) {
            for (int i = 0; i < word.length(); i ++) {
                if (wordMap.containsKey(word.charAt(i))) {
                    wordMap.put(word.charAt(i), wordMap.get(word.charAt(i)) + 1);
                } else {
                    wordMap.put(word.charAt(i), 1);
                }
            }
            boolean flag = true;
            for (Map.Entry<Character, Integer> entry : wordMap.entrySet()) {
                if (!map.containsKey(entry.getKey()) || entry.getValue() > map.get(entry.getKey())) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                cnt += word.length();
            }
            wordMap.clear();
        }
        return cnt;
    }

    @Test
    public void countCharactersTest() {
        String[] words = {"cat","bt","hat","tree"};
        String chars = "atach";
        System.err.println(countCharacters(words, chars));
        String[] words1 = {"hello","world","leetcode"};
        String chars1 = "welldonehoneyr";
        System.err.println(countCharacters(words1, chars1));
    }
}
