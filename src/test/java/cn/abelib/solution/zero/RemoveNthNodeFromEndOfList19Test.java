package cn.abelib.solution.zero;

import org.junit.Before;
import org.junit.Test;


/**
 * @author abel.huang
 * @date 2019/4/30 13:48
 */
public class RemoveNthNodeFromEndOfList19Test {
    private RemoveNthNodeFromEndOfList19 removeNthNodeFromEndOfList19;
    private RemoveNthNodeFromEndOfList19.ListNode head;

    @Before
    public void init() {
        removeNthNodeFromEndOfList19 = new RemoveNthNodeFromEndOfList19();
        head = new RemoveNthNodeFromEndOfList19.ListNode(1);
        head.next = new RemoveNthNodeFromEndOfList19.ListNode(2);
        head.next.next = new RemoveNthNodeFromEndOfList19.ListNode(3);
        head.next.next.next = new RemoveNthNodeFromEndOfList19.ListNode(4);
        head.next.next.next.next = new RemoveNthNodeFromEndOfList19.ListNode(5);
    }

    @Test
    public void removeNthFromEndTest() {
        head = removeNthNodeFromEndOfList19.removeNthFromEnd(head, 2);
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }

    @Test
    public void removeNthFromEndTest1() {
        System.out.println();
        head = removeNthNodeFromEndOfList19.removeNthFromEnd(head, 1);
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }
}