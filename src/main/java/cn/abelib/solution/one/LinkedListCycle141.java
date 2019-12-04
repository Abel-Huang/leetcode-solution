package cn.abelib.solution.one;


/**
 * @Author: abel.huang
 * @Date: 2019-02-28 02:56
 */
public class LinkedListCycle141 {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public boolean hasCycle1(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode node = head;
        while (head != null) {
            head = head.next;
            if (head == null) {
                break;
            } else {
                node = node.next;
                head = head.next;
                if (head != null && node.val == head.val) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean hasCycle2(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode fast = head;
        ListNode slow = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow.equals(fast)) {
               return true;
            }
        }
        return false;
    }
}
