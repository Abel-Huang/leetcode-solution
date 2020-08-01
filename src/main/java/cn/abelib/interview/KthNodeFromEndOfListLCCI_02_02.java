package cn.abelib.interview;

import org.junit.Test;

/**
 * @Author: abel.huang
 * @Date: 2020-07-25 16:00
 */
public class KthNodeFromEndOfListLCCI_02_02 {

    public class ListNode {
       int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public int kthToLast(ListNode head, int k) {
        ListNode fast = head;
        ListNode slow = head;
        for(int i = 0; i < k; i ++) {
            fast = fast.next;
        }
        while(fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow.val;
    }

    @Test
    public void kthToLastTest() {
        // 1->2->3->4->5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        System.err.println(kthToLast(head, 1));
        System.err.println(kthToLast(head, 2));
        System.err.println(kthToLast(head, 3));
        System.err.println(kthToLast(head, 4));
        System.err.println(kthToLast(head, 5));
    }
}
