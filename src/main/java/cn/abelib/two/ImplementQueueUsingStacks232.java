package cn.abelib.two;

import org.junit.Test;

import java.util.Stack;

/**
 * @Author: abel.huang
 * @Date: 2019-01-15 22:54
 *  两个栈实现一个队列
 */
public class ImplementQueueUsingStacks232 {
    /**
     * Your MyQueue object will be instantiated and called as such:
     * MyQueue obj = new MyQueue();
     * obj.push(x);
     * int param_2 = obj.pop();
     * int param_3 = obj.peek();
     * boolean param_4 = obj.empty();
     */

    class MyQueue {
        Stack<Integer> stackA;
        Stack<Integer> stackB;
        /** Initialize your data structure here. */
        public MyQueue() {
            stackA = new Stack<>();
            stackB = new Stack<>();
        }

        /** Push element x to the back of queue. */
        public void push(int x) {
            stackA.push(x);
        }

        /** Removes the element from in front of queue and returns that element. */
        public int pop() {
            int popItem = 0;
            while (!stackA.isEmpty()) {
                if (stackA.size() == 1) {
                    popItem = stackA.pop();
                    break;
                }
                stackB.push(stackA.pop());
            }
            while (!stackB.isEmpty()) {
                stackA.push(stackB.pop());
            }
            return popItem;
        }

        /** Get the front element. */
        public int peek() {
            int popItem = 0;
            while (!stackA.isEmpty()) {
                if (stackA.size() == 1) {
                    popItem = stackA.peek();
                    stackB.push(stackA.pop());
                    break;
                }
                stackB.push(stackA.pop());
            }
            while (!stackB.isEmpty()) {
                stackA.push(stackB.pop());
            }
            return popItem;
        }

        /** Returns whether the queue is empty. */
        public boolean empty() {
            return stackA.isEmpty();
        }
    }

    @Test
    public void myStackTest() {
        MyQueue myQueue = new MyQueue();
        System.out.println(myQueue.empty());
        myQueue.push(1);
        myQueue.push(2);
        myQueue.push(3);
        System.out.println(myQueue.peek());
        System.out.println(myQueue.pop());
        System.out.println(myQueue.peek());
        System.out.println(myQueue.pop());
        System.out.println(myQueue.peek());
        System.out.println(myQueue.pop());
        System.out.println(myQueue.empty());
    }
}
