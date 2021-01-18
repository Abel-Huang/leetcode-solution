package cn.abelib.solution.zero;

import org.junit.Test;

/**
 *
 * @author abel-huang
 * @date 2016/7/26
 */
public class AddTwoNumbers2 {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        ListNode head = new ListNode(0);
        ListNode root = head;
        boolean flag = false;
        int num;
        int ans;
        while (l1 != null && l2 != null) {
            num = l1.val + l2.val;
            if (flag) {
                num += 1;
            }
            ans =  num % 10;
            head.next = new ListNode(ans);
            flag = num >= 10;
            l1 = l1.next;
            l2 = l2.next;
            head = head.next;
        }
        if (l2 != null) {
            head.next = l2;
        }
        if (l1 != null) {
            head.next = l1;
        }
        while (head.next != null) {
            head = head.next;
            num = head.val;
            if (flag) {
                num += 1;
            }
            ans = num % 10;
            head.val = ans;
            flag = num >= 10;
        }
        if (flag) {
            head.next = new ListNode(1);
        }

        return root.next;
    }

    @Test
    public void addTwoNumbers() {
        ListNode l1 = new ListNode(5);
        ListNode l2 = new ListNode(5);
        System.out.print(mergeTwoLists(l1, l2).val );
    }
}
