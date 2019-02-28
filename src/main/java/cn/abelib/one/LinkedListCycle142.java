package cn.abelib.one;

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


    public ListNode hasCycle(ListNode head) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return null;
        }
        int index = 0;
        ListNode node = head;
        while (head != null) {
            head = head.next;
            if (head == null) {
                break;
            } else {
                node = node.next;
                head = head.next;
                if (head != null && node.val == head.val) {
                    return head;
                }
            }
        }
        return null;
    }
}
