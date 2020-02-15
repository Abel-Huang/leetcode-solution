package cn.abelib.solution.two;

import org.junit.Test;

/**
 * @Author: abel.huang
 * @Date: 2019-09-08 16:50
 */
public class PalindromeLinkedList234 {

    /**
     *  Definition for singly-linked list.
     */
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public boolean isPalindrome(ListNode head) {
        if (head == null) {
            return true;
        }
        if (head.next == null) {
            return true;
        }
        if (head.next.next == null) {
            return head.val == head.next.val;
        }
        ListNode fast = head;
        ListNode slow = head;
        ListNode temp = head;
        int idx = 0;
        while (temp != null) {
            idx ++;
            temp = temp.next;
        }
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode target;

        if (idx % 2 == 0) {
            if (slow.val != slow.next.val) {
                return false;
            }
            target = slow.next.next;
        } else {
            target = slow.next;
        }
        ListNode newNode = reverseList(head, slow.next);
        while (target != null) {
            if (target.val != newNode.val) {
                return false;
            }
            target = target.next;
            newNode = newNode.next;
        }
        return true;
    }

    public ListNode reverseList(ListNode head, ListNode target) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode prev = null;
        ListNode now = head;
        while (now != null && now.next != target) {
            ListNode next = now.next;
            now.next = prev;
            prev = now;
            now = next;
        }
        return prev;
    }

    @Test
    public void test() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(1);
        System.err.println(isPalindrome(head));
    }

    @Test
    public void test2() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(1);
        System.err.println(isPalindrome(head));
    }

    @Test
    public void test3() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(0);
        head.next.next = new ListNode(0);
        System.err.println(isPalindrome(head));
    }

    @Test
    public void test4() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        System.err.println(isPalindrome(head));
    }

    @Test
    public void test5() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(1);
        System.err.println(isPalindrome(head));
    }
}
