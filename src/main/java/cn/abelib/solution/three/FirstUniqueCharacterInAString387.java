package cn.abelib.solution.three;

import org.junit.Test;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @Author: abel.huang
 * @Date: 2019-02-01 02:00
 */
public class FirstUniqueCharacterInAString387 {

    public int firstUniqCharWithMap(String s) {
        if (s.equals("")) {
            return -1;
        }
        if (s.length() == 1) {
            return 0;
        }
        Map<Character, Integer> treeMap = new LinkedHashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (treeMap.get(s.charAt(i)) == null) {
                treeMap.put(s.charAt(i), 1);
            } else {
                treeMap.put(s.charAt(i), treeMap.get(s.charAt(i)) + 1);
            }
        }
        for (int i = 0; i < s.length(); i ++) {
            if (treeMap.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }

    public int firstUniqChar(String s) {
        if (s.equals("")) {
            return -1;
        }
        if (s.length() == 1) {
            return 0;
        }
        int[] chars = new int[26];
        for (int i = 0; i < s.length(); i++) {
            int index = s.charAt(i) - 'a';
            chars[index] ++;
        }
        for (int i = 0; i < s.length(); i++) {
            int index = s.charAt(i) - 'a';
            if (chars[index] == 1) {
                return i;
            }
        }
        return -1;
    }

    @Test
    public void firstUniqCharTest() {
        System.out.println(firstUniqChar("loveleetcode"));
        System.out.println(firstUniqChar("leetcode"));
    }
}
