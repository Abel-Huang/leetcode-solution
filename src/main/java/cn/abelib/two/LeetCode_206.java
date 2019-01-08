package cn.abelib.two;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by  abel-huang on 2016/7/28.
 * Use a temp list to save every node.
 */
public class LeetCode_206 {
    public static void main(String args[]) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        while (reverseList(head) != null)
            System.out.print("  " + reverseList(head).val);
    }

    public static ListNode reverseList(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode temp = head;
        List<Integer> list = new ArrayList<>();
        while (temp != null) {
            list.add(new Integer(temp.val));
            temp = temp.next;
        }
        head.val = list.get(list.size() - 1);
        ListNode haha = head;
        for (int i = list.size() - 2; i >= 0; i--) {
            haha.next = new ListNode(list.get(i));
            haha = haha.next;
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
