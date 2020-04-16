package cn.abelib.solution.four;

import org.junit.Test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/**
 * @Author: abel.huang
 * @Date: 2020-04-05 22:50
 */
public class LFUCache460 {
    class LFUCache {
        private Map<Integer, Integer> cache;
        private Map<Integer, Integer> count;
        private int capacity;

        public LFUCache(int capacity) {
            this.cache = new HashMap<>(capacity);
            this.count = new LinkedHashMap<>(capacity);
            this.capacity = capacity;
        }

        public int get(int key) {
            if (capacity < 1) {
                return -1;
            }
            if (cache.containsKey(key)) {
                int cnt = count.get(key);
                count.remove(key);
                count.put(key, cnt + 1);
                return cache.get(key);
            }
            return -1;
        }

        public void put(int key, int value) {
            if (capacity < 1) {
                return;
            }
            if (cache.containsKey(key)) {
                if (cache.get(key) == value) {
                    int cnt = count.get(key);
                    count.remove(key);
                    count.put(key, cnt + 1);
                } else {
                    cache.put(key, value);
                    count.remove(key);
                    count.put(key, 1);
                }
                return;
            }
            if (cache.size() == capacity) {
                Integer minKey = null;
                for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
                    if (Objects.isNull(minKey)) {
                        minKey = entry.getKey();
                        continue;
                    }
                    if (entry.getValue() < count.get(minKey)) {
                        minKey = entry.getKey();
                    }
                }
                count.remove(minKey);
                cache.remove(minKey);
            }
            cache.put(key, value);
            count.put(key, 1);
        }
    }

    @Test
    public void test1() {
        LFUCache cache = new LFUCache( 2);

        cache.put(1, 1);
        cache.put(2, 2);
        // 返回 1
        System.err.println(cache.get(1));
        // 去除 key 2
        cache.put(3, 3);
        // 返回 -1 (未找到key 2)
        System.err.println(cache.get(2));
        // 返回 3
        System.err.println(cache.get(3));
        // 去除 key 1
        cache.put(4, 4);
        // 返回 -1 (未找到 key 1)
        System.err.println(cache.get(1));
        // 返回 3
        System.err.println(cache.get(3));
        // 返回 4
        System.err.println(cache.get(4));
    }

    @Test
    public void test2() {
        LFUCache cache = new LFUCache(2);

        cache.put(3, 1);
        cache.put(2, 1);
        cache.put(2, 2);
        cache.put(4, 4);

        System.err.println(cache.get(2));
    }

    @Test
    public void test3() {
        LFUCache cache = new LFUCache(0);

        cache.put(0, 0);

        System.err.println(cache.get(0));
    }

    @Test
    public void test4() {
        LFUCache cache = new LFUCache(2);
        System.err.println(cache.get(2));
        cache.put(2, 6);
        System.err.println(cache.get(1));
        cache.put(1, 5);
        cache.put(1, 2);
        System.err.println(cache.get(1));
        System.err.println(cache.get(2));
    }
}
