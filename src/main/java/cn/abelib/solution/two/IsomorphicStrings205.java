package cn.abelib.solution.two;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author abel-huang
 * @date 2016/8/3
 * Use hashtable
 */
public class IsomorphicStrings205 {
    public static void main(String args[]) {
        String s = "aab", t = "bba";
        System.out.print(isIsomorphic(s, t));
    }

    public static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        Map<Character, List<Integer>> hashMap1 = new HashMap<>();
        Map<Character, List<Integer>> hashMap2 = new HashMap<>();
        int len = s.length();
        for (int i = 0; i < len; i++) {
            if (!hashMap1.containsKey(s.charAt(i)) && !hashMap2.containsKey(t.charAt(i))) {
                List<Integer> list = new ArrayList<>();
                list.add(i);
                hashMap1.put(s.charAt(i), list);
                hashMap2.put(t.charAt(i), list);
            } else if ((hashMap1.containsKey(s.charAt(i))) && (hashMap2.containsKey(t.charAt(i)))) {
                hashMap1.get(s.charAt(i)).add(i);
                hashMap2.get(t.charAt(i)).add(i);
                if (hashMap1.get(s.charAt(i)) != hashMap2.get(t.charAt(i))) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }
}
