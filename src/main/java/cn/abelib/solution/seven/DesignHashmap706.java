package cn.abelib.solution.seven;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: abel.huang
 * @Date: 2019-04-29 00:28
 * done
 */
public class DesignHashmap706 {
    class MyHashMap {
        private List<Integer> keyList;
        private List<Integer> valueList;
        /** Initialize your data structure here. */
        public MyHashMap() {
            keyList = new ArrayList<>();
            valueList = new ArrayList<>();
        }

        /** value will always be non-negative. */
        public void put(int key, int value) {
            int index = keyList.indexOf(key);
            if (index < 0) {
                keyList.add(key);
                valueList.add(value);
            } else {
                valueList.set(index, value);
            }
        }

        /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
        public int get(int key) {
            int index = keyList.indexOf(key);
            if (index < 0 || index >= keyList.size()) {
                return -1;
            }
            return valueList.get(index);
        }

        /** Removes the mapping of the specified value key if this map contains a mapping for the key */
        public void remove(int key) {
            int index = keyList.indexOf(key);
            if (index >= 0) {
                keyList.remove(index);
                valueList.remove(index);
            }
        }
    }
}
