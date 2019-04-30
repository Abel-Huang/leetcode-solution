package cn.abelib.solution.zero;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author abel-huang
 * @date 2016/7/16
 * First time I forget to add the last hashmap to the list, so I can't get the right result,
 * I means when the loop is end, the last element of substring's length, so I add the code in
 * line 35, finally I AC this question.
 */
public class LongestSubstringWithoutRepeatingCharacters3 {
    public int lengthOfLongestSubstring(String s) {
        List<Integer> list = new ArrayList<>();
        int index = 0;
        Map<Character, Integer> hashMap = new HashMap<>();
        if (s == null || s.length() < 1) {
            return 0;
        } else {
            while (index < s.length()) {
                if (!hashMap.containsKey(s.charAt(index))) {
                    hashMap.put(s.charAt(index), index);
                } else {
                    list.add(hashMap.size());
                    index = hashMap.get(s.charAt(index));
                    hashMap.clear();
                }
                index++;
            }
            list.add(hashMap.size());
            int max = 0;
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) > max) {
                    max = list.get(i);
                }
            }
            return max;
        }
    }
}
