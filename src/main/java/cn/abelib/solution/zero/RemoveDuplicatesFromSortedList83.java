package cn.abelib.solution.zero;

/**
 *
 * @author abel-huang
 * @date 2016/7/26
 * I must consider about the tail of the link list and understand
 * the meaning of delete a node is just point the pre_node's next node to
 * the next_node of this node.
 */
public class RemoveDuplicatesFromSortedList83 {
    public  ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode listNode = head;
        while (listNode.next != null) {
            if (listNode.val == listNode.next.val) {
                listNode.next = listNode.next.next;
            } else {
                listNode = listNode.next;
            }
        }
        return head;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
