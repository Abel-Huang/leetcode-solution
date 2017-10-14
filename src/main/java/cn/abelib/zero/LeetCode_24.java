package cn.abelib.zero;

/**
 * Created by abel-huang on 2016/7/28.
 *
 * digui
 */
public class LeetCode_24 {
    public static void main(String args[]){
        ListNode head=new ListNode(1);
        head.next=new ListNode(2);
        head.next.next=new ListNode(3);
        head.next.next.next=new ListNode(4);
        head=swapPairs(head);
        while(head!=null){
            System.out.print("  "+head.val);
            head=head.next;
        }
    }
    public static ListNode swapPairs(ListNode head) {
        if(head==null||head.next==null)
            return head;
        ListNode root=head.next;
        ListNode temp=root.next;
        root.next=head;
        head.next=swapPairs(temp);
        return root;
    }
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }
}
