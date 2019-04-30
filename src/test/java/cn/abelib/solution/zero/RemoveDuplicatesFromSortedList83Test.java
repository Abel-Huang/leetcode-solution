package cn.abelib.solution.zero;

import org.junit.Before;
import org.junit.Test;


/**
 * @author abel.huang
 * @date 2019/4/30 17:22
 */
public class RemoveDuplicatesFromSortedList83Test {
    private RemoveDuplicatesFromSortedList83 removeDuplicatesFromSortedList83;

    @Before
    public void init() {
        removeDuplicatesFromSortedList83 = new RemoveDuplicatesFromSortedList83();
    }

    @Test
    public void deleteDuplicates() {
        RemoveDuplicatesFromSortedList83.ListNode head = new RemoveDuplicatesFromSortedList83.ListNode(1);
        head.next = new RemoveDuplicatesFromSortedList83.ListNode(1);
        head.next.next = new RemoveDuplicatesFromSortedList83.ListNode(2);
        head.next.next.next = new RemoveDuplicatesFromSortedList83.ListNode(2);
        while (head != null) {
            System.out.println(removeDuplicatesFromSortedList83.deleteDuplicates(head).val);
            head = head.next;
        }
    }
}