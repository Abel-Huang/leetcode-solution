package cn.abelib.solution.zero;

import org.junit.Before;
import org.junit.Test;


/**
 * @author abel.huang
 * @date 2019/4/30 14:14
 */
public class SwapNodesInPairs24Test {
    SwapNodesInPairs24 swapNodesInPairs24;

    @Before
    public void init() {
        swapNodesInPairs24 = new SwapNodesInPairs24();
    }

    @Test
    public void swapPairsTest() {
        SwapNodesInPairs24.ListNode head = new SwapNodesInPairs24.ListNode(1);
        head.next = new SwapNodesInPairs24.ListNode(2);
        head.next.next = new SwapNodesInPairs24.ListNode(3);
        head.next.next.next = new SwapNodesInPairs24.ListNode(4);
        head = swapNodesInPairs24.swapPairs(head);
        while (head != null) {
            System.out.print("  " + head.val);
            head = head.next;
        }
    }
}