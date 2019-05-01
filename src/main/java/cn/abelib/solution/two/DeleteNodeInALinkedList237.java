package cn.abelib.solution.two;

/**
 *
 * @author abel-huang
 * @date 2016/7/26
 * Just give one information about this question, we can
 * just point the node equals the node next
 */
public class DeleteNodeInALinkedList237 {
    public static void main(String args[]) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10};
        //System.out.print(new DeleteNodeInALinkedList237().deleteNode(nums));
    }

    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
