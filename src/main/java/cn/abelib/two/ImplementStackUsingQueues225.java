package cn.abelib.two;

import org.junit.Test;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * @Author: abel.huang
 * @Date: 2019-01-15 02:07
 */
public class ImplementStackUsingQueues225 {
    class MyStack {
        private Queue<Integer> queueA;
        private Queue<Integer> queueB;
        /** Initialize your data structure here. */
        public MyStack() {
            queueA = new ArrayDeque<>();
            queueB = new ArrayDeque<>();
        }

        /** Push element x onto stack. */
        public void push(int x) {
            queueA.add(x);
        }

        /** Removes the element on top of the stack and returns that element. */
        public int pop() {
            int popItem = 0;
            while (!queueA.isEmpty()) {
                if (queueA.size() == 1) {
                    popItem = queueA.poll();
                    break;
                }
                queueB.add(queueA.poll());
            }
            while (!queueB.isEmpty()) {
                queueA.add(queueB.poll());
            }
            return popItem;
        }

        /** Get the top element. */
        public int top() {
            int popItem = 0;
            while (!queueA.isEmpty()) {
                if (queueA.size() == 1) {
                    popItem = queueA.peek();
                    queueB.add(queueA.poll());
                    break;
                }
                queueB.add(queueA.poll());
            }
            while (!queueB.isEmpty()) {
                queueA.add(queueB.poll());
            }
            return popItem;
        }

        /** Returns whether the stack is empty. */
        public boolean empty() {
            return  queueA.isEmpty();
        }
    }

    @Test
    public void myStackTest() {
        MyStack myStack = new MyStack();
        System.out.println(myStack.empty());
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        System.out.println(myStack.top());
        System.out.println(myStack.pop());
        System.out.println(myStack.top());
        System.out.println(myStack.pop());
        System.out.println(myStack.top());
        System.out.println(myStack.pop());
        System.out.println(myStack.empty());
    }
}
