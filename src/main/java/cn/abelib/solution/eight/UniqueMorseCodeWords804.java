package cn.abelib.solution.eight;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author: abel.huang
 * @Date: 2019-12-05 01:01
 */
public class UniqueMorseCodeWords804 {
    public int uniqueMorseRepresentations(String[] words) {
        int len = words.length;
        if (len < 1) {
            return 0;
        }
        if (len < 2) {
            return 1;
        }
        Set<String> set = new HashSet<>();
        StringBuilder str = new StringBuilder();
        String[] moses = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",
                ".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        for (String word : words) {
            for (int i = 0; i < word.length(); i++) {
                str.append(moses[word.charAt(i) - 'a']);
            }
            set.add(str.toString());
            str.setLength(0);
        }
        return set.size();
    }

    @Test
    public void uniqueMorseRepresentationsTest() {
        String[] words = {"gin", "zen", "gig", "msg"};
        System.err.println(uniqueMorseRepresentations(words));
    }
}
