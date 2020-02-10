package cn.abelib.solution.one;

import org.junit.Test;

import java.util.Collections;
import java.util.Stack;

/**
 * @Author: abel.huang
 * @Date: 2019-12-15 23:43
 */
public class MinStack155 {
    class MinStack {
        private int min;
        private Stack<Integer> stack;

        /** initialize your data structure here. */
        public MinStack() {
            stack = new Stack<>();
            min = Integer.MIN_VALUE;
        }

        public void push(int x) {
            stack.push(x);
            if (x == Integer.MIN_VALUE || stack.size() == 1) {
                min = x;
                return;
            }
            if (min > x) {
                min = x;
            }
        }

        public void pop() {
            int peek  = top();
            stack.pop();
            if (peek != min) {
                return;
            }
            if (!stack.isEmpty()) {
                min = Collections.min(stack);
            }
        }

        public int top() {
            return stack.peek();
        }

        public int getMin() {
            return min;
        }
    }

    /**
     * ["MinStack","push","push","push",
     * "top","pop","getMin","pop",
     * "getMin","pop","push","top",
     * "getMin","push","top","getMin",
     * "pop","getMin"]
     * [[],[2147483646],[2147483646],[2147483647],[],[],[],[],[],[],[2147483647],[],[],[-2147483648],[],[],[],[]]
     */
    @Test
    public void stackTest() {
        MinStack minStack = new MinStack();
        minStack.push(2147483646);
        minStack.push(2147483646);
        minStack.push(2147483647);
        System.err.println(minStack.top());
        minStack.pop();
        System.err.println(minStack.getMin());
        minStack.pop();
        System.err.println(minStack.getMin());
        minStack.pop();

        minStack.push(2147483647);

        System.err.println(minStack.top());
        System.err.println(minStack.getMin());

        minStack.push(-2147483648);

        System.err.println(minStack.top());
        System.err.println(minStack.getMin());

        minStack.pop();
        System.err.println(minStack.getMin());
    }
}
