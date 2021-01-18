package cn.abelib.solution.zero;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

/**
 *
 * @author abel-huang
 * @date 2016/7/16
 *  无重复字符的最长子串
 */
public class LongestSubstringWithoutRepeatingCharacters3 {
    /**
     * 使用HashMap
     * @param s
     * @return
     */
    public int lengthOfLongestSubstringSliceWindow(String s) {
        List<Integer> list = new ArrayList<>();
        int index = 0;
        Map<Character, Integer> map = new HashMap<>();
        if (s == null || s.length() < 1) {
            return 0;
        }
        while (index < s.length()) {
            if (!map.containsKey(s.charAt(index))) {
                map.put(s.charAt(index), index);
            } else {
                list.add(map.size());
                index = map.get(s.charAt(index));
                map.clear();
            }
            index++;
        }
        list.add(map.size());
        int max = 0;
        for (Integer integer : list) {
            if (integer > max) {
                max = integer;
            }
        }
        return max;
    }

    public int lengthOfLongestSubstring(String s) {
        int len = s.length();
        if (len < 1) {
            return 0;
        }
        if (len == 1) {
            return 1;
        }
        int[] map = new int[256];
        int left = 0;
        for (int i = 0; i < len; i ++) {
            int index = s.charAt(i);
            if (map[index] == 0) {
                map[index] = i - left + 1;
            } else {
                map[index] = i - left + 1;
            }
        }
        return 0;
    }

    @Test
    public void lengthOfLongestSubstringTest() {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
        Assert.assertEquals(lengthOfLongestSubstring(s), 3);
        String s1 = "bbbbb";
        System.out.println(lengthOfLongestSubstring(s1));
        String s2 = "pwwkew";
        System.out.println(lengthOfLongestSubstring(s2));
    }
}
