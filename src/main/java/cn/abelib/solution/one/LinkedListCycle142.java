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
        if (head == null || head.next == null) {
            return null;
        }
        ListNode fast = head;
        ListNode slow = head;
        boolean flag = false;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow.equals(fast)) {
                flag = true;
                break;
            }
        }
        if (!flag) {
            return null;
        }
        fast = head;
        while (fast != null) {
            if (slow.equals(fast)) {
                return fast;
            }
            fast = fast.next;
            slow = slow.next;
        }
        return null;
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
