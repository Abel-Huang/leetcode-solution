package cn.abelib.point;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: abel.huang
 * @Date: 2020-07-18 19:45
 */
public class LengthOfLongestSubstring48 {
    public int lengthOfLongestSubstringSet(String s) {
        int len = s.length();
        if (len < 1) {
            return 0;
        }
        if (len < 2) {
            return 1;
        }

        List<Character> list = new ArrayList<>();
        int ans = 0;
        for (char c : s.toCharArray()) {
            if (!list.contains(c)) {
                list.add(c);
                ans = Math.max(list.size(), ans) ;
            } else {
                while (true) {
                    char temp = list.get(0);
                    list.remove(0);
                    if (temp == c) {
                        list.add(c);
                        break;
                    }
                }
            }
        }
        return Math.max(ans, list.size());
    }

    public int lengthOfLongestSubstring(String s) {
        int len = s.length();
        if (len < 2) {
            return len;
        }

        int ans = 0;
        int left = 0;
        for (int i = 0; i < len; i++) {
            for (int j = left; j < i; j ++) {
                if (s.charAt(j) == s.charAt(i)) {
                    left = j + 1;
                    break;
                }
            }
            ans = Math.max(ans,  i - left + 1);
        }
        return ans;
    }

    @Test
    public void lengthOfLongestSubstringTest() {
        System.err.println(lengthOfLongestSubstring("abcabcbb"));

        System.err.println(lengthOfLongestSubstring("bbbbb"));

        System.err.println(lengthOfLongestSubstring("pwwkew"));

        System.err.println(lengthOfLongestSubstring("aab"));

    }
}
