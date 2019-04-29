package cn.abelib.solution.two;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by  abel-huang on 2016/8/8.
 * hashtable, and similar with 205th.
 */
public class LeetCode_290 {
    public static void main(String args[]) {
        String s = "abba", t = "a b b a";
        System.out.print(wordPattern(s, t));
    }

    public static boolean wordPattern(String pattern, String str) {
        String[] temp = str.split(" ");
        if (pattern.length() != temp.length)
            return false;
        else {
            HashMap<Character, List<Integer>> hashMap1 = new HashMap<>();
            HashMap<String, List<Integer>> hashMap2 = new HashMap<>();
            int len = pattern.length();
            for (int i = 0; i < len; i++) {
                if (!hashMap1.containsKey(pattern.charAt(i)) && !hashMap2.containsKey(temp[i])) {
                    List<Integer> list = new ArrayList<>();
                    list.add(i);
                    hashMap1.put(pattern.charAt(i), list);
                    hashMap2.put(temp[i], list);
                } else if ((hashMap1.containsKey(pattern.charAt(i))) && (hashMap2.containsKey(temp[i]))) {
                    hashMap1.get(pattern.charAt(i)).add(i);
                    hashMap2.get(temp[i]).add(i);
                    if (hashMap1.get(pattern.charAt(i)) != hashMap2.get(temp[i]))
                        return false;
                } else {
                    return false;
                }
            }
            return true;
        }
    }
}
