package cn.abelib.solution.two;

/**
 * Created by  abel-huang on 2016/7/26.
 * Just give one information about this question, we can
 * just point the node equals the node next
 */
public class LeetCode_237 {
    public static void main(String args[]) {
        int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10};
        //System.out.print(new LeetCode_237().deleteNode(nums));
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
