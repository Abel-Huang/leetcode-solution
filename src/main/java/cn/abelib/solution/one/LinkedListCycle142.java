package cn.abelib.solution.one;

import org.junit.Test;

/**
 * @Author: abel.huang
 * @Date: 2019-02-28 03:06
 */
public class LinkedListCycle142 {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode detectCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        do {
            if (fast == null || fast.next == null) {
                return null;
            }
            slow = slow.next;
            fast = fast.next.next;
        }while (fast != slow);

        fast = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        return fast;
    }

    @Test
    public void detectCycleTest() {
        ListNode head = new ListNode(1);
        ListNode node = head;
        node.next = new ListNode(2);
        node.next.next = head;
        System.err.println(detectCycle(head).val);
    }
}
