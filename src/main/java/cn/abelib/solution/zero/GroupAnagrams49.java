package cn.abelib.solution.zero;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author abel-huang
 * @date 2016/7/28
 */
public class GroupAnagrams49 {

    public  List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length < 1) {
            return null;
        }
        List<List<String>> lists = new ArrayList<>();
        Map<String, Integer> hashMap = new HashMap<>();
        int index = 0;
        for (int i = 0; i < strs.length; i++) {
            if (!hashMap.containsKey(isAnagram(strs[i]))) {
                hashMap.put(isAnagram(strs[i]),index);
                List<String> strlist = new ArrayList<>();
                strlist.add(strs[i]);
                lists.add(strlist);
                index++;
            } else {
                lists.get((hashMap.get(isAnagram(strs[i])))).add(strs[i]);
            }
        }
        return lists;
    }

    private String isAnagram(String s) {
        if (s.length() <= 1) {
            return s;
        }
        char[] str = s.toCharArray();
        char additionC;
        int index = 0;
        for (int i = 0; i < str.length; i++) {
            additionC = str[i];
            index = i;
            for (int j = i + 1; j < str.length; j++) {
                if (additionC >= str[j]) {
                    additionC = str[j];
                    index = j;
                }
            }
            str[index] = str[i];
            str[i] = additionC;
        }
        return new String(str);
    }
}
