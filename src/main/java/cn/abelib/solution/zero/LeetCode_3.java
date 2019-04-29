package cn.abelib.solution.zero;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by abel-huang on 2016/7/16.
 * First time I forget to add the last hashmap to the list, so I can't get the right result,
 * I means when the loop is end, the last element of substring's length, so I add the code in
 * line 35, finally I AC this question.
 */
public class LeetCode_3 {
    public static void main(String args[]) {
        String s = "pwwkew";
        System.out.print(lengthOfLongestSubstring(s));
    }

    public static int lengthOfLongestSubstring(String s) {
        List<Integer> list = new ArrayList<>();
        int index = 0;
        HashMap<Character, Integer> hashMap = new HashMap<>();
        if (s == "" || s == null)
            return 0;
        else {
            while (index < s.length()) {
                if (!hashMap.containsKey(new Character(s.charAt(index)))) {
                    hashMap.put(new Character(s.charAt(index)), new Integer(index));
                } else {
                    list.add(new Integer(hashMap.size()));
                    index = hashMap.get(new Character(s.charAt(index)));
                    hashMap.clear();
                }
                index++;
            }
            list.add(new Integer(hashMap.size()));
            int max = 0;
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).intValue() > max) {
                    max = list.get(i).intValue();
                }
            }
            return max;
        }
    }
}
