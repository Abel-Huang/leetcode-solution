package cn.abelib.solution.seven;


import org.junit.Test;

/**
 * @Author: abel.huang
 * @Date: 2019-09-28 19:08
 */
public class DesignLinkedList707 {
    /**
     *  Definition for singly-linked list.
     */
    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    class MyLinkedList {
        private ListNode head;
        private int size;
        /** Initialize your data structure here. */
        public MyLinkedList() {
            head = new ListNode(0);
            size = 0;
        }

        /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
        public int get(int index) {
            if (size < 1 || index >= size || index < 0) {
                return -1;
            }
            ListNode node = head.next;
            while (index > 0) {
                node = node.next;
                index--;
            }
            return node.val;
        }

        /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
        public void addAtHead(int val) {
            if (size == 0) {
                head.next = new ListNode(val);
                size ++;
                return;
            }
            ListNode next = head.next;
            ListNode newNode = new ListNode(val);
            newNode.next = next;
            size ++;
            head.next = newNode;
        }

        /** Append a node of value val to the last element of the linked list. */
        public void addAtTail(int val) {
            if (size == 0) {
                head.next = new ListNode(val);
                size ++;
                return;
            }
            ListNode node = head;
            while (node.next != null) {
                node = node.next;
            }
            node.next = new ListNode(val);
            size++;
        }

        /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
        public void addAtIndex(int index, int val) {
            if (index > size) {
                return;
            }
            if (index <= 0) {
                addAtHead(val);
                return;
            }
            if (index == size) {
                addAtTail(val);
                return;
            }
            ListNode node = head.next;
            while (index > 1) {
                node = node.next;
                index --;
            }
            ListNode next =  node.next;
            ListNode newNode = new ListNode(val);
            newNode.next = next;
            node.next = newNode;
            size++;
        }

        /** Delete the index-th node in the linked list, if the index is valid. */
        public void deleteAtIndex(int index) {
            if (index >= size || index < 0 || size < 1) {
                return;
            }
            if (index == 0) {
                head = head.next;
                size --;
                return;
            }
            ListNode node = head;
            while (index > 0) {
                node = node.next;
                index--;
            }
            node.next = node.next.next;
            size--;
        }
    }


    @Test
    public void myLinkedListTest() {
        MyLinkedList linkedList = new MyLinkedList();
        linkedList.addAtIndex(-1, 0);
        System.err.println(linkedList.get(0));
        linkedList.deleteAtIndex(-1);
        System.err.println(linkedList.size);
    }
}
