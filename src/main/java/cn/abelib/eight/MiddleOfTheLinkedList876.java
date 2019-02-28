package cn.abelib.eight;

/**
 * @Author: abel.huang
 * @Date: 2019-02-28 02:09
 */
public class MiddleOfTheLinkedList876 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public ListNode middleNode(ListNode head) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return head;
        }
        ListNode node = head;
        while (head != null) {
            head = head.next;
            if(head == null) {
                break;
            } else{
                node = node.next;
                head = head.next;
            }
        }
        return node;
    }
}
