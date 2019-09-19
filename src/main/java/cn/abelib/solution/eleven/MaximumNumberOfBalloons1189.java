package cn.abelib.solution.eleven;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: abel.huang
 * @Date: 2019-09-18 01:27
 */
public class MaximumNumberOfBalloons1189 {
    public int maxNumberOfBalloons(String text) {
        String balloon = "balloon";
        if (text.length() < balloon.length()) {
            return 0;
        }
        if (text.equals(balloon)) {
            return 1;
        }
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < balloon.length(); i++) {
            map.put(balloon.charAt(i), 0);
        }
        for (int i = 0; i < text.length(); i++) {
            if (map.containsKey(text.charAt(i))) {
                map.put(text.charAt(i), map.get(text.charAt(i)) + 1);
            }
        }
        int min1 = Math.min(map.get('a'), Math.min(map.get('b'),  map.get('n')));
        int min2 = Math.min(map.get('l'), map.get('o'));
        if (min1 < 1 || min2 < 2) {
            return 0;
        }
        while (min1 > 0) {
            if (min1 * 2 <= min2) {
                return min1;
            }
            min1 --;
        }
        return 0;
    }

    @Test
    public void maxNumberOfBalloonsTest() {
        String text1 = "nlaebolko";
        System.err.println(maxNumberOfBalloons(text1));
        String text2 = "loonbalxballpoon";
        System.err.println(maxNumberOfBalloons(text2));
        String text3 = "leetcode";
        System.err.println(maxNumberOfBalloons(text3));
    }

}
