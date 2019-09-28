package cn.abelib.solution.two;


import org.junit.Test;

/**
 * @Author: abel.huang
 * @Date: 2019-09-23 23:48
 */
public class RemoveLinkedListElements203 {
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

    public ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return head;
        }
        ListNode root = new ListNode(-1);
        root.next = head;
        ListNode temp = root;
        while (temp.next != null) {
            while (temp.next.val == val) {
                if (temp.next.next == null) {
                    temp.next = null;
                    return root.next;
                }
                temp.next = temp.next.next;
            }
            temp = temp.next;
        }
        return root.next;
    }

    @Test
    public void removeElementsTest(){
        ListNode root1 = new ListNode(1);
        root1.next = new ListNode(1);
//        root1.next.next = new ListNode(3);
//        root1.next.next.next = new ListNode(4);
//        root1.next.next.next.next = new ListNode(5);
        System.err.println(removeElements(root1, 1));
    }
}
