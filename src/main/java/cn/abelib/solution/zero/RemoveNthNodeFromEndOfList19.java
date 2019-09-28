package cn.abelib.solution.zero;


import org.junit.Test;

/**
 *
 * @author abel-huang
 * @date 2016/7/26
 */
public class RemoveNthNodeFromEndOfList19 {
    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    /**
     *  需要遍历两次
     * @param head
     * @param n
     * @return
     */
    public ListNode removeNthFromEnd1(ListNode head, int n) {
        if (head == null) {
            return head;
        }
        ListNode node1 = head;
        int length = 0;
        int index = 0;
        while (node1 != null) {
            length++;
            node1 = node1.next;
        }
        ListNode node2 = head;
        if (length == n) {
            return head.next;
        }
        while (index < length - n - 1) {
            node2 = node2.next;
            index++;
        }
        if (n == 1) {
            node2.next = null;
        } else {
            node2.next = node2.next.next;
        }
        return head;
    }

    /**
     *  双指针，只需要遍历一次
     * @param head
     * @param n
     * @return
     */
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) {
            return head;
        }
        ListNode fast = head;
        ListNode slow = head;
        while (n > 0) {
            fast = fast.next;
            n --;
        }
        while (fast != null && fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        if (slow.next == null) {
            slow = null;
        } else {
            slow.next = slow.next.next;
        }
        return head;
    }

    @Test
    public void removeNthFromEndTest() {
        ListNode head = new ListNode(1);
//        head.next = new ListNode(2);
//        head.next.next = new ListNode(3);
//        head.next.next.next = new ListNode(4);
//        head.next.next.next.next = new ListNode(5);
        System.err.println(removeNthFromEnd(head, 1));
    }
}
