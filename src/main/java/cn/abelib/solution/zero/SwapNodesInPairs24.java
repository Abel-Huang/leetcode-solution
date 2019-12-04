package cn.abelib.solution.zero;

/**
 *
 * @author abel-huang
 * @date 2016/7/28
 *
 */
public class SwapNodesInPairs24 {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode root = head.next;
        ListNode temp = root.next;
        root.next = head;
        head.next = swapPairs(temp);
        return root;
    }
}
