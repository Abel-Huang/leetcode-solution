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

    public boolean hasCycle(ListNode head) {
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
}
