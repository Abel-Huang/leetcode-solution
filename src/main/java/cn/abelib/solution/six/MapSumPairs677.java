package cn.abelib.solution.six;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: abel.huang
 * @Date: 2019-12-08 23:24
 */
public class MapSumPairs677 {
    class MapSum {
        Map<String, Integer> map;
        /** Initialize your data structure here. */
        public MapSum() {
            map = new HashMap<>(16);
        }

        public void insert(String key, int val) {
            map.put(key, val);
        }

        public int sum(String prefix) {
            int sum = 0;
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                if (entry.getKey().startsWith(prefix)) {
                    sum += entry.getValue();
                }
            }
            return sum;
        }
    }

    @Test
    public void mapSumPairsTest() {
        MapSum mapSum = new MapSum();
        mapSum.insert("apple", 3);
        System.err.println(mapSum.sum("app"));
        mapSum.insert("app", 2);
        System.err.println(mapSum.sum("ap"));
    }
}
