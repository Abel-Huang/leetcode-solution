package cn.abelib.solution.five;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Author: abel.huang
 * @Date: 2021-01-11 23:01
 */
public class LongestWordInDictionaryThroughDeleting524 {
    public String findLongestWord(String s, List<String> d) {
        int l1 = s.length();
        int l2 = d.size();

        if (l1 < 1 || l2 < 1) {
            return "";
        }

        String result = "";
        Collections.sort(d);
        for (String t : d) {
            if (t.length() > s.length() || result.length() > t.length()) {
                continue;
            }
            for (int i = 0, j = 0; i < l1 && j < t.length(); i ++) {
                if (s.charAt(i) == t.charAt(j)) {
                    if (j == t.length() - 1) {
                        if ("".equals(result) || result.length() < t.length()) {
                            result = t;
                            break;
                        }
                    }
                    j ++;
                }
            }
        }
        return result;
    }

    @Test
    public void findLongestWordTest() {
        String s = "bab";
        List<String> d = new ArrayList<>();

        Collections.addAll(d, "ba","ab","a","b");

        System.err.println(findLongestWord(s, d));
    }
}
