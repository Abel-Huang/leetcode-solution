package cn.abelib.solution.zero;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author abel-huang
 * @date 2016/8/7
 * Use two list two save each partition of the original linklist.
 */
public class PartitionList86 {

    public ListNode partition(ListNode head, int x) {
        if (head == null || head.next == null) {
            return head;
        } else {
            List<Integer> list1 = new ArrayList<>();
            List<Integer> list2 = new ArrayList<>();
            ListNode node = head;
            while (node != null) {
                if (node.val < x) {
                    list1.add(node.val);
                } else {
                    list2.add(node.val);
                }
                node = node.next;
            }
            list1.addAll(list2);
            head.val = list1.get(0);
            ListNode temp = head;
            for (int i = 1; i < list1.size(); i++) {
                temp.next = new ListNode(list1.get(i));
                temp = temp.next;
            }
            return head;
        }
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
