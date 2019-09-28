package cn.abelib.solution.one;

import org.junit.Test;


/**
 * @Author: abel.huang
 * @Date: 2019-09-23 22:50
 */
public class IntersectionOfTwoLinkedLists160 {
    /**
     *  Definition for singly-linked list.
     */
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        ListNode nodeA = headA;
        ListNode nodeB = headB;
        int idx = 0;
        while (nodeA.next != null) {
            nodeA = nodeA.next;
            idx ++;
        }
        nodeA.next = nodeB;
        ListNode fast = headA;
        ListNode slow = headA;

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
            recover(headA, idx);
            return null;
        }
        fast = headA;
        while (fast != null) {
            if (slow.equals(fast)) {
                recover(headA, idx);
                return fast;
            }
            fast = fast.next;
            slow = slow.next;
        }
        recover(headA, idx);
        return null;
    }

    private ListNode recover(ListNode head, int index) {
        ListNode node = head;
        while (index > 0) {
            node = node.next;
            index --;
        }
        node.next = null;
        return head;
    }

    @Test
    public void getIntersectionNodeTest() {
        ListNode root1 = new ListNode(4);
        root1.next = new ListNode(1);
        root1.next.next = new ListNode(8);
        root1.next.next.next = new ListNode(4);
        root1.next.next.next.next = new ListNode(5);

        ListNode root2 = new ListNode(5);
        root2.next = new ListNode(0);
        root2.next.next = new ListNode(1);
        root2.next.next.next = new ListNode(8);
        root2.next.next.next.next = new ListNode(4);
        root2.next.next.next.next.next = new ListNode(5);

        ListNode result = getIntersectionNode(root1, root2);

        if (result == null) {
            System.err.println(result);
        } else {
            System.err.println(result.val);
        }
    }
}
