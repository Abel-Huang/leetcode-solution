package cn.abelib.solution.zero;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by abel-huang on 2016/8/7.
 * Use two list two save each partition of the original linklist.
 */
public class LeetCode_86 {
    public static void main(String args[]) {
        ListNode head = new ListNode(2);
        head.next = new ListNode(1);
        //head.next.next=new ListNode(2);
        head = partition(head, 2);
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }

    public static ListNode partition(ListNode head, int x) {
        if (head == null || head.next == null)
            return head;
        else {
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
            for (int i = 0; i < list2.size(); i++) {
                list1.add(list2.get(i));
            }
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
