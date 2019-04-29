package cn.abelib.solution.eight;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: abel.huang
 * @Date: 2019-04-30 03:31
 */
public class UncommonWordsFromTwoSentences884 {
    public String[] uncommonFromSentences(String A, String B) {
        if (A.trim().length() < 1 || B.trim().length() < 1) {
            return new String[]{};
        }
        String[] aArray = A.split(" ");
        String[] bArray = B.split(" ");
        Map<String, Integer> map = new HashMap<>();
        for (String str : aArray) {
            if (!map.containsKey(str)) {
                map.put(str, 1);
            } else {
                map.put(str, 2);
            }
        }
        for (String str : bArray) {
            if (!map.containsKey(str)) {
                map.put(str, 1);
            } else {
                map.put(str, 2);
            }
        }
        List<String> list = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() < 2) {
                list.add(entry.getKey());
            }
        }
        return list.toArray(new String[list.size()]);
    }
}
