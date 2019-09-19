package cn.abelib.solution.five;

import org.junit.Test;

import java.util.*;

/**
 * @Author: abel.huang
 * @Date: 2019-09-15 17:39
 */
public class KeyboardRow500 {

    public String[] findWords(String[] words) {
        if (words.length < 1) {
            return new String[0];
        }
        List<String> result = new ArrayList<>(words.length);
        Map<Character, Integer> map = new HashMap<>(64);
        char[] lines1 = {'Q', 'W', 'E', 'R', 'T', 'Y', 'U', 'I', 'O', 'P'};
        char[] lines2 = {'A', 'S', 'D', 'F', 'G', 'H', 'J', 'K', 'L'};
        char[] lines3 = {'Z', 'X', 'C', 'V', 'B', 'N', 'M'};
        for (char c : lines1) {
            map.put(c, 0);
            map.put((char) (c + 32), 0);
        }
        for (char c : lines2) {
            map.put(c, 1);
            map.put((char) (c + 32), 1);
        }
        for (char c : lines3) {
            map.put(c, 2);
            map.put((char) (c + 32), 2);
        }
        for (String word : words) {
            if (word.length() < 2) {
                result.add(word);
                continue;
            }
            boolean flag = true;
            for(int i = 1; i < word.length(); i++) {
                if (map.get(word.charAt(i)).intValue() != map.get(word.charAt(i - 1)).intValue()) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                result.add(word);
            }
        }
        String[] strings = new String[result.size()];
        return result.toArray(strings);
    }

    @Test
    public void findWordsTest() {
        String[] words = {"Hello", "Alaska", "Dad", "Peace"};
         System.err.println(Arrays.toString(findWords(words)));
    }
}
