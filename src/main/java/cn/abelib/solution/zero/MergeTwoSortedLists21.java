package cn.abelib.solution.zero;

/**
 *
 * @author abel-huang
 * @date 2016/7/25
 * This is the simplest questions about link list, I AC follow other's code,
 * but I can get many ideas about how to use link list in Java.
 */
public class MergeTwoSortedLists21 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        ListNode head;
        if (l1.val >= l2.val) {
            head = l2;
            l2 = l2.next;
        } else {
            head = l1;
            l1 = l1.next;
        }
        ListNode listNode = head;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                listNode.next = l1;
                l1 = l1.next;
            } else {
                listNode.next = l2;
                l2 = l2.next;
            }
            listNode = listNode.next;
        }
        listNode.next = l1 == null ? l2 : l1;
        return head;
    }

    public ListNode mergeTwoLists2(ListNode l1, ListNode l2) {
        if(l1 == null && l2 != null) {
            return l2;
        }
        if(l1 != null && l2 == null) {
            return l1;
        }
        ListNode head = new ListNode(-1);
        ListNode node = head;
        while(l1 != null && l2 != null) {
            if (l1.val > l2.val) {
                node.next = new ListNode(l2.val);
                l2 = l2.next;
            } else{
                node.next = new ListNode(l1.val);
                l1 = l1.next;
            }
            node = node.next;
        }
        if(l1 != null) {
            node.next = l1;
        }
        if(l2 != null) {
            node.next = l2;
        }
        return head.next;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
