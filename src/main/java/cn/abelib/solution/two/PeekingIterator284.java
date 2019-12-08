package cn.abelib.solution.two;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Author: abel.huang
 * @Date: 2019-12-08 22:39
 */
public class PeekingIterator284 {
    class PeekingIterator implements Iterator<Integer> {
        private Iterator<Integer> iterator;
        private Integer nextNum;
        private boolean flag = false;
        public PeekingIterator(Iterator<Integer> iterator) {
            // initialize any member here.
            this.iterator = iterator;
        }

        // Returns the next element in the iteration without advancing the iterator.
        public Integer peek() {
            if (flag) {
                return nextNum;
            }
            if (iterator.hasNext()) {
                nextNum = iterator.next();
                flag = true;
                return nextNum;
            }
            return null;
        }

        // hasNext() and next() should behave the same as in the Iterator interface.
        // Override them if needed.
        @Override
        public Integer next() {
            if (flag) {
                flag = false;
                return nextNum;
            }
            return iterator.next();
        }

        @Override
        public boolean hasNext() {
            if (flag) {
                return true;
            }
            return iterator.hasNext();
        }
    }

    @Test
    public void peekingIteratorTest() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        PeekingIterator iterator = new PeekingIterator(list.iterator());
        System.err.println(iterator.hasNext());
        System.err.println(iterator.peek());
        System.err.println(iterator.peek());
        System.err.println(iterator.next());
        System.err.println(iterator.next());

        System.err.println(iterator.peek());
        System.err.println(iterator.peek());
        System.err.println(iterator.next());
        System.err.println(iterator.hasNext());
    }
}
