package cn.abelib.solution.zero;


/**
 *
 * @author abel-huang
 * @date 2016/7/26
 * a?b:c----->if(a)
 * return b;
 * else
 * return c;
 */
public class RemoveNthNodeFromEndOfList19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) {
            return head;
        } else {
            ListNode temp = head;
            int length = 0;
            int index = 0;
            while (temp != null) {
                length++;
                temp = temp.next;
            }
            ListNode temp2 = head;
            if (length == n) {
                return head.next;
            }
            while (index < length - n - 1) {
                temp2 = temp2.next;
                index++;
            }
            if (n == 1) {
                temp2.next = null;
            } else {
                temp2.next = temp2.next.next;
            }
            return head;
        }
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
