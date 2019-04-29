package cn.abelib.solution.seven;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: abel.huang
 * @Date: 2019-04-29 00:20
 */
public class DesignHashset705 {
    class MyHashSet {
        private List<Integer> list;
        /** Initialize your data structure here. */
        public MyHashSet() {
            list = new ArrayList<>();
        }

        public void add(int key) {
            if (!contains(key)) {
                list.add(key);
            }
        }

        public void remove(int key) {
            list.remove(new Integer(key));
        }

        /** Returns true if this set contains the specified element */
        public boolean contains(int key) {
            return list.contains(key);
        }
    }
}
