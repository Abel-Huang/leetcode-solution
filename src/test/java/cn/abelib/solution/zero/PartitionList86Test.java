package cn.abelib.solution.zero;

import org.junit.Before;
import org.junit.Test;


/**
 * @author abel.huang
 * @date 2019/4/30 17:25
 */
public class PartitionList86Test {
    PartitionList86 partitionList86;

    @Before
    public void init() {
        partitionList86 = new PartitionList86();
    }

    @Test
    public void partition() {
        PartitionList86.ListNode head = new PartitionList86.ListNode(2);
        head.next = new PartitionList86.ListNode(1);
        //head.next.next=new ListNode(2);
        head = partitionList86.partition(head, 2);
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }
}