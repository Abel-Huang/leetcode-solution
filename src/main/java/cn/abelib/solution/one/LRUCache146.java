package cn.abelib.solution.one;

import org.junit.Test;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @Author: abel.huang
 * @Date: 2020-02-10 01:44
 */
public class LRUCache146 {
    class LRUCache {
        private Map<Integer, Integer> cache;
        private int capacity;
        public LRUCache(int capacity) {
            this.cache = new LinkedHashMap<>(capacity);
            this.capacity = capacity;
        }

        public int get(int key) {
            if (cache.containsKey(key)) {
                int value = cache.get(key);
                cache.remove(key);
                cache.put(key, value);
                return value;
            }
            return -1;
        }

        public void put(int key, int value) {
            if (cache.containsKey(key)) {
                cache.remove(key);
                cache.put(key, value);
                return;
            }
            if (cache.size() == capacity) {
                for (Map.Entry<Integer, Integer> entry : cache.entrySet()) {
                    cache.remove(entry.getKey());
                    break;
                }
            }
            cache.put(key, value);
        }
    }

    @Test
    public void test() {
        LRUCache cache = new LRUCache(2);

        cache.put(1, 1);
        cache.put(2, 2);
        System.err.println(cache.get(1));

        cache.put(3, 3);
        System.err.println(cache.get(2));

        cache.put(4, 4);
        System.err.println(cache.get(1));

        System.err.println(cache.get(3));
        System.err.println(cache.get(4));
    }

    @Test
    public void test2() {
        LRUCache cache = new LRUCache(2);

        cache.put(2, 1);
        cache.put(1, 1);
        cache.put(2, 3);
        cache.put(4, 1);

        System.err.println(cache.get(1));
        System.err.println(cache.get(2));
    }
}
